package com.itfactory;

import java.util.Scanner;

public class Aditional1 {
    /*1. Se citesc de la tastatura doua variabile de tip String.
         Sa se verifice daca aceste variabile sunt egale neluand in considerare proprietatea case-sensitive.
         Exemplu. Se citesc: Masina si masInA. In acest caz programul va afisa "S-a citit acelasi text"*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti prima variabila: ");
        String primaVariabila = scanner.nextLine();

        System.out.println("Introduceti a doua variabila: ");
        String aDouaVariabila = scanner.nextLine();

        if(primaVariabila.toLowerCase().equals(aDouaVariabila.toLowerCase())) {
            System.out.println("S-a citit acelasi text");
        }else {
            System.out.println("S-au citit texte diferite");
        }



    }
}
