package Lesson7.Zoo.Animals;

public class AbstractAnimal {
    private String name;
    private Integer weight;
    private String animalFood;

    public AbstractAnimal(String name, Integer weight, String animalFood) {
        this.name = name;
        this.weight = weight;
        this.animalFood = animalFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }
    public void getSleep() throws InterruptedException {
        System.out.println("Зверь уснул, но он скоро проснётся!");
        Thread.sleep(5000);
    }
    public Integer getFood(){
        System.out.println("Чявк-чявк-чявк...");
        return weight+1;
    }
}
