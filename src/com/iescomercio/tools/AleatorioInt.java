/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tools;

/**
 *
 * @author Chiqui
 */
public class AleatorioInt {
    private final int nInicial, nFinal;

    public AleatorioInt(int pInicial, int pFinal) {
        nInicial = pInicial;
        nFinal = pFinal;
    }
    
    public void muestraAleatoriosEntero(int pCantidad) {
        int cantidad;
        for (cantidad = pCantidad; cantidad > 0; cantidad--) {
            dameAleatorioEntero();
        }
    }
    public int dameAleatorioEntero () {
        int numero;
        numero = (int) (Math.random() * (nFinal - nInicial + 1) + nInicial);
        return numero;
    }
}
