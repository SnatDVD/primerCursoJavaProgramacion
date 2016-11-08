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
public class Alumno {
    private int expediente;
    private String nombreCompleto;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;
    
    public Alumno (int expediente){
        this.expediente = expediente;
        nombreCompleto = "";
        asignatura1 = null;
        asignatura2 = null;
        asignatura3 = null;
        
    }
    
    public Alumno (int expediente, String nombreCompleto){
        this.expediente = expediente;
        this.nombreCompleto = nombreCompleto;
        asignatura1 = null;
        asignatura2 = null;
        asignatura3 = null;
    }

    public int getExpediente() {
        return expediente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }
}
