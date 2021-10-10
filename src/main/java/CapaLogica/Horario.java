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
public class Horario {
    private String horaInicio;
    private String horaFin;
    private String dia;
    
    public Horario(String horaInicio, String horaFin, String dia){
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
    }
    
    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
