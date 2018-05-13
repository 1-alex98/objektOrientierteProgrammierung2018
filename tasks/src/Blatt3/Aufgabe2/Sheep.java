package Blatt3.Aufgabe2;

public class Sheep implements Cloneable {
    public String name;
    public Fur fur;

    public Sheep(String name, Fur fur) {
        this.name = name;
        this.fur = fur;
    }

    public void shear() {
        fur.length = 0;
    }

    public String toString() {
        return "Name: " + name + " " + fur.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sheep)) return false;

        Sheep sheep = (Sheep) o;

        if (name != null ? !name.equals(sheep.name) : sheep.name != null) return false;
        return fur != null ? fur.equals(sheep.fur) : sheep.fur == null;
    }

    //This is a deep copy

    @Override
    public Sheep clone() {
        return new Sheep(name, fur.clone());
    }
}
