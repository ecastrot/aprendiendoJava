/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.swing.cinema.cine;

import java.util.Calendar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

/**
 *
 * @author ecastrot
 */
public class SillaTest {

    @Test
    public void testCalcularPrecioSillaNormalDiaEnSemana_mock() {
        Silla sillaNormal = new Silla(1, "image", Estado.DISPONIBLE);
        Silla spySilla = Mockito.spy(sillaNormal);
        Mockito.when(spySilla.esDiaEnSemana(Mockito.anyInt())).thenReturn(Boolean.TRUE);
        double precio = spySilla.calcularPrecio(Calendar.MONDAY);
        assertEquals(5_000, precio);
    }
    
    @Test
    public void testCalcularPrecioSillaNormalDiaFinDeSemana_mock() {
        Silla sillaNormal = new Silla(1, "image", Estado.DISPONIBLE);
        Silla spySilla = Mockito.spy(sillaNormal);
        Mockito.when(spySilla.esDiaEnSemana(Mockito.anyInt())).thenReturn(Boolean.FALSE);
        double precio = spySilla.calcularPrecio(Calendar.SUNDAY);
        assertEquals(7000, precio);
    }
    
    @Test
    public void testCalcularPrecioSillaNormalFinDeSemana(){
        Silla sillaNormal = new Silla (1, "imagen", Estado.DISPONIBLE);
        double precio = sillaNormal.calcularPrecio(Calendar.SATURDAY);
        assertEquals(7000, precio);
    }
    
    @Test
    public void testCalcularPrecioSillaPreferencialDiaEnSemana(){
        Silla sillaPreferencial = new SillaPreferencial(1, "imagen", Estado.DISPONIBLE);
        double precio = sillaPreferencial.calcularPrecio(Calendar.MONDAY);
        assertEquals(7500, precio);
    }
    
    @Test
    public void testCalcularPrecioSillaPreferencialFinDeSemana(){
        Silla sillaPreferencial = new SillaPreferencial(1, "imagen", Estado.DISPONIBLE);
        double precio = sillaPreferencial.calcularPrecio(Calendar.SATURDAY);
        assertEquals(10500, precio);
    }
    
    @Test
    public void testCalcularPrecioSillaDeshabilitada(){
        Silla sillaDeshabilitada = new SillaDeshabilitada(1, "imagen", Estado.DISPONIBLE);
        double precio = sillaDeshabilitada.calcularPrecio(Calendar.DAY_OF_WEEK);
        assertEquals(-1, precio);
    }

}
