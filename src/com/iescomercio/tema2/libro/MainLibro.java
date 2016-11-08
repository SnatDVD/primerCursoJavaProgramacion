/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema2.libro;

/**
 *
 * @author chiqui
 */
public class MainLibro {
    public static void main(String[] args) {
        //Libro l1= new Libro("Davicito", "Quijote", 456);
        //l1.imprimirDetalles();
        
        Libro l2 = new Libro("Miguel", "Titulo", 50, "Hola");
        l2.prestar();
        l2.imprimirDetalles();
    }
   
}
