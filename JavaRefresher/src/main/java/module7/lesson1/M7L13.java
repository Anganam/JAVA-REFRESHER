/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module7.lesson1;

/**
 *
 * @author Anganam
 */
public class M7L13 {
    public void doStuff(){
        System.out.println("In zero arg doStuff");
    }
    public void doStuff(String s){
        System.out.println("In doStuff with String arg. Value is: " + s);
    }
    public int doStuff(int x){
        System.out.println("In doStuff with int arg. Value is: " + x);
        return x * 2;
    }    
    
    
 /*       public void doStuff(String t){
        System.out.println("Not working because the same type with same number of args already exists " );
    }
  */  
  /*  
        public float doStuff(int x){
        System.out.println("INot working because the same type with same number of args already exists ");
        return x * 2;
    } 
     */ 
    public static void main(String[] args){
        M7L13 obj = new M7L13();
        obj.doStuff();
        obj.doStuff("Hello from do stuff with string arg");
        int z = obj.doStuff(56);
        //float f = obj.doStuff(56);
    }
}
