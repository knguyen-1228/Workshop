package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Dealership(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public static void getVehicleByPrice(double min, double max){

    }
    public static void getVehicleByMakeModel(String make, String model){

    }
    public static void getVehicleByYear(int min, int max){

    }
    public static void getVehicleByColor(String color){

    }
    public static void getVehicleByMileage(int min, int max){

    }
    public static void getVehicleByType(String type){

    }

    public static void getAllVehicles(ArrayList<Vehicle> vehicles){
        System.out.println("Here is a list of all vehicles:");
        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            System.out.printf("%d %tY %s %s %s %s %d $%.2f%n ",v.getVin(),v.getYear(),v.getMake(),v.getModel(),v.getType(),v.getColor(),v.getOdometer(),v.getPrice());
        }

    }

    public static void addVehicle(Vehicle vehicle){

    }

    public static void removeVehicle(Vehicle vehicle){

    }
    public static ArrayList<Vehicle> getVehicles(){
        Dealership dealership = DealershipFileManager.getDealership();
        if(dealership != null){
            return dealership.vehicles;
        }else{
            return new ArrayList<Vehicle>();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
