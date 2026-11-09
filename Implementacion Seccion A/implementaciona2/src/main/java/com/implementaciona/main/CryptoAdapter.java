/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.implementaciona.main;

/**
 *
 * @author rafae
 */
public class CryptoAdapter implements PaymentProcessor{
    private CryptoAPI cryptoApi;
    private String storeWallet;
    public CryptoAdapter(CryptoAPI api, String wallet){
        this.cryptoApi= api;
        this.storeWallet=wallet;
    }
    @Override
    public void pay(double amountUSD){
                double exchangeRate = 60000.0;  
                double btcAmount = amountUSD / exchangeRate;
                System.out.println("Adaptando cobro de $" + amountUSD + " USD a Criptomonedas..."); 
                cryptoApi.transferBTC(btcAmount, storeWallet);
    }
}
