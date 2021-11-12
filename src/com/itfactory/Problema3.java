package com.itfactory;

import java.util.Scanner;

public class Problema3 {
    /*Problema 3.
        Sa se creeze un program in care se calculeaza pretul unei cantitati de produse.
        Pentru aceasta se vor citi urmatoarele 3 variabile:
        numele produsului, pretul produsului si cantitatea.

        Se cere ca in functie de datele introduse sa se calculeze pretul final.
         Se va afisa un mesaj similar: "Pentru produsele de tip {nume produs}
          si cantitatea {cantitate} , pretul este de {pret calculat}";
        Aspecte:
        1. "Cumpar atatea produse cu numele pe care il citesc si calculez pretul total"*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti numele produsului: ");
        String numeProdus = scanner.nextLine();

        System.out.println("introduceti pretul unitar al produsului: ");
        double pretPerProdus = scanner.nextDouble();

        System.out.println("introduceti cantitatea: ");
        int cantProdus = scanner.nextInt();

        double pretCalculat = pretPerProdus*cantProdus;

        System.out.println("Pentru produsele de tip "+ numeProdus +" in cantitate de "+ cantProdus+" UM ," +
                " valoarea calculata este de "+ pretCalculat + " lei.");
    }
}
