/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module4.lesson2;

/**
 *
 * @author Anganam
 */
public final class Customer {
    
    private String name;
    private String address;
    private int balance;
    
    public Customer(String name, String address, int balance){
        this.name = name;
        this.address = address;
        this.balance = balance;
    }
    
    public boolean equals(Object other){
        boolean rv = false;
        if(other instanceof Customer){
            Customer c2 = (Customer)other;
            rv = c2.name.equals(this.name)
                    && c2.address.equals(this.address);
        }
        return rv;
    }
    
    public static void main(String[] args){
        Customer c1 =  new Customer("Fred", "Colorado", 0);
        Customer c2 =  new Customer("Jim", "Washington", 1000);
        Customer c3 =  new Customer("Fred", "Colorado", 0);
        Customer c4 =  new Customer("Fred", "Colorado", 1000);
        
        System.out.println("c1 == c2 is " + (c1 == c2));
        System.out.println("c1 == c3 is " + (c1 == c3));
        System.out.println("c1 == c4 is " + (c1 == c4));
        
        System.out.println("c1.equals(c2) is " + c1.equals(c2));
        System.out.println("c1.equals(c3) is " + c1.equals(c3));
        System.out.println("c1.equals(c4) is " + c1.equals(c4));
        
    }
}
