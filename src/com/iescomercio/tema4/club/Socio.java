package com.iescomercio.tema4.club;

/**
 *
 * @author chiqui
 */

public class Socio {
    
    private String nombre;
    private int mes;
    private int año;

    /**
     * Constructor for objects of class Membership.
     *
     * @param nombre The name of the member.
     * @param mes The month in which they joined. (1 ... 12)
     * @param año The year in which they joined.
     */
    public Socio(String nombre, int mes, int año)
            throws IllegalArgumentException {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException(
                    "Mes " + mes + " esta fuera de rango, introducir datos de 1 a 12.");
        }
        this.nombre = nombre;
        this.mes = mes;
        this.año = año;
    }

    /**
     * @return The member's name.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return The month in which the member joined. A value in the range 1 ...
     * 12
     */
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return The year in which the member joined.
     */
    public int getAño() {
        return año;
    }

    /**
     * @return A string representation of this membership.
     */
    @Override
    public String toString() {
        return nombre
                + " asociado en:  "
                + mes + " de " + año;
    }
}
