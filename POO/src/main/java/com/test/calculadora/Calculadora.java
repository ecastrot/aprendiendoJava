/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.calculadora;

/**
 *
 * @author ecastrot
 */
class Calculadora {

    static int sumar(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

    static int sumar(Integer numero1, Integer numero2, Integer numero3) {
        // Hacer un llamado a métodos externos más complejos...
        return sumar(numero1, numero2) + numero3;
    }

}
