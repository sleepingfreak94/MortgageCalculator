package com.kshitij;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){

       /* // Input and view principal
        Scanner principal = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int finalprinciple = principal.nextInt();
        System.out.print("Principal: ");
*/
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        try{
            // Entering the value
            System.out.print("Enter Principal: ");
            int principal = scanner.nextInt();
            System.out.print("Enter Annual Interest Rate: ");
            double annualInterestRate = scanner.nextDouble();
            double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
            System.out.print("Enter Period (Years): ");
            double period = scanner.nextDouble();
            int numberOfPayments = (int) (period * MONTHS_IN_YEAR);

            // Displaying the value
            System.out.println("\nPrincipal: "+ principal);
            System.out.println("Annual Interest Rate: " + annualInterestRate);
            System.out.println("Period (Years): " + period);

            //Calculating Mortgage
            double mortgage = principal *
                    (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                    (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "CA"));
            String formattedMortgage = currencyFormat.format(mortgage);


            //Display Result
            System.out.println("\n---------------------------");
            System.out.println("Monthly Payment: " + formattedMortgage);
            System.out.println("------------------");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter numeric values!!");

        }


    }
}
