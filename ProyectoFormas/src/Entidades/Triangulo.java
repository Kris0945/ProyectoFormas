package Entidades;

import excepciones.TrianguloInvalidoException;

public class Triangulo extends Figura {
    protected double lado1;
    protected double lado2;
    protected double lado3;

    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Métodos

    public static Triangulo crearTriangulo(double a, double b, double c)
            throws TrianguloInvalidoException {

        if (a + b <= c || a + c <= b || b + c <= a) {// Para verificar que exista el triángul
            throw new TrianguloInvalidoException(
                    "Los lados no forman un triángulo válido."
            );
        }

        if (a == b && b == c) {
            return new Equilatero(a);
        }

        if (a == b) {
            return new Isosceles(a, c);
        }

        if (a == c) {
            return new Isosceles(a, b);
        }

        if (b == c) {
            return new Isosceles(b, a);
        }

        return new Escaleno(a, b, c);
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularArea() {
        double s = calcularPerimetro() / 2;

        return Math.sqrt(
                s *
                        (s - lado1) *
                        (s - lado2) *
                        (s - lado3)
        );
    }

    //Getter

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    //Setter

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }


    public String toString() {
        return getNombre() +
                "{lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }


    public boolean equals(Object obj) {

        if (!super.equals(obj))
            return false;

        Triangulo otro = (Triangulo) obj;

        return lado1 == otro.lado1 &&
                lado2 == otro.lado2 &&
                lado3 == otro.lado3;
    }
}
