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
public class MainRelojAlarma {
    public static void main(String[] args) {
        RelojAlarma ra1 = new RelojAlarma(12, 20, 12, 30);
        System.out.println(ra1.getHoraAlarma());
        ra1.printHora();
    }
    
}
