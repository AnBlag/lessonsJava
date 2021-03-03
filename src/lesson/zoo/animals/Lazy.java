package lesson.zoo.animals;

import lesson.zoo.animalsAction.AnimalEats;
import lesson.zoo.animalsAction.SleepAnimal;

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
