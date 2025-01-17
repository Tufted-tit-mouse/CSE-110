// CSE 110 Spring 2021
// Assignment  : Assignment #1
// Name        : Caleb Ewer
// ASU ID      : 1222131495
// Time taken to complete : 1 Hour
import java.util.Scanner;


class Assignment1
{
public static void main(String args[])
{
 
    Scanner sc = new Scanner(System.in);
    
    
    //Declaration of data and their place values
    int NumPizzas, TotalSlices = -9; 
    int NumSlices, AdultSlices = -99;
    int NumAdults, AvailSlices = -999;
    int NumChild, ChildSlices = -9999, RemainSlices = -99999;
    int sum = AvailSlices - ChildSlices;
    
    
    //Prompts for input
    System.out.println("Number of pizzas purchased:");
    NumPizzas = sc.nextInt();
    System.out.println("Number of slices per pizza:");
    NumSlices = sc.nextInt();
    System.out.println("Number of adults          :");
    NumAdults = sc.nextInt();
    System.out.println("Number of children        :");
    NumChild = sc.nextInt();
    
   
  
    //Output computation
    
    //Computation for Total number of pizza slices
    TotalSlices = NumSlices * NumPizzas;
    //Computation for Total number of slices that will be given to adults
    AdultSlices = NumAdults * 2;
    //Computation for Total number of slices available for the children
    AvailSlices = TotalSlices - AdultSlices;
    //Computation for Number of slices each child will get
    ChildSlices = AvailSlices / NumChild;
    //Computation for Number of slices left 
    RemainSlices = sum % AvailSlices;
   
    
    //5 Output Values of test data
    System.out.println("Total number of pizza slices                        :"+TotalSlices);
    System.out.println("Total number of slices that will be given to adults :"+AdultSlices);
    System.out.println("Total number of slices available for the children   :"+AvailSlices);
    System.out.println("Number of slices each child will get                :"+ChildSlices);
    System.out.println("Number of slices left                               :"+RemainSlices);
    
    sc.close();
	}
    
    
}
