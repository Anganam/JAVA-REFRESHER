/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module6.lesson5;

/**
 *
 * @author Anganam
 */
public class M6L5 {
    public static void main(String[] args){
        for(int i =0; i < 10; i++){
            System.out.println("i is: " + i);
            if(Math.random() > 0.5){
                System.out.println("On no! I left the oven on!");
                break;
            }
            System.out.println("Let's do that for the next number");
        }
        System.out.println("Loop finished, I wonder if we counted everything!");
    }
}
