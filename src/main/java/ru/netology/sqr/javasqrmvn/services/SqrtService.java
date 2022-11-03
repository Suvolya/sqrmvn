package ru.netology.sqr.javasqrmvn.services;

public class SqrtService {

    private int count;

    public int calcSqrt(int a, int b) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (a <= i * i && i * i <= b) {

                count++;

            }
        }
        return count;
    }
}