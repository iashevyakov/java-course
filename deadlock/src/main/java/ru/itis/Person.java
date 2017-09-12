package ru.itis;

public class Person {

    public Person(int money) {
        this.money = money;
    }

    private int money;


    public double getMoney() {

        return money;
    }


    public void withdrawMoney(int money) {
        this.money -= money;
    }

    public void earnMoney(int money) {
        this.money += money;
    }

}
