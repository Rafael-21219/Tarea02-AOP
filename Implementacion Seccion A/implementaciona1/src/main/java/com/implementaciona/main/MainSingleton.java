/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.implementaciona.main;

/**
 *
 * @author rafae
 */
public class MainSingleton{

    public static void main(String[] args) {
    //prueba de Singleton (usando SingleOption)
    System.out.println("-----SIMULACION DE UN EJEMPLO DE SINGLETON-----");
    SingleOption SO1= SingleOption.getInstance();
    System.out.println("");
    SingleOption SO2= SingleOption.getInstance();
    //Comprobación que son la misma instancia
    System.out.println("");
    System.out.println(SO1==SO2);
    System.out.println("");
    SO1.connect();
    System.out.println("");
    SO2.connect();
    System.out.println("");
    System.out.println("");
    
    }
}
