/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.implementaciona.main;

/**
 *
 * @author rafae
 */
public class WebStore {

    public static void main(String[] args) {
    //prueba de Adapter
    //Simulación de una webstore
    System.out.println("-----SIMULACION DE UNA WEBSTORE(ADAPTER)-----");
    CryptoAPI api =new CryptoAPI();
    CreditCardProcessor procesador = new CryptoAdapter(api, "OpOL2l20opPp1oI"); 
    System.out.println("Cliente realizando compra de $15,000 USD"); 
    procesador.pay(15000.0); 
    }
}
