package Week2_HW1;

public class Computer {
    private String name;
    private int year;
    private double cost;

    // Getter
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getCost() {
        return cost;
    }

    // Setter
    public void getName(String n) {
        this.name = n;
    }

    public void getYear(int y) {
        this.year = y;
    }

    public void getCost(double c) {
        this.cost = c;
    }


    public static void main(String[] args) {
        Computer v1 = new Computer();
        Computer v2 = new Computer();
        v1.getName("Dell");
        v1.getYear(2006);
        v1.getCost(200.00);

        v2.getName("Apple");
        v2.getYear(2020);
        v2.getCost(2000.00);
        System.out.println(v1.getName());
        System.out.println(v1.getYear());
        System.out.println(v1.getCost());
        System.out.println("------------------------------------");
        System.out.println(v2.getName());
        System.out.println(v2.getYear());
        System.out.println(v2.getCost());
    }

}