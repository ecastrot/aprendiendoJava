/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.estudiante;

import com.mintic.poo.academia.Curso;
import com.mintic.poo.academia.Materia;
import java.util.Date;

/**
 * Controla la información de los estudiantes de la instución
 * @author ecastrot
 */
public class Estudiante {
    
    private String documento;
    private String nombre;
    private String apellido;
    private int edad;
    private Curso curso;
    private int[] notas = new int[5];
    
    private int contadorNotas;

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
    }
    
    public Asistencia asistirAClase(Materia materia) {
        Asistencia asistencia = new Asistencia(new Date(), this, materia);
        return asistencia;
    }
    
    public void matricularCurso(Curso curso){
        this.curso = curso;
    }
    
    public void agregarNota(int nota){
        if (contadorNotas < 5) {
            this.notas[contadorNotas] = nota;
            contadorNotas++;    
        }else{
            throw new RuntimeException("Ingresaste mas de cinco notas");
        }
    }
    
    public float calcularPromedio2(boolean parcial){
        float sumaNotas = 0;
        for (int i = 0; i < this.notas.length; i++) {
            sumaNotas = sumaNotas + this.notas[i];
        }
        return sumaNotas / this.notas.length;
    }
    
    public float calcularPromedio(boolean parcial){
        float sumaNotas=0;
        float prom = 0;
        int noNotasParaPromedio;
//        if(parcial==true){
//           noNotasParaPromedio = contadorNotas;
//        }else{
//           noNotasParaPromedio = this.notas.length;
//           //otras cosas
//        }
        //Operador ternario
        noNotasParaPromedio = (parcial==true) ? this.contadorNotas : this.notas.length;
        for(int i=0;i<noNotasParaPromedio;i++){
            sumaNotas+=this.notas[i];
        }
        prom =sumaNotas/noNotasParaPromedio;
        return prom;
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

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

}

