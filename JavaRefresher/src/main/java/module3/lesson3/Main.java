/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module3.lesson3;

/**
 *
 * @author Anganam
 */
public class Main {
    public static void main(String[] args){
        Thing t = new Thing();
        //int n = t.numOne;
        //System.out.println("value read is " + n);
        
        
        /*Box b = new Box();
        System.out.println("numOne in boxed thing is " + b.getOneThing().numOne);
        b.getOneThing().numOne = 5432;
        System.out.println("numOne in boxed thing is " + b.getOneThing().numOne);
        */
        
        /*
        System.out.println("t is " + t);
        t.doStuff();
        System.out.println("t is " + t);
        */
        
        System.out.println("t is the same reference as \"this\"" + " inside a method called on t?" +t.sameAs(t));
        
    }
}
