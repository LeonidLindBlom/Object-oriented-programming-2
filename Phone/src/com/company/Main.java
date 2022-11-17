package com.company;

public class Main {

    public static void main(String[] args) {
        Phone firstPhone = new Phone();
        Phone secondPhone = new Phone();
        Phone thirdPhone = new Phone();
        firstPhone.setModel("Samsung");
        firstPhone.setNumber("89139738622");
        firstPhone.setWeight(500);
        System.out.println(firstPhone.getModel() + "\n" + firstPhone.getWeight() + "\n" + firstPhone.getNumber() + "\n");

        secondPhone.setModel("Iphone");
        secondPhone.setNumber("84952320206");
        secondPhone.setWeight(241);
        System.out.println(secondPhone.getModel() + "\n" + secondPhone.getWeight() + "\n" + secondPhone.getNumber() + "\n");

        thirdPhone.setModel("One Plus");
        thirdPhone.setNumber("88005553535");
        thirdPhone.setWeight(354);
        System.out.println(thirdPhone.getModel() + "\n" + thirdPhone.getWeight() + "\n" + thirdPhone.getNumber() + "\n");

        System.out.println(firstPhone.receiveCall("Мурзик"));
        System.out.println(secondPhone.receiveCall("Антошка"));
        System.out.println(thirdPhone.receiveCall("Наруто") + "\n");

        System.out.println(firstPhone.receiveCall("Петя", "89963959421"));
        System.out.println(secondPhone.receiveCall("Барсик", "89969994587"));
        System.out.println(thirdPhone.receiveCall("Валера", "89632154658") + "\n");

        firstPhone.sendMassage("9995552134", "8884442211", "5561234589");
        secondPhone.sendMassage("1234567898", "2145658942");
        thirdPhone.sendMassage("8945612468");
    }
}
