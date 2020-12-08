package bsu.rfe.java.group8.lab1.Dubezhinskiy.var9A;

public abstract class Food implements Consumable {
    String name = null;

    public Food(String name)
    {
        this.name = name;
    }

    public boolean equals(Object args) {
        if (!(args instanceof Food)) {
            return false;
        } else {
            return this.name != null && ((Food)args).name != null ? this.name.equals(((Food)args).name) : false;
        }
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
