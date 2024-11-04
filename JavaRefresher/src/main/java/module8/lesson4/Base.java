/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module8.lesson4;

/**
 *
 * @author Anganam
 */
public class Base {
    public String x  = "Base.x value";
    private String y =  "Base.y value";
    public String z =  "Base.z value";
    
    public String getGreeting(){
    return "Hello";
    }
    
    public Base(){}
    
    public Base(String x){
        super();// redundant
        System.out.println("Back in Base(String)");
        this.x = x;
        
    }
}
