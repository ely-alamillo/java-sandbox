package com.mortageCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float principalAmt;
        float annualInterest;
        int periodInYears;


        while (true) {
            System.out.print("Principal: ");
            principalAmt = Float.parseFloat(scanner.next().trim());

            if (principalAmt < 1000) continue;
            break;
        }



        while (true) {
            System.out.print("Annual interest rate: ");
            annualInterest = Float.parseFloat(scanner.next().trim());

            if (annualInterest < 1 || annualInterest > 30) continue;
            break;
        }



        while (true) {
            System.out.print("Period (Years): ");
            periodInYears = Integer.parseInt(scanner.next().trim());

            if (periodInYears > 30) continue;
            break;
        }


        System.out.print("Mortgage: " + calculateMortgage(principalAmt, annualInterest, periodInYears));


    }

    private static String calculateMortgage(float principal, float interestRate, int years) {
        DecimalFormat df2 = new DecimalFormat("#.##");

        final float monthlyInterestRate = (interestRate / 100) / 12;
        final int totalMonthlyPayments = years * 12;

        final double top = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), totalMonthlyPayments);
        final double bottom = Math.pow((1 + monthlyInterestRate), totalMonthlyPayments) - 1;

        final double monthlyPayment = principal * (top / bottom);

        return df2.format(monthlyPayment);

    }
}