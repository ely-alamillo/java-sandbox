package com.mortageCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        float principalAmt = Float.parseFloat(scanner.next().trim());

        System.out.print("Annual interest rate: ");
        float annualInterest = Float.parseFloat(scanner.next().trim());

        System.out.print("Period (Years): ");
        int periodInYears = Integer.parseInt(scanner.next().trim());

        System.out.print("Mortgage: " + calculateMortgage(principalAmt, annualInterest, periodInYears));


    }

    private static String calculateMortgage(float principal, float interestRate, int years) {
        DecimalFormat df2 = new DecimalFormat("#.##");

        final float monthlyInterestRate = (interestRate / 100) / 12;
        final int totalMonthlyPayments = years * 12;

        final double top = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), totalMonthlyPayments);
        final double bottom = Math.pow((1 + monthlyInterestRate),totalMonthlyPayments) - 1;

        final double monthlyPayment = principal * (top/bottom);

        return df2.format(monthlyPayment);

    }
}