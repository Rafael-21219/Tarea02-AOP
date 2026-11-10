/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.implementacionc.main;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author valer
 */

@Aspect
public class SingletonAspect {
    
    private SingleOption singleInstance = null;

    // El pointcut se define dentro de la anotación
    @Around("call(SingleOption.new())")
    public Object aroundConstructor(ProceedingJoinPoint pjp) throws Throwable {
        if (singleInstance == null) {
            singleInstance = (SingleOption) pjp.proceed(); // proceed() ejecuta el new original
        }
        return singleInstance;
    }
}
