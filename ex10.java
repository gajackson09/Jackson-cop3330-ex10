/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program is a simple self-checkout system
import java.util.Scanner;
public class ex10{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
            double item1price = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
            int item1qty = input.nextInt();
        System.out.print("Enter the price of item 2: ");
            double item2price = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
            int item2qty = input.nextInt();
        System.out.print("Enter the price of item 3: ");
            double item3price = input.nextDouble();
       System.out.print("Enter the quantity of item 3: ");
            int item3qty = input.nextInt();
       
       //calculates the tax and final price
       double subtotal = (item1price*item1qty) + (item2price*item2qty) + (item3price*item3qty);
       double tax = (subtotal*5.5)/100;
       double finaltotal = subtotal + tax;

       //prints out "recipt"
       System.out.println("Subtotal: $"+subtotal);
       System.out.println("Tax: $"+tax);
       System.out.println("Total: $"+finaltotal);
   }//end of main
}//end of class