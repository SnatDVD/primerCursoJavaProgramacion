package com.iescomercio.tema2.calentador;

/**
 *
 * @author chiqui
 */
public class Calentador {

    private int temperatura;
    private int min;
    private int max;
    private int incremento;
    private int tempMax;
    private int tempMin;
    private int sumTemp, cambioTemp = 1;
    private String modelo;

    public Calentador(int minimo, int maximo, String modeloCaletador) {
        temperatura = 15;
        incremento = 5;
        modelo = modeloCaletador;
        sumTemp = temperatura;
        tempMax = temperatura;
        tempMin = temperatura;

        if (modelo.length() > 5) {
            modelo = modelo.substring(0, 5);
        }

        if (maximo > minimo) {
            min = minimo;
            max = maximo;
        } else {
            min = maximo;
            max = minimo;
        }

    }

    public int getTempMax() {
        return tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public int getTemperatura() {
        return temperatura;

    }

    public void setIncremento(int newIncremento) {
        if (newIncremento <= 0) {
            System.out.println("El valor tiene que ser positivo.");
        } else {
            incremento = newIncremento;
        }

    }

    public void calentar() {
        if ((temperatura + incremento) < (max + 1)) {
            temperatura = temperatura + incremento;
            sumTemp = sumTemp + temperatura;
            cambioTemp++;
            if (temperatura > tempMax) {
                tempMax = temperatura;
            }
        } else {
            System.out.println("No se puede calentar.");
        }
    }

    public void enfriar() {
        if ((temperatura - incremento) < (min - 1)) {
            temperatura = temperatura - incremento;
            sumTemp = sumTemp + temperatura;
            cambioTemp++;

            if (temperatura < tempMin) {
                tempMin = temperatura;
            }
        } else {
            System.out.println("No se puede enfriar.");
        }
    }

    public float mediaTemperatura() {
        return (float) sumTemp / cambioTemp;
    }

    public void imprimirDatos() {
        System.out.println("Temperatura: " + getTemperatura() + "// Modelo: " + modelo + "// Media: " + mediaTemperatura());
        System.out.println("Temperatura minima: " + getTempMin());
        System.out.println("Temperatura maxima: " + getTempMax());
    }

}
