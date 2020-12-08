package bsu.rfe.java.group8.lab1.Dubezhinskiy.var9A;

public class Eggs extends Food {
    private String number;

    public Eggs(String number) {
        super("Eggs");
        this.number = number;
    }

    public void consume() {
        System.out.println(this + " в количестве " + this.number + " съедено");
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            return !(arg0 instanceof Eggs) ? false : this.number.equals(((Eggs)arg0).number);
        } else {
            return false;
        }
    }
}