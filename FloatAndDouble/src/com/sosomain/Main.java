package com.sosomain;

public class Main {

    public static void main(String[] args) {
	    int MyIntValue = 5/2;
        float MyFloatValue = 5f/3f;
        double MyDoubleValue = 5d/3d;
        System.out.println("My Int Value = " + MyIntValue);
        System.out.println("My Float Value = " + MyFloatValue);
        System.out.println("My Double Value = " + MyDoubleValue);
        //Convert a given number from pounds to kg
        //1. Create a variable to store a number of pounds
        //2. Calculate the number of kilograms for the number above and store into a variable
        //3. Print out the result
        //
        //1 pound equals 0.453 kg
        float MyPoundValue =  200f ;
        double  MyKgValue = (MyPoundValue * 0.453);
        System.out.println("My Kg Value = " + MyKgValue);


    }
}
