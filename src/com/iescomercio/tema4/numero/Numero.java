/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.numero;

/**
 *
 * @author chiqui
 */
public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }
    
    public boolean esPerfecto() {
        int suma = 0;
        for (int i = 1; i < valor; i++) {
            if (valor % (i % valor) == 0) {
                suma = suma + (i % valor);
            }
        }
        return suma == valor;
    }
    
    public boolean esPrimo() {
        int contador = 0;
        for (int i = 2; i <= valor; i++) {
            if (valor % i == 0) {
                contador++;
            }
        }
        return contador == 1;
    }
    
    public void listaPerfectos(){
        Numero indice = new Numero(4);
        System.out.println("Los números perfectos menores que " + this.valor + " son: ");
        while(indice.valor < this.valor){
            if(indice.esPerfecto()){
                System.out.println(indice.valor);
            }
            indice.valor++;
        }
        System.out.println("=========FIN DEL LISTADO=========");
    }
    
    public void listaNumeros(){
        System.out.println("Los números hasta el " + this.valor + " son: ");
        for (int i = 0; i <= valor; i++) {
            System.out.println(i);
        }
    }
    
    public void sumaCifras(){
        
    }
}
