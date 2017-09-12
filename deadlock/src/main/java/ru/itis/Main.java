package ru.itis;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Person p1 = new Person(100);
        Person p2 = new Person(500);
        Process pr1 = new Process(p1,p2,50);
        Process pr2 = new Process(p2, p1, 45);
        Thread t1 = new Thread(pr1);
        Thread t2 = new Thread(pr2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Person1: "+ p1.getMoney() + " Person2: " + p2.getMoney());
    }
}
