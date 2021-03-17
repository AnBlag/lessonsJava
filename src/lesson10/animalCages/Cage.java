package lesson10.animalCages;


import lesson10.animals.ResidentsOfTheCage;
import lesson10.exceptionsСages.OverflowCageException;
import lesson10.exceptionsСages.UniqueAnimalsCageException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cage {

    private int cageCapacity;
    private final String name;

    private final List<ResidentsOfTheCage> cageList;

    public Cage(String name) {
        this.name = name;
        cageCapacity = 8;
        cageList = new ArrayList<>();
    }

    public int getCageCapacity() {
        return cageCapacity;
    }

    public String getName() {
        return name;
    }

    public List<ResidentsOfTheCage> getCageList() {
        return cageList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cage cage = (Cage) o;
        return cageCapacity == cage.cageCapacity &&
                Objects.equals(name, cage.name) &&
                Objects.equals(cageList, cage.cageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cageCapacity, name, cageList);
    }

    @Override
    public String toString() {
        return "Cage{" +
                "cageCapacity=" + cageCapacity +
                ", name='" + name + '\'' +
                ", cageList=" + cageList +
                '}';
    }

    public void addAnimalInCage(ResidentsOfTheCage animal){
       if (cageCapacity == 0){
           try {
               throw new OverflowCageException("Вольер переполнен!");
           } catch (OverflowCageException e) {
               e.printStackTrace();
           }
       }
       else if (cageList.contains(animal)){
           try {
               throw new UniqueAnimalsCageException("Такое животное уже есть!");
           } catch (UniqueAnimalsCageException e) {
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
                throw new UniqueAnimalsCageException("Такого животного нет!");
            } catch (UniqueAnimalsCageException e) {
                e.printStackTrace();
            }
        }
    }

    public void whoInCageForAnimals() {
        System.out.println(cageList.toString());
    }

}
