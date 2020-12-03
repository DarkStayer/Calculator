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
            if (int1 > 10 | int1 < 0) throw new Exception("Numbers 1 must be less than 10 and greater than 0");
            if (int2 > 10 | int2 < 0) throw new Exception("Numbers 2 must be less than 10 and greater than 0");
            result = int1 + int2;

        } else if (str2.indexOf("-") > 0) {
            numbers = str2.split("[-]");
            int int1 = Integer.parseInt(numbers[0]);
            int int2 = Integer.parseInt(numbers[1]);
            if (int1 > 10 | int1 < 0) throw new Exception("Numbers 1 must be less than 10 and greater than 0");
            if (int2 > 10 | int2 < 0) throw new Exception("Numbers 2 must be less than 10 and greater than 0");
            result = int1 - int2;
        } else if (str2.indexOf("/") > 0) {
            numbers = str2.split("[/]");
            int int1 = Integer.parseInt(numbers[0]);
            int int2 = Integer.parseInt(numbers[1]);
            if (int1 > 10 | int1 < 0) throw new Exception("Numbers 1 must be less than 10 and greater than 0");
            if (int2 > 10 | int2 < 0) throw new Exception("Numbers 2 must be less than 10 and greater than 0");
            result = int1 / int2;
        } else if (str2.indexOf("*") > 0) {
            numbers = str2.split("[*]");
            int int1 = Integer.parseInt(numbers[0]);
            int int2 = Integer.parseInt(numbers[1]);
            if (int1 > 10 | int1 < 0) throw new Exception("Numbers 1 must be less than 10 and greater than 0");
            if (int2 > 10 | int2 < 0) throw new Exception("Numbers 2 must be less than 10 and greater than 0");
            result = int1 * int2;
        } else throw new Exception("Wrong operation");

        System.out.print(result);
    }
}
