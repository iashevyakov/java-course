package ru.itis;

public class Process implements Runnable{

    private Person p1, p2;

    private int money;

    public Process(Person p1, Person p2, int money) {
        this.p1 = p1;
        this.p2 = p2;
        this.money = money;
    }

    public void run() {

        try {
            Transfer.transferMoney(p1,p2,money);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
