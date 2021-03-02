package Lesson7.Zoo.Animals;

import Lesson7.Zoo.AnimalsAction.AnimalEats;
import Lesson7.Zoo.AnimalsAction.SleepAnimal;

public class Elephants extends Animal implements AnimalEats, SleepAnimal {
    public Elephants(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }

    public Integer forcingToElephant() {
            System.out.println("Слон устал. Его нужно скорее покормить, или он умрет!");
            return getWeight()-1;
    }

    @Override
    public void getVoice() {
        System.out.println("Файл \"Звуки слона\" - not found!");
    }
}
