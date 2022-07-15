/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class MayorEdad extends Persona{
    private TarjetaCredito tarjeta;

    public MayorEdad(TarjetaCredito t, String n) {
        super(n);
        tarjeta = t;
    }
    
  
    public void establecerTarjeta(TarjetaCredito t){
        tarjeta = t;
    }
    
    public TarjetaCredito obtenerTarjeta(){
        return tarjeta;
    }

    
}
