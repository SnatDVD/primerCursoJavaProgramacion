/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.club;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author chiqui
 */
public class Club {

    private ArrayList<Socio> socios;

    /**
     * Constructor for objects of class Club
     */
    public Club() {
        socios = new ArrayList<Socio>();
    }

    /**
     * Add a new member to the club's list of members.
     *
     * @param socio The member object to be added.
     */
    public void asociar(Socio miembro) {
        socios.add(miembro);
    }

    /**
     * @return The number of members (Membership objects) in the club.
     */
    public int numeroSocios() {
        int contSocios = 0;
        while (socios.size() > 0) {
            contSocios++;

        }
        return contSocios;
    }

    public void listarMiembros() {
        Iterator<Socio> it = socios.iterator();

        System.out.println("*********************");
        System.out.println("    LISTA SOCIOS     ");
        System.out.println("*********************");

        while (it.hasNext()) {
            System.out.println(it.next());

        }
        System.out.println("******************************");
    }

    public ArrayList<Socio> purgar(int mes) {
        ArrayList<Socio> listaPurgar = new ArrayList<Socio>();
        Iterator<Socio> it = socios.iterator();
        Socio aux;

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getMes() == mes) {
                listaPurgar.add(aux);
                it.remove();
            }
        }
        return listaPurgar;
    }

    public void añadirMujeres() {
        ArrayList<Socio> listaConMujeres = new ArrayList<Socio>();
        Socio aux;
        
        for(Socio s:socios){
            if(!s.getNombre().contains("Mujer de ") ){
                aux = new Socio("Mujer de " + s.getNombre(), s.getMes(), s.getAño());
                listaConMujeres.add(aux);
            }
        }
        socios.addAll(listaConMujeres);
    }    
    
//        Iterator<Socio> it = socios.iterator();
//        int contadorMujeres = 0;
//        
//        while (it.hasNext()) {
//            aux = it.next();
//            if ( socios.size()> contadorMujeres) {
//                listaConMujeres.add(aux);
//                System.out.println("Mujer de " + aux);
//                if(!aux.getNombre().contains("Mujer de") )
//                    asociar(new Socio("Mujer de" + aux.getNombre(), aux.getMes(), aux.getAño()));
//                contadorMujeres++;
//
//            } 
//        }
//        return socios;
//    }
    
    public ArrayList<Socio> sociosMes(int mes){
        ArrayList<Socio> sociosMes = new ArrayList<Socio>();
        Iterator<Socio> it = socios.iterator();
        Socio aux;
        
        while(it.hasNext()){
            aux = it.next();
            if(aux.getMes() == mes)
                sociosMes.add(aux);
        }
        return sociosMes;
    }
    
    public void socioMes2(int mes){
        Iterator<Socio> it = socios.iterator();
        Socio aux;
        
        while(it.hasNext()){
            aux = it.next();
            if(aux.getMes() == mes){
                System.out.println(aux);
            }
        }
    }
    
    public boolean estaSocio(String nombre){
        Iterator<Socio> it = socios.iterator();
        boolean encontrado = false;
        Socio aux;
        
        while(it.hasNext()){
            aux = it.next();
            if(aux.getNombre() == nombre){
                encontrado = true;
                
            }
        }
        return encontrado;
    }
    
    public void cambiarMes(){
        ArrayList<Socio> cambiarMes = new ArrayList<Socio>();
        Socio aux;
        
        for(Socio s:socios){
            int mesActual = s.getMes();
            
            if(mesActual<12){
                s.setMes(s.getMes() + 1);
                cambiarMes.add(s);
            }else{
                s.setMes(1);
               
            }
        }
    }    
}    
