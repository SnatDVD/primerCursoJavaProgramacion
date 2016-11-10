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
        if (noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        } else if (noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        } else {
            // This is not a valid note number, so do nothing.
        }
    }

    public void eliminarNotas(int noteNumber) {
        if (noteNumber < 0) {
            System.out.println("No se puede poner numero negativos.");
        } else if (noteNumber < numberOfNotes()) {
            notes.remove(noteNumber);
        }else{
            System.out.println("El numero es demasiado grande.");
        }

    }
}
