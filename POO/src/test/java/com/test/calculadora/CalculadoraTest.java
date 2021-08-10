/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ecastrot
 */
public class CalculadoraTest {
    
    private String atributo; 
    
    public CalculadoraTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
        // Va a ser un código que se ejecute antes de empezar cualquier prueba
        // Fecha = 01 ene 2021
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Va a ser un código que se ejecute cuando se termino la ejecución de todas las pruebas
        // Fecha = 10 ago 2021
    }
    
    @BeforeEach
    public void setUp() {
        // Va a ser un código que se ejecute antes de cada caso de prueba
        // Resetear acumulador...
    }
    
    @AfterEach
    public void tearDown() {
        // Va a ser un código que se ejecute después de cada caso de prueba
        // Resetear acumulador...
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
