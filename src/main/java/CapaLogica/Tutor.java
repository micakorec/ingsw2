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
public class Tutor extends Persona{
    private String relacion;
    
    public Tutor(int DNI, String nombre, String apellido, int telefono, String relacion){
        super(DNI, nombre, apellido, telefono);
        this.relacion=relacion;
    }
    
    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
}
    
}