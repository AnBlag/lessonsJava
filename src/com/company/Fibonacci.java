package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static void main(String[] args) throws IOException {
        resultFibonacci();
    }

    public static int enterNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static void resultFibonacci() throws IOException {
        System.out.println("Введите число. Что бы получить последовательность.");
        int number = enterNumber();
        getFibonacci(number);
    }

    public static void getFibonacci(int number) {
        int result = 0;
        int result2 = 1;
        int sum;
        for (int i = 1; i <= number; i++) {
            sum = result + result2;
            result = result2;
            result2 = sum;
            System.out.println(sum);
        }
    }
}
