package SingleInheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Person {
    private String name;
    private LocalDate dateOfBirth;
    private String gender;
    private String mobileNumber;
    private String bloodGroup;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    public String getDateOfBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return dateOfBirth.format(formatter);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
}

class Donor extends Person {
    private String bloodBankName;
    private String donorType;
    private LocalDate donationDate;

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonationDate(String donationDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.donationDate = LocalDate.parse(donationDate, formatter);
    }

    public String getDonationDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return donationDate.format(formatter);
    }

    public void displayDonationDetails() {
        System.out.println("Donation Details :");
        System.out.println("Name : " + getName());
        System.out.println("Date Of Birth : " + getDateOfBirth());
        System.out.println("Gender : " + getGender());
        System.out.println("Mobile Number : " + getMobileNumber());
        System.out.println("Blood Group : " + getBloodGroup());
        System.out.println("Blood Bank Name : " + getBloodBankName());
        System.out.println("Donor Type : " + getDonorType());
        System.out.println("Donation Date : " + getDonationDate());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Donor donor = new Donor();

        System.out.println("Enter the name :");
        donor.setName(sc.nextLine());

        System.out.println("Enter Date of Birth :");
        donor.setDateOfBirth(sc.nextLine());

        System.out.println("Enter Gender :");
        donor.setGender(sc.nextLine());

        System.out.println("Enter Mobile Number :");
        donor.setMobileNumber(sc.nextLine());

        System.out.println("Enter Blood Group :");
        donor.setBloodGroup(sc.nextLine());

        System.out.println("Enter Blood Bank Name :");
        donor.setBloodBankName(sc.nextLine());

        System.out.println("Enter Donor Type :");
        donor.setDonorType(sc.nextLine());

        System.out.println("Enter Donation Date :");
        donor.setDonationDate(sc.nextLine());

        donor.displayDonationDetails();
    }
}



