package lesson10;

import lesson10.animalCages.CageForCages;
import lesson10.animalCages.Cage;
import lesson10.animals.*;

public class Main {

    public static void main(String[] args) {

        Bear bear = new Bear("Клык", 150);

        Bison bison = new Bison("Степной гигант", 110);

        Elephant elephant = new Elephant("Гора", 170);

        Fox fox = new Fox("ФайерФокс", 50);

        Fox fox1 = new Fox("ФайерФокс", 50);

        Lion lion = new Lion("Король", 120);

        Panda panda = new Panda("Пандарийский пивовар", 30);

        Rhino rhino = new Rhino("Толсторог", 140);

        Tiger tiger = new Tiger("Стальной коготь", 120);

        Wolf wolf = new Wolf("Ночной волк", 70);


        Cage cageFirst = new Cage();
        Cage cageSecond = new Cage();
        Cage cageThird = new Cage();
        Cage cageFour = new Cage();
        Cage cageFive = new Cage();
        Cage cageSix = new Cage();

        CageForCages cage = new CageForCages();
        cage.addCageInCageForCages(cageFirst);
        cage.addCageInCageForCages(cageSecond);
        cage.addCageInCageForCages(cageThird);
        cage.addCageInCageForCages(cageFour);
        cage.addCageInCageForCages(cageFive);
        cage.whoInCageForCages();

        System.out.println();

        cageFirst.addAnimalInCage(bear);

        cageFirst.whoInCageForAnimals();

        System.out.println();

        cageFirst.deleteAnimalInCage(bear);

        cageFirst.whoInCageForAnimals();

    }
}
