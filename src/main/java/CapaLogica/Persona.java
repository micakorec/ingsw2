/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

/**
 *
 * @author Rocio
 */
public class Persona {
    private int DNI;
    private String nombre;
    private String apellido;
    private int telefono;
    
    public Persona(int DNI, String nombre, String apellido, int telefono){
       this.DNI = DNI;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
}
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setDNI(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
