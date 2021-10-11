/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Inserta_Datos {
private static Inserta_Datos INSTANCE = null;
private Connection conexion = null;
    private String servidor;
    private String nombreBD;
    private String usuario;
    private String contraseña;
    private String url;
    private String query;
    private int id_insertado;
        private Statement sentencia = null;

 
private Inserta_Datos(){
    servidor = "localhost";
    nombreBD = "Academia";
    usuario = "postgres";
    contraseña = "admi";
    //contraseña = "1234";
    url = "";
    
}
private static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Inserta_Datos();
        }
    }

    public static Inserta_Datos getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        
        return INSTANCE;
    }


public void conectar(){
    try {
            
            Class.forName("org.postgresql.Driver");
            
            url="jdbc:postgresql://localhost:5432/Academia";
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar la Base de Datos" + ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar la Base de Datos" + ex);
        } 
    }
public void cerrarConexion() {
        try {
              this.conexion.close();
              System.out.println("Cerrando conexion a " + url + " . . . . . Ok");
            } catch (Exception errorCONN) {
                errorCONN.printStackTrace();
            }
    }
public int query(String consulta) {
        int r = 0;
        try {
            this.query = consulta;
            Statement stmt = this.conexion.prepareStatement(this.query, Statement.RETURN_GENERATED_KEYS);
            r = stmt.executeUpdate(this.query);

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                this.id_insertado = rs.getInt(1);
            }
        } catch (SQLException ex) {
        }
        return r;
    }

        public ResultSet queryR(String consulta) throws SQLException {
        ResultSet r = null;
        
            this.query = consulta;
            PreparedStatement stmt = this.conexion.prepareStatement(this.query);
            r = stmt.executeQuery();
        
        return r;
    }

    public void statement(String sentenciaSQL){
    try {
        sentencia=conexion.createStatement();
        sentencia.execute(sentenciaSQL);          
        
    } catch (SQLException ex) {
        Logger.getLogger(Inserta_Datos.class.getName()).log(Level.SEVERE, null, ex);
        
        
    }     
}

}