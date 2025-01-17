// =====================================================================================
// Lab8.java
// Name : Caleb Ewer
// ASU ID: 1222131495
// Time taken to complete this lab: About 2 hours
// =====================================================================================

import java.util.Scanner;
import java.util.regex.*;
class Lab8
{
    public static void main(String args[])
    {
     // Create an object of the Scanner class for user input
     Scanner sc = new Scanner(System.in);
     
     // Variables to contain the user input
     int str1_length, str2_length;
     String str1, str2;
     
     // Prompt the user for the first string
     System.out.print("Enter the first string: ");
     str1 = sc.nextLine();
     
     // Prompt the user for the second string 
     System.out.print("Enter the second string: ");
     str2 = sc.nextLine();
     
            // Space for formatting
            System.out.println();
     
     // Statement for the lengths of the strings
     System.out.println("Checking to find the lengths of String 1 '"+str1+"' and String 2 '"+str2+"':");
            
     // Find out the length of string #1
     str1_length = str1.length();
     System.out.println("The length of String 1 '"+str1+"' is: "+str1_length);
     
     // Find out the length of a string #2
     str2_length = str2.length();
     System.out.println("The length of String 2 '"+str2+"' is: "+str2_length);
     
            // Space for formatting
            System.out.println();
     
     // Statement to descibe the checking of alphanumerical
     System.out.println("Checking to see if String 1 '"+str1+"' and String 2 '"+str2+"' are alphanumerical or not:");
            
     // Regex to check string is alphanumeric or not.
     String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";
     
     // Compile the Regex
     Pattern p = Pattern.compile(regex);
     
     // Pattern class contains matcher() method to find matching between the user entered string and regular expression
     Matcher m = p.matcher(str1);
     Matcher n = p.matcher(str2);
     
     // Returns true or false if the string is alphanumeric
     System.out.println("The first string '"+str1+"' is "+m.matches()+" to being alphanumeric!");
     System.out.println("The second string '"+str2+"' is "+n.matches()+" to being alphanumeric!");
     
            // Space for formatting
            System.out.println();
     
     // Checking if the strings are equal
     System.out.println("Checking to see if String 1 '"+str1+"' and String 2 '"+str2+"' are equal or not");  
            
     // Calling compare Strings function
     compareStrings(str1, str2);
     
     // Closing Scanner class
     sc.close();
    }
    
       
    static boolean compareStrings(String str1, String str2)
    {
        // If statement for comparing Strings
        
        int result = str1.compareTo(str2);
        if (result == 0)
        {
            System.out.println("String 1 '"+str1+"' and String 2 '"+str2+"' are equal!");
        }
        else
        {
            System.out.println("String 1 '"+str1+"' and String 2 '"+str2+"' are not equal!");
        }
        return true;
    }
}