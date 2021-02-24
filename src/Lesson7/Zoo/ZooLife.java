package Lesson7.Zoo;

import Lesson7.Zoo.Animals.*;


import java.io.IOException;

public class ZooLife {
    public static void main(String[] args) throws InterruptedException, IOException {
        Lazy lazyAnimal = new Lazy("Flash", 10, "Листья");
        lazyAnimal.getVoice();
        lazyAnimal.getScratch();
        lazyAnimal.getFood();
        lazyAnimal.getSleep();

        //

        Visitors visitor = new Visitors("Посетитель", 74, "Чебурек");
        visitor.giveSomeFood();
        visitor.getApplause();
        visitor.getFood();
        visitor.getSleep();

        //

        Monkeys monkey = new Monkeys("Abu", 19, "Банан");
        monkey.toHide();
        monkey.getVoice();
        monkey.getSleep();
        monkey.getFood();

        //

        Elephants elephant = new Elephants("Dumbo", 295, "Листья");
        elephant.forcingToElephant();
        elephant.getVoice();
        elephant.getFood();
        elephant.getSleep();

        //

        Dolphins dolphin = new Dolphins("Ecco", 29, "Рыба");
        dolphin.upJump();
        dolphin.pretendToBeDead();
        dolphin.getFood();
        dolphin.getSleep();

        //

        bearFight();
        Bear bear = new Bear("Какой-то медведь", 200, "Мёд");
        bear.toSwim();
        bear.getFood();
        bear.getSleep();

        //

        Birds bird = new Birds("Thunderbolt", 31, "Пшено");
        bird.feedTheBird();
        bird.scareTheBird();
        bird.getFood();
        bird.getSleep();

    }
    public static void bearFight(){
        Bear Misha = new Bear("Misha", 215, "Мёд");
        Bear Potap = new Bear("Potap", 194, "Мёд");
        Bear Teddy = new Bear("Teddy", 191, "Мёд");
        if (Misha.getWeight() > Potap.getWeight() && Misha.getWeight() > Teddy.getWeight()) {
            System.out.println("Сегодня в этой почти равной схватке победил " + Misha.getName() + "!");
        }
        else if (Potap.getWeight() > Misha.getWeight() && Potap.getWeight() > Teddy.getWeight()) {
            System.out.println("Сегодня в этой почти равной схватке победил " + Potap.getName() + "!");
        }
        else System.out.println("Сегодня в этой почти равной схватке победил " + Teddy.getName() + "!");
    }
}
