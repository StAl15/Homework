package com.company;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше число ");
        long a = scan.nextLong();
        System.out.println("Вы хотите перевести ваше число в двоичную или в десятичную систему счисления? ");
        System.out.println("1) из двоичной в десятичную \n2) из десятичной в двоичную ");
        int answer = scan.nextInt();
        if (answer == 1){
            String b = Long.toString(a);
            System.out.println("Полученное число = " + Long.parseLong(b, 2));
        }
        if (answer == 2){
            System.out.println("Полученное число = " + Long.toBinaryString(a));
        }
        else{
            System.out.println("Опция не выбрана, запустите программу ещё раз ");
        }
        scan.close();
    }
}
