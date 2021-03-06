package lesson.zoo.animals;

import lesson.zoo.animalsAction.AnimalEats;
import lesson.zoo.animalsAction.SleepAnimal;

public class Bear extends Animal implements AnimalEats, SleepAnimal {
    public Bear(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }

    @Override
    public void getVoice() {
        System.out.println("Агрх-хх!");
    }

    public void toSwim() {
        System.out.println("Медведь нырнул в воду.");
        System.out.println("Медведь вынырнул из воды.");
        System.out.println("Медведь посмотрел что я тут понаписал и рассмеялся.");
    }
}
