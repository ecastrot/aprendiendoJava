/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.academia.principal;

import com.mintic.poo.academia.Curso;
import com.mintic.poo.academia.Materia;
import com.mintic.poo.estudiante.Asistencia;
import com.mintic.poo.estudiante.Estudiante;
import java.util.Date;

/**
 *
 * @author ecastrot
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Curso programacion = new Curso();
        programacion.setCodigo(100);
        programacion.setDuracion(180);
        programacion.setNombre("Programación");
        
        Materia poo = new Materia();
        poo.setCodigo(101);
        poo.setNombre("Programación Orientada a Objetos");
        poo.setCurso(programacion);
        
        Estudiante diana = new Estudiante("15245454", "Diana", "Marulanda");
        diana.matricularCurso(programacion);
        
        Date fechaActual = new Date();
        Asistencia asistencia = new Asistencia(fechaActual, diana, poo);
    }
    
}
