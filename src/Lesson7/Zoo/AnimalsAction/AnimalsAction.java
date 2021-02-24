package Lesson7.Zoo.AnimalsAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalsAction {
    public static void animalSleep() throws InterruptedException {
        System.out.println("Зверь уснул, но он скоро проснётся!");
        Thread.sleep(5000);
    }
    public static void giveSomeFood() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String food = reader.readLine();
    }


}
