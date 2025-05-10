package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    private static Dealership dealership;
    private UserInterface(){};
    static Scanner myScanner = new Scanner(System.in);

    public static void display(){
        init();
        boolean menuRunning = true;
        while(menuRunning){
            System.out.println( "\n \n " +
                                "Welcome to D&B Used Cars!" +
                                "\n \n " +
                                "\n[1] Find vehicles within a price range" +
                                "\n[2] Find vehicles by make / model" +
                                "\n[3] Find vehicles by year range" +
                                "\n[4] Find vehicle by color" +
                                "\n[5] Find vehicle by mileage range" +
                                "\n[6] Find vehicles by type (car,truck, SUV, van" +
                                "\n[7] List all vehicles" +
                                "\n[8] Add a vehicle" +
                                "\n[9] Remove a vehicle" +
                                "\n[0] Quit" +
                                "\nWhat would you like to do?");
            int userChoice;
            if(myScanner.hasNextInt()){
                userChoice = myScanner.nextInt();
                myScanner.nextLine();
            }else{
                myScanner.nextLine();
                userChoice = -1;
            }


            switch(userChoice){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMilageRequest();
                    break;
                case 6:
                    processGetByTypeRequest();
                    break;
                case 7:
                    processGetAllVehicleRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Thank you for visiting D&B Used Cars! Have a nice day!");
                    menuRunning = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }
    }
    private static void init(){
        DealershipFileManager dfm = new DealershipFileManager();
        dealership = dfm.getDealership();
    }
    public static void processGetByPriceRequest(){
        double min = -1;
        double max = -1;
        System.out.println("Enter the minimum value:");
        min = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.println("Enter the maximum value:");
        max = myScanner.nextDouble();
        myScanner.nextLine();
        dealership.getVehicleByPrice(min,max);

    }
    public static void processGetByMakeModelRequest(){
        String make = "";
        String model = "";
        System.out.println("Enter the make of the vehicle:");
        make = myScanner.nextLine();
        System.out.println("Enter the model of the vehicle:");
        model = myScanner.nextLine();
        dealership.getVehicleByMakeModel(make,model);

    }
    public static void processGetByYearRequest(){
        int year1 = -1;
        int year2 = -1;
        System.out.println("Enter the minimum year:");
        year1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Enter the maximum year:");
        year2 = myScanner.nextInt();
        myScanner.nextLine();
        dealership.getVehicleByYear(year1,year2);
    }
    public static void processGetByColorRequest(){
        String color = "";
        System.out.println("Enter a color:");
        color = myScanner.nextLine();
        dealership.getVehicleByColor(color);

    }
    public static void processGetByMilageRequest(){
        int mile1 = -1;
        int mile2 = -1;
        System.out.println("Enter the minimum milage:");
        mile1 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Enter the maximum mileage:");
        mile2 = myScanner.nextInt();
        myScanner.nextLine();
        dealership.getVehicleByMileage(mile1,mile2);

    }
    public static void processGetByTypeRequest(){
        String type = "";
        System.out.println("Enter vehicle type:");
        type = myScanner.nextLine();
        dealership.getVehicleByType(type);
    }
    public static void processGetAllVehicleRequest(){
        dealership.displayAllVehicles();

    }
    public static void processAddVehicleRequest(){
        System.out.println("Enter VIN");
        int vin = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("Enter Year");
        int year = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("Enter Make");
        String make = myScanner.nextLine();

        System.out.println("Enter Model");
        String model = myScanner.nextLine();

        System.out.println("Enter Type");
        String type = myScanner.nextLine();

        System.out.println("Enter Color");
        String color = myScanner.nextLine();

        System.out.println("Enter Milage");
        int odometer = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("Enter Price");
        double price = myScanner.nextDouble();
        myScanner.nextLine();

        Vehicle newVehicle = new Vehicle(vin,year,make,model,type,color,odometer,price);
        dealership.addVehicle(newVehicle);

        System.out.println("\n\nVehicle has been added");

    }
    public static void processRemoveVehicleRequest(){
        System.out.println("Enter the VIN of the car you'd like to remove");
        int vin = myScanner.nextInt();
        myScanner.nextLine();

        Vehicle vehicleToRemove = null;
        for(Vehicle v : dealership.getVehicles()){
            if(v.getVin() == vin){
                vehicleToRemove = v;
                break;
            }
        }
        if(vehicleToRemove != null){
            dealership.removeVehicle(vehicleToRemove);
            System.out.println("\n\nVehicle was removed");
        }
    }

}
