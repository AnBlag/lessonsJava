package Lesson7.Zoo.animals;

import Lesson7.Zoo.animalsAction.AnimalEats;
import Lesson7.Zoo.animalsAction.SleepAnimal;

public class Birds extends Animal implements AnimalEats, SleepAnimal {
    public Birds(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }

    @Override
    public void getVoice() {
        System.out.println("Чик-чирик!");
    }

    public void scareTheBird () {
            System.out.println("Своими действиями Вы жутко напугали птиц.");
            System.out.println("Вас выгнала охрана парка за неподобающее поведение.");
    }
}