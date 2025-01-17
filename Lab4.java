//CSE Spring 2021 
//Lab4.java
// Name: Caleb Ewer
// ASU ID: 1200047497
// Time taken to complete this lab: About 2 Hours

// Importing the scanner
import java.util.Scanner;

// Defining the class
class Lab4
{
    public static void main(String args[])
    {
    //Defining the scanner    
    Scanner sc = new Scanner(System.in);
    
    // Defining integers
    int n, UserInput;
    int PrevNum = 0, PrevNum1 = 0;
    int NextNum = 1, NextNum1 = 1;
    
    // User Prompt for the program
    System.out.print("Enter a number :");
    UserInput = sc.nextInt();
    
    // "For" loop for odd numbers
    System.out.println("Odd numbers up to the number you entered");
    for(n = 1; n < UserInput; n=n+2)
    
        { 
           System.out.print(n+",");
        }
    System.out.println();
    
    // "For" loop for even numbers
    System.out.println("Even numbers up to the number you entered");
    for(n = 2; n < UserInput; n=n+2)
    
        {
           System.out.print(n+",");
        } 
    System.out.println(); 
    
    // "While" loop for Fibonacci series
    System.out.println("Fibonacci number sequences up to the number you entered");
    n = 0;
    while(n < UserInput)
        {
            System.out.print(PrevNum+",");
            int sum = PrevNum + NextNum;
            PrevNum = NextNum;
            NextNum = sum;
            n++; 
        }
    System.out.println();
    
    // "For" loop for Fibonacci series
    System.out.println("Fibonacci number sequences up to the number you entered");
    for(n = 0; n < UserInput; n++)
        {
            System.out.print(PrevNum1+",");
            int sum1 = PrevNum1 + NextNum1;
            PrevNum1 = NextNum1;
            NextNum1 = sum1;
        }    
    
    // Scanner close
    sc.close();
    }
}
