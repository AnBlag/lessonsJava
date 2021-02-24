package Lesson7.Zoo.Animals;

public class Elephants extends AbstractAnimal {
    public Elephants(String name, Integer weight, String animalFood) {
        super(name, weight, animalFood);
    }
    public Integer forcingToElephant() {
        System.out.println("Слон устал. Его нужно скорее покормить, или он умрет!");
        return getWeight()-1;
    }
    public void getVoice(){
        System.out.println("Файл \"Звуки слона\" - not found!");
    }
}
