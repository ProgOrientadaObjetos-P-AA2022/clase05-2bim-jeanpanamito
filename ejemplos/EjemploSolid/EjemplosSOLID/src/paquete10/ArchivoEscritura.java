/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

// Uso de la clase Formatter para escribir datos en un archivo de texto.

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public  class ArchivoEscritura {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> generadores;

    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        establecerListaGeneradores();

        try {

            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerListaGeneradores().size() > 0) {
                for (int i = 0; i < obtenerListaGeneradores().size(); i++) {
                    establecerGeneradores(obtenerListaGeneradores().get(i));
                    establecerSalida();
                }
            }

        } catch (IOException IOexception) {
            System.out.println("Error al abrir el archivo");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerGeneradores(GeneradorPeliculas g) {
        registro = g;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public void establecerListaGeneradores() {
        ArchivoLectura l = new ArchivoLectura(obtenerNombreArchivo());
        l.establecerGeneradores();
        generadores = l.obtenerGeneradores();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerListaGeneradores() {
        return generadores;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }

}