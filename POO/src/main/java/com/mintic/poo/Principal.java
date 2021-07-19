/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo;

/**
 *
 * @author ecastrot
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Estudiante diana = new Estudiante();
//        diana.setNombre("Diana");
//        diana.setApellido("Ariztizabal");
//        diana.setEdad(10);
//        diana.setCarrera("Ingenieria en Sistemas");

        Estudiante diana = new Estudiante("165758787", "Diana", "Aristizabal");
        diana.setCarrera("Ingenieria Agropecuaria");
        System.out.println("El nombre del estudiante es: " + diana.getNombreCompleto());
        System.out.println("Asistencias = " + diana.getAsistencias());
        diana.asistirAClase();
        System.out.println("Asistencias = " + diana.getAsistencias());
        diana.agregarNota(1);
        diana.agregarNota(2);
        diana.agregarNota(3);
        diana.agregarNota(4);
        diana.agregarNota(5);
      
    }
    
}
