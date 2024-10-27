/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module7.lesson6;

/**
 *
 * @author Anganam
 */
public class M7L6 {
    public static void add(int x){
        x++;
        System.out.println("x is "+ x);
    }
    
     public static void add(StringBuilder sb){
       sb.append(", world");
       System.out.println("sb is " + sb);
    }

     public static void change(StringBuilder sb){
       sb = new StringBuilder("Goodbye");
       System.out.println("sb is " + sb);
    }
     
     public static void main(String[] args){
         int x = 99;
         add(x);
         System.out.println("x in caller is " + x);
         System.out.println("======================");
         
         StringBuilder sb = new StringBuilder("Hello");
         add(sb);
         System.out.println("sb in caller is " + sb);
         System.out.println("======================");
          
         sb = new StringBuilder("Hello");
         change(sb);
         System.out.println("sb in caller is " + sb);
         System.out.println("======================");
     }
    
}
