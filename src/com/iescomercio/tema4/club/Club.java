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
            if (aux.getMes() == mes){
                listaPurgar.add(aux);
                it.remove();
            }
        }
        return listaPurgar;
    }
}
