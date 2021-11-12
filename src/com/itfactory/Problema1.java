package com.itfactory;

import java.util.Scanner;

public class Problema1 {

    /*Problema 1.
    Sa se creeze un program prin care se citeste de la tastatura un user si o parola.
In prealabil, acestea trebuie sa mimeze autentificarea unui user intr-un sistem.
Daca userul si parola sunt aceleasi cu cele prestabilite, afisati un mesaj de tipul:
"Userul {user} s-a autentificat in aplicatie." (Unde {user} este userul introdus).
    In cazul in care cel putin una din valorile citite (user sau parola)
nu este egala cu valoarea prestabilita, se afiseaza mesajul "Credentiale gresite".
Aspecte:
1. Pentru userul si parola prestabilite se definesc 2 stringuri in program.
2. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar:
   "Introduceti userul: " / "Introduceti parola: ".
*/

    public static void main(String[] args) {

        String userNameCorect = "Ali Baba";
        String userPasswordCorect = "1234567";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti userul: ");
        String userName = scanner.nextLine();


        System.out.println("Introduceti parola: ");
        String userPassword = scanner.nextLine();


        if(userName.equalsIgnoreCase(userNameCorect) && userPassword.equals(userPasswordCorect)){
            System.out.println("Userul "+ userNameCorect +" s-a autentificat in aplicatie.");
        }else
            System.out.println("Credentiale gresite");

    }
}