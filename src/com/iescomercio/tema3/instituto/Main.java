package com.iescomercio.tema3.instituto;

/**
 *
 * @author chiqui
 */
public class Main {
    public static void main(String[] args) {
        Asignatura asig1 = new Asignatura(1);
        Asignatura asig2 = new Asignatura(2);
        Asignatura asig3 = new Asignatura(3);
        
        Alumno alum1 = new Alumno(1, "Miguel Vegas");
        alum1.setAsignatura1(asig1);
        alum1.setAsignatura2(asig2);
        alum1.setAsignatura3(asig3);
        
        
        Profesor profe1 = new Profesor();
        profe1.ponerNotas(alum1);
        
        System.out.println("Asignatura 1: " + alum1.getAsignatura1().getCalificacion());
        System.out.println("Asignatura 2: " + alum1.getAsignatura2().getCalificacion());
        System.out.println("Asignatura 3: " + alum1.getAsignatura3().getCalificacion());
        
        System.out.println("La nota media de " + alum1.getNombreCompleto() + " es: " + (int) profe1.calcularMedia(alum1));
        
    }
    
}
