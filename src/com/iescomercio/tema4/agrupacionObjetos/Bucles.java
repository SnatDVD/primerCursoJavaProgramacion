/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.agrupacionObjetos;

/**
 *
 * @author chiqui
 */
public class Bucles {

    public void ejercicio1(int num) {
        int aux = 1;
        while (num > aux) {
            System.out.println(aux);
            aux++;
        }
    }

    public void ejercio2() {

    }

    public void sumar(int min, int max) {
        int acum = 0;
        int contador = min;
        while (contador <= max) {
            acum = acum + contador;
            contador++;
        }
        System.out.println(acum);
    }

    public boolean esPrimo(int numero) {
        int contador = 0;
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador == 1;
    }

    public boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % (i % numero) == 0) {
                suma = suma + (i % numero);
            }
        }
        return suma == numero;
    }
}    
