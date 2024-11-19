package com.perscholas.operatorsnumbers;

public class Main {
    public static void main(String[] args) {
        OperatorsNumbers opObj = new OperatorsNumbers();
        opObj.useLeftShift(2);    // Binary string of x ->10 Decimal value of x -> 4
        opObj.useLeftShift(9);  // Binary string of x ->1001 Decimal value of x -> 18
        opObj.useLeftShift(17); // Binary string of x ->10001 Decimal value of x -> 34
        opObj.useLeftShift(88);  // Binary string of x ->1011000 Decimal value of x -> 176
        opObj.useRightShift(150);  //Binary string of x ->10010110 Decimal value of x -> 37
        opObj.useRightShift(225);  // Binary string of x ->11100001 Decimal value of x -> 56
        opObj.useRightShift(1555); // Binary string of x ->11000010011 Decimal value of x -> 388
        opObj.useRightShift(32456); // Binary string of x ->111111011001000 Decimal value of x -> 8114
        opObj.useBitwiseAndOperator(); // Binary string of z ->1 Decimal value of z-> 1
        opObj.useBitwiseOROperator(); // Binary string of z ->10111 Decimal value of z -> 23
        opObj.usePostfixOperator(); // 5
        opObj.incrementVariable();  // x->5, 1st increment by 1: x->6, 2nd increment by 1: x->6, 3rd increment by 1: x->7
        opObj.useUnaryOperators();  // 14
    }
}
