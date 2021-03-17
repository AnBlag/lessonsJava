package lesson10.animalCages;


import lesson10.exceptionsСages.BoundException;
import lesson10.exceptionsСages.OverflowCageException;

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
                throw new OverflowCageException("Место кончилось. Добавлять вольеры больше нельзя!");
            } catch (OverflowCageException e) {
                e.printStackTrace();
            }
        } else {
            cages.add(cageForAnimals);
            --cageCapacity;
        }
    }

    public void removeCageInCageForCages(Cage cageForAnimals) {
        if (cageCapacity == 5) {
            try {
                throw new OverflowCageException("Удалять нечего! Вольеров нет.");
            } catch (OverflowCageException e) {
                e.printStackTrace();
            }
        }
        else if (!cages.contains(cageForAnimals)){
            try {
                throw new BoundException("Такого вольера нет.");
            } catch (BoundException e) {
                e.printStackTrace();
            }
        }
        else {
            cages.remove(cageForAnimals);
            ++cageCapacity;
        }
    }

    public void whoInCageForCages() {
        System.out.println(cages.toString());
    }

}