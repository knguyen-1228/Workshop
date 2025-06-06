package com.pluralsight;

public class LeaseContract extends Contract{

    public LeaseContract(String date, String name, String email, Vehicle vehicle, double totalPrice, double monthlyPayment) {
        super(date, name, email, vehicle, totalPrice, monthlyPayment);
    }

    @Override
    public double getTotalPrice() {
        double value = getVehicle().getPrice();
        return (value * .5) + (value *.07);
    }

    @Override
    public double getMonthlyPayment() {
        return (getTotalPrice() * 1.04) / 36;
    }
}
