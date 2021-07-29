/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.abstractas.email;

/**
 *
 * @author ecastrot
 */
public class Gmail extends Email implements IAnularEnvio{

    @Override
    public boolean enviarCorreo(String destinatario, String asunto) {
        System.out.println("Enviando correo por gmail");
        return true;
    }

    @Override
    public boolean anularEnvio(String id) {
        System.out.println("Anulando envio del correo con id: " + id);
        return true;
    }
    
}
