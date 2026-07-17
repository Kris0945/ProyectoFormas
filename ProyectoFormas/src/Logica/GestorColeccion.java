package Logica;

import Entidades.*;
import Dao.ColeccionDAO;
import java.util.List;

public class GestorColeccion {
    private Coleccion coleccion;
    private ColeccionDAO dao;

    public Coleccion getColeccion() {

        return coleccion;
    }


    public void setColeccion(Coleccion coleccion) {

        this.coleccion = coleccion;
    }
    public GestorColeccion(ColeccionDAO dao) {

        this.coleccion = new Coleccion();
        this.dao = dao;
    }


    public void agregarFigura(Figura figura) {

        coleccion.agregarFigura(figura);
        dao.guardarFigura(figura);
    }


    public void agregarCuerpo(Cuerpo cuerpo) {

        coleccion.agregarCuerpo(cuerpo);
        dao.guardarCuerpo(cuerpo);
    }


    public List<Figura> listarFiguras() {

        return coleccion.getFiguras();
    }


    public List<Cuerpo> listarCuerpos() {

        return coleccion.getCuerpos();
    }


    public double obtenerAreaTotal() {

        return coleccion.calcularAreaTotal();
    }


    public double obtenerPerimetroTotal() {

        return coleccion.calcularPerimetroTotal();
    }


    public double obtenerVolumenTotal() {

        return coleccion.calcularVolumenTotal();
    }


    public void cargarColeccion() {

        coleccion.setFiguras(
                dao.obtenerFiguras()
        );

        coleccion.setCuerpos(
                dao.obtenerCuerpos()
        );
    }



}
