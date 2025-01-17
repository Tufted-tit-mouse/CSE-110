// =====================================================================================
// Lab7.java
// Name : Caleb Ewer
// ASU ID: 1222131495
// Time taken to complete this lab: About 2 hours
// =====================================================================================

import java.util.Scanner;
class Lab7
{
    // Write your main function here
    public static void main(String args[])
    {
        // Create an object of the Scanner class for user input
        Scanner sc = new Scanner(System.in);
        
        // Declare variables needed to store the size of the array
        int arr[];
        int size, i, key, index = -1;
        
        // Prompt and accept the size of the array from the user
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        
        // Create an array with the given size
        arr = createArray(size);
        
        // Prompt and accept the elements of the array from the user
        arr = inputArray(size);
        
        // Call displayArray() function to display the array
        displayArray(arr);
        
        // Call displayNegativeNumbers() function to display the negative numbers in the array
        displayNegativeNumbers(arr);
        
        // Close Scanner object
        sc.close();
    }
    
    // Function to define or create an array
    static int[] createArray(int size)
    {
        int arr[] = new int[size];
        return arr;
    }
    
    // Function to accept the elements of an array
    static int[] inputArray(int size)
    {
        int arr[] = createArray(size);
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array elements:");
        for( i = 0; i < size; i++)
        {
            System.out.print("Enter the element at index["+i+"]:");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    // Function to display array elements
    static void displayArray(int arr[])
    {
        // Declare and define a variable to hold the size of the array. 
        int size = arr.length;
        int i;
        System.out.println();
        System.out.print("The elements of the array are:");
        // Declare a loop variable
        for(i = 0; i < size; i++)
        {
            // Using an iteration statement, traverse the array in the forward direction and print the elements
            System.out.print(arr[i]+",");
        }
    }

    // Function to display the negative numbers in an array 
    static void displayNegativeNumbers(int arr[])
    {
        // Declare and define a variable to hold the size of the array. 
        int i, index = -1;
        int size = arr.length;
        // Declare a loop variable
        System.out.println();
        System.out.print("The negative elements of the array are:");
        for ( i = 0; i < size; i++)
        {
        // Use an if statement to determine if an element of the array is positive or negative.
            if ( arr[i] < 0 )
            {
                System.out.print(arr[i]+",");
            }
        }
    }
}

