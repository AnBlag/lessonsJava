package Lesson7.Zoo.visitors;

import Lesson7.Zoo.vistorsAction.GetVoiceVisitor;
import Lesson7.Zoo.vistorsAction.VisitorEating;
import Lesson7.Zoo.vistorsAction.VisitorSleep;

public abstract class Visitor implements GetVoiceVisitor, VisitorSleep, VisitorEating {
    private String name;
    private Integer weight;
    private String visitorFood;

    public Visitor(String name, Integer weight, String visitorFood) {
        this.name = name;
        this.weight = weight;
        this.visitorFood = visitorFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getVisitorFood() {
        return visitorFood;
    }

    public void setVisitorFood(String visitorFood) {
        this.visitorFood = visitorFood;
    }

    @Override
    public void sleep() {
        {
            System.out.println("Посетитель уснул, но он скоро проснётся!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void visitorLaughs() {

    }

    @Override
    public abstract void visitorEats();

}
