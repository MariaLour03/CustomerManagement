package com.perscholas.operatorsnumbers;

public class OperatorsNumbers {
    public void useLeftShift(int x) {
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = (x << 1);
        System.out.println("Decimal value of x after Left shift: " + x);
    }
    public void useRightShift(int x) {
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = (x >> 2);
        System.out.println("Decimal value of x after Right shift: " + x);
    }
    public void useBitwiseAndOperator() {
        int x = 7;
        int y = 17;
        int z = x & y; // Bitwise AND Operator
        System.out.println("Binary string of the number: " + Integer.toBinaryString(z)); // z->1
        System.out.println("Decimal value of z after AND operation: " + z); // z-> 1
    }
    public void useBitwiseOROperator() {
        int x = 7;
        int y = 17;
        int z = x | y; // Bitwise OR Operator
        System.out.println("Binary string of the number: " + Integer.toBinaryString(z)); // z->10111
        System.out.println("Decimal value of z after OR operation: " + z); // z->23
    }
    public void usePostfixOperator(){
        int x = 5;
        System.out.println("Value of x before Postfix operation: " + x);
        int y = x++;
        System.out.println("Value of y after Postfix operation: " + y);
    }
    public void incrementVariable(){
        int x = 5;
        System.out.println("Value of x : " + x);
        x = ++x;
        System.out.println("Value of x after increment by 1: " + x);
        x = x++;
        System.out.println("Value of x after increment by 1 second time: " + x);
        x += 1;
        System.out.println("Value of x after increment by 1 third time: " + x);
    }
    public void useUnaryOperators(){
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println("Value of sum after Prefix operation: " + sum);
        sum = x++ + y;
        System.out.println("Value of sum after Postfix operation: " + sum);
    }


}

