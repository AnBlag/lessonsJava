package com.company;

import java.util.Scanner;

public class FibonacciRec {
    public static int
            num1,
            num2;

    public FibonacciRec(int firstElement, int secondElement)
    {
        num1 = firstElement;
        num2 = secondElement;
    }

    public int calculate(int result)
    {
        if (result <= 1)
            return num1;
        if (result == 2)
            return num2;
        return calculate(result - 1) + calculate(result - 2);
    }


    public static void main(String[] args)
    {
        int firstElement = 1;
        int secondElement = 2;
        Scanner scanner = new Scanner(System.in);
        int requiredElementIndex = scanner.nextInt();
        FibonacciRec sequence = new FibonacciRec(firstElement, secondElement);
        System.out.println(sequence.calculate(requiredElementIndex));
    }
}