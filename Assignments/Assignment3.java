// CSE 110     : 32187 / Online Zoom Tues and Thurs
// Assignment  : Assignment #3
// Author      : Caleb Ewer & 1222131495
// Description : Automatic Stock Trader

import java.util.Scanner;

public class Assignment03 {

    public static void main(String[] args) {
        // declare and initiate a Scanner
        Scanner sc = new Scanner(System.in);
        
        // declare and initialize variables
        int CurrentShares;
        int PurchasePrice;
        int MarketPrice;
        int AvailableFunds;
        int BuyCost;
        int SharesToBuy;
        int ShareBuyValue;
        int BuyValue;
        int ShareSellValue;
        int SellValue;
        int PriceOfShares;
        
        // prompt for and collect inputs
        System.out.print("What is the current amount of shares              : ");
        CurrentShares = sc.nextInt();
        System.out.print("What is the amount the shares were purchased at   : ");
        PurchasePrice = sc.nextInt();
        System.out.print("What is the current market price                  : ");
        MarketPrice = sc.nextInt();
        System.out.print("What are the available funds?                     : ");
        AvailableFunds = sc.nextInt();
        System.out.println();
        
        // compute required values
        SharesToBuy = ((AvailableFunds - 10) / MarketPrice);
        BuyCost = (10) + (MarketPrice * SharesToBuy);
        ShareBuyValue = (PurchasePrice - MarketPrice);
        BuyValue = (ShareBuyValue * SharesToBuy);
        ShareSellValue = (MarketPrice - PurchasePrice);
        SellValue = (ShareSellValue * CurrentShares);
        
        
        // display required outputs

        if(MarketPrice > 1 && SellValue >= 11)
        {
         System.out.println("Sell "+CurrentShares+" Shares");   
        }
        else if(MarketPrice == 1 && AvailableFunds >= 11)
        {
         System.out.println("Buy "+SharesToBuy+" Shares");   
        }
        else if(BuyValue <= 0 && SellValue <= 10)
        {
         System.out.println("Hold Shares");   
        }
        
        // Close the scanner function 
        sc.close();
    }
}
