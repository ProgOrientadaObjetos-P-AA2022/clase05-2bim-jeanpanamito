/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
         
        TransporteTransvia transvia = new TransporteTransvia();
        transvia.establecerCooperativaTransvia("24 de mayo");
        transvia.establecerTarifa();
        
       TiposTransporte tiposTransporte= new TiposTransporte();
        ArrayList<Transporte>transportes= new ArrayList<>();
        transportes.add(bus);
        transportes.add(taxi);
        transportes.add(transvia);
        tiposTransporte.establecerTransportes(transportes);
        tiposTransporte.establecerPromedioTarifas();
        
        
        
        System.out.printf("Promedio de Tarifas: %.2f",
                tiposTransporte.obtenerPromedioTarifas());
        
    }
}
