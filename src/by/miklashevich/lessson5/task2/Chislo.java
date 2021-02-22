package by.miklashevich.lessson5.task2;

public class Chislo {
    public int chislo1;
    public int chislo2;

    public Chislo(int chislo1, int chislo2) {
        this.chislo1 = chislo1;
        this.chislo2 = chislo2;
    }

    @Override
    public String toString() {
        return "Chislo{" +
                "chislo1=" + chislo1 +
                ", chislo2=" + chislo2 +
                '}';
    }
}
