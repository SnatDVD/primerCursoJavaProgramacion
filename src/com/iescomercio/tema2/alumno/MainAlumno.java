package com.iescomercio.tema2.alumno;

/**
 *
 * @author chiqui
 */
public class MainAlumno {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Miguel Vegas Serrano", 22, 'n');
        a1.ponerNotaInjusta();
        
        a1.imprimirDetalles();
    }
    
}
