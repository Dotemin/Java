/*
 * kone dotemin issouf 
 * exercise 12 P.188
If n is a positive integer in Java, n % 10 is its rightmost digit and n / 10 is the integer obtained by dropping the
rightmost digit from n. Using these facts, write a recursive method that displays an integer n in decimal. Now
observe that you can display n in any base between 2 and 9 by replacing 10 with the new base. Revise your
method to accommodate a given base.
 */

import java.util.ArrayList;
public class DecimalInteger {
    private static String digitVal;
    public DecimalInteger(){
    super();
   }
    // creating the string method and initialize those variables 
    public static String lookingForInteger(int val, int base, int index, String display ){
  
            String result ="";
            // the if condition 
    if (val>0){
        int digit= val%base;
        val= val/base;
        // if condition: initialize index to 0 
        if (index==0) 
            //the formula to display that 
            display= display+digitVal+"x"+base+"^"+index;
        else display=display+"+"+digit+"x"+base+"^"+index;
        index++;
        return lookingForInteger(val, base,index,display);
    }
    if (val==0){
        if (index==0)
            result="0x10^0";
        else result=display;
    }
    return result;
  }
    public static void main(String args[]){
        String myDisplay="";
        String display=lookingForInteger(1496324,10,0,myDisplay);
        System.out.println(display);
    }
    
    
    
}
