/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.abstractas;

import com.mintic.poo.abstractas.email.Email;
import com.mintic.poo.abstractas.email.Gmail;
import com.mintic.poo.abstractas.email.Outlook;

/**
 *
 * @author ecastrot
 */
public class Abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String destinatario = "yineth@mail.com";
        String cuerpo = "mmmmmmmmmmmm";
        
        Gmail emailGmail = new Gmail();
        emailGmail.setAsunto("x");
        emailGmail.setCuerpo("y");
        String resumen = emailGmail.resumenCorreo();
        System.out.println("Resumen del correo: " + resumen);
        
        Email email = new Outlook();
        email.enviarCorreo("jhon@mail.com", "asunto");
        
        // resto de cosas...
        
        emailGmail.enviarCorreo(destinatario, cuerpo);
        
        
        
        
        
        
        
        
    }
    
}
