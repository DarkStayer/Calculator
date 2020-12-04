package com.company;

public enum RomanumNumbers {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), XL(40),L(50), XC(90), C(100);


     final int number;

    RomanumNumbers(int number) {
        this.number = number;
    }


    public int getNumber(String number) {
        return this.number;
    }

}
