package com.company;

import java.util.Scanner;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String receiveCall(String callName){
        return "Звонит " + callName;
    }

    public Phone() {
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String receiveCall(String callName, String number){
        return "Звонит "+ callName+ " по номеру " + number;
    }

    public void sendMassage(String ... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


}
