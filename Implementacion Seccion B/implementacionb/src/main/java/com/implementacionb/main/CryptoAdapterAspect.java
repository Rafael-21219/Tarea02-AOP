/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.implementacionb.main;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class CryptoAdapterAspect {
   
    private CryptoAPI cryptoApi = new CryptoAPI();
    private String walletDestino = "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa";


    @Pointcut("execution(* com.implementacionb.main.WebStore.pay(double)) && args(monto)")
    public void pagoInterceptado(double monto) {}


    @Around("pagoInterceptado(monto)")
    public void aroundAdvice(ProceedingJoinPoint joinPoint, double monto) throws Throwable {
       
        double exchangeRate = 60000.0;
        double btcAmount = monto / exchangeRate;
       
        System.out.println("[AOP Adapter] Interceptando cobro de $" + monto + " USD...");
        System.out.println("[AOP Adapter] Adaptando a " + btcAmount + " BTC.");
       
        cryptoApi.transferBTC(btcAmount, walletDestino);


        joinPoint.proceed();
    }
}