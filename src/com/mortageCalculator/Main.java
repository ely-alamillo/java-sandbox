package com.mortageCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        String principalAmt = scanner.next().trim();

        System.out.print("Annual interest rate: ");
        String annualInterest = scanner.next().trim();

        System.out.print("Period (Years): ");
        String periodInYears = scanner.next().trim();

        System.out.print("Mortgage: \n");



        System.out.println(principalAmt);
        System.out.println(annualInterest);
        System.out.println(periodInYears);
    }


}