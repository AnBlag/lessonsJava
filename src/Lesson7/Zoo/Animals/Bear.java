package Lesson7.Zoo.Animals;

public class Bear extends AbstractAnimal{
    public Bear(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }
    public void toSwim() {
        System.out.println("Медведь нырнул в воду.");
        System.out.println("Медведь вынырнул из воды.");
        System.out.println("Медведь посмотрел что я тут понаписал и рассмеялся.");
    }
}
