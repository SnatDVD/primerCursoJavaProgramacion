/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3.taller;

/**
 *
 * @author chiqui
 */
public class Main {

    public static void main(String[] args) {

        Taller taller1 = new Taller();

        Coche coche1 = new Coche("Mustang", "GT");
        Coche coche2 = new Coche("Chevrolet", "Camaro");
        Coche coche3 = new Coche("Porche", "911");
        
        taller1.aceptarCoche(coche1, "aceite");
        coche1.setPrecioDeAveria();
        taller1.devolvercoche();
        coche1.verCoche();
        taller1.aceptarCoche(coche2, "ruedas");
        coche2.setPrecioDeAveria();
        coche2.verCoche();
        System.out.println(" ** Numero de coches que han visitado el taller: " + taller1.getNumeroCoches());
        taller1.aceptarCoche(coche3, "averia");
        
        
        
 

    }
}    