package com.itfactory;

public class Problema3 {
    public static void main(String[] args) {
        /*Problema 3.
        Sa se creeze un program in care se calculeaza pretul unei cantitati de produse.
        Pentru aceasta se vor citi urmatoarele 3 variabile:
        numele produsului, pretul produsului si cantitatea.

        Se cere ca in functie de datele introduse sa se calculeze pretul final.
         Se va afisa un mesaj similar: "Pentru produsele de tip {nume produs}
          si cantitatea {cantitate} , pretul este de {pret calculat}";
        Aspecte:
        1. "Cumpar atatea produse cu numele pe care il citesc si calculez pretul total"*/
        String numeProdus = "Produs";
        double pretPerProdus = 23.15;
        int cantProdus = 10;
        double pretCalculat = pretPerProdus*cantProdus;

        System.out.println("Pentru produsele de tip "+ numeProdus +" in cantitate de "+ cantProdus+" UM ," +
                " pretul este de "+ pretCalculat);
    }
}
