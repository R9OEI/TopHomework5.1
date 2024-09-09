package com.company;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        String digits = "";
        String digitsTmp = "";
        int number = 1;
        boolean isTrue = true;
        while (isTrue) {
            if (digitsTmp.length() < 1000) {
                digitsTmp += number;
                if (digitsTmp.length() < 1000) {
                    digits = digitsTmp;
                } else {
                    isTrue = false;
                }
            }
            number++;
        }
        System.out.println(digits);
        System.out.println(digits.length());
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите индекс:");
        int index = scan.nextInt();
        System.out.println("Число в строке по индексу " + index + " , это " + digits.charAt(index + 1));
    }
}
