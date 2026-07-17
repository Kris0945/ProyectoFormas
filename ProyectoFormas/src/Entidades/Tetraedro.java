package Entidades;

public class Tetraedro extends Cuerpo {
    private Triangulo cara;

    public Tetraedro(Triangulo cara) {
        super("Tetraedro");
        this.cara = cara;
    }

    public Triangulo getCara() {
        return cara;
    }

    public void setCara(Triangulo cara) {
        this.cara = cara;
    }


    public double calcularArea() {

        // Un tetraedro tiene 4 caras triangulares
        return 4 * cara.calcularArea();
    }



    public double calcularPerimetro() {

        return cara.calcularPerimetro();
    }


    public double calcularVolumen() {
        double lado = cara.getLado1();

        return Math.pow(lado, 3) /
                (6 * Math.sqrt(2));
    }



    public String toString() {
        return "Tetraedro{" +
                "lado=" + cara.getLado1() +
                '}';
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Tetraedro))
            return false;

        Tetraedro otro = (Tetraedro) obj;

        return cara.equals(otro.cara);
    }
}
