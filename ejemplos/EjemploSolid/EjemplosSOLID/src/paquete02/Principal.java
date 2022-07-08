/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Jose Miguel", 22);
        Persona persona2 = new Persona("Paula", 23);
        Persona persona3 = new Persona("Jose", 24);
        Persona persona4 = new Persona("Rene", 25);
        
        ArrayList<Persona>list= new ArrayList<>();
        list.add(persona1);
        list.add(persona2);
        list.add(persona3);
        list.add(persona4);

        OperacionesEstudiantes operacionesEstudiantes = new OperacionesEstudiantes();
        operacionesEstudiantes.establecerEstudiante(list);
        operacionesEstudiantes.establecerPromedioEdades();
        
        System.out.printf("%s\n",operacionesEstudiantes);

    }
}
