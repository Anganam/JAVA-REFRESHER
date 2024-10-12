/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module7.lesson1;

/**
 *
 * @author Anganam
 */
public class VarArgs {
    /*
    public static int AddUpNumber(int ... values){
        int rv = 0;
        for(int v : values){
        rv+= v;
        }
        return rv;
    
    }
    */
    
      public static int AddUpNumber(int[] values){
        int rv = 0;
        for(int v : values){
        rv+= v;
        }
        return rv;
    
    }
    public static void main(String[] args){
        /*
     System.out.println("> " + AddUpNumber(1, 3, 5));
    System.out.println("> " + AddUpNumber(1,2,3,4,5,6,7,8));
    System.out.println("> " + AddUpNumber());   
        */
        
    System.out.println("> " + AddUpNumber(new int[]{1, 3, 5}));
    System.out.println("> " + AddUpNumber(new int[]{1,2,3,4,5,6,7,8}));
    System.out.println("> " + AddUpNumber(new int[]{}));
    }
}
