package com.itfactory;

import java.util.Scanner;

public class Problema4 {
    /*Problema 4.
Sa se creeze un program in care se vor citi de la
tastatura siruri de caractere pana cand introduc textul "stop";
Aspecte.
1. Se va folosi bucla "while"

Simulare:
Introduceti textul: masina
Introduceti textul: avion
Introduceti textul: stop

Am iesit din program.
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti un sir: ");
        String sir = scanner.nextLine();

        while(!sir.toLowerCase().equals("stop")) {
            System.out.println("Intoduceti textul:");
            sir = scanner.nextLine();

        }
        System.out.println("Am iesit din program");
    }

}
