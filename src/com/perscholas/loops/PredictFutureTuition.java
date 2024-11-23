package com.perscholas.loops;

public class PredictFutureTuition {
    public static void main(String[] args) {

        double tuition = 10000.00;  // current tuition value
        int year = 0;
        double interestRate = 0.07;  // 7% increase each year

        while (tuition < 20000) {
            tuition = tuition * (1 + interestRate);
            year++;
        }
        System.out.printf("Tuition will be doubled in %d years" , year); // 11 years
    }
}
