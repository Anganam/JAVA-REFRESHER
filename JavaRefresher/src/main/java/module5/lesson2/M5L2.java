/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5.lesson2;

/**
 *
 * @author Anganam
 */
public class M5L2 {
    
        public static void show2DimensionalArray(int[][] iaa){
             System.out.println("Array contains");
             for(int x = 0; x < iaa.length; x++){
                 System.out.print(iaa[x].length + " items: ");
                 for(int y = 0; y < iaa[x].length; y++){
                     System.out.print(" " + iaa[x][y]);                 
                 }
                 System.out.println();           
             }


        }
        public static void main(String[] args){ 

        int[][] iaa1 = {
            {1, 3, 5, 7, 9},
            {2},
            {3, 2, 3, 4},
            {4, 2}                    
        };
        show2DimensionalArray(iaa1);

        show2DimensionalArray(new int[][]{
            {1, 2, 3},
            {2, 3, 4}
        });
        
        int [][][] iaaa = new int[2][][];
        iaaa[0] = new int[3][];
        iaaa[0][0] = new int[]{ 1, 2, 3 };      
        iaaa[0][1] = new int[]{ 1, 2 };  
        iaaa[0][2] = new int[]{ 1 };  
        
        show2DimensionalArray(iaaa[0]);
        
       //int [][] iaa2 = new int[][];
    }
}
