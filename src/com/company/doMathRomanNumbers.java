package com.company;

public class doMathRomanNumbers {

    public static void doMathRomanNumbers(String str){
        int result;
        String[] numbers;
        String str2 = str.replaceAll("\\s+", "");
        if (str2.indexOf("+") > 0)
        {
            numbers = str2.split("[+]");
            int[] RomanNumbers = convertRomanNumbersToArabian (numbers);
            result = RomanNumbers [0] + RomanNumbers [1];
            printRomanNumbers (result);
        }
        else if (str2.indexOf("-") > 0)
        {
            numbers = str2.split("[-]");
            int[] RomanNumbers = convertRomanNumbersToArabian(numbers);
            result = RomanNumbers [0] - RomanNumbers [1];
            printRomanNumbers (result);
        }
        else if (str2.indexOf("/") > 0)
        {
            numbers = str2.split("[/]");
            int[] RomanNumbers = convertRomanNumbersToArabian(numbers);
            result = RomanNumbers [0] / RomanNumbers [1];
            printRomanNumbers (result);
        }
        else if (str2.indexOf("*") > 0)
        {
            numbers = str2.split("[*]");
            int[] RomanNumbers = convertRomanNumbersToArabian(numbers);
            result = RomanNumbers [0] * RomanNumbers [1];
            printRomanNumbers (result);
        }

    }
    private static int[] convertRomanNumbersToArabian(String[] numbers) {
        RomanumNumbers symbol1 = RomanumNumbers.valueOf(numbers[0]);
        RomanumNumbers symbol2 = RomanumNumbers.valueOf(numbers[1]);
        int number1 = symbol1.getNumber(numbers[0]);
        int number2 = symbol2.getNumber(numbers[1]);
        return new int [] {number1,number2};
    }
    public static void printRomanNumbers(int result) {
        if (result ==0) System.out.print("0");
        if (result < 0)
        {
            result = Math.abs(result);
            System.out.print("-"+ArabianNumbersToRoman(result));
            System.exit(0);
        }
        System.out.print(ArabianNumbersToRoman(result));
        System.exit(0);
    }
    public static String ArabianNumbersToRoman(int n) {
        StringBuilder buf = new StringBuilder();
        final RomanumNumbers[] values = RomanumNumbers.values();
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i].number) {
                buf.append(values[i]);
                n -= values[i].number;
            }
        }
        return buf.toString();
    }
}

