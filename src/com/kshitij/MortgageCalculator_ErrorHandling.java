package com.kshitij;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator_ErrorHandling {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double principal =0;
        double annualInterestRate=0;
        double years =0;

        // Input principal
        while(true) {
            try {
                System.out.print("Enter principal($1K - $1M: ");
                principal = scanner.nextDouble();
                if (principal < 1000 || principal > 100000) throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                scanner.nextLine();
            }
        }

        // Input AnnualInterestRate
        while(true){
            try{
                System.out.print("Annual Interest Rate: ");
                annualInterestRate = scanner.nextDouble();
                if(annualInterestRate <= 0 || annualInterestRate > 30 ) throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
                scanner.nextLine();
            }
        }

        // Input years
        while(true){
            try{
                System.out.print("Period (Years): ");
                years = scanner.nextDouble();
                if(years <=0 || years > 30 ) throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Enter a value between 1 and 30");
                scanner.nextLine();
            }
        }

        // Displaying the value
        System.out.println("\nPrincipal: "+ principal);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println("Period (Years): " + years);

        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        int numberOfPayments = (int) (years * MONTHS_IN_YEAR);

        double mortgage = principal *
                (monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments))/
                Math.pow(1+monthlyInterestRate,numberOfPayments)-1;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "CA"));
        String formattedMortgage = currencyFormat.format(mortgage);

        //Display Result
        System.out.println("\n---------------------------");
        System.out.println("Monthly Payment: " + formattedMortgage);
        System.out.println("------------------");



    }
}
