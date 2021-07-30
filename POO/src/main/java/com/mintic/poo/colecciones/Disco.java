/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.colecciones;

/**
 *
 * @author ecastrot
 */
public class Disco {
    
    private String nombre; 
    private Integer noVentas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNoVentas() {
        return noVentas;
    }

    public void setNoVentas(Integer noVentas) {
        this.noVentas = noVentas;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
 
    
}
