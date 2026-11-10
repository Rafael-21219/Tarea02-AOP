/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.implementacionc.main;

/**
 *
 * @author rafae
 */
public class MainSingleton {

    public static void main(String[] args) {
        System.out.println("-----SIMULACION DE UN EJEMPLO DE SINGLETON AOP-----");
        
        // El cliente usa 'new', pero el Aspecto interceptará esta llamada
        SingleOption SO1 = new SingleOption();
        System.out.println("");
        SingleOption SO2 = new SingleOption();
        
        // Comprobación que son la misma instancia
        System.out.println("");
        System.out.println(SO1 == SO2); // Imprimirá 'true'
        System.out.println("");
        
        SO1.connect();
        System.out.println("");
        SO2.connect();
    }
}
