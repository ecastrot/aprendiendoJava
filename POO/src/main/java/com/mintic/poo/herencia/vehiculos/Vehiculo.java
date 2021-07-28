/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.herencia.vehiculos;

/**
 *
 * @author ecastrot
 */
public class Vehiculo {
    protected String marca; 
    protected String placa;
    
    public String imprimir(){
        return this.marca + " " + this.placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
  

    
}
