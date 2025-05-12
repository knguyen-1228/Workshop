package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;

        vehicles = new ArrayList<>();
    }
    
    public ArrayList<Vehicle> getVehicleByPrice(double min, double max){
        ArrayList<Vehicle> output = new ArrayList<>();
        System.out.println("\n\nHere is a list of vehicle by price:");
        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            if(v.getPrice() >= min && v.getPrice() <= max) {
                output.add(v);
            }
        }
        for(Vehicle v: output){
            System.out.println(v);
        }
        return output;

    }
    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){
        ArrayList<Vehicle> output = new ArrayList<>();
        System.out.println("\n\nHere is a list of vehicle by make and model:");
        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            if(v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
                output.add(v);
            }
        }
        for(Vehicle v: output){
            System.out.println(v);
        }
        return output;


    }
    public ArrayList<Vehicle> getVehicleByYear(int min, int max){
        ArrayList<Vehicle> output = new ArrayList<>();
        System.out.println("\n\nHere is a list of vehicle by year:");
        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            if(v.getYear() >= min && v.getYear() <= max) {
                output.add(v);
            }
        }
        for(Vehicle v: output){
            System.out.println(v);
        }
        return output;


    }
    public ArrayList<Vehicle> getVehicleByColor(String color){
        ArrayList<Vehicle> output = new ArrayList<>();
        System.out.println("\n\nHere is a list of vehicle by color:");
        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            if(v.getColor().equalsIgnoreCase(color)) {
                output.add(v);
            }
        }
        for(Vehicle v: output){
            System.out.println(v);
        }
        return output;


    }
    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){
        ArrayList<Vehicle> output = new ArrayList<>();
        System.out.println("\n\nHere is a list of vehicle by milage:");
        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            if(v.getOdometer() >= min && v.getOdometer() <= max) {
                output.add(v);
            }
        }
        for(Vehicle v: output){
            System.out.println(v);
        }
        return output;


    }
    public ArrayList<Vehicle> getVehicleByType(String type){
        ArrayList<Vehicle> output = new ArrayList<>();
        System.out.println("\n\nHere is a list of vehicle by type:");
        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            if(v.getType().equalsIgnoreCase(type)){
                output.add(v);
            }
        }
        for(Vehicle v: output){
            System.out.println(v);
        }
        return output;


    }

    public void displayAllVehicles(){
        System.out.println("\n\nHere is a list of all vehicles:");
        for(int i = 0; i<vehicles.size();i++){
            Vehicle v = vehicles.get(i);
            System.out.printf("%d %d %s %s %s %s %d $%.2f%n ",v.getVin(),v.getYear(),v.getMake(),v.getModel(),v.getType(),v.getColor(),v.getOdometer(),v.getPrice());
        }

    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
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
