package com.company;
import java.util.Scanner;

 class Main {

     public static void main(String[] args) {

         Scanner keyboard = new Scanner(System.in);

         String Adress, Room, Expense;

         System.out.println("Give some details about your home.");
         System.out.println("You can chose the followings: (Adress=1, 2=Room, 3=Expense)");
         int newint = keyboard.nextInt();
         System.out.println("You have chossen " + newint);
         do {
             if (newint == 1) {
                 System.out.println("We will talk about adress");

                 String adreess1 = "Chalkhill Road";
                 System.out.println("The street name is " + adreess1);

                 System.out.println("");
             }
             if (newint == 2) {
                 System.out.println("We will talk about Room");
             }
             if (newint == 3) {
                 System.out.println("We will talk about Expense");
             }

             // write your code here
         } while (newint < 4);
     }
 }
