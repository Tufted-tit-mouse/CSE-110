// CSE 110 Spring 2021
// Assignment  : Assignment #1
// Name        : Caleb Ewer
// ASU ID      : 1222131495
// Time taken to complete : 2 Hours
import java.util.Scanner;

class Lab3
{
 public static void main(String args[])
 {
     //Importing Scanner Class
     Scanner sc = new Scanner(System.in);
     
     //Declaring Variables
     double FirstNum, SecondNum, ResultNum;
     char Function = ' ';
     
     //First User Input Prompt
     System.out.print("Enter a number: ");
     FirstNum = sc.nextDouble();
     
     //Second User Input Prompt
     System.out.print("Enter a number: ");
     SecondNum = sc.nextDouble();
     
     //Symbol Prompt
     System.out.print("Enter the type of operation you wish to perform (+,-,*,/,%) : ");
     Function = sc.next().charAt(0);
     
     //Declaring Switch Function and Cases
     switch(Function)
     {
         //Addition Case
         case '+':
                   ResultNum = FirstNum + SecondNum;
                   System.out.print("The Result of Addition is = "+ResultNum);
                   break;
         //Subtraction Case          
         case '-':
                   ResultNum = FirstNum - SecondNum;
                   System.out.print("The Result of Subtraction is = "+ResultNum);
                   break;
         //Multiplication Case          
         case '*':
                   ResultNum = FirstNum * SecondNum;
                   System.out.print("Result of Multiplication is = "+ResultNum);
                   break;
         //Division Case          
         case '/':
         //If else for when the second number is 0
                   ResultNum = FirstNum / SecondNum;
                if (SecondNum > 0 )
                {
                   System.out.print("Result of Quotion is = "+ResultNum);
                }
                
                else 
                {
                   System.out.print("The Second number that was entered cannot be 0. Please enter another number!");
                }
                   break;
         //Modulus Case          
         case '%':
                   ResultNum = FirstNum % SecondNum;
         //If else for when the second number is 0
                if (SecondNum > 0 )
                {
                   System.out.print("Result of Modulus is = "+ResultNum);
                }
                
                else 
                {
                   System.out.print("The Second number that was entered cannot be 0. Please enter another number!");
                }
                   break;
         //Default statement when the prompt is invalid          
         default :
                   System.out.print("The operation you tried to perform was invalid. Please retry!");
                   break;
                }    
  //Scanner Close
  sc.close();     
 }
}
