public class JavaBasicsClass {

    // Addition of integers
    public void addInt() {
        int x = 10;
        int y = 50;
        int sum = x + y;
        System.out.println("Sum of Integers: " + sum);
    }

    //Addition of double values
    public void addDouble() {
        double num1 = 18.15;
        double num2 = 35.89;
        double total = num1 + num2;
        System.out.println("Sum of Doubles: " + total);
    }

    // Addition of integer and double value
    public void addIntDouble() {
        int num1 = 45;
        double num2 = 25.85;
        double total = num1 + num2; //total must be double data type
        System.out.println("Sum of Doubles: " + total);
    }

    // Division method - Integers
    public void divideIntValues() {
        int num1 = 50;
        int num2 = 120;
        double num3 = 250.85;
        int result = num2 / num1;

        //result1 should be double datatype since num3 is double and num1 is integer
        double result1 = num3 / num1;
        System.out.println("Division result of Integer values : " + result);
        System.out.println("Division result of Double/Integer values : " + result1);
    }

    // Typecasting - Integer datatype
    public void divide_TypecastInt() {
        double num1 = 150.25;
        double num2 = 450.75;

        double result = num2 / num1;
        System.out.println("Division result of Double values : " + result);

        //Type casting division expression to integer datatype
        double result1 = (int) (num2 / num1);
        System.out.println("After casting expression to Integer : " + result1);
    }

    // Typecasting - Double datatype
    public void divide_TypecastDouble() {
        int x = 5;
        int y = 6;

        int q = y / x;
        System.out.println("Division result of Integer values : " + q);

        //Type casting y to double datatype gives an Error
        // So, the result variable-> q1 is declared as double
        double q1 = (double) y / x;
        System.out.println("After casting y to Double : " + q1);
    }

    //Calculate Area of a Circle using Constant
    public void calculateArea_UsingConstant() {
        final double PI = 3.14; // Constant
        int r = 5;
        double area = PI * Math.pow(r, 2);
        System.out.println("Area of a Circle (Using Constant) : " + area);
    }

    //Calculate Sales Tax
    public void calculate_SalesTax() {
        final double SALES_TAX = 5.20; // Constant
        double coffee = 5.75;
        double espresso = 7.30;
        double greenTea = 8.25;
        double subtotal = (3 * coffee) + (4 * espresso) + (2 * greenTea);
        double totalSale = subtotal + SALES_TAX;

        System.out.print("Total Sales Amount : ");
        System.out.printf("%.2f", totalSale);
    }
}


