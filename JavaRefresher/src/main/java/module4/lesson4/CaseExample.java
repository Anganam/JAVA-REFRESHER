/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module4.lesson4;

/**
 *
 * @author Anganam
 */
public class CaseExample {
    public static void main(String[] args){
        int day =99;
        System.out.println("The day is "  + day);
        
        switch (day){
            case 0:
                System.out.println("An exciting new week begins!");
                break;
            case 1:
                System.out.println("boring!");
                break;
            case 2:
                System.out.println("Okay, let's try again!");
                break;
            case 3:
                System.out.println("Whoo hoo, half the way there!");
                break;
            case 4:
                System.out.println("Still dragging on!");
                break;
            case 5:
                System.out.println("Yay, weekend!");
                break;   
            default:
                System.out.println("Weekends rock, but are never long enough!");
                break;                
        }
    
    }
    
}
