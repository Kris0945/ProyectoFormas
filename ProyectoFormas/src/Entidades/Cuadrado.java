package Entidades;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return getBase();
    }

    public void setLado(double lado) {
        setBase(lado);
        setAltura(lado);
    }


    public String toString() {
        return "Cuadrado{" +
                "lado=" + getLado() +
                '}';
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Cuadrado))
            return false;

        Cuadrado otro = (Cuadrado) obj;

        return getLado() == otro.getLado();
    }
}
