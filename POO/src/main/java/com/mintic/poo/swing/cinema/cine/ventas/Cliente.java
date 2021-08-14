/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.swing.cinema.cine.ventas;

import java.io.Serializable;

/**
 *
 * @author ecastrot
 */
public class Cliente implements Serializable{
    
    private String documento;
    private String nombre; 

    public Cliente(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
