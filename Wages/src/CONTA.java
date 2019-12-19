package com.company;
import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner (System.in);
        System.out.println("\n");
        double HoursPerDay, HoursToday, HoursPerWeek;
        double final1 = HoursPerDay = 8;
        HoursPerWeek = HoursPerDay * 5;
        System.out.println("\n");
        System.out.println("Total Hours per Day = 8");
        double pay = 7.20;
        System.out.println("Total Pay per Hour is " + pay);
        System.out.println("Enter hours today...");
        HoursToday = keyboard.nextDouble();
        System.out.println("Total Hours per week..." + HoursPerWeek);
        double finalPay = HoursPerDay * 7.20;
        System.out.println("Tatal Pay per Week " + finalPay);

    }
}
