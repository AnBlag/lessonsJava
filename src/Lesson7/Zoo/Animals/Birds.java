package Lesson7.Zoo.Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Birds extends AbstractAnimal{
    public Birds(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }



    public void feedTheBird() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Можешь покормить птичку пшеном. Введи слово - Пшено.");
        String foodBird = reader.readLine();
        if (foodBird.equals(getAnimalFood())) {
            System.out.println("Чик-чирик!");
        } else System.out.println("Птицы это не едят.");
    }
    public void scareTheBird() {
        System.out.println("Своими действиями Вы жутко напугали птиц.");
        System.out.println("Вас выгнала охрана парка за неподобающее поведение.");
    }
}
