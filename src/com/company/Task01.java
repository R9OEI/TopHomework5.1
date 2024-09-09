package com.company;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words = "";
        char symbol;
        int index = 0;
        int coincidence = 0;
        System.out.println("Введите строку слов:");
        words = scan.nextLine();
        System.out.println("Введите символ:");
        symbol = scan.next().charAt(0);
        boolean isTrue = true;
        while (isTrue) {

                index = words.indexOf(symbol, index);
            if(index != -1 && index < words.length()) {
                index++;
                System.out.println("Совпадение символа " + index);
                coincidence++;
            }
            else {
                isTrue = false;
                System.out.println("Всего совпадений : " + coincidence );
            }
        }
    }
}
