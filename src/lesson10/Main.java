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


        Cage cageFirst = new Cage("1ый вольер.");
        Cage cageSecond = new Cage("2ой вольер.");
        Cage cageThird = new Cage("3ий вольер.");
        Cage cageFour = new Cage("4ый вольер.");
        Cage cageFive = new Cage("5ый вольер.");
        Cage cageSix = new Cage("6ой вольер.");

        CageForCages cage = new CageForCages();
        cage.addCageInCageForCages(cageFirst);
        cage.addCageInCageForCages(cageSecond);
        cage.addCageInCageForCages(cageThird);
        cage.addCageInCageForCages(cageFour);
        cage.addCageInCageForCages(cageFive);


        System.out.println();

        cageFirst.addAnimalInCage(bear);

        cage.whoInCageForCages();

        cageFirst.whoInCageForAnimals();

        System.out.println();

        cageFirst.deleteAnimalInCage(bear);

        cageFirst.whoInCageForAnimals();

        cage.removeCageInCageForCages(cageSix);

        cageFirst.deleteAnimalInCage(wolf);

    }
}
