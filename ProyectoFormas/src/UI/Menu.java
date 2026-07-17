package UI;
import Entidades.*;
import Excepciones.TrianguloInvalidoException;
import Logica.GestorColeccion;
import java.util.Scanner;
import Dao.ColeccionDAO;
import Dao.ColeccionDAOImpl;
import Logica.GestorColeccion;

public class Menu {



    private GestorColeccion gestor;
    private Scanner teclado;


    public Menu(GestorColeccion gestor) {

        this.gestor = gestor;
        teclado = new Scanner(System.in);

    }



    public void mostrarMenu() {


        int opcion;


        do {

            System.out.println("\n===== MENU GEOMETRÍA =====");
            System.out.println("1. Agregar figura");
            System.out.println("2. Agregar cuerpo");
            System.out.println("3. Listar figuras");
            System.out.println("4. Listar cuerpos");
            System.out.println("5. Área total");
            System.out.println("6. Perímetro total");
            System.out.println("7. Volumen total");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");


            opcion = teclado.nextInt();



            switch(opcion) {


                case 1:
                    agregarFigura();
                    break;


                case 2:
                    agregarCuerpo();
                    break;


                case 3:
                    listarFiguras();
                    break;


                case 4:
                    listarCuerpos();
                    break;


                case 5:
                    System.out.println(
                            "Área total: "
                                    + gestor.obtenerAreaTotal()
                    );
                    break;


                case 6:
                    System.out.println(
                            "Perímetro total: "
                                    + gestor.obtenerPerimetroTotal()
                    );
                    break;


                case 7:
                    System.out.println(
                            "Volumen total: "
                                    + gestor.obtenerVolumenTotal()
                    );
                    break;


                case 0:
                    System.out.println("Programa finalizado");
                    break;


                default:
                    System.out.println("Opción inválida");

            }


        } while(opcion != 0);

    }





    private void agregarFigura() {


        System.out.println("\n1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rombo");
        System.out.println("5. Triángulo");


        int opcion = teclado.nextInt();


        Figura figura = null;



        switch(opcion) {


            case 1:

                System.out.print("Radio: ");
                double radio = teclado.nextDouble();

                figura = new Circulo(radio);

                break;



            case 2:

                System.out.print("Base: ");
                double base = teclado.nextDouble();

                System.out.print("Altura: ");
                double altura = teclado.nextDouble();

                figura = new Rectangulo(base, altura);

                break;



            case 3:

                System.out.print("Lado: ");
                double lado = teclado.nextDouble();

                figura = new Cuadrado(lado);

                break;



            case 4:

                System.out.print("Lado: ");
                double ladoR = teclado.nextDouble();

                System.out.print("Diagonal mayor: ");
                double dMayor = teclado.nextDouble();

                System.out.print("Diagonal menor: ");
                double dMenor = teclado.nextDouble();


                figura =
                        new Rombo(ladoR, dMayor, dMenor);

                break;



            case 5:

                try {

                    System.out.print("Lado 1: ");
                    double a = teclado.nextDouble();

                    System.out.print("Lado 2: ");
                    double b = teclado.nextDouble();

                    System.out.print("Lado 3: ");
                    double c = teclado.nextDouble();


                    figura =
                            Triangulo.crearTriangulo(a,b,c);


                } catch(TrianguloInvalidoException e) {

                    System.out.println(e.getMessage());
                }

                break;


        }



        if(figura != null) {

            gestor.agregarFigura(figura);

            System.out.println(
                    "Figura agregada correctamente"
            );
        }

    }






    private void agregarCuerpo() {


        System.out.println("\n1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Esfera");
        System.out.println("4. Tetraedro");


        int opcion = teclado.nextInt();


        Cuerpo cuerpo = null;



        switch(opcion) {


            case 1:

                System.out.print("Lado del cubo: ");

                double lado =
                        teclado.nextDouble();


                cuerpo =
                        new Cubo(
                                new Cuadrado(lado)
                        );

                break;



            case 2:

                System.out.print("Radio: ");

                double radio =
                        teclado.nextDouble();


                System.out.print("Altura: ");

                double altura =
                        teclado.nextDouble();


                cuerpo =
                        new Cilindro(
                                new Circulo(radio),
                                new Rectangulo(
                                        2*Math.PI*radio,
                                        altura
                                )
                        );

                break;



            case 3:

                System.out.print("Radio: ");

                double radioEsfera =
                        teclado.nextDouble();


                cuerpo =
                        new Esfera(radioEsfera);

                break;



            case 4:

                System.out.print("Lado tetraedro: ");

                double ladoT =
                        teclado.nextDouble();


                cuerpo =
                        new Tetraedro(
                                new Equilatero(ladoT)
                        );

                break;

        }



        if(cuerpo != null) {

            gestor.agregarCuerpo(cuerpo);

            System.out.println(
                    "Cuerpo agregado correctamente"
            );
        }

    }





    private void listarFiguras() {

        for(Figura f : gestor.listarFiguras()) {

            f.imprimirInformacion();

            System.out.println("----------------");

        }

    }





    private void listarCuerpos() {

        for(Cuerpo c : gestor.listarCuerpos()) {

            c.imprimirInformacion();

            System.out.println("----------------");

        }

    }
}
