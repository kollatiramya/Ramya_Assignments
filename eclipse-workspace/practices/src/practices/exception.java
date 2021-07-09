package practices;

/*public class exception {
	   static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){  
	      validate(21);  
	      System.out.println("rest of the code...");  
	  }  
	} */ 

import java.io.IOException;  
class exception{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   exception obj=new exception();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  