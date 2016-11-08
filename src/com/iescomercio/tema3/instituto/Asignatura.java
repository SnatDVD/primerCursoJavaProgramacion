/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3.instituto;

/**
 *
 * @author chiqui
 */
public class Asignatura {
    private int identificador;
    private int calificacion;

    public Asignatura(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
     
}
