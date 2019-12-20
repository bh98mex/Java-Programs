package com.company;
import javax.swing.JOptionPane;

public class Main {



    public static void main(String[] args) {
       int TopScore = 80;
        if (TopScore <100)
        System.out.println("You got the high score");

        int SecondTopScore = 81;

        if ( TopScore < 100) {

            JOptionPane.showMessageDialog (null,"What is wrong?", "Hallo",JOptionPane.INFORMATION_MESSAGE);
        }
        else;

        JOptionPane.showMessageDialog(null, "You got the high score", "Error Message",JOptionPane.PLAIN_MESSAGE);
        System.out.println("You are wrong");
    }
}
