/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module7.lesson2;

/**
 *
 * @author Anganam
 */
public class M7L2 {
    private int x;
    private static int y;
    
    public static void main(String[] args){
        y = 99;
        System.out.println("y is " + y);
        
        M7L2 object1 = new M7L2();
        M7L2 object2 = new M7L2();
        
        System.out.println("object1.y is " + object1.y);
        System.out.println("object2.y is " + object2.y);
        
        object1.x = 100;
        object2.x = 200;
        System.out.println("object1.x is " + object1.x);
        System.out.println("object2.x is " + object2.x);
        
        System.out.println("______________________");
        
        showY();
        
        System.out.println("______________________");
        
        object1.showX();
        object2.showX();
        
        
        object1.showX();
        object2.showX();
    }
    
    static void showY(){
        System.out.println("y is " + y);
        System.out.println("M7L2.y is " + M7L2.y);
        //System.out.println("this.y is " + this.y);
        
        //System.out.println("x is " + x);
        //System.out.println("this.y is " + this.y);
    
    }
    
    void showX(){
        System.out.println("x is " + x);
        //System.out.println("M7L2.x is " + M7L2.x);
        //System.out.println("this.x is " + this.x);
        
        
        System.out.println("y is " + y);
        //System.out.println("M7L2.y is " + M7L2.y);
        //System.out.println("this.y is " + this.y);
    }
    
    static void showX(M7L2 object){
        System.out.println("object.x is" + object.x);
    }
    
}
