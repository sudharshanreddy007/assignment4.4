package testdemo;

import java.util.Scanner;

public class Testdemo {
	
		public static void main(String[] args) {
	
		 
		int n1 = 0;
    if(n1==0){
//using if loop checking that if it is equal to zero ,it shows that we have entered zero
  	  System.out.println("you have entered zero");
    String char1=null;
    //taking ASCII value  null it prints as null
    System.out.println("ASCII value of n is"+(char1));
//prints the ASCII value
    }
	else if(n1<0)
//if we pass negative arguments it will show negative value
	{
		System.out.println("you have entered negative values");
	}else
	{
		//positive arguments
		System.out.println("you have entered positive values");
	}
 Scanner in=new Scanner(System.in);
 //we are using scanner to initialize the input values 
 System.out.print("Enter the marks of Physics");
 //it print the values
 int num1=in.nextInt();
 
 System.out.print("Enter the marks of Chemistry");
 int num2=in.nextInt();
 
 System.out.print("Enter the marks of Maths");
 int num3=in.nextInt();
  
 int physics=num1,chemistry=num2,maths=num3,average;
 //after initializing the marks it calculates the average value
 
 average=(physics+chemistry+maths)/3;
  if(average>=70)
  {
  	//if the value is equal to input then it show the grade
  	System.out.println("Grade A");
  }
  if((average>=61) && (average<70))
  {
  	System.out.println("Grade B");
  }
  if(average<61)
  {
  	System.out.println("Grade C");
  }
		}    
  
}