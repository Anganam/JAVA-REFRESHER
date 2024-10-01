/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anganam.scopeofvariable;

/**
 *
 * @author Anganam
 */
public class SpecialCaseScope {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++)
            System.out.println("i is " + 1);

        int j = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("i is " + i);
            j += i;
        }
        System.out.println("j is " + j);  
    }
    
    public void doStuff(int i){
    System.out.println("i is " + i);
}
}
