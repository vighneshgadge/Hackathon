package DisplayItemType;


import java.util.Scanner;

class ItemType {
    private String name;
    private double costPerDay;
    private double deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void display() {
        System.out.println("Item type details");
        System.out.println("Name : " + getName());
        System.out.printf("CostPerDay : %.2f\n", getCostPerDay());
        System.out.printf("Deposit : %.2f\n", getDeposit());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the item type name");
        String name = scanner.nextLine();

        System.out.println("Enter the cost per day");
        double costPerDay = scanner.nextDouble();

        System.out.println("Enter the deposit");
        double deposit = scanner.nextDouble();

        ItemType itemType = new ItemType();
        itemType.setName(name);
        itemType.setCostPerDay(costPerDay);
        itemType.setDeposit(deposit);

        itemType.display();
    }
}