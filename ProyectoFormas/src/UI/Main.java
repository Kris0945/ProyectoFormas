package UI;

import Dao.ColeccionDAO;
import Dao.ColeccionDAOImpl;
import Logica.GestorColeccion;
import UI.Menu;


public class Main {

    public static void main(String[] args) {


        ColeccionDAO dao = new ColeccionDAOImpl();


        GestorColeccion gestor =
                new GestorColeccion(dao);


        Menu menu =
                new Menu(gestor);


        menu.mostrarMenu();

    }
}