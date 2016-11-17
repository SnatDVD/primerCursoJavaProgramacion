/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema4.notebook;

import java.util.ArrayList;

/**
 *
 * @author chiqui
 */
public class Notebook {

    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the notebook.
     */
    public Notebook() {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     *
     * @param note The note to be stored.
     */
    public void storeNote(String note) {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes() {
        return notes.size();
    }

    /**
     * Show a note.
     *
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber) {
        int noteNumber1 = (noteNumber -1);
        if (noteNumber1 < 0) {
            // This is not a valid note number, so do nothing.
        } else if (noteNumber1 < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber1));
        } else {
            // This is not a valid note number, so do nothing.
        }
    }

    public void eliminarNotas(int noteNumber) {
        int noteNumber1 = (noteNumber - 1);
        if (noteNumber1 < 0) {
            System.out.println("No se puede poner numero negativos.");
        } else if (noteNumber1 < numberOfNotes()) {
            notes.remove(noteNumber1);
        } else {
            System.out.println("El numero es demasiado grande.");
        }

    }

    public void printNotas() {
        for (String note : notes) {
            System.out.println(note);
        }
    }

    public void imprimirNotas() {
        int contador = 0;
        int indiceArray = 0;
        int cantidad = numberOfNotes();
        do {
            System.out.println(indiceArray + ": " + notes.get(contador));
            contador++;
            indiceArray++;
        } while (contador < cantidad);
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

    public void buscar(String cadABuscar) {
        int indice = 0;
        boolean encontrado = false;
        int tamañoNotas = notes.size();
        while (indice < tamañoNotas && !encontrado) {
            String nota = notes.get(indice);
            if (nota.contains(cadABuscar)) {
                encontrado = true;
            } else {
                indice++;
            }
        }
        if(encontrado)
            System.out.println("La nota se a encontrado: " + cadABuscar);
        else
            System.out.println("No se a encontrado el elemento buscado: " + cadABuscar);

    }
}
