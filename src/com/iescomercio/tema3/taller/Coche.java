/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3.taller;

import com.iescomercio.tools.AleatorioFloat;

/**
 *
 * @author chiqui
 */
public class Coche {
    private Motor motor;
    private String marca;
    private String modelo;
    private double precioDeAveria;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        precioDeAveria = 0;
        motor = new Motor(500);
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioDeAveria() {
        return precioDeAveria;
    }
    
    public void verCoche(){
        System.out.println("**********************************");
        System.out.println("*         DATOS DEL COCHE        *");
        System.out.println("**********************************");
        System.out.println("Litros de aceite: " + motor.getLitrosAceite());
        System.out.println("Caballos: " + motor.getCv());
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Precio: " + (int) precioDeAveria + "€");
        System.out.println("---------------------------------------------");
    }
    
    public void setPrecioDeAveria(){
        AleatorioFloat aleatorioFloat = new AleatorioFloat(100, 1000);
        precioDeAveria = precioDeAveria + (aleatorioFloat.dameAleatorio());
    }
    
    public void acumularAveria (double incrementoAveria){
        precioDeAveria = precioDeAveria + incrementoAveria;
    }
    
}
