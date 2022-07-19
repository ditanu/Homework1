package com.ditaalexandru.tema1;

public class Main {

    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.deposit(2000);
        System.out.println(ac1.getAmount());

        try {
            ac1.withdraw(1500);
        } catch (NotEnoughMoneyException e) {
            throw new RuntimeException(e);
        }

        System.out.println(ac1.getAmount());

        try {
            ac1.linkToNationalId("5220701015461");
            System.out.println(ac1.getNationalId());
        } catch (InvalidNationalIdException e) {
            throw new RuntimeException(e);
        }

        try {
            ac1.linkToNationalId("9220701015461");
        } catch (InvalidNationalIdException e) {
            throw new RuntimeException(e);
        }

    }
}
