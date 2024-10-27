/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module8.lesson3;

/**
 *
 * @author Anganam
 */
public class M8L3 {
    public static void main(String[] args){
        Animal a;
        
        System.out.println("========== Investigating an Animal ==========");
        a = new Animal();
        showAnimalType(a);
        
        System.out.println("========== Investigating a Lion ==========");
        a = new Lion();
        showAnimalType(a);

        System.out.println("========== Investigating a Dog ==========");
        a = new Dog();
        showAnimalType(a);        
    }
    
    public static void showAnimalType(Animal a){
        Class theClass = a.getClass();
        String className = theClass.getName();
        Class parentClass = theClass.getSuperclass();
        String parentClassName = parentClass.getName();
        System.out.println("Class name is " + className);
        System.out.println("Parent class name is " + parentClassName);
        
        
        if(a instanceof Animal){
            System.out.println("It is an animal");
        }
        if(a instanceof Lion){
            System.out.println("It is a Lion");
        }
        if(a instanceof Dog){
            System.out.println("It is a Dog");
        }
        
        System.out.println("This animal says: " + a.whatDoYouSay());
        
        
        
        
    }
    
}
