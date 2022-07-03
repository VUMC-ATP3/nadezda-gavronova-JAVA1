package homework;

import java.util.Scanner;
import java.util.StringJoiner;

public class LoopHomeWork {
    public static void main(String[] args) {

// === 1. uzdevums ===
        System.out.println("=== 1. uzdevums ===");
        int summa = 0;
        Scanner scanner = new Scanner(System.in);
        int skaitlis;
        while (summa <= 100){
            System.out.println("Ievadiet veselu skaitli:");
            skaitlis = scanner.nextInt();
            summa = summa + skaitlis;
        }
        System.out.println(summa);
        System.out.println("Gatavs!");

// === 2. uzdevums ===
        System.out.println("\n" + "=== 2. uzdevums ===");
        int temp;
        boolean irPirmskaitlis = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli:");
        int number = scan.nextInt();

        if(number == 1 || number == 0) {
            irPirmskaitlis = false; //skaitlis 1 nav ne pirmskaitlis, ne salikts skaitlis. 0 - nav naturāls skaitlis.
        }
        else {
            // pārbaude vai ir pirmskaitlis
            for (int i = 2; i <= number/2; i++) {
                temp = number % i;
                if (temp == 0) {
                    irPirmskaitlis = false;
                    break;
                }
            }
        }
        //izvadām vai ir/nav pirmskaitlis
        if(irPirmskaitlis) {
            System.out.println(number + " - ir pirmskaitlis");
        } else {
            System.out.println(number + " - NAV pirmskaitlis");
        }

// === 3. uzdevums ===
        System.out.println("\n" + "=== 3. uzdevums ===");
        int[] skaitli = {1,2,88,11,52,6,73,8,90,10};
        String[] ielas = {"Brīvības bulvāris", "Skolas iela", "Klijānu iela", "Blaumaņa iela", "Marijas iela", "Kr. Valdemāra iela"};
        char[] lidzskani = {'b', 'c', 'd', 'f', 'g', 'h', 'k', 'l'};

        System.out.println("[a. While cikls]:");
        int a = 0;
        while (a < skaitli.length){
            System.out.println(skaitli[a]);
            a = a + 1;
        }

        int b = 0;
        while (b < ielas.length){
            System.out.println(ielas[b]);
            b = b + 1;
        }

        int c = 0;
        while (c < lidzskani.length){
            System.out.println(lidzskani[c]);
            c = c + 1;
        }

        System.out.println("\n" + "[b. Do while cikls]:");
        int aw = 0;
        do {
            System.out.println(skaitli[aw]);
            aw = aw + 1;
        } while (aw < (skaitli.length));

        int bw = 0;
        do {
            System.out.println(ielas[bw]);
            bw = bw + 1;
        } while (bw < (ielas.length));

        int cw = 0;
        do {
            System.out.println(lidzskani[cw]);
            cw = cw + 1;
        } while (cw < (lidzskani.length));

        System.out.println("\n" + "[c. For loop cikls]:");
        for (int j = 0; j < skaitli.length; j++) {
            System.out.println(skaitli[j]);
        }

        for (int j = 0; j < ielas.length; j++) {
            System.out.println(ielas[j]);
        }

        for (int j = 0; j < lidzskani.length; j++) {
            System.out.println(lidzskani[j]);
        }

        System.out.println("\n" + "[d. For each cikls]:");
        for (int af: skaitli){
            System.out.println(af);
        }

        for (String bf: ielas){
            System.out.println(bf);
        }

        for (char cf: lidzskani){
            System.out.println(cf);
        }

// === 4. uzdevums ===
        System.out.println("\n" + "=== 4. uzdevums ===");
        int [] skaitluMasivs = new int[100];
        int paraSkatislis = 2;
        for (int masivaIndeks = 0; masivaIndeks < skaitluMasivs.length; masivaIndeks++) {
            skaitluMasivs[masivaIndeks] = paraSkatislis;
            System.out.print(paraSkatislis + " ");
            paraSkatislis = paraSkatislis + 2;
        }

// === 5. uzdevums ===
        System.out.println();
        System.out.println("\n" + "=== 5. uzdevums ===");
        faktorialaAprekins(3);
        faktorialaAprekins(8);

// === 6. uzdevums ===
        System.out.println("\n" + "=== 6. uzdevums ===");
        final int pin = 4488;
        int lietotajaIevaditaisPin;
        for(int meginajums = 1; meginajums <= 3; meginajums++){
            System.out.println("Ievadiet PIN");
            lietotajaIevaditaisPin = scanner.nextInt();
            if(lietotajaIevaditaisPin == pin) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
                break;
            }
            else {
                if(meginajums == 3) {
                    System.out.println("Atvainojiet, bet jūs esat bloķēts.");
                }
                else {System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");}
            }
        }
    }

    static void faktorialaAprekins(int ievadSkaitlis){ //5. uzdevums
        int faktorials = 1;
        for (int i = 1; i <= ievadSkaitlis; i++){
            faktorials = faktorials * i;
        }
        System.out.println(ievadSkaitlis + "! = " + faktorials);
    }
}
