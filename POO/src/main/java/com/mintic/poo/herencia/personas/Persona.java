/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.herencia.personas;

import com.mintic.poo.herencia.vehiculos.Vehiculo;

/**
 *
 * @author ecastrot
 */
public class Persona {
    protected String id; 
    protected String nombre;
    protected String apellidos;
    protected Vehiculo vehiculo;

    public Persona() {
    }

    public Persona(String id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public String imprimirNombre() {
        return nombre;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
