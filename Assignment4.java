// CSE 110     : 32187 / Online Zoom Tues and Thurs
// Assignment  : Assignment 4
// Author      : Caleb Ewer & 1222131495
// Description : Five Methods 
// Description cont: Displaying a greeting, display user text of one integer, print total of three integers, get total of three integers, get average of three integers.
import java.util.Scanner;
public class Assignment4 
{

    public static void main(String[] args) 
    {
        // Write any code here that you may wish to test your methods defined below.
        
        // Declare the variables and assign value
        int int1 = 1, int2 = 1, int3 = 1;
        
        // Calling display greeting method
        displayGreeting();
        System.out.println();
        
        // Calling display text method
        displayText(int1);
        System.out.println();
        
        // Calling print total method
        printTotal(int1, int2, int3);
        System.out.println();
        
        // Calling get total method
        getTotal(int1, int2, int3);
        System.out.println();
        
        // Calling get average method
        getAverage(int1, int2, int3);
    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    static void displayGreeting()
        {System.out.println("Hello, and welcome!");}
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single integer argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    static void displayText(int int1)
    {
        // Promt user input
        System.out.print("Enter a integer value:");
        Scanner sc = new Scanner(System.in);
        int1 = sc.nextInt();
        
        // Display text
        System.out.println("The integer value you entered is: "+int1);
        
        // Close the scanner class
        sc.close();
    }
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    static void printTotal (int int1, int int2, int int3)
    {
        // Declare the variables
        int sum;
        
        // Promt user input
        System.out.println("Enter three integer to get their total:");
        Scanner sc = new Scanner(System.in);
        int1 = sc.nextInt();
        int2 = sc.nextInt();
        int3 = sc.nextInt();
        
        // Compute the values
        sum = (int1 + int2 + int3);
        
        // Display the total
        System.out.println("The total of the three integers added is:"+sum);
        
        // Close the scanner class
        sc.close();
    }
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    static int getTotal(int int1, int int2, int int3)
    {
       // Declare the variables
       int sum;
       
       // Promt user input
        System.out.println("Enter three integer to get their total:");
        Scanner sc = new Scanner(System.in);
        int1 = sc.nextInt();
        int2 = sc.nextInt();
        int3 = sc.nextInt();
        
        // Compute the values
        sum = (int1 + int2 + int3);
        
        // Display the total
        System.out.println("The total of the three integers added is:"+sum);
        
        // Close the scanner class
        sc.close();
        return sum;
    }
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double 
    static double getAverage(int int1, int int2, int int3)
    {
       // Declare the variables
       double average, sum;
       
       // Promt user input
        System.out.println("Enter three integer to get their average:");
        Scanner sc = new Scanner(System.in);
        int1 = sc.nextInt();
        int2 = sc.nextInt();
        int3 = sc.nextInt();
        
        // Compute the values
        sum = (int1 + int2 + int3);
        average = sum / 3;
        
        // Display the average
        System.out.println("The average of the three integers is:"+average);
        
        // Close the scanner class
        sc.close();
        return average; 
    }

}
