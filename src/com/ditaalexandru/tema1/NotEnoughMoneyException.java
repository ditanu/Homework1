package com.ditaalexandru.tema1;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException() {
        System.out.println("You don't have enough money in your account!");
    }

}
