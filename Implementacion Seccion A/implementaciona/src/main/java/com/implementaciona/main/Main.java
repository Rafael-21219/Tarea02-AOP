/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.implementaciona.main;

/**
 *
 * @author rafae
 */
public class Main {

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
    //prueba de Adapter
    //Simulación de una webstore
    System.out.println("-----SIMULACION DE UNA WEBSTORE(ADAPTER)-----");
    CryptoAPI api =new CryptoAPI();
    CreditCardProcessor procesador = new CryptoAdapter(api, "OpOL2l20opPp1oI"); 
    System.out.println("Cliente realizando compra de $15,000 USD"); 
    procesador.pay(15000.0); 
    }
}
