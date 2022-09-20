/*NAME: Grisha Vekariya
ID NO: 21CE153
AIM: WAP to generate user defined exception using “throw” and “throws” keyword.*/

class MyException extends Exception{
    public MyException(String s) {
        super(s);
}
}
public class Practicle_2 {   
     
    public static void validate(int age) throws MyException{  
        if(age<18) {  
              
            throw new MyException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
      
    public static void main(String args[]){  
        try{
            validate(19);
        } 
        catch (MyException e)
        {
            System.out.println(e);
        }
          
        System.out.println("Outside..");    
  }    
}    