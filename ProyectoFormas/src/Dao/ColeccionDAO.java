package Dao;

import Entidades.*;
import java.util.List;

public interface ColeccionDAO {


    void guardarFigura(Figura figura);


    void guardarCuerpo(Cuerpo cuerpo);


    List<Figura> obtenerFiguras();


    List<Cuerpo> obtenerCuerpos();

}
