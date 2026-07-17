package Entidades;

public class Isosceles extends Triangulo {
    public Isosceles(double ladoIgual, double base) {
        super("Isosceles", ladoIgual, ladoIgual, base);
    }

    //Getter

    public double getLadoIgual() {
        return lado1;
    }
    public double getBase() {
        return lado3;
    }

    //Setter

    public void setLadoIgual(double lado) {
        this.lado1 = lado;
        this.lado2 = lado;
    }

    public void setBase(double base) {
        this.lado3 = base;
    }


    public String toString() {
        return "Isosceles{" +
                "ladoIgual=" + lado1 +
                ", base=" + lado3 +
                '}';
    }

}
