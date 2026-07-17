package Entidades;

public class Esfera extends Cuerpo {
    private double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    //Getter
    public double getRadio() {
        return radio;
    }

    //Setter

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {

        return 4 * Math.PI * radio * radio;
    }

    public double calcularPerimetro() {

        return 2 * Math.PI * radio;
    }

    public double calcularVolumen() {

        return (4.0 / 3.0) *
                Math.PI *
                Math.pow(radio, 3);
    }

    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Esfera))
            return false;

        Esfera otra = (Esfera) obj;

        return radio == otra.radio;
    }
}
