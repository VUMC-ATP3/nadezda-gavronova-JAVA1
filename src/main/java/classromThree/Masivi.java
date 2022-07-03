package classromThree;

import java.util.Random;
import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {

/*        //Random util
        Random skaitluGenereators = new Random();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(skaitluGenerators.nextInt(1000));
        }
            //int nejaussSkaitlis = skaitluGenereators.nextInt(); //jebkuru
        int nejaussSkaitlis = skaitluGenereators.nextInt(50); //no 0 līdz 50
        System.out.println(nejaussSkaitlis);
*/



 // WHILE CIKLS ====================

        int sakotnejs = 1;
        while (sakotnejs<=1000){
            System.out.println(sakotnejs);
            sakotnejs++; // sakotnejs = sakotnejs+1;
        }

        int sakotnejsPara = 0;
        while (sakotnejsPara<=10){
            System.out.println(sakotnejsPara);
            sakotnejsPara = sakotnejsPara + 2;
        }

        String[] stacijas = {"Centrālā stacija", "Brasa", "Majori", "Zemitāni", "Dubulti", "Sloka"};
        String[] pieturas = {"Centrālā stacija", "Marijas iela", "Bernu pasaule", "Ziedoņdārzs", "PieturaX"};
        int skaititajs = 0;
        while (skaititajs < pieturas.length){
            System.out.println("Pieturas: "+ pieturas[skaititajs] );
            skaititajs = skaititajs + 1;
        }

        int[] majuNumuri = {1,2,3,4,5,6,7,8};
        int e = 0;
        while (e<8){
            System.out.println("Majas numurs: "+ majuNumuri[e] );
            e = e + 1;
        }
        char[] patskani = {'a', 'e', 'u', 'o', 'i'};



        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
        pieturas[3] = "Zemitanu stacija";
        System.out.println("Cik pieturas masivā? " + pieturas.length);
        System.out.println("Cik mājas uz ielas? " + majuNumuri.length);

        String [] hokejaCempioniTopTris = new String[3];
        System.out.println("Cik vietas ir čempionātā? " + hokejaCempioniTopTris.length);
        System.out.println(hokejaCempioniTopTris[0]);
        String pirmaVieta = "Somija";
        String otraVieta = "Kanāda";
        String tresaVieta = "Čehija";
        hokejaCempioniTopTris[0] = pirmaVieta;
        hokejaCempioniTopTris[1] = otraVieta;
        hokejaCempioniTopTris[2] = tresaVieta;
        System.out.println(hokejaCempioniTopTris[0] + "\n" + hokejaCempioniTopTris[1] + "\n" + hokejaCempioniTopTris[2]);

        System.out.println("Cikls sākās");
        int i = 0;
        while  (i<5){
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Cikls beidzās");

        printerTekstaMasivu(stacijas);
        printerTekstaMasivu(pieturas);
        printetIntegerMasivu(majuNumuri);

        majuParbaude(10,50,13);
        majuParbaude(1,5230,2);

//DO WHILE cikls =============

        int y = 0;
        do {
            System.out.println("Do while" + y);
            y = y+1;
        } while (y < 10);
        //paroles parbaude
        Scanner scanner = new Scanner(System.in);
        String parole = "Parole 123";
        String lietotajaIevaditaParole;

        do{
            System.out.println("Ievadi paroli");
            lietotajaIevaditaParole = scanner.nextLine();
            System.out.println("Notiek paroles pārbaude");
        } while(!lietotajaIevaditaParole.equals(parole));
        System.out.println("Pareiza parole");

        //likt ievadit pozitivu skaitli
        int number;
        do{
            System.out.println("Ievadi pozitīvo skaitli vai 0");
            number = scanner.nextInt();
            System.out.println("Notiek pārbaude");
        } while(number<=0);
        System.out.println("Derīgs skaitli " + number);

//FOR  cikls =============

        for (int j = 0; j < 5; j=j++){
            System.out.println("FOR CIKLS " + j );
        }
        // ===== tikai pāra sk.
        for (int j = 0; j <=10 ; j=j+2) {
            System.out.println(j);
        }

        // ===== ar masīviem
        String [] mansMasivs = {"Juris","Anna", "Peteris","Jānis"};

        for (int j = 0; j < 10; j++){
            System.out.println(mansMasivs[j]);
        }

        // ========
        for (int j = 0; j >= -100; j--) {
            System.out.println("FOR CIKLS" + j);
        }

        // print BREAKE example
        for (int j = 0; j < 10; j++) {
            if(j==5){
                System.out.println("J = 5, laužam ciklu");
                break;
            }
            System.out.println("print break example: " + j);
        }

        //atrast masīvā pirmo negatīvo skaitli un izvadīt to un  tā indexu(poziciju) uz ekrāna
        int[] skaitluMasivs = {3, 4, 6, 7, 2, 1, -5, 4, 2, 6, -4, -3, 3};
        for (int j = 0; j < skaitluMasivs.length; j++) {
            if (skaitluMasivs[j] < 0) {
                System.out.println("Pirmais negativais skaitlis: " + skaitluMasivs[j]);
                System.out.println("Indekss ir: " + j);
                break;
            }
        }

        // print CONTINUE example
        int[] skaitluMasivs2 = {3, 4, 6, 7, 2, 1, -5, 4, 2, 6, -4, -3, 3};
        for (int j = 0; j < skaitluMasivs.length; j++) {
            if (skaitluMasivs[j] < 0) {
                continue;
            }
            System.out.println(skaitluMasivs[j]);
        }



//FOR EACH cikls =============
        String [] mansMasiv = {"Juris","Anna", "Peteris","Jānis"};
        for (String xxxx : mansMasiv){ //katram stringam manā masīvā izdari kaut ko
            System.out.println(xxxx);
            //System.out.println("Lekcija par masīviem");
        }


    }

//Matodes
    static void printerTekstaMasivu(String[] randomMasivs){
        int skaititajs = 0;
        while (skaititajs < randomMasivs.length){
            System.out.println("Pieturas: "+ randomMasivs[skaititajs] );
            skaititajs = skaititajs + 1;
        }
    }

   static void printetIntegerMasivu(int[] kautKo){
         int i = 0;
         while(i<kautKo.length){
             System.out.println(kautKo[i]);
             i++; //i = i + 1;
            }
        }

        // Izvada vai der mājas vai nē (der kas nedalās ar 3 vai 5, un nav =13)
        static void majuParbaude(int sakums, int beigas, int iznemums){
            int majuNumuri = sakums;
            while(majuNumuri<=beigas){
                if(majuNumuri%3==0 || majuNumuri%5==0 || majuNumuri==iznemums) {
                    System.out.println("Neder" + majuNumuri);
                } else {
                    System.out.println("DER" + majuNumuri);
                }
                majuNumuri++;
            }
        }




}
