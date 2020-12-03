package com.company;
import java.util.Scanner;

public class getUserInput {

        public static void main() throws Exception {
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                ChekInput.ChekInput(str);
        }
}


