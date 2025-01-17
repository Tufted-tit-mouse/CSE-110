// CSE 110 Spring 2021
// Assignment  : Lab2
// Name        : Caleb Ewer
// ASU ID      : 1222131495
// Time taken to complete : 1 Hour

import java.util.Scanner;

class Lab2
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
     
     
    // Doubles and their values
    double scannerNum = -9;
    double scannerNum2 = -99;
     
     
    //User prompts
    System.out.println("Enter the first number = ");
    scannerNum = sc.nextDouble();
    System.out.println("Enter the second number = ");
    scannerNum2 = sc.nextDouble();
    
    
    //Sum and Difference functions
    double sum = scannerNum + scannerNum2;
    double diff = scannerNum2 - scannerNum;
     
   
    //If else statments
     if (scannerNum >= scannerNum2)
     {
     System.out.println("The sum of "+scannerNum+" and "+scannerNum2+" is "+sum);
    }
    if(scannerNum < scannerNum2)
     {
     System.out.println("The difference of "+scannerNum+" and "+scannerNum2+" is "+diff);
    }
    
    
    sc.close();
    }
}
