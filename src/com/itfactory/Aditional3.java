package com.itfactory;

import java.util.Scanner;

public class Aditional3 {
    /*3. Se citesc de la tastatura mai multe cuvinte pana la intalnirea cuvantului "final".
Sa se afiseze un mesaj atunci cand se citeste un cuvant format doar din litere mari
sau doar din litere mici.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul cuvant: ");
        String word = scanner.nextLine();
        if (word.compareToIgnoreCase("final") == 0) {
            System.out.print("Primul cuvant este final. Am iesit din program.");
        }else{
            while(true){
                System.out.print("Introduceti urmatorul: ");
                String word2 = scanner.nextLine();
                if(word2.compareToIgnoreCase("final")==0)
                    break;
                if(word2.toLowerCase().compareTo(word2)==0){
                    System.out.println("litere mici ");
                }else if(word2.toUpperCase().compareTo(word2)==0){
                    System.out.println("TIPAR");
                }else{
                    System.out.println("nici");
                }
            }
            System.out.println("S-a introdus cuvantul final. Am iesit din program.");
        }
    }
}

