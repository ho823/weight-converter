package org.train;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Convert kg to gr");
        System.out.println("2. Convert gr to kg ");

        int userChoice = scan.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Enter a number: ");
                int numberEntered = scan.nextInt();
                double result = NumberToConvert.KgToGr(numberEntered);
                System.out.println("Conversion: "+ result);
                break;

            case 2:
                System.out.println("Enter a number: ");
                int numberEntered2 = scan.nextInt();
                double result2  = NumberToConvert.GrToKg(numberEntered2);
                System.out.println("Conversion: "+ result2);
                break;

        }
    }
}