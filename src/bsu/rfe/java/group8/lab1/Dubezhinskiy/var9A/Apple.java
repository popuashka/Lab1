package bsu.rfe.java.group8.lab1.Dubezhinskiy.var9A;

public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public void consume() {
        System.out.println(this.name + " " + this.size + " съедено");
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "размера '" + this.size + "'";
    }

    public boolean equals(Object args) {
        if (super.equals(args)) {
            return !(args instanceof Apple) ? false : this.size.equals(((Apple)args).size);
        } else {
            return false;
        }
    }
}