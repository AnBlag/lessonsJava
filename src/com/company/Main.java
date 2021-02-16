package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        wordInFrame();
    }


    public static void wordInFrame() throws IOException {
        System.out.println("Введите длину.");
        int lenFrame = getLenFrame();
        System.out.println("Введите высоту.");
        int heiFrame = getHeiFrame();
        System.out.println("Введите слово.");
        String text = getText();
        compilation(lenFrame, heiFrame, text);
    }

    public static int getLenFrame () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static int getHeiFrame () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static String getText () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void compilation (int lenFrame, int heiFrame, String text){
        if ((lenFrame-2) > text.length()) {
            for (int i = 0; i < heiFrame; i++) {
                for (int j = 0; j < lenFrame; j++) {
                    if (j == (lenFrame-text.length()) / 2 && i == heiFrame/2) {
                        System.out.print(text);
                        j = j+(text.length()-1);
                    }
                    else if (i == 0 || i == heiFrame - 1 || j == 0 || j == lenFrame - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        else System.out.println("Вы ввели слишком длинное слово!");
    }
}