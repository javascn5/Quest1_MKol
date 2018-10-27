package com.sda.Day11;

import java.util.Scanner;
public class Main {

    public static final int NUMBERS = 10;

    public static void main(String[] args) {

        int suma = 0;
        int[] tab = new int[NUMBERS];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUMBERS; i++) {
            System.out.print("Podaj liczbe calkowita: ");
            tab[i] = scanner.nextInt();
            if (tab[i] % 2 == 0) {
                suma += tab[i];
            } else {
                suma -= tab[i];
            }

        }

        System.out.println("Suma: " + suma);
        System.out.print("Podane liczby: ");
        for (int liczby: tab
             ) {
            System.out.print(liczby + "\t");
        }
        System.out.println("\nSrednia: " + (suma / 2));
    }
}
