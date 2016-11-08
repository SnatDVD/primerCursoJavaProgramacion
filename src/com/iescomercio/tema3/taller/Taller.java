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
public class Taller {
    private Coche coche;
    private String averia;
    private int numeroCoches = 0;
    private boolean atendido;
    
    public boolean aceptarCoche(Coche coche, String averia) {
        if (atendido == false) {
            this.coche = coche;
            this.averia = averia;
            atendido = true;
            numeroCoches++;
            
            if ("aceite".equals(averia)){
                coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite()+10);
            }
            return true;
            
        } else {
            System.out.println("El taller esta ocupado, saca primero el coche");
            return false;
        }
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }
    
    
    public void devolvercoche(){
        atendido = false;
    }
  
    
}
