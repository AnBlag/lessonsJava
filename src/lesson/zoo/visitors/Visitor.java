package lesson.zoo.visitors;

import lesson.zoo.exception.ToGiveSomeFoodException;
import lesson.zoo.vistorsAction.GetVoiceVisitor;
import lesson.zoo.vistorsAction.VisitorEating;
import lesson.zoo.vistorsAction.VisitorSleep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Visitor implements GetVoiceVisitor, VisitorSleep, VisitorEating {
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

    public void visitorLaughs() {
        System.out.println("Ха-ха-ха! Какой смешной зверь!");
    }

    public void visitorEats() {
        System.out.println("Чявк-чявк-чявк...");
    }

    public void getApplause() {
        System.out.println("Файл \"Громкие звуки оваций\" - not found!");
    }

    public void giveSomeFoodVisitor() {
        {
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Можете покормить посетителя. Оно ест - " + getVisitorFood() + ".");
                String food = null;
                try {
                    food = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (!food.equalsIgnoreCase(getVisitorFood())) {
                    try {
                        throw new ToGiveSomeFoodException("Посетитель это не ест!");
                    } catch (ToGiveSomeFoodException e) {
                        e.printStackTrace();
                    }
                } else System.out.println("М-М-М! Как вкусно!");
            }
        }
    }

}
