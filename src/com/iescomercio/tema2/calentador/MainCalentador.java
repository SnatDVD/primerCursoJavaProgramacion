/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema2.calentador;

import com.iescomercio.tema2.calentador.Calentador;

/**
 *
 * @author chiqui
 */
public class MainCalentador {
    public static void main(String[] args) {
        Calentador c1 = new Calentador(1, 29, "01234567");
        c1.calentar();
        c1.imprimirDatos();
    }
    
}
