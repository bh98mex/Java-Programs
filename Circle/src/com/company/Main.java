package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;


 class Circle2 {

    static double radius;

    public static double getArea() {
        //Method to calculate the area-Uses a return statement
        double answer;

        answer = Math.PI * Math.pow(radius, 2);
        return answer;
    }//area

     public static double getCircumference() {


         //A method to calculate the circumference - Uses a return statement
         double answer;
         answer = 2 * Math.PI * radius;
         return answer;
     }

    public static void main (String[]args){
       double area,circumference;
        //we have to put this line to make the program read
        //what the user type with the keyboard
        Scanner keyboard = new Scanner(System.in);
        //now declare some variables - 1 for area and 1 for circumference
        //First- get the radius of the circle
        System.out.println("Please, enter the radius of a circle:\t");
        radius=keyboard.nextDouble();
        //Now call the getArea()method- stores the result in are
        area= getArea();
        //Now, call the getCircumference()method
        //stores the result in circumference
        circumference= getCircumference();
        //Print out the result

        System.out.print("Area of circle = " +getArea() + "\n\n");
        System.out.println("Circumference of circle = " +  getCircumference());
        JOptionPane.showMessageDialog(null,"Area of circle is " +getArea(),"Circumference of a circle",JOptionPane.ERROR_MESSAGE);
    }
}
