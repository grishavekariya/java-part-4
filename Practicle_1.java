/*NAME: Grisha Vekariya
ID NO: 21CE153
AIM: WAP to show the try - catch block to catch the different types of exception.*/

import java.util.*;
public class Practicle_1 {
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
try{
    String a1 = null; 
    System.out.println(a1.charAt(0));
}
 catch(NullPointerException e)
 {
    System.out.println("Null pointer Exception is occure");
 }
 try{
    String s = "This a java program";
    char c1 = s.charAt(24);
    System.out.println(c1);

 }
 catch(StringIndexOutOfBoundsException e)
 {
    System.out.println("String index out of Bound Exception");
 }
}
}


    