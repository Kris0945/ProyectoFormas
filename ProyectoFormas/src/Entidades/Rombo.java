package Entidades;

public class Rombo extends Figura {
    private double lado;
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double lado, double diagonalMayor, double diagonalMenor) {
        super("Rombo");
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    //Getter
    public double getLado() {
        return lado;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    //Stter
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public String toString() {
        return "Rombo{" +
                "lado=" + lado +
                ", diagonalMayor=" + diagonalMayor +
                ", diagonalMenor=" + diagonalMenor +
                '}';
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;

        Rombo otro = (Rombo) obj;

        return lado == otro.lado &&
                diagonalMayor == otro.diagonalMayor &&
                diagonalMenor == otro.diagonalMenor;
    }
}
