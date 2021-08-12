/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.swing.cinema.cine;

import java.util.Calendar;

/**
 *
 * @author ecastrot
 */
public class Silla implements ICobro {
    
    private int no;
    private String imagen; 
    private Estado estado;

    public Silla(int no, String imagen, Estado estado) {
        this.no = no;
        this.imagen = imagen;
        this.estado = estado;
    }
    
    public void cambiarEstado(Estado estado){
        this.estado = estado;
    }
    
    public int getNo() {
        return no;
    }

    public String getImagen() {
        return imagen;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public double calcularPrecio(int dia) {
//        boolean estaEnSemana = dia >= Calendar.MONDAY && dia <= Calendar.FRIDAY;
        if (esDiaEnSemana(dia)){
           return 5000; 
        }
        return 7000;
    }

    public boolean esDiaEnSemana(int dia) {
        //Otra linea
        //Otra linea
        //Otra linea
        //Otra linea
        //Otra linea
        //Otra linea
        //Otra linea
        //Otra linea
        //Otra linea
        //Otra linea
        return dia >= Calendar.MONDAY && dia <= Calendar.FRIDAY;
    }

    @Override
    public String toString() {
        return "Silla #" + this.no;
    }
    
    

}
