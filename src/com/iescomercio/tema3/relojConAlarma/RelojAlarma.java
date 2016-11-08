/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3.relojConAlarma;

/**
 *
 * @author chiqui
 */
public class RelojAlarma {

    private ClockDisplay reloj;
    private ClockDisplay alarma;

    public RelojAlarma(int horaReloj, int minutosReloj, int horaAlarma, int minutosAlarma) {
        reloj = new ClockDisplay(horaReloj, minutosReloj);
        alarma = new ClockDisplay(horaAlarma, minutosAlarma);

    }

    public RelojAlarma(int horaReloj, int minutosReloj) {
        reloj = new ClockDisplay(horaReloj, minutosReloj);
        alarma = new ClockDisplay();

    }

    public RelojAlarma() {
        reloj = new ClockDisplay();
        alarma = new ClockDisplay();
    }

    public String getHoraReloj() {
        return reloj.getTime();
    }

    public String getHoraAlarma() {
        return alarma.getTime();
    }

    public void setHoraReloj(int horaNueva, int minutosNuevos) {
        reloj.setTime(horaNueva, minutosNuevos);
    }

    public void setHoraAlarma(int horaNueva, int minutosNuevos) {
        reloj.setTime(horaNueva, minutosNuevos);
    }
    
    public void ticTac() {
        reloj.timeTick();
    }

    public void printHora() {
        reloj.printTime();
    }

}
