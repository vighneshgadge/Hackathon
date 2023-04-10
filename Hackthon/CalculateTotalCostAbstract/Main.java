package CalculateTotalCostAbstract;
import java.util.Scanner;
abstract class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;

    public Event(String name, String detail, String type, String organiser) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getType() {
        return type;
    }

    public String getOrganiser() {
        return organiser;
    }

    public abstract Double calculateAmount();
}

class Exhibition extends Event {
    private Integer noOfStalls;
    private Double rentPerStall;

    public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls, Double rentPerStall) {
        super(name, detail, type, organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }

    public Integer getNoOfStalls() {
        return noOfStalls;
    }

    public Double getRentPerStall() {
        return rentPerStall;
    }

    public void setNoOfStalls(Integer noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public void setRentPerStall(Double rentPerStall) {
        this.rentPerStall = rentPerStall;
    }

    public Double calculateAmount() {
        return noOfStalls * rentPerStall;
    }
}

class StageEvent extends Event {
    private Integer noOfShows;
    private Double costPerShow;

    public StageEvent(String name, String detail, String type, String organiser, Integer noOfShows, Double costPerShow) {
        super(name, detail, type, organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    public Integer getNoOfShows() {
        return noOfShows;
    }

    public Double getCostPerShow() {
        return costPerShow;
    }

    public void setNoOfShows(Integer noOfShows) {
        this.noOfShows = noOfShows;
    }

    public void setCostPerShow(Double costPerShow) {
        this.costPerShow = costPerShow;
    }

    public Double calculateAmount() {
        return noOfShows * costPerShow;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
        int choice = sc.nextInt();

        if (choice == 1) {
            sc.nextLine(); // Consume the newline character left behind by nextInt()

            System.out.println("Enter the details in CSV format");
            String[] details = sc.nextLine().split(",");

            if (details.length != 6) {
                System.out.println("Invalid input format");
                return;
            }

            Exhibition exhibition = new Exhibition(details[0], details[1], details[2], details[3], Integer.parseInt(details[4]), Double.parseDouble(details[5]));

            System.out.println("Exhibition Details");
            System.out.println("Event Name:" + exhibition.getName());
            System.out.println("Detail:" + exhibition.getDetail());
            System.out.println("Type:" + exhibition.getType());
            System.out.println("Organiser Name:" + exhibition.getOrganiser());
            System.out.println("Total Cost : "+exhibition.calculateAmount());
            
            
        } else if (choice == 2) {
            sc.nextLine(); // Consume the newline character left behind by nextInt()

            System.out.println("Enter the details in CSV format");
            String[] details = sc.nextLine().split(",");

            if (details.length != 6) {
                System.out.println("Invalid input format");
                return;
            }

            StageEvent stageEvent= new StageEvent(details[0], details[1], details[2], details[3], Integer.parseInt(details[4]), Double.parseDouble(details[5]));

            System.out.println("Stage Event Details");
            System.out.println("Event Name:" + stageEvent.getName());
            System.out.println("Detail:" + stageEvent.getDetail());
            System.out.println("Type:" + stageEvent.getType());
            System.out.println("Organiser Name:" + stageEvent.getOrganiser());
            System.out.println("Total Cost : "+stageEvent.calculateAmount());
            
        }else{
            System.out.println("Invalid Choice");
        }
    }
}



