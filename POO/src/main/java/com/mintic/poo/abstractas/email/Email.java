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
public abstract class Email {
    
    private String asunto; 
    private String cuerpo;
    
    public abstract boolean enviarCorreo(String destinatario, String asunto);
    
    public String resumenCorreo(){
        return "Es un correo con asunto: " + asunto + " y cuerpo: " + cuerpo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    
}
