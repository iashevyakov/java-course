package ru.itis;

public class Transfer {

    public static void transferMoney(Person from, Person to, int money) throws InterruptedException {
        synchronized (from){
                Thread.sleep(1000);
            synchronized (to){
                if (from.getMoney()<money){
                    System.out.println("No money");
                }
                else{
                    from.withdrawMoney(money);
                    to.earnMoney(money);
                }
            }
        }
    }
}
