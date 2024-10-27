/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module8.lesson3;

/**
 *
 * @author Anganam
 */
public class TestingThis {
    private int x = 5;
     
    public void doStuff(int x){
       x++;
      System.out.println("x is " + x);
        this.x++;
        System.out.println("x is " + x);

    }
    
    public static void main(String[] args){
        
    TestingThis obj = new TestingThis();
    obj.doStuff(10);
    }
}
