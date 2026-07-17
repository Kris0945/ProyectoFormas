package Entidades;

public class Equilatero extends Triangulo {
    public Equilatero(double lado) {
        super("Equilatero", lado, lado, lado);
    }

    //Getter
    public double getLado() {
        return lado1;
    }

    //Setter

    public void setLado(double lado) {
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
    }


    public String toString() {
        return "Equilatero{" +
                "lado=" + lado1 +
                '}';
    }
}
