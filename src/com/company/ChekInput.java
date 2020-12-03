package com.company;

public class ChekInput {
    public static void ChekInput(String str) throws Exception {
        if (chekRomanNumbers(str))
            doMathRomanNumbers.doMathRomanNumbers(str);
        if (chekArabianInput(str))
            doMathArabianNumbers.doMathArabianNumbers(str);
        else throw new Exception("WrongInput");
    }

    private static boolean chekRomanNumbers(String str) {
        String[] RomanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] str2 = str.replaceAll("[^A-Za-z0-9]", ",").split(",");
        int chek = 0;
        for (int count = 1; count < 2; count++) //проверка на два значения ввода римских цифр
        {
            for (String s : str2) {
                for (String romanNumber : RomanNumbers) {
                    if (s.equals(romanNumber)) {
                        chek++;
                    }
                }
            }
        }
        return chek == 2;
    }

    private static boolean chekArabianInput(String str) {
        String[] str2 = str.replaceAll("[^A-Za-z0-9]", ",").split(",");
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int chek = 0;
        for (int count = 1; count < 2; count++) //проверка на два значения ввода арабских цифр
        {
            for (String s : str2) {
                for (String number : numbers) {
                    if (s.equals(number)) {
                        chek++;
                    }
                }
            }
        }return chek == 2;
    }
}
