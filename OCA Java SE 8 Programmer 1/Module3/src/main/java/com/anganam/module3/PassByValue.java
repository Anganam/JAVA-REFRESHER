package com.anganam.module3;

import java.util.*;



public class PassByValue {
     public static void main(String[] args){
         new PassByValue().go();
        
    }
     
      public void go(){
             Calendar cal = new GregorianCalendar();
             int x = 1;
             tomorrow(cal);
             addOne(x);
             
             System.out.printf("Calender after method return is %tF\n", cal);
             System.out.println("int after method return is " + x);
         }
          
        public void tomorrow(Calendar c) {
            System.out.printf("Calender before is %tF\n ", c);
            c.add(Calendar.DATE, 1);
            System.out.printf("Calender after is %tF\n ", c);       
        }
        
         public void addOne(int i) {
            System.out.println("int before is " + i);
            i = i +1;
            System.out.println("int after is " + i);
        
        }
}
