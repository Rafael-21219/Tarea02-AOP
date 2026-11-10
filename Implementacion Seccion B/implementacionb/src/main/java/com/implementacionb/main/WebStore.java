/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.implementacionb.main;


public class WebStore {
    public void pay(double amountUSD) {
        System.out.println("Procesando pago estándar por: $" + amountUSD + " USD");
    }
   
    public static void main(String[] args) {
        WebStore store = new WebStore();
        System.out.println("Cliente realizando compra de $15,000 USD");
       
        store.pay(15000.0);
    }
}
