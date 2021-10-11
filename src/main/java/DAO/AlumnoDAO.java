/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CapaDatos.Inserta_Datos;
import CapaLogica.Alumno;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlumnoDAO {
    private Inserta_Datos db;
    private ArrayList <Alumno> listaAlumnos= new ArrayList<Alumno>();
    
    public AlumnoDAO() {
        db = Inserta_Datos.getInstance();
    }
    
    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
    
    public void agregarAlumno(Alumno p){
        this.listaAlumnos.add(p);
    }

    public void setListaMesas(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    public ArrayList getAlumnos() {
        try {
            listaAlumnos.clear();
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM alumno";
            this.db.conectar();
            resultSet = this.db.queryR(consulta);
            Alumno b;
         
            if (resultSet != null) {
                
                while (resultSet.next()) {
                    b = new Alumno(resultSet.getInt("DNI"), resultSet.getString("nombre"),resultSet.getString("apellido"),resultSet.getInt("telefono"),resultSet.getInt("edad"),resultSet.getString("direccion"),resultSet.getDate("fechaNac"),resultSet.getString("diasAsignados"),resultSet.getInt("contactoEmergencia"));
                    this.listaAlumnos.add(b);
                }
                resultSet.close();
            }
            this.db.cerrarConexion();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());//mostrar el Error
        }
        for (int i=0;i<listaAlumnos.size();i++) {
                    Alumno b;
                    b=listaAlumnos.get(i);
                    System.out.print("i="+i+" ");
                    b.toString();
        }
        return this.listaAlumnos;
    }
    
    public Alumno getMesa(int num) {
        Alumno c = null;
        try {
            ResultSet resultSet = null;
            String consulta = "SELECT * FROM alumno WHERE dni=" + num;
            this.db.conectar();
            
            resultSet = this.db.queryR(consulta);
            if (resultSet != null && resultSet.next()) {
                c= new Alumno(resultSet.getInt("DNI"), resultSet.getString("nombre"),resultSet.getString("apellido"),resultSet.getInt("telefono"),resultSet.getInt("edad"),resultSet.getString("direccion"),resultSet.getDate("fechaNac"),resultSet.getString("diasAsignados"),resultSet.getInt("contactoEmergencia"));
            }
            this.db.cerrarConexion();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());//mostrar el Error
        }
        return c;
    }
    
}
