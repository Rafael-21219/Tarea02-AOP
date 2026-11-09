/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.implementaciona.main;

/**
 *
 * @author rafae
 */
public class SingleOption {
    private static SingleOption instance;
    private SingleOption(){
        System.out.println("Creación de la instancia");
    }
    public static SingleOption getInstance(){
        if(instance==null){
            instance= new SingleOption();
        }               
        return instance;           
    }
    public void connect(){
        System.out.println("Ejecutando en consola....");
        
    }
}
