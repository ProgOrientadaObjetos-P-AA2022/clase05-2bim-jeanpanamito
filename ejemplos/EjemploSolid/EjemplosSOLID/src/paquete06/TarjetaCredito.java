/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author PERSONAL
 */
public class TarjetaCredito {
    private String nombre;
    private String codigo;
    private double cupoMaximo;

    public TarjetaCredito(String nom, String cod, double cupo) {
        nombre = nom;
        codigo = cod;
        cupoMaximo = cupo;
    }

    public String obtenerNombreTajeta() {
        return nombre;
    }

    public void establecerNombreTarjeta(String n) {
        nombre = n;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public void establecerCodigo(String c) {
        codigo = c;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

    public void establecerCupoMaximo(double c) {
        cupoMaximo = c;
    }

    @Override
    public String toString() {
       String cadena;
        cadena = String.format("%s - %s - %.2f",nombre,codigo,cupoMaximo);
       return cadena;
    }
    
    
    
}
