package com.sda.Day11;

import java.util.Random;
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
//todo Zad. 5
//        int[] tab = {3, 2, 6, 8, 11, -9, 69, -87, 7, 8};
//        int smallest = 0;
//        int largest = 0;
//        int smallestIndex = 0;
//        int largestIndex = 0;
//
//        for (int i = 0; i < tab.length; i++) {
//            if (i == 0) {
//                smallest = largest = tab[i];
//            } else if (tab[i] < smallest) {
//                smallest = tab[i];
//                smallestIndex = i;
//            } else if (tab[i] > largest) {
//                largest = tab[i];
//                largestIndex = i;
//            }
//        }
//        System.out.println("Najmniejsza liczba to: " + smallest + " o indeksie: " + smallestIndex);
//        System.out.println("Najwieksza liczba to: " + largest + " o indeksie: " + largestIndex);

//todo Zad. 6, 7
//        int temp;
//        Scanner scanner = new Scanner(System.in);
//        LinkedList list = new LinkedList();
//
//        do{
//            System.out.print("Podaj liczbe: ");
//            temp = scanner.nextInt();
//            if(temp != 0){
//                list.add(temp);
//            }
//        } while (temp != 0);
//
//        scanner.close();
//        System.out.println("Liczba wprowadzonych elementow: " + list.size());
//        list.show();
//        list.showEven();
//        list.showNotEven();

//todo Zad. 8
//        String word;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj słowo: ");
//        word = scanner.nextLine();
//        String halfWord = word.substring(0, word.length()/2);
//        System.out.println("Slowo wyswietlone w polowie: " + halfWord);
//        System.out.println("Dlugosc slowa: " + word.length());

//todo Zad. 9
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj slowo: ");
        word = scanner.nextLine();

        Palindrom palindrom = new Palindrom();

        System.out.println("Czy slowo jest palindromem: " + palindrom.palindrom(word));
    }
}
