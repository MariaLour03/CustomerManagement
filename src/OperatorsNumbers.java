public class OperatorsNumbers {
    public void useLeftShift() {
        int x = 2;
        // Binary string of x -> 10
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = (x << 1);    // Decimal value of x -> 4
        System.out.println("Decimal value of x after Left shift: " + x);
    }
    public void useRightShift() {
        int x = 150;
        // Binary string of x -> 10010110
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = (x >> 2);  // Decimal value of x -> 37
        System.out.println("Decimal value of x after Right shift: " + x);
    }
    public void useBitwiseAndOperator() {
        int x = 7;
        int y = 17;
        int z = x & y; // Bitwise AND Operator
        System.out.println("Binary string of the number: " + Integer.toBinaryString(z));
        System.out.println("Decimal value of z after AND operation: " + z);
    }
    public void useBitwiseOROperator() {
        int x = 7;
        int y = 17;
        int z = x | y; // Bitwise OR Operator
        System.out.println("Binary string of the number: " + Integer.toBinaryString(z));
        System.out.println("Decimal value of z after OR operation: " + z);
    }
    public void useUnaryOperators(){
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println("Value of sum after Prefix operation: " + sum);
        sum = x++ + y;
        System.out.println("Value of sum after Postfix operation: " + sum);
    }

    public void usePostfixOperator(){
        int x = 5;
        System.out.println("Value of x before Postfix operation: " + x);
        int y = x++;
        System.out.println("Value of y after Postfix operation: " + y);
    }
}

