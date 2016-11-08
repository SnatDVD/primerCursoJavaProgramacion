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
public class Motor {
    private int litrosAceite;
    private int Cv;

    public Motor(int Cv) {
        this.Cv = Cv;
        litrosAceite = 0;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return Cv;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
    
    
    
    
}
