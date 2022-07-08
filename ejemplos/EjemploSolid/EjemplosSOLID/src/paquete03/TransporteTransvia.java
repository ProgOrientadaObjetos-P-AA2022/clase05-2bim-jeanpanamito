/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author PERSONAL
 */
class TransporteTransvia {
    private String cooperativaTransvia;
    public double tarifa;
    
    public void establecerCooperativaTrransvia(String n){
        cooperativaTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 3.00 + 0.30;
    }
    
    public String obtenerCooperativaTransvia(){
        return cooperativaTransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
