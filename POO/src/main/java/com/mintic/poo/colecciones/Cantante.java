/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.colecciones;

import java.util.ArrayList;

/**
 *
 * @author ecastrot
 */
public class Cantante {
   private String nombre; 
   private String id;
   private ArrayList<Disco> discos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<Disco> discos) {
        this.discos = discos;
    }
   
   
   
   public Integer noVentasEnSusDiscos(){
      // Recorrer la lista de discos y sumar la cantidad de ventas. 
      return 0;
   }
  
   public void agregarDisco(Disco disco){
      // Agregar un disco más a la lista de los discos del cantante
   }
   
   public void buscarDisco(String nombreDisco){
      // Agregar un disco más a la lista de los discos del cantante
   }
   
   
}
