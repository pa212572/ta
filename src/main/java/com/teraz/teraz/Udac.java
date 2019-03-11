package com.teraz.teraz;

class Calculator {
    int a;
    int b;

    public int dodawanie(int a, int b) {
        int wynik = a + b;
        return wynik;
    }

    public int odejmowanie(int a, int b) {
        int wyn = a - b;
        return wyn;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}