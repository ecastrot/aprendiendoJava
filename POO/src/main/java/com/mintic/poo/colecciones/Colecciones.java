/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.colecciones;

import java.util.ArrayList;

/**
 *
 * @author ecastrot
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(10);
        numeros.add(20);
        numeros.add(1);
        Float promedio = 0f;
        
        System.out.println("El número en la posición 3 es: " + numeros.get(3));
        numeros.add(3, 40);
        System.out.println("El número en la posición 3 es: " + numeros.get(3));
        
        numeros.forEach(numero -> System.out.println("Numero en lista: " + numero));
        
        for (Integer numero : numeros) {
            promedio = promedio + numero; 
        }

//        for (int i = 0; i < numeros.size(); i++) {
//            Integer numeroEnLaLista = numeros.get(i);
//            promedio = promedio + numeroEnLaLista;
//        }
        promedio = promedio / numeros.size();
        System.out.println("Promedio " + promedio);
        
        
        ArrayList<Cantante> cantantes = new ArrayList<>();
        Cantante shakira = new Cantante();
        Disco disco1 = new Disco();
        shakira.agregarDisco(disco1);
        System.out.println("El disco es: " + disco1); //Debo sobreescribir el toString de mi clase
        System.out.println("El disco es: " + disco1.getNombre()); //Accedo a la propiedad que quiero mostrar
        cantantes.add(shakira);
        Cantante shakira2 = new Cantante();
        cantantes.add(shakira2);
        Cantante shakira3 = new Cantante();
        cantantes.add(shakira3);
        Cantante shakira4 = new Cantante();
        cantantes.add(shakira4);
        
        String nombreCantanteABuscar = "";
        Cantante cantanteEncontrado = buscarCantante(cantantes, nombreCantanteABuscar);
        if (cantanteEncontrado != null){
            Integer noVentas = cantanteEncontrado.contarVentas();    
            System.out.println("El no ventas es: " + noVentas);
        }else{
            System.out.println("Ese cantante no existe");
        }
        
        Disco elPrimerDiscoDelCantanteNo3DeLaLista = cantantes.get(2).getDiscos().get(0);
        System.out.println("El disco es: " + elPrimerDiscoDelCantanteNo3DeLaLista.getNombre());
    }

    private static Cantante buscarCantante(ArrayList<Cantante> cantantes, String nombreCantante) {
        for (Cantante cantante : cantantes) {
            if (nombreCantante.equalsIgnoreCase(cantante.getNombre())){
                return cantante;
            }
        }
        return null;
    }
    
}
