package Lesson7.Zoo.Animals;

import Lesson7.Zoo.AnimalsAction.AnimalEats;
import Lesson7.Zoo.AnimalsAction.SleepAnimal;

import java.util.Random;
import java.util.Scanner;

public class Monkeys extends Animal implements AnimalEats, SleepAnimal {
    public Monkeys(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }

    @Override
    public void getVoice() {
        System.out.println("У,у,а,а!");
    }

    public void toHide() {
        Scanner scanner = new Scanner(System.in);
        int a = new Random().nextInt(3);
        System.out.println("Мартышка спряталась за деревом. Сможешь её найти? Введи номер дерева 1, 2, или 3.");
        for (int i = 3; i > 0; i--) {
            int enterNum = scanner.nextInt();
            if (a == enterNum) {
                System.out.println("Нашел!");
                break;
            } else System.out.println("Не нашел, поищи в другом месте.");
        }
    }
}
