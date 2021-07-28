/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.herencia.personas;

import java.util.Date;

/**
 *
 * @author ecastrot
 */
public class Cliente extends Persona{
    private int noPedidos;
    private String clasificacion;
    
    public Cliente(String id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
    }
    
    public void solicitarDomicilio(){
        // ...
        noPedidos++;
        resolverClasificacionCliente();
    }
    
    private void resolverClasificacionCliente() {
        if (this.noPedidos <=2){
            this.clasificacion = "Cliente Bronce";
        }else if (this.noPedidos <=5){
            this.clasificacion = "Cliente Plata";
        }else{
            this.clasificacion = "Cliente Oro";
        }
    }

    public int getNoPedidos() {
        return noPedidos;
    }

    public void setNoPedidos(int noPedidos) {
        this.noPedidos = noPedidos;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    @Override
    public String imprimirNombre() {
        return super.nombre + " " + super.apellidos;
    }

    
    
    

}
