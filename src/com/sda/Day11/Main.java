package com.sda.Day11;

import java.util.Scanner;
public class Main {

    public static final int NUMBERS = 10;

    public static void main(String[] args) {

//        int suma = 0;
//        int[] tab = new int[NUMBERS];
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < NUMBERS; i++) {
//            System.out.print("Podaj liczbe calkowita: ");
//            tab[i] = scanner.nextInt();
//            if (tab[i] % 2 == 0) {
//                suma += tab[i];
//            } else {
//                suma -= tab[i];
//            }
//        }
//
//        System.out.println("Suma: " + suma);
//        System.out.print("Podane liczby: ");
//        for (int liczby: tab
//             ) {
//            System.out.print(liczby + "\t");
//        }
//        System.out.println("\nSrednia: " + (suma / tab.length));

        int[] tab = {3, 2, 6, 8, 11, -9, 69, -87, 7, 8};
        int smallest = 0;
        int largest = 0;
        int smallestIndex = 0;
        int largestIndex = 0;

        for (int i = 0; i < tab.length; i++){
            if(i == 0){
                smallest = largest = tab[i];
            } else if (tab[i] < smallest) {
                smallest = tab[i];
                smallestIndex = i;
            } else if (tab[i] > largest){
                largest = tab[i];
                largestIndex = i;
            }
        }
        System.out.println("Najmniejsza liczba to: " + smallest + " o indeksie: " + smallestIndex);
        System.out.println("Najwieksza liczba to: " + largest + " o indeksie: " + largestIndex);
    }
}
