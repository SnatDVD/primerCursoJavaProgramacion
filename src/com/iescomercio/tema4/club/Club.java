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

    public void listarMiembrosFor() {
        System.out.println("*********************");
        System.out.println("    LISTA SOCIOS     ");
        System.out.println("*********************");

        for (Socio s : socios) {
            System.out.println(s.toString());
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

        for (Socio s : socios) {
            if (!s.getNombre().contains("Mujer de ")) {
                aux = new Socio("Mujer de " + s.getNombre(), s.getMes(), s.getAño());
                listaConMujeres.add(aux);
            }
        }
        socios.addAll(listaConMujeres);
    }

    public ArrayList<Socio> sociosMes(int mes) {
        ArrayList<Socio> sociosMes = new ArrayList<Socio>();
        Iterator<Socio> it = socios.iterator();
        Socio aux;

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getMes() == mes) {
                sociosMes.add(aux);
            }
        }
        return sociosMes;
    }

    public void añadirMujeresWhile() {
        Socio sAux, sAux2;
        int tam = socios.size();
        int cont = 0;
        while (cont < tam) {
            sAux = socios.get(cont);
            if (!sAux.getNombre().contains("Mujer de ")) {
                sAux2 = new Socio("Mujer de " + sAux.getNombre(), sAux.getMes(), sAux.getAño());
                asociar(sAux2);
            }
            cont++;
        }
    }

    public void sociosMesWhile(int mes) {
        int cont = 0, tam = socios.size();
        Socio aux;
        while (cont < tam) {
            aux = socios.get(cont);
            if (aux.getMes() == mes) {
                System.out.println(aux.toString());
            }
            cont++;
        }
    }

    public void sociosMesForEach(int mes) {
        for (Socio s : socios) {
            if (s.getMes() == mes) {
                System.out.println(s.toString());
            }
        }
    }

    public void sociosMesIt(int mes) {
        if (mes > 0 && mes < 13) {
            Iterator<Socio> it = socios.iterator();
            Socio aux;
            while (it.hasNext()) {
                aux = it.next();
                if (aux.getMes() == mes) {
                    System.out.println(aux.toString());
                }
            }
        } else {
            System.out.println("Debes introducir un mes entre 1 y 12.");
        }
    }

    public boolean estaSocioIt(String nombre) {
        Iterator<Socio> it = socios.iterator();
        boolean encontrado = false;
        Socio aux;

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getNombre() == nombre) {
                encontrado = true;

            }
        }
        return encontrado;
    }

    public boolean estaSocioWhile(String nombre) {
        int contador = 0;
        int tamaño = socios.size();
        Socio aux;
        while (contador < tamaño) {
            aux = socios.get(contador);
            if (aux.getNombre().equals(nombre)) {
                return true;
            }
            contador++;
        }
        return false;
    }

    public void cambiarMesForEach() {

        for (Socio s : socios) {
            int mesActual = s.getMes();

            if (mesActual < 12) {
                s.setMes(s.getMes() + 1);
            } else {
                s.setMes(1);

            }
        }
    }

    public void listarSociosMes() {
        int contadorMes = 1;
        int contadorSocios;
        System.out.println("*************************");
        System.out.println("    LISTA SOCIOS MES     ");
        System.out.println("*************************");

        while (contadorMes < 13) {
            contadorSocios = 0;
            for (Socio s : socios) {
                if (s.getMes() == contadorMes) {
                    contadorSocios++;
                }
            }

            if (contadorSocios > 0) {
                System.out.println("Mes " + contadorMes + " ... " + contadorSocios);
            }

            contadorMes++;
        }

        System.out.println("*******************************************");
    }

    public void mesConMasSocios() {
        int contadorSocios;
        int contadorMes = 1;
        int maxMes = 0;
        int maxSocios = 0;

        while (contadorMes < 13) {
            contadorSocios = 0;
            for (Socio s : socios) {
                if (s.getMes() == contadorMes) {
                    contadorSocios++;
                }
            }
            if (contadorSocios > maxSocios) {
                maxMes = contadorMes;
                maxSocios = contadorSocios;
            }
            contadorMes++;
        }
        System.out.println("El mes con más ingresos ha sido el " + maxMes);
        System.out.println("Han ingresado " + maxSocios + " socios");
    }

    public void listarSociosTrimestre() {
        int contadorSocio;
        int contadorTrimestre = 0;

        while (contadorTrimestre < 5) {
            contadorSocio = 0;
            for (Socio s : socios) {
                if (s.trimestre() == contadorTrimestre) {
                    contadorSocio++;
                }
            }
            if (contadorSocio > 0) {
                System.out.println("El trimestre " + contadorTrimestre + " tiene "
                        + contadorSocio + " socios");
            }
            contadorTrimestre++;
        }
    }

    public void trimestreMasSocios() {
        int contadorSocios, contadorTrimestre = 0,
                maxtrimestre = 0, maxSocios = 0;

        while (contadorTrimestre < 5) {
            contadorSocios = 0;
            for (Socio s : socios) {
                if (s.trimestre() == contadorTrimestre) {
                    contadorSocios++;
                }
            }
            if (contadorSocios > maxSocios) {
                maxtrimestre = contadorTrimestre;
                maxSocios = contadorSocios;
            }
            contadorTrimestre++;
        }
        System.out.println("El trimestre con mas ingresos es el " + maxtrimestre);
        System.out.println("Ha tenido " + maxSocios + " socios");
    }

    public void trimestreMenosSocios() {
        int contadorSocios, contadorTrimestre = 1,
                mintrimestre = 0, minSocios = 0;

        while (contadorTrimestre < 5) {
            contadorSocios = 0;
            for (Socio s : socios) {
                if (s.trimestre() == contadorTrimestre) {
                    contadorSocios++;
                }
            }
            if (contadorTrimestre == 1) {
                mintrimestre = contadorTrimestre;
                minSocios = contadorSocios;
            } else if (contadorSocios < minSocios) {
                mintrimestre = contadorTrimestre;
                minSocios = contadorSocios;

            }
            contadorTrimestre++;
        }
        System.out.println("El trimestre con menos ingresos es el " + mintrimestre);
        System.out.println("Ha tenido " + minSocios + " socios");
    }

    public String nombreMasLargoPrimero() {
        String nombreMasLargo = "", nombre;

        for (Socio s : socios) {
            nombre = s.getNombre();
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
            }
        }
        return nombreMasLargo;
    }

    public String nombreMasLargoUltimo() {
        String nombreMasLargo = "", nombre;

        for (Socio s : socios) {
            nombre = s.getNombre();
            if (nombre.length() >= nombreMasLargo.length()) {
                nombreMasLargo = nombre;
            }
        }
        return nombreMasLargo;
    }

    public ArrayList<String> nombreMasLargoTodos() {
        ArrayList<String> aux = new ArrayList<String>();

        String nombreMasLargo = "", nombre;

        for (Socio s : socios) {
            nombre = s.getNombre();
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
                aux.clear();
                aux.add(nombreMasLargo);
            }else if(nombre.length() == nombreMasLargo.length()){
                aux.add(nombre);
            }
        }
        return aux;
    }
}
