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
public class AleatorioFloat {
    private float nInicial, nFinal;

    public AleatorioFloat(float pInicial, float pFinal) {
        nInicial = pInicial;
        nFinal = pFinal;
    }

    public AleatorioFloat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void muestraAleatorios(float pCantidad) {
        float cantidad;
        for (cantidad = pCantidad; cantidad > 0; cantidad--) {
            dameAleatorio();
        }
    }
    public float dameAleatorio () {
        float numero;
        numero = (float) (Math.random() * (nFinal - nInicial + 1) + nInicial);
        return numero;
    }
}
