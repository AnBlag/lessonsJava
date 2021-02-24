package Lesson7.Zoo.Animals;

public class Lazy extends AbstractAnimal{
    public Lazy(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }
    public void getVoice(){
        System.out.println("A-a-agh");
    }
    public void getScratch(){
        System.out.println("Ленивец почесался.");
    }
}
