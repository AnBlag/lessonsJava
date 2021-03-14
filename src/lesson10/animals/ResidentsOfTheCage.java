package lesson10.animals;


import java.util.Objects;

public abstract class ResidentsOfTheCage {
    private String name;
    private Integer hp;

    public ResidentsOfTheCage(String name, Integer hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidentsOfTheCage that = (ResidentsOfTheCage) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(hp, that.hp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp);
    }

    @Override
    public String toString() {
        return "ResidentsOfTheCage{" +
                "name='" + name + '\'' +
                ", hp='" + hp + '\'' +
                '}';
    }
}
