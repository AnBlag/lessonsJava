package Lesson7.Zoo.Animals;

import Lesson7.Zoo.AnimalsAction.AnimalEats;
import Lesson7.Zoo.AnimalsAction.SleepAnimal;

public class Lazy extends Animal implements SleepAnimal, AnimalEats {
    public Lazy(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }

    @Override
    public void getVoice() {
        System.out.println("A-a-agh");
    }

    public void getScratch(){
        System.out.println("Ленивец почесался.");
    }

    @Override
    public void eatFood() {
        super.eatFood();
    }

}
