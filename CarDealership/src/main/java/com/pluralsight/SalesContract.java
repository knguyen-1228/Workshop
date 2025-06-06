package com.pluralsight;

public class SalesContract extends Contract{

    private boolean isFinanced;

    public SalesContract(String date, String name, String email, Vehicle vehicle, double totalPrice, double monthlyPayment) {
        super(date, name, email, vehicle, totalPrice, monthlyPayment);
        this.isFinanced = isFinanced;
    }

    @Override
    public double getTotalPrice() {
        double basedPrice = getVehicle().getPrice();
        double tax = basedPrice * .05;
        double recordingFee = 100;
        double processingFee = 0;
        if(basedPrice < 10000){
            processingFee = 295;
        }else{
            processingFee = 495;
        }
        double total = basedPrice + tax + recordingFee + processingFee;
        return total;
    }

    @Override
    public double getMonthlyPayment() {
        if(!isFinanced){
            return 0;
        }
        double totalPrice = getTotalPrice();
        double basedPrice = getVehicle().getPrice();
        double rate = 0;
        int month = 0;
        double monthlyPayment = 0;
        if(basedPrice >= 10000){
            rate = .0425;
        }else{
            rate = .0525;
        }
        if(basedPrice >= 10000){
            month = 48;
        }else{
            month = 24;
        }
        monthlyPayment = (totalPrice * (1+rate)) / month;

        return monthlyPayment;
    }
}
