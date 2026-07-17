package Entidades;

public class Cubo extends Cuerpo {
    private Cuadrado cara;

    public Cubo(Cuadrado cara) {
        super("Cubo");
        this.cara = cara;
    }

    //Getter
    public Cuadrado getCara() {
        return cara;
    }

    //Setters

    public void setCara(Cuadrado cara) {
        this.cara = cara;
    }

    public double calcularArea() {
        return 6 * cara.calcularArea();
    }


    public double calcularPerimetro() {
        return cara.calcularPerimetro();
    }


    public double calcularVolumen() {
        double lado = cara.getLado();
        return lado * lado * lado;
    }

    public String toString() {
        return "Cubo{" +
                "lado=" + cara.getLado() +
                '}';
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Cubo))
            return false;

        Cubo otro = (Cubo) obj;

        return cara.equals(otro.cara);
    }
}
