// CSE 110     : 32187 / Online Zoom Tues and Thurs
// Assignment  : Assignment #2
// Author      : Caleb Ewer & 1222131495
// Description : Quote for Rosie's Road Company

import java.util.Scanner;

public class Assignment2 
{
    
    public static void main(String[] args) 
    {
        // Declare and instantiate a Scanner
        Scanner sc = new Scanner(System.in);
        
        // Declare and initialize variables
        double LengthOfRoad, TrucksOfAsphalt, NumStoplights, ConduitPipe, CrewMem; 
        double AsphaltCost, StoplightCost, ConduitCost, LaborCost, TotalCost;
        int NumLanes, DepthAsphalt, DaysTotal;
        
        
        
        // Collect inputs
        System.out.print("What is the length of the Road in Miles           : ");
        LengthOfRoad = sc.nextDouble();
        System.out.print("How many lanes                                    : ");
        NumLanes = sc.nextInt();
        System.out.print("How deep is the asphalt in Inches                 : ");
        DepthAsphalt = sc.nextInt();
        System.out.print("How many days will it take to complete the project: ");
        DaysTotal = sc.nextInt();
        
        // Compute required values
        TrucksOfAsphalt =((((5280 * LengthOfRoad)*NumLanes)*DepthAsphalt)*150)/10000;
        NumStoplights = (NumLanes + 2)*(int)LengthOfRoad;
        ConduitPipe = (5280 * LengthOfRoad)/24;
        CrewMem = ((50*LengthOfRoad)*NumLanes)/DaysTotal;
        AsphaltCost = (Math.ceil(TrucksOfAsphalt)*1000);
        StoplightCost = (NumStoplights*25000);
        ConduitCost = (ConduitPipe*500);
        LaborCost = ((Math.ceil(CrewMem)*200)*DaysTotal);
        TotalCost = (LaborCost+ConduitCost+StoplightCost+AsphaltCost);

        // Display results
        System.out.println('\n');
        System.out.println("        === Amount of Materials Needed ===");
        System.out.println("Truckloads of asphalt                             :"+(int)Math.ceil(TrucksOfAsphalt)); 
        System.out.println("Number of Stoplights                              :"+(int)NumStoplights);
        System.out.println("Conduit Pipes                                     :"+(int)ConduitPipe);
        System.out.println("Crew Members                                      :"+(int)Math.ceil(CrewMem));
        System.out.println('\n');
        System.out.println("        === Cost of Materials ============");
        System.out.println("Cost of Asphalt                                   :$"+AsphaltCost);
        System.out.println("Cost of Stoplights                                :$"+StoplightCost);
        System.out.println("Cost of Conduit                                   :$"+ConduitCost);
        System.out.println("Cost of Labor                                     :$"+LaborCost);
        System.out.println('\n');
        System.out.println("        === Total Cost of Project ========");
        System.out.println("Total Cost of Project                             :$"+TotalCost);
        
        //Scanner Close
        sc.close(); 
    }

}
