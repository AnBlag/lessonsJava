package Lesson7.Zoo.animals;

import Lesson7.Zoo.animalsAction.AnimalEats;
import Lesson7.Zoo.animalsAction.GiveSomeFoodAnimal;
import Lesson7.Zoo.animalsAction.SleepAnimal;
import Lesson7.Zoo.exception.ToGiveSomeFoodException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public abstract class Animal implements AnimalEats, SleepAnimal, GiveSomeFoodAnimal{
    private String name;
    private Integer weight;
    private String animalFood;

    public Animal(String name, Integer weight, String animalFood) {
        this.name = name;
        this.weight = weight;
        this.animalFood = animalFood;
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

    public String getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", animalFood='" + animalFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal that = (Animal) o;
        return Objects.equals(name, that.name) && Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, animalFood);
    }


    @Override
    public void eatFood() {
            System.out.println("Чявк-чявк-чявк...");
    }

    public abstract void getVoice();

    @Override
    public void animalSleep() {
            System.out.println("Зверь уснул, но он скоро проснётся!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    @Override
    public void giveSomeFood() {
        {
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                if (!name.equals("Посетитель")) {
                    System.out.println("Можете покормить животное. Оно ест - " + getAnimalFood() + ".");
                    String food = null;
                    try {
                        food = reader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (!food.equalsIgnoreCase(getAnimalFood())) {
                        try {
                            throw new ToGiveSomeFoodException("Животное эту еду не ест!");
                        }
                        catch (ToGiveSomeFoodException e) {
                            e.printStackTrace();
                        }
                    } else System.out.println("Чавк-чавк-чавк...");
                }
            }
        }
    }
}

