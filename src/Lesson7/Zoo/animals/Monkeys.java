package Lesson7.Zoo.animals;

import Lesson7.Zoo.animalsAction.AnimalEats;
import Lesson7.Zoo.animalsAction.SleepAnimal;
import Lesson7.Zoo.exception.RandomValueOutOfBound;

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
            if (enterNum > 3 || enterNum < 1) {
                try {
                    throw new RandomValueOutOfBound("На было ввести значение от 1 до 3!");
                } catch (RandomValueOutOfBound e) {
                    e.printStackTrace();
                }
            } else if (a == enterNum) {
                System.out.println("Нашел!");
                break;
            } else System.out.println("Не нашел, поищи в другом месте.");
        }
    }
}
