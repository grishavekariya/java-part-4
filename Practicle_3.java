/*NAME: Grisha Vekariya
ID NO: 21CE153
AIM: Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two exceptions. 
Each ‘catch’ block handles a different type of exception. 
For example the exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’. 
Display a message in the ‘finally’ block.*/

import java.util.*;
public class Practicle_3 {
 public static void main(String[] args) {
 try {
    int a=10;
    int b=0;
    int c=a/b;

 } 
 catch(ArithmeticException e)
 {
    System.out.println("Divide by zero");
 }
 try{
    int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println(ar[10]);
 }
 catch (ArrayIndexOutOfBoundsException e) 
 {
     System.out.println("Array index out of Bound Exception");
 }
 finally{
    System.out.println("In finally block");
 }
  System.out.println("outside the try,catch and finally block");
}
    
}