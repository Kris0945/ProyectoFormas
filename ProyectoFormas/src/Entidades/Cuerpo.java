package Entidades;

import java.util.Objects;

public abstract class Cuerpo implements Forma {

    private String nombre;

    public Cuerpo(String nombre) {
        this.nombre = nombre;
    }

    // Método
    public abstract double calcularVolumen();

    // Getter
    public String getNombre() {
        return nombre;
    }


    //Stter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(toString());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

    @Override
    public String toString() {
        return "Cuerpo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Cuerpo cuerpo = (Cuerpo) obj;

        return Objects.equals(nombre, cuerpo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
