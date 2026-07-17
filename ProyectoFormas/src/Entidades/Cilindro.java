package Entidades;

public class Cilindro extends Cuerpo {
    private Circulo base;
    private Rectangulo superficie;

    public Cilindro(Circulo base, Rectangulo superficie) {
        super("Cilindro");
        this.base = base;
        this.superficie = superficie;
    }

    //Getters

    public Circulo getBase() {
        return base;
    }

    public Rectangulo getSuperficie() {
        return superficie;
    }

    //Setters

    public void setBase(Circulo base) {
        this.base = base;
    }

    public void setSuperficie(Rectangulo superficie) {
        this.superficie = superficie;
    }

    public double calcularArea() {
        return (2 * base.calcularArea())
                + superficie.calcularArea();
    }


    public double calcularPerimetro() {
        return base.calcularPerimetro();
    }

    public double calcularVolumen() {

        double radio = base.getRadio();
        double altura = superficie.getAltura();

        return Math.PI * radio * radio * altura;
    }


    public String toString() {
        return "Cilindro{" +
                "radio=" + base.getRadio() +
                '}';
    }


    public boolean equals(Object obj) {

        if (!(obj instanceof Cilindro))
            return false;

        Cilindro otro = (Cilindro) obj;

        return base.equals(otro.base)
                && superficie.equals(otro.superficie);
    }
}
