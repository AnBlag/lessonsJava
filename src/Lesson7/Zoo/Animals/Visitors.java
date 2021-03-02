package Lesson7.Zoo.Animals;

import Lesson7.Zoo.AnimalsAction.AnimalEats;
import Lesson7.Zoo.AnimalsAction.SleepAnimal;

public class Visitors extends Animal implements AnimalEats, SleepAnimal {
    public Visitors(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }

    public void getApplause() {
        System.out.println("Файл \"Громкие звуки оваций\" - not found!");
    }

    @Override
    public void getVoice() {
        System.out.println("Ха-ха-ха! Какой смешной зверь!");
    }

    @Override
    public void animalSleep() {
        super.animalSleep();
    }
}
