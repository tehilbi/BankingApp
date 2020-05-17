package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
//        int a = scanner.nextInt();
        char c = scanner.next().charAt(0);
        System.out.println("value = " + c);
    }
}
