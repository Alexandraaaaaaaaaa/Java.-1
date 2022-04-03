package com.geekbrains.lesson4;

public class Triangle
{
    public static double triangleGeron(int a, int b, int c) {
        double a1 = a;
        double b1 = b;
        double c1 = c;
        double p = (a1+b1+c1) / 2;

        return Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));
    }
}
