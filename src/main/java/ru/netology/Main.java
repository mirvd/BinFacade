package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        System.out.println(bins.sum("10101010","00001000"));
        System.out.println(bins.mult("00000010", "00000010"));

    }
}