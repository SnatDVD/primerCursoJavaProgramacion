/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.club;

import java.util.ArrayList;

/**
 *
 * @author chiqui
 */
public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Pepito", 1, 2016);
        Socio socio2 = new Socio("Juanito", 2, 2014);
        Socio socio3 = new Socio("Anita", 3, 1960);
        Socio socio4 = new Socio("Juan", 4, 2000);
        Socio socio5 = new Socio("Tania", 5, 2010);
        Socio socio6 = new Socio("David", 6, 1994);
        Socio socio7 = new Socio("Miguel", 7, 1993);
        Socio socio8 = new Socio("Chiqui", 9, 1994);
        Socio socio9 = new Socio("Asier", 9, 2016);
        Socio socio10 = new Socio("Antonio", 12, 2016);
        
        Club club1 = new Club();
        
        club1.asociar(socio1);
        club1.asociar(socio2);
        club1.asociar(socio3);
        club1.asociar(socio4);
        club1.asociar(socio5);
        club1.asociar(socio6);
        club1.asociar(socio7);
        club1.asociar(socio8);
        club1.asociar(socio9);
        club1.asociar(socio10);

        ArrayList<Socio> a = club1.cambiarMes();
        
        System.out.println(a);

        
        
        
        
    }
}
