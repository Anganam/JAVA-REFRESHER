/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module7.lesson1;

/**
 *Note to self: This code is incomplete go back to the lesson and finish
 * @author Anganam
 */
public class M7L1 {
    public void simpleMethod(){
        
        if(Math.random() > 0.5){
            System.out.println("Larger number");
            return;
        } else {
            System.out.println("Smaller number");
        }
        System.out.println("From the end ");
    }
    
    public String returningMethod(){
        if(Math.random() > 0.5){
            return "Partway through";
        }
        //return 99;
        return "At the end";
    }
    
    public void simpleArgs(String s, int y){
        System.out.println("String s is " + s);
        System.out.println("Int y is ");
    }
    
    public static void simpleStatic(){
    System.out.println("simpleStatic");
    }
    
        
    public static void main(String[] args){
        simpleStatic();
      //  simpleMethod();
      M7L1 self =  new M7L1();
      self.simpleMethod();
      String res = self.returningMethod();
      System.out.println("returningMethod returned "+ res);
      self.simpleArgs("A String ", 99);
    
    
    }

}
