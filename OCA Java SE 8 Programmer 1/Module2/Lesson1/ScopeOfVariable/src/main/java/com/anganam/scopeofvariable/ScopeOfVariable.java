/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.anganam.scopeofvariable;

/**
 *
 * @author Anganam
 */

/*
This code demostates how variables are scope within the curly braces they were declared in
No need to run this code 
*/
public class ScopeOfVariable {
    private static int y = 99;

    public static void main(String[] args) {
        int x = y;
        {
        // x = d;
            int j = 100;
            System.out.println("Value of J is " + j + " and x is "+ x);
            int d = 100;
            x = d;
            
        }
        
        //System.out.println("Value of j is " + j);
        //System.out.println("Value of d is " + x);
        System.out.println("Value of x is "+ x);
        
    }
}
