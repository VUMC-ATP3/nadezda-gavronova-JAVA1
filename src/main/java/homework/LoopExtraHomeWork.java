package homework;

import java.util.Random;
import java.util.Scanner;

public class LoopExtraHomeWork {
    public static void main(String[] args) {

        Random skaitluGenereators = new Random();
        Scanner scanner = new Scanner(System.in);
        int nejaussSkaitlis = skaitluGenereators.nextInt(51); //no 0 līdz 50

        System.out.println(nejaussSkaitlis);

        int lietotajaIevaditaisSkaitlis;
        for(int meginajums = 1; meginajums <= 10; meginajums++){
            System.out.println("Ievadiet veselu skaitli no 0 līdz 50:");
            lietotajaIevaditaisSkaitlis = scanner.nextInt();
            if(lietotajaIevaditaisSkaitlis == nejaussSkaitlis) {
                System.out.println("Apsveicam! Jūs uzminējāt skaitli [" + lietotajaIevaditaisSkaitlis + "] no " + meginajums + ". mēģinājuma!");
                break;
            }
            else {
                if(meginajums == 10) {
                    System.out.println("Jūs zaudējāt!");
                }
                else {
                    System.out.println("Jūs neuzminējāt!");
                    if(lietotajaIevaditaisSkaitlis > nejaussSkaitlis) {
                        System.out.println("Jūsu ievadītais skaitlis [" + lietotajaIevaditaisSkaitlis + "] ir lielāks par uzģenerēto.");
                        }
                    else {
                        System.out.println("Jūsu ievadītais skaitlis [" + lietotajaIevaditaisSkaitlis + "] ir mazāks par uzģenerēto.");
                    }
                    }
            }
        }

    }
}
