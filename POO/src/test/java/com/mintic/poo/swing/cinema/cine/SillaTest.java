/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.swing.cinema.cine;

import java.util.Calendar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ecastrot
 */
public class SillaTest {

    @Test
    public void testCalcularPrecioSillaNormalDiaEnSemana() {
        Silla sillaNormal = new Silla(1, "image", Estado.DISPONIBLE);
        double precio = sillaNormal.calcularPrecio(Calendar.SUNDAY);
        assertEquals(5_000, precio);
    }
    
}
