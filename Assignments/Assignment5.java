// CSE 110     : 32187 / Online
// Assignment  : Assignment #5
// Author      : Caleb & 1222131495
// Description : Inputing an array and calling methods to perform differnt functions 

public class Assignment5 
{

    public static void main(String[] args) 
    {
        // Write any code here that you may wish to test your methods defined below.
        
        int myArray[] = {1, 22, 333, 400, 5005, 0};
        String str1  = ",", str2 = "-";
        
        
        
        
        
        
        //Dsiplaying the array
       System.out.println("Array in forward order:");
       printArray(myArray, str1);
        
        //Line for formating 
       System.out.println();
        
        //Displaying the first number of the array
       System.out.println("First number of the Array:");
       getFirst(myArray);
        
        //Line for formating
       System.out.println();
        
        //Displaying the last number of the array
       System.out.println("Last number of the Array:");
       getLast(myArray);
        
        //Line for formating
       System.out.println();
        
        //Displaying the  array minus the first number
       System.out.println("Array in forward order minus the first number:");
       getAllButFirst(myArray);
        
        //Line for formating
       System.out.println();
        
        //Displaying the index of the minimum 
       System.out.println("Index of the minimum number:");
       System.out.println(getIndexOfMin(myArray));
        
        //Displaying the index of the maximum 
       System.out.println("Index of the maximum number:");
       System.out.println(getIndexOfMax(myArray));
        
        //Displaying swap by index 
       int [] swaparr = swapByIndex(myArray, 0, 5);
       System.out.println("Swapping indexes");
       for(int i = 0; i< swaparr.length; i++)
       {
       System.out.print(swaparr[i]+",");
       }
       
        
        //Line for formating
       System.out.println();
        
        //Displaying remove index
       int [] removearr = removeAtIndex(myArray, 1);
       System.out.println("Removing index");
       for(int i = 0; i< removearr.length; i++)
       {
       System.out.print(removearr[i]+",");    
       }
        
       
        //Line for formating
       System.out.println();
        
        //Displaying insert at index
       int [] insertarr = insertAtIndex(myArray, 1, 12);
       System.out.println("Adding index");
       for(int i = 0; i< insertarr.length; i++)
       {
       System.out.print(insertarr[i]+",");    
       }
        
        //Line for formating
       System.out.println();
        
        //Displaying is sorted
       System.out.println("The array is sorted: True or False");
       System.out.print(isSorted(myArray));
        
    }
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.
    public static int printArray(int arr[], String str)
    {
      int index;
      for (index = 0; index < arr.length; index++)
      {
        System.out.print(arr[index]+str);  
      }
      return index;
    }
    
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.
    public static int getFirst(int arr[])
    {
      int index;
      for (index = 0; index < arr.length; index++)
      {
        if (index == 0)
        {
          System.out.print(arr[index]);  
        }
       
      }
      return index;
    }  
    
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.
    public static int getLast(int arr[])
    {
      int index;
      for (index = 0; index < arr.length; index++)
      {
        if (index == 5)
        {
          System.out.print(arr[index]);  
        }
       
      }
      return index;
    } 
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
    public static int getAllButFirst(int arr[])
    {
      int index;
      for (index = 1; index < arr.length; index++)
      {
        System.out.print(arr[index]+",");  
      }
      return index;
    }
    
    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
    public static int getIndexOfMin(int arr[])
    {
    int index = 0;
    int min = arr[index];

    for (int i = 1; i < arr.length; i++)
    {
        if (arr[i] <= min)
        {
        min = arr[i];
        index = i;
        }
    }
    return index;
    }
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int arr[])
    { 
    int index = 0;
    int max = arr[index]; 
    for(int i = 1; i < arr.length; i++)
    { 
      if(arr[i] >= max)
      { 
         max = arr[i]; 
         index = i;
      } 
      
    }
    return index; 
    }
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.
    public static int[] swapByIndex(int arr[], int int1, int int2)
    {
      int [] swaparr = new int [arr.length];
      int temp = arr[int1];
      arr[int1] = arr[int2];
      arr[int2] = temp;
      for(int i = 0; i < swaparr.length; i++)
      {
        swaparr[i] = arr[i];  
      }
      
        
      return swaparr;
    }
    
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.
    public static int[] removeAtIndex(int[] arr, int index)
    {
      int[] removearr = new int[arr.length -1];
      int j = 0;
      for (int i = 0; i < arr.length; i++)
      {
        if(arr[i] != arr[index])
        {
        removearr[j++] = arr[i];
        }
      }
      

      return removearr;
    }
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int arr[], int index, int value)
    {
      int [] insertarr = new int[arr.length+1];
      int j = 0;
      for (int i = 0; i < index; i++)
      {
        insertarr[j++] = arr[i];  
      }
        insertarr[j++] = value;
      for (int i = index; i < arr.length; i++)
      {
        insertarr[j++] = arr[i]; 
      }
      return insertarr;
    }
  
  
  
    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
    public static boolean isSorted(int arr[])
    {
     for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1])
            return false;
    }
    return true;
}

}
