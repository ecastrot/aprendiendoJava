/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.herencia.personas;

import com.mintic.poo.herencia.vehiculos.Vehiculo;
import java.util.Date;

/**
 *
 * @author ecastrot
 */
public class Empleado extends Persona {
    protected String cargo;
    protected Date fechaIngreso;
    
    public Empleado(){
        
    }
    

    public Empleado(String id, String nombre, String apellidos, String cargo, Date fechaIngreso) {
//        this.id = id;
//        this.nombre= nombre;
        super(id, nombre, apellidos);
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }
    
    public Empleado(String id, String nombre, String apellidos, Vehiculo vehiculo) {
//        this.id = id;
//        this.nombre= nombre;
        super(id, nombre, apellidos);
        this.vehiculo = vehiculo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    
    
    
    
    

}
