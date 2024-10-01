/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module3;

/**
 *
 * @author Anganam
 */
public class Thing {
    public int numOne;
    public long numTwo;
    
    public void doStuff(){
        this.numOne = this.numOne +10;
        numTwo++;
    
    }
    
    public boolean sameAs(Thing other){
        return other == this;
    }
    
    @Override
    public String toString(){
        return "Thing: numOne=" + this.numOne + ", numTwo=" + this.numTwo;
    
    }
    
}
