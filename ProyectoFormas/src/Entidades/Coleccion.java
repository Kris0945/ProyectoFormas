package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<Figura> figuras;
    private List<Cuerpo> cuerpos;

    public Coleccion() {
        figuras = new ArrayList<>();
        cuerpos = new ArrayList<>();
    }

    // Getter
    public List<Figura> getFiguras() {
        return figuras;
    }

    public List<Cuerpo> getCuerpos() {
        return cuerpos;
    }

    //Setter

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }


    public void setCuerpos(List<Cuerpo> cuerpos) {
        this.cuerpos = cuerpos;
    }



    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void agregarCuerpo(Cuerpo cuerpo) {
        cuerpos.add(cuerpo);
    }

    public double calcularAreaTotal() {
        double total = 0;

        for (Figura figura : figuras) {
            total += figura.calcularArea();
        }

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularArea();
        }

        return total;
    }

    public double calcularPerimetroTotal() {
        double total = 0;

        for (Figura figura : figuras) {
            total += figura.calcularPerimetro();
        }

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularPerimetro();
        }

        return total;
    }

    public double calcularVolumenTotal() {
        double total = 0;

        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularVolumen();
        }

        return total;
    }

    public void listarFiguras() {
        for (Figura figura : figuras) {
            figura.imprimirInformacion();
            System.out.println("---------------------");
        }
    }

    public void listarCuerpos() {
        for (Cuerpo cuerpo : cuerpos) {
            cuerpo.imprimirInformacion();
            System.out.println("---------------------");
        }
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "figuras=" + figuras +
                ", cuerpos=" + cuerpos +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Coleccion))
            return false;

        Coleccion otra = (Coleccion) obj;

        return figuras.equals(otra.figuras)
                && cuerpos.equals(otra.cuerpos);
    }
}
