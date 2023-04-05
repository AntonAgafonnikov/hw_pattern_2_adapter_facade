package ru.netology.task2_facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        // Демонстрация
        System.out.println(bins.sum("10100", "1010100")); // 20 + 84 = 104 -> 1101000
        System.out.println(bins.mult("1100", "11000")); // 12 * 24 = 288 -> 100100000
    }
}
