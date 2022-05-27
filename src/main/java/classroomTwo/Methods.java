package classroomTwo;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Sākās koda izpilde");
        checkPersonAge();
        checkPersonPension();
        checkPersonPension2(65,'V');
        checkPersonPension2(45,'S');
        int manaKvadrataLaukums = aprekinatKvadrataLaukumu(8);
        System.out.println("Kvadrata lauikuims ir: " + manaKvadrataLaukums);
        System.out.println("Beidzās koda izpilde");
    }

    static int aprekinatKvadrataLaukumu(int mala) {
     int laukums = mala * mala;
     return laukums;
    }
    static void checkPersonPension2(int vecums, char dzimums){
        boolean drikstDotiesPensija = false;
        if (vecums >= 65 && dzimums == 'V') {
            drikstDotiesPensija = true;
        }
        else if (vecums >=60 && dzimums == 'S'){
            drikstDotiesPensija = true;
        }

        if(drikstDotiesPensija){
            System.out.println(String.format("Dzimums: %s, Vecums: %s", dzimums, vecums));
            System.out.println("Cilveks drikst doties pensija!");
        }
        else {
            System.out.println(String.format("Dzimums: %s, Vecums: %s", dzimums, vecums));
            System.out.println("Cilveks nedrikst doties pensija!");
        }
    }

    static void checkPersonPension(){
        int cilvekaVecums = 63;
        char cilvekaDzimums = 'S';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
       }
       else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
            drikstDotiesPensija = true;
        }

        if(drikstDotiesPensija){
            System.out.println("Cilveks drikst doties pensija!");
        }

    }

    static void checkPersonAge(){
        System.out.println("Sākās  metodes izpilde");
        System.out.println("Ievadi vecumu..");
        Scanner scanner = new Scanner(System.in);
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilvēks drīkst balsot");
        } else {
            System.out.println("Cilvēks nedrīkst balsot");
        }
        System.out.println("Beidzās  metodes izpilde");
    }
}

