package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {
    private static final String fileName = "src/main/resources/contracts.csv";

    public void saveContract(Contract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Vehicle v = contract.getVehicle();
            String[] contractParts;
            if(contract instanceof SalesContract){
                double basedPrice = v.getPrice();
                double tax = basedPrice * .05;
                double recordingFee = 100;
                double processingFee = 0;
                if(basedPrice < 10000){
                    processingFee = 295;
                }else{
                    processingFee = 495;
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}