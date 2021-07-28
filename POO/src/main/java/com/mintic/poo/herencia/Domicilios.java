/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.herencia;

import com.mintic.poo.herencia.personas.Cliente;
import com.mintic.poo.herencia.personas.Empleado;
import com.mintic.poo.herencia.personas.Persona;
import com.mintic.poo.herencia.vehiculos.Carro;
import com.mintic.poo.herencia.vehiculos.Moto;
import com.mintic.poo.herencia.vehiculos.Vehiculo;
import java.util.Date;

/**
 *
 * @author ecastrot
 */
public class Domicilios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
        
        
        Empleado empleado = new Empleado("123", "Daniela", "Hicapie", "Ing", new Date());
        Cliente cliente = new Cliente("456", "Raul", "Florez");
        
        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setPlaca("ABC001");
        moto.setCasco("C01");
        
        Carro carro = new Carro();
        carro.setMarca("Renault");
        carro.setNoPuertas(4);
        carro.setPlaca("RIE405");
        
        Empleado maria = new Empleado("458", "Maria", "Ochoa", carro);
        
        Vehiculo vehiculoMaria = maria.getVehiculo();
        if (vehiculoMaria instanceof Moto) {
//            Moto motoMaria2 = (Moto) maria.getVehiculo();
            System.out.println("El vehiculo de Maria es una moto");
        }else{
            System.out.println("El vehiculo de Maria es un carro");
//            Carro carroMaria2 = (Carro) maria.getVehiculo();
        }
        
        System.out.println("empleado: " + empleado.imprimirNombre());
        System.out.println("cliente: " + cliente.imprimirNombre());
        
        System.out.println("moto: " + moto.imprimir());
        System.out.println("carro: " + carro.imprimir());
        
        cliente.solicitarDomicilio();
        System.out.println("Clasificacion 1 " + cliente.getClasificacion());
        cliente.solicitarDomicilio();
        cliente.solicitarDomicilio();
        cliente.solicitarDomicilio();
        System.out.println("Clasificacion 2 " + cliente.getClasificacion());
        cliente.solicitarDomicilio();
        cliente.solicitarDomicilio();
        cliente.solicitarDomicilio();
        System.out.println("Clasificacion 3 " + cliente.getClasificacion());
    }
    
}
