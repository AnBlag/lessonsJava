package Lesson7.Zoo.Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Visitors extends AbstractAnimal{
    public Visitors(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }
    public void giveSomeFood() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Животных кормить нельзя! Но можно покормить посетителя чебуреком.");
        String food = reader.readLine();
        if (food.equals("Чебурек")){
            System.out.println("M-m-m! Nice! Thank's!");
        } else System.out.println("Человеки это не едят!");
    }
    public void getApplause(){
        System.out.println("Файл \"Громкие звуки оваций\" - not found!");
    }
}
