package com.itfactory;

public class Problema6 {
    public static void main(String[] args) {
        /*Problema 6.
Se da urmatorul text:
"Ma numesc NumePrenume si sunt cursant la cursul de testare
din cadrul companiei facebook."
Sa se scrie un program prin care sa se corecteze textul
si sa se inlocuiasca cuvintele gresite:
Aspecte:
1. "NumePrenume" - se va inlocui cu numele cursantului.
2. "testare" - se va inlocui cu tipul de curs la care participati.
3. "facebook" - se va inlocui cu numele companiei unde participati la curs.*/

        String text = "Ma numesc NumePrenume si sunt cursant la cursul de testare " +
                "din cadrul companiei facebook.";
        String textNou = text.replace("NumePrenume", "Ali Bali")
                             .replace("testare", "Java")
                             .replace("facebook", "itFactory");
        System.out.println("* Text initial: " + text);
        System.out.println("** Text nou: " + textNou);
    }
}
