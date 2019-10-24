/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THE_LOAN;

/**
 *
 * @author Chit
 */
import java.util.Scanner;

public class GARCIA {
    public static void main(String[]args){
    

  double loanAm, intPerYr, monthPay, intPerMo;
   double intPerMo2 = 0;
   double monthPay2 = 0;
   double count = 0;
   
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("_________________________");
    System.out.println("  RCBC LOAN SYSTEM BANK   ");
    System.out.println("_________________________");
    System.out.println("*PLEASE ENTER YOUR AMOUNT=");
    loanAm = myObj.nextDouble();
    System.out.print("*YOUR INTEREST PER YEAR= ");
    intPerYr = myObj.nextDouble();
    System.out.print("*YOUR MONTHLY PAYMENT=");
    monthPay = myObj.nextDouble();
    
    double intRate = intPerYr/100;
  
  
  do
  {
    intPerMo = intRate / 12;
    intPerMo2 = loanAm * intPerMo;
    monthPay2 = monthPay - intPerMo;
    
    if(monthPay < intPerMo2)
    {
      System.out.println("Your monthly payment is lessr than the first month the interest payment loan amount cant be repaid.");
    }
    
    else
    {
     loanAm = loanAm - monthPay2;
     count++;
     
    }
  } 
 
  
   while (loanAm > 0);  
  
    System.out.println();
    System.out.println("Months To Paid: " + count);  
    
    }


}



