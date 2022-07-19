package com.ditaalexandru.tema1;

public class Account {
    private int accountNo;
    private int amount;
    private String nationalId;

    public Account() {
        this.accountNo = 0;
        this.amount = 0;
        nationalId = "5000000000";
    }

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if (amount > this.amount) {
            throw new NotEnoughMoneyException();
        }
        this.amount -= amount;
    }

    public void linkToNationalId(String nationalId) throws InvalidNationalIdException {

        if (nationalId.length() == 13 && (nationalId.charAt(0) == '1' || nationalId.charAt(0) == '2' || nationalId.charAt(0) == '5' || nationalId.charAt(0) == '6')
                && checkForDigits(nationalId)) {
            this.nationalId = nationalId;
        } else {
            throw new InvalidNationalIdException();
        }
    }

    private static boolean checkForDigits(String s) {
        if (s == null || s.isBlank()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public int getAmount() {
        return this.amount;
    }

    public String getNationalId() {
        return this.nationalId;
    }
}
