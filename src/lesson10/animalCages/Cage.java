package lesson10.animalCages;


import lesson10.animals.ResidentsOfTheCage;
import lesson10.exceptionsСages.OverflowCage;
import lesson10.exceptionsСages.UniqueAnimalsCage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cage {

    private int cageCapacity;

    private final List<ResidentsOfTheCage> cageList;

    public Cage() {
        cageCapacity = 8;
        cageList = new ArrayList<>();
    }

    public int getCageCapacity() {
        return cageCapacity;
    }

    public void setCageCapacity(int cageCapacity) {
        this.cageCapacity = cageCapacity;
    }

    public List<ResidentsOfTheCage> getCageList() {
        return cageList;
    }

    public void addAnimalInCage(ResidentsOfTheCage animal){
       if (cageCapacity == 0){
           try {
               throw new OverflowCage("Вольер переполнен!");
           } catch (OverflowCage e) {
               e.printStackTrace();
           }
       }
       else if (cageList.contains(animal)){
           try {
               throw new UniqueAnimalsCage("Такое животное уже есть!");
           } catch (UniqueAnimalsCage e) {
               e.printStackTrace();
           }
       }

       else {
           cageList.add(animal);
           --cageCapacity;
       }
    }

    public void deleteAnimalInCage(ResidentsOfTheCage animal){
        if (cageList.contains(animal) && cageCapacity < 8){
            cageList.remove(animal);
            ++cageCapacity;
        }
        else if (!cageList.contains(animal)) {
            try {
                throw new UniqueAnimalsCage("Такого животного нет!");
            } catch (UniqueAnimalsCage e) {
                e.printStackTrace();
            }
        }
    }
    public void whoInCageForAnimals() {
        System.out.println(cageList.toString());
    }

    @Override
    public String toString() {
        return "Cage{" +
                "cageCapacity=" + cageCapacity +
                ", cage=" + cageList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cage cage = (Cage) o;
        return cageCapacity == cage.cageCapacity &&
                Objects.equals(cageList, cage.cageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cageCapacity, cageList);
    }
}
