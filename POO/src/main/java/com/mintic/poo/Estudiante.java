/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo;

/**
 * Controla la información de los estudiantes de la instución
 * @author ecastrot
 */
public class Estudiante {
    
    private String documento;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private int[] notas = new int[5];
    private int asistencias = 1;

    public Estudiante() {
        
    }
    
    public Estudiante(String documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Estudiante(String documento, String nombre, String apellido, int edad, String carrera, int asistencias) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.asistencias = asistencias;
    }
    
    public void asistirAClase(){
        this.asistencias++;
    }
    
    public void agregarNota(int nota){
        this.notas[0] = nota;
    }
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    
    
    
    
    
}

