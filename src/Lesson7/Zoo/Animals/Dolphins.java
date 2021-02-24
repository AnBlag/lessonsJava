package Lesson7.Zoo.Animals;

import java.util.Random;

public class Dolphins extends AbstractAnimal{
    public Dolphins(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }
    public void upJump() {
        int record = 5;
        for (int i = 0; i < 5; i++) {
            int jumpMeters = new Random().nextInt(10);
            if (jumpMeters >= record){
                System.out.println("Звучат оглушительные апплодисменты! Дельфин подпрыгнул на " + jumpMeters + " метров!");
                record++;
            } else
                System.out.println("Давай! Выше!");
        }
    }
    public void pretendToBeDead() throws InterruptedException {
        System.out.println("Ооо нет! С дельфином что то не так! Он кажется умер!");
        Thread.sleep(10000);
        System.out.println("А н-нет. Он притворялся!");
    }
}
