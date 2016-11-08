/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3.instituto;

import com.iescomercio.tools.AleatorioInt;

/**
 *
 * @author chiqui
 */
public class Profesor {

    public void ponerNotas(Alumno alum) {
        AleatorioInt aleatorio = new AleatorioInt(0, 10);

        if (alum.getAsignatura1() != null) {
            alum.getAsignatura1().setCalificacion(aleatorio.dameAleatorioEntero());
        }
        if (alum.getAsignatura2() != null) {
            alum.getAsignatura2().setCalificacion(aleatorio.dameAleatorioEntero());
        }
        if (alum.getAsignatura3() != null) {
            alum.getAsignatura3().setCalificacion(aleatorio.dameAleatorioEntero());
        }
    }

    public double calcularMedia(Alumno alum) {
        double media;
        int numAsig = 0;
        int sumatorio = 0;

        if (alum.getAsignatura1() != null) {
            numAsig++;
            sumatorio = sumatorio + alum.getAsignatura1().getCalificacion();
        }

        if (alum.getAsignatura2() != null) {
            numAsig++;
            sumatorio = sumatorio + alum.getAsignatura2().getCalificacion();
        }

        if (alum.getAsignatura3() != null) {
            numAsig++;
            sumatorio = sumatorio + alum.getAsignatura3().getCalificacion();
        }

        if (numAsig == 0) {
            System.out.println("No se puede calcular, el alumno no tiene asignaturas.");
        }

        media = (double) sumatorio / numAsig;

        return media;
    }
}
