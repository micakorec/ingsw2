/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import java.util.Date;


public class Alumno extends Persona{
    private enum categoria{infantil, junior, adulto, mayor};
    private int edad;
    private String direccion;
    private Date fechaNac;
    private String diasAsignados;
    private int contactoEmergencia;

    public Alumno(int DNI, String nombre, String apellido, int telefono, int edad, String direccion, Date fechaNac, String diasAsignados, int contactoEmergencia){
        super(DNI, nombre, apellido, telefono);
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.diasAsignados = diasAsignados;
        this.contactoEmergencia = contactoEmergencia;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDiasAsignados() {
        return diasAsignados;
    }

    public void setDiasAsignados(String diasAsignados) {
        this.diasAsignados = diasAsignados;
    }

    public int getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(int contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }
    
}
