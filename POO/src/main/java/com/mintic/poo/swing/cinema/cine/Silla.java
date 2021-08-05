/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.swing.cinema.cine;

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
    
    public void cambiarEstado(String estado){
        // TODO
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
