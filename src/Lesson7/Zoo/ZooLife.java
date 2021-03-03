package Lesson7.Zoo;

import Lesson7.Zoo.animals.*;
import Lesson7.Zoo.visitors.OneOfTheZooVisitors;

import java.util.Random;

public class ZooLife {
    public static void main(String[] args) {
        Lazy lazyAnimal = new Lazy("Flash", 10, "Листья");
        lazyAnimal.getVoice();
        lazyAnimal.getScratch();
        lazyAnimal.eatFood();
        lazyAnimal.animalSleep();
        lazyAnimal.giveSomeFood();

        //

        OneOfTheZooVisitors visitor = new OneOfTheZooVisitors("Посетитель", 74, "Чебурек");
        visitor.getApplause();
        visitor.visitorEats();
        visitor.sleep();
        visitor.visitorLaughs();

        //

        Monkeys monkey = new Monkeys("Abu", 19, "Банан");
        monkey.toHide();
        monkey.getVoice();
        monkey.animalSleep();
        monkey.eatFood();
        monkey.giveSomeFood();

        //

        Elephants elephant = new Elephants("Dumbo", 295, "Листья");
        elephant.forcingToElephant();
        elephant.getVoice();
        elephant.eatFood();
        elephant.animalSleep();
        elephant.giveSomeFood();

        //

        Dolphins dolphin = new Dolphins("Ecco", 29, "Рыба");
        dolphin.upJump();
        dolphin.pretendToBeDead();
        dolphin.eatFood();
        dolphin.animalSleep();
        dolphin.getVoice();
        dolphin.giveSomeFood();

        //

        bearFight();
        Bear bear = new Bear("Какой-то медведь", 200, "Мёд");
        bear.toSwim();
        bear.eatFood();
        bear.animalSleep();
        bear.getVoice();
        bear.giveSomeFood();

        //

        Birds bird = new Birds("Thunderbolt", 31, "Пшено");
        bird.getVoice();
        bird.scareTheBird();
        bird.eatFood();
        bird.animalSleep();
        bird.giveSomeFood();

    }
    public static void bearFight(){
        Bear Misha = new Bear("Misha", new Random().nextInt(10), "Мёд");
        Bear Potap = new Bear("Potap", new Random().nextInt(10), "Мёд");
        Bear Teddy = new Bear("Teddy", new Random().nextInt(10), "Мёд");
        if (Misha.getWeight() > Potap.getWeight() && Misha.getWeight() > Teddy.getWeight()) {
            System.out.println("Сегодня в этой почти равной схватке победил " + Misha.getName() + "!");
        }
        else if (Potap.getWeight() > Misha.getWeight() && Potap.getWeight() > Teddy.getWeight()) {
            System.out.println("Сегодня в этой почти равной схватке победил " + Potap.getName() + "!");
        }
        else if (Teddy.getWeight() > Misha.getWeight() && Teddy.getWeight() > Potap.getWeight()) {
            System.out.println("Сегодня в этой почти равной схватке победил " + Teddy.getName() + "!");
        }
        else System.out.println("Ничья!");
    }
}
