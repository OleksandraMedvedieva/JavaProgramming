package day01_JavaIntro.week05;

import java.util.*;

public class CarInsurance {
    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        int zipCode = 0;


        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String driverLicence = scan.next();
        if (driverLicence.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);

        }

        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        if (zipCode == 20910 || zipCode == 20740){
            premium = premium + 60;
        }else if (zipCode == 22102 || zipCode == 22103){
            premium = premium + 30;
        }else{
            premium = premium + 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if (vehicleOwnership.equalsIgnoreCase("Owned")){
            premium = premium + 10;
        }else{
            premium = premium + 20;
        }


        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")){
            premium = premium + 50;
        }else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium = premium + 10;
        }else{
            premium = premium + 20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium = premium + 5*daysDrivenToWorkOrSchool;

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium = premium + milesToWorkOrSchool*1;
        }





        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age< 16){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        if (age>=16 && age <18){
            premium = premium*20;
        }else if (age>=18 && age <=21){
            premium = premium*6;
        }else if (age>21 && age <25){
            premium = premium*2;
        }





        System.out.println("How many years you've been driving?");
        int drivingExp = scan.nextInt();
        if (drivingExp > 0 && (drivingExp - age) <16){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        else{
            premium = premium - (drivingExp*5);

        }




        System.out.println("Have you had any accidents in the last 5 years?");
        String accidents = scan.next ();
        if (accidents.equalsIgnoreCase("Yes"))
        {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium = premium + accidentsAmount * (0.2 * premium);
        }



        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("No")){
            premium = 2*premium;
        }



        System.out.println("What is the highest level of education you have completed?");
        education = scan.next();
        if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors")  || education.equalsIgnoreCase("Masters")){
            premium = premium - premium *0.05;
        }else if (education.equalsIgnoreCase("Less than High School")){
            education = "LessthanHighSchool";
            premium = premium +premium *0.05;
        }else{
            premium = premium *0.1;
        }

        referenceNumber = name.substring(0,2) + "" + age + "" + name.substring(name.length()-2)
                + "" + zipCode + "" +  education;                                              referenceNumber = referenceNumber.toUpperCase();

        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        System.out.println("Reference number: " + referenceNumber);
























    }
}