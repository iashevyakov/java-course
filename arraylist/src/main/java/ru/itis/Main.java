package ru.itis;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<String >();
        list.add("ss");
        list.add("ff");
        list.add(1,"aa");
        list.set(2,"cc");
        list.remove("cc");
        //list.remove(0);
        System.out.println(list.size()+" "+ list.get(1));
    }
}
