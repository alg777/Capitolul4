package com.itfactory;

import java.util.Scanner;


public class Aditional2 {
    /*2. Sa se citeasca de la tastatura cate un cuvant pana la intalnirea cuvantului "final".
         Din cuvintele formate se va construi o propozitie.
Exemplu.
Introduceti cuvantul:Astazi
Introduceti cuvantul:mergem
Introduceti cuvantul:sa
Introduceti cuvantul:facem
Introduceti cuvantul:cumparaturi
Introduceti cuvantul:final

S-a citit propozitia: Astazi mergem sa facem cumparaturi.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul cuvant: ");
        String propozitie = scanner.nextLine();



        while(true){
            System.out.println("Introduceti urmatorul cuvant: ");
            String urmatorulCuvant = scanner.nextLine();
            if(urmatorulCuvant.compareToIgnoreCase("final")==0)
                break;
            propozitie = propozitie.concat(" " + urmatorulCuvant );

        }
        System.out.println(propozitie + ".");
    }
}

