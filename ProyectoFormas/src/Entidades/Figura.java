package Entidades;

import java.util.Objects;

public abstract  class Figura implements Forma {
    private String nombre;

    // Getter
    public String getNombre() {
        return nombre;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirInformacion() {
        System.out.println(toString());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }


    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Figura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Figura figura = (Figura) obj;

        return Objects.equals(nombre, figura.nombre);
    }

    public int hashCode() {
        return Objects.hash(nombre);
    }
}
