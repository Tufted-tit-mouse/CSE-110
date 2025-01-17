// Lab5.java
// Name: Caleb Ewer
// ASU ID: 1222131495
// Time taken to complete this lab: 60 minutes

// Importing the scanner class
import java.util.Scanner;

class Lab5
{   
    // Declaring the boolean function
    static boolean isPrime(int num)
    {
     int i;
     // If statment to correct negative numbers
     if (num <= 0)
     {
       return false;
     }
     // "For" loop to determine if the number entered is prime or not
     for (i=2;i<=(num/2);i++)
     {
       if(num%i==0)
       {
        return false;   
       }
     }
     return true;
    }
    public static void main(String args[])
    {
        // Integer and boolean values for scanner and result
        Scanner sc = new Scanner(System.in);
        int FirstNum, SecondNum;
        boolean Result;
        
        // First user input and calling the function w/print outs
        System.out.print("Enter an integer to check if it is prime: ");
        FirstNum = sc.nextInt();
        Result = isPrime(FirstNum);
        System.out.println();
        System.out.println("The number you entered is prime: "+Result);
        
        // Formatting line
        System.out.println();
        
        // Second user input and calling the function w/print outs
        System.out.print("Enter an integer to check if it is prime: ");
        SecondNum = sc.nextInt();
        Result = isPrime(SecondNum);
        System.out.println();
        System.out.println("The number you entered is prime: "+Result);
        
        // Closing the scanner
        sc.close();
    }
}
