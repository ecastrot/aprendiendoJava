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
public class Outlook extends Email{

    @Override
    public boolean enviarCorreo(String destinatario, String asunto) {
        return true;
    }
    
}
