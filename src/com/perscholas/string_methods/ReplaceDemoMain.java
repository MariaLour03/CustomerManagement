package com.perscholas.string_methods;

public class ReplaceDemoMain {
    public static void main(String[] args) {
        String str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));
    }
}
//public static int subtractDigits(int number) {
//    String str = String.valueOf(number);
//    System.out.println(str);
//    char[] ch = str.toCharArray();
//    System.out.println(Arrays.toString(ch));
//    System.out.println(ch.length);
//
//    //int result = Character.getNumericValue(str.charAt(0));// tempresult=0;
//    //System.out.println(result);
//    //for (int i=1;i<str.length();i++){
//    //tempresult = ch[i];
//    //result = result - Character.getNumericValue(str.charAt(i));;
//
//    //}
//    //return result;
//
//
//    int num = number;
//int temp = num /100;
//       System.out.println(temp);
//int result = temp;
//       System.out.println(temp);
//num = num % 100;
