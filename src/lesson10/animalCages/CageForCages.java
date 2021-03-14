package lesson10.animalCages;


import lesson10.exceptionsСages.OverflowCage;

import java.util.ArrayList;
import java.util.List;

public class CageForCages {

    private int cageCapacity;

    private final List<Cage> cages;

    public CageForCages() {
        cageCapacity = 5;
        cages = new ArrayList<>();
    }

    public void addCageInCageForCages(Cage cageForAnimals) {
        if (cageCapacity == 0) {
            try {
                throw new OverflowCage("Место кончилось. Добавлять вольеры больше нельзя!");
            } catch (OverflowCage e) {
                e.printStackTrace();
            }
        } else {
            cages.add(cageForAnimals);
            --cageCapacity;
        }
    }
    public void whoInCageForCages() {
        System.out.println(cages.toString());
    }

}