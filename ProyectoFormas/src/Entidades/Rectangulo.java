package Entidades;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    //Getter
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    //Setter

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularArea() {
        return base * altura;
    }

    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public boolean equals(Object obj) {

        if (!super.equals(obj))
            return false;

        Rectangulo otro = (Rectangulo) obj;

        return base == otro.base &&
                altura == otro.altura;
    }
}
