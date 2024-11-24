package com.perscholas.controlflowstatements;

import java.util.Scanner;
// Check a given value
public class ConditionalStatements {
    public void useIfStatement() {
        int x = 7;
        if (x < 10)
            System.out.println("Less than 10");
    }
    //Check a given value
    public void use_IfElse_Statement() {
        int x = 7;
        if (x < 10)
            System.out.println("Less than 10");
        else
            System.out.println("Greater than 10");
    }
    // Check a given value
    public void useIf_ElseIf_Statement() {
        int x = 15;
        if (x < 10)
            System.out.println("Less than 10");
        else if (x > 10 && x < 20)
            System.out.println("Between 10 and 20");
        else
            System.out.println("Greater than or equal to 20");
    }
    // Check the range of a value
    public void useIf_ElseStatement() {
        int x = 15;
        if (x < 10 || x > 20)
            System.out.println("Out of range");
        else
            System.out.println("In range");
    }
     // To display the Grade for a given score
    public void calculateGrades() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score value : ");
        int score = input.nextInt(); // Enter a score
        if (score < 0 || score > 100)
            System.out.println("Score out of range");
        if (score >= 90 && score <= 100)
            System.out.println("Grade A");
        else if (score >= 80 && score <= 89)
            System.out.println("Grade B");
        else if (score >= 70 && score <= 79)
            System.out.println("Grade C");
        else if (score >= 60 && score <= 69)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }
    // Display the Weekday
    public void useSwitch_Statement() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value between 1 and 7 : ");
        int weekDay = input.nextInt();
        if (weekDay < 1 || weekDay > 7)
            System.out.println("Out of range");
        switch (weekDay) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
    // To calculate Income Tax
    public double calculate_IncomeTax() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your filing status: ");
        String filingStatus = input.nextLine();
        System.out.print("Enter your income($): ");
        double income = input.nextDouble();
        double tax = 0.00d;

        if (filingStatus.equals("Single")) {
            double tenmax = 8350 * 0.10;
            double fifteenmax = ((33950 - 8350) * 0.15);
            double twentyfivemax = ((82250 - 33950) * 0.25);
            double twentyeightmax = ((171550 - 82250) * 0.28);
            double thirtythreemax = ((372950 - 171550) * 0.33);
            if (income > 0 && income <= 8350) {
                tax = income * 0.10;
                return tax;
            } else if (income > 8350 && income <= 33950) {
                tax = tenmax + ((income - 8350) * 0.15);
                return tax;
            } else if (income > 33950 && income <= 82250) {
               tax = tenmax + fifteenmax + ((income - 33950) * 0.25);
                return tax;
            } else if (income > 82250 && income <= 171550) {
                tax = tenmax + fifteenmax + twentyfivemax + ((income - 82250) * 0.28);
                return tax;
            } else if (income > 171550 && income <= 372950) {
               tax =  tenmax + fifteenmax + twentyfivemax + twentyeightmax + ((income - 171550) * 0.33);
                return tax;
            } else if (income > 372950) {
                tax = tenmax + fifteenmax + twentyfivemax + twentyeightmax + thirtythreemax
                        + ((income - 372950) * 0.35);
                return tax;
            }
            return 0.00d;
        }

        if (filingStatus.equals("Married Filing Jointly")) {
            double tenmax = 16700 * 0.10;
            double fifteenmax = ((67900 - 16700) * 0.15);
            double twentyfivemax = ((137050 - 67900) * 0.25);
            double twentyeightmax = ((208850 - 137050) * 0.28);
            double thirtythreemax = ((372950 - 208850) * 0.33);
            if (income > 0 && income <= 16700) {
                tax = income * 0.10;
                return tax;
            } else if (income > 16700 && income <= 67900) {
                tax = tenmax  + ((income - 16700) * 0.15);
                return tax;
            } else if (income > 67900 && income <= 137050) {
                tax = tenmax + fifteenmax + ((income - 67900) * 0.25);
                return tax;
            } else if (income > 137050 && income <= 208850) {
               tax = tenmax + fifteenmax + twentyfivemax + ((income - 137050) * 0.28);
                return tax;
            } else if (income > 208850 && income <= 372950) {
                tax = tenmax + fifteenmax + twentyfivemax + twentyeightmax + ((income - 208850) * 0.33);
                return tax;
            } else if (income > 372950) {
                tax = tenmax + fifteenmax + twentyfivemax + twentyeightmax + thirtythreemax
                        + ((income - 372950) * 0.35);
                return tax;
            }
            return 0.00d;
        }

        if (filingStatus.equals("Married Filing Separately")) {
            double tenmax = 8350 * 0.10;
            double fifteenmax = ((33950 - 8350) * 0.15);
            double twentyfivemax = ((68525 - 33950) * 0.25);
            double twentyeightmax = ((104425 - 68525) * 0.28);
            double thirtythreemax = ((186475 - 104425) * 0.33);
            if (income > 0 && income <= 8350) {
                tax = income * 0.10;
                return tax;
            } else if (income > 8350 && income <= 33950) {
                tax = tenmax + ((income - 8350) * 0.15);
                return tax;
            } else if (income > 33950 && income <= 68525) {
                tax = tenmax + fifteenmax + ((income - 33950) * 0.25);
                return tax;
            } else if (income > 68525 && income <= 104425) {
                tax = tenmax + fifteenmax + twentyfivemax + ((income - 68525) * 0.28);
                return tax;
            } else if (income > 104425 && income <= 186475) {
                tax = tenmax + fifteenmax + twentyfivemax + twentyeightmax + ((income - 104425) * 0.33);
                return tax;
            } else if (income > 186475) {
                tax = tenmax + fifteenmax + twentyfivemax + twentyeightmax + thirtythreemax
                        + ((income - 186475) * 0.35);
                return tax;
            }
            return 0.00d;
        }

        if (filingStatus.equals("Head of Household")) {
            double tenmax = 11950 * 0.10;
            double fifteenmax = ((45500 - 11950) * 0.15);
            double twentyfivemax = ((117450- 45500) * 0.25);
            double twentyeightmax = ((190200 - 117450) * 0.28);
            double thirtythreemax = ((372950 - 190200) * 0.33);
            if (income > 0 && income <= 11950) {
                tax = income * 0.10;
                return tax;
            } else if (income > 11950 && income <= 45500) {
                tax = tenmax + ((income - 11950) * 0.15);
                return tax;
            } else if (income > 45500 && income <= 117450) {
                tax = tenmax + fifteenmax + ((income - 45500) * 0.25);
                return tax;
            } else if (income > 117450 && income <= 190200) {
                tax = tenmax + fifteenmax + twentyfivemax + ((income - 117450) * 0.28);
                return tax;
            } else if (income > 190200 && income <= 372950) {
                tax = tenmax + fifteenmax + twentyfivemax + twentyeightmax + ((income - 190200) * 0.33);
                return tax;
            } else if (income > 372950) {
                tax = tenmax + fifteenmax + twentyfivemax + twentyeightmax + thirtythreemax
                        + ((income - 372950) * 0.35);
                return tax;
            }
            return 0.00d;
        }
        return 0.00d;
    }

}