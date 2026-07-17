package Entidades;

public class Escaleno extends Triangulo {
    public Escaleno(double lado1, double lado2, double lado3) {
        super("Escaleno", lado1, lado2, lado3);
    }


    public String toString() {
        return "Escaleno{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }
}
