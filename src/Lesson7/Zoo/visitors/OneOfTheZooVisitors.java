package Lesson7.Zoo.visitors;

import Lesson7.Zoo.vistorsAction.GetVoiceVisitor;
import Lesson7.Zoo.vistorsAction.VisitorEating;
import Lesson7.Zoo.vistorsAction.VisitorSleep;

public class OneOfTheZooVisitors extends Visitor implements VisitorEating, VisitorSleep, GetVoiceVisitor {
    public OneOfTheZooVisitors(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }

    public void getApplause() {
        System.out.println("Файл \"Громкие звуки оваций\" - not found!");
    }

    @Override
    public void visitorLaughs() {
        System.out.println("Ха-ха-ха! Какой смешной зверь!");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void visitorEats() {
        System.out.println("Чявк-чявк-чявк...");
    }
}
