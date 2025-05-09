package com.pluralsight;

public class CarDealershipApp {
    public static void main(String[] args) {
        int choice = UserInterface.display();
        switch(choice){
            case 1:
                UserInterface.processGetByPriceRequest();
                break;
            case 2:
                UserInterface.processGetByMakeModelRequest();
                break;
            case 3:
                UserInterface.processGetByYearRequest();
                break;
            case 4:
                UserInterface.processGetByColorRequest();
                break;
            case 5:
                UserInterface.processGetByMilageRequest();
                break;
            case 6:
                UserInterface.processGetByTypeRequest();
                break;
            case 7:
                UserInterface.processGetAllVehicleRequest();
                break;
            case 8:
                UserInterface.processAddVehicleRequest();
                break;
            case 9:
                UserInterface.processRemoveVehicleRequest();
                break;
            case 0:
                System.out.println("Thank you for visiting D&B Used Cars! Have a nice day!");
                break;
        }

    }
}
