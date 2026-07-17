package Dao;

import Entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ColeccionDAOImpl implements ColeccionDAO{
    private Connection conexion;

    public ColeccionDAOImpl() {
        conexion = ConexionMySQL.conectar();
    }

    public void guardarFigura(Figura figura) {

        String sql = "INSERT INTO figuras(nombre, area, perimetro) VALUES(?,?,?)";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, figura.getNombre());
            ps.setDouble(2, figura.calcularArea());
            ps.setDouble(3, figura.calcularPerimetro());

            ps.executeUpdate();

            ps.close();

        } catch(SQLException e) {

            System.out.println("Error guardando figura: " + e.getMessage());
        }
    }


    public void guardarCuerpo(Cuerpo cuerpo) {

        String sql = "INSERT INTO cuerpos(nombre, area, perimetro, volumen) VALUES(?,?,?,?)";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, cuerpo.getNombre());
            ps.setDouble(2, cuerpo.calcularArea());
            ps.setDouble(3, cuerpo.calcularPerimetro());
            ps.setDouble(4, cuerpo.calcularVolumen());

            ps.executeUpdate();

            ps.close();

        } catch(SQLException e) {

            System.out.println("Error guardando cuerpo: " + e.getMessage());
        }
    }


    public List<Figura> obtenerFiguras() {

        List<Figura> lista = new ArrayList<>();

        String sql = "SELECT * FROM figuras";

        try {

            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {

            }

            rs.close();
            st.close();

        } catch(SQLException e) {

            System.out.println(e.getMessage());
        }

        return lista;
    }


    public List<Cuerpo> obtenerCuerpos() {

        List<Cuerpo> lista = new ArrayList<>();

        String sql = "SELECT * FROM cuerpos";

        try {

            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {

            }

            rs.close();
            st.close();

        } catch(SQLException e) {

            System.out.println(e.getMessage());
        }

        return lista;
    }
}
