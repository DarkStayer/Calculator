package com.company;

public class doMathArabianNumbers {

    public static void doMathArabianNumbers(String str) throws Exception {
        int result;
        String [] numbers;
        String str2 = str.replaceAll("\\s+", "");
        if (str2.indexOf("+") > 0) {
            numbers = str2.split("[+]");
            int int1 = Integer.parseInt(numbers[0]);
            int int2 = Integer.parseInt(numbers[1]);
            result = int1 + int2;

        } else if (str2.indexOf("-") > 0) {
            numbers = str2.split("[-]");
            int int1 = Integer.parseInt(numbers[0]);
            int int2 = Integer.parseInt(numbers[1]);
            result = int1 - int2;
        } else if (str2.indexOf("/") > 0) {
            numbers = str2.split("[/]");
            int int1 = Integer.parseInt(numbers[0]);
            int int2 = Integer.parseInt(numbers[1]);
            result = int1 / int2;
        } else if (str2.indexOf("*") > 0) {
            numbers = str2.split("[*]");
            int int1 = Integer.parseInt(numbers[0]);
            int int2 = Integer.parseInt(numbers[1]);
            result = int1 * int2;
        } else throw new Exception("Wrong operation");

        System.out.print(result);
    }
}
