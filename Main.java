
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please type your gpa down here |");
        Scanner scanner = new Scanner(System.in);
        boolean breakPoint = true;
        do {
            try {
                float gpa = scanner.nextFloat();
                if (gpa >= 50 && gpa <= 100){
                    System.out.println("congrats you have been promoted");
                }
                else if (gpa >= 0 && gpa < 50){
                    System.out.println("Please give a retake and try again next year");
                }

                else {
                    throw new Exception();
                }

                breakPoint = false;
            }
            catch (Exception e){
                System.out.println("Wrong input");

            }
        } while(breakPoint == true);
    }
}