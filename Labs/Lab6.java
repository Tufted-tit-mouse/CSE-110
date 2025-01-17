// Lab6.java
// Name: Caleb Ewer
// ASU ID: 1222131495
// Time taken to complete this lab: 180 minutes

class Lab6
{
      // Main function
      public static void main(String args[])
      {
        System.out.print("Prime Palindrome Numbers Between 1-1000: "); 
        int number = 0, count = 0, copy;
        copy = number;
       // For loop from 1 to 100000
        for (number = 2; number <= 100000; number++) 
        {
       // If statement for Prime Palindrome
        if (isPrime(number) && isPalindrome(number))
          {
            count++;
           } 
          }          
       System.out.print(count);
       
      }  
    
    
      // isPrime() function 
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
            if(num % i==0)
            {
                return false;   
            }
        }
        return true;   
      }

    
      // Write your isPalindrome() function here
      static boolean isPalindrome(int num)
      {
        // Declare variables to hold a copy of num, hold the reversed number, hold an extracted digit
        int ReversedNum = 0, Remain, Copy;
        Copy = num;
        // Compute the reversed number
        while (num != 0)
        {
            Remain = num % 10;
            ReversedNum = ReversedNum * 10 + Remain;
            num /= 10;
        }

        // Check if the reversed number and the parameter num are the same. Return true if they are
        if (Copy == ReversedNum)
        {
            return true;   
        }
        else 
        {
        // Return false if they are not the same
        return false;   
        }
      }
    
    
}