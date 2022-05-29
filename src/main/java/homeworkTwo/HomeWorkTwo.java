package homeworkTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.uzdevums ==========================
        int x;
        boolean isTrue = false;
        x = 8;
        System.out.println("1. uzdevums: x = " + x);
        isTrue = x > 0;
        System.out.println("a) Vai x ir pozitīvs? => " + isTrue); //true
        isTrue = x < 0;
        System.out.println("b) Vai x ir negatīvs? => " + isTrue); //false
        isTrue = (x > 5) && (x <= 10);
        System.out.println("c) Vai x ir lielāks par 5 un x ir mazāks vai vienāds par 10? => " + isTrue); //true
        isTrue = !(x <= 5) && (x < 10);
        System.out.println("d) Vai x NAV mazāks vai vienāds par 5 un x ir mazāks par 10? => " + isTrue); //true
        isTrue = (x == 0) || (x == 10);
        System.out.println("e) Vai x ir vienāds 0 vai x ir vienāds 10? => " + isTrue); //false
        isTrue = (x * x) > 10;
        System.out.println("f) Vai x * x reizinājums ir lielāks par 10 ? => " + isTrue); //true
        System.out.println();

        //2.uzdevums ==========================
        System.out.println("2. uzdevums:");
        String menesaVards;
        System.out.println("Ievadi Mēneša numuru!");
        int menesis = scanner.nextInt();
        switch(menesis) {
            case 1:
                menesaVards="Janvāris";
                break;
            case 2:
                menesaVards="Februāris";
                break;
            case 3:
                menesaVards="Marts";
                break;
            case 4:
                menesaVards="Aprīlis";
                break;
            case 5:
                menesaVards="Maijs";
                break;
            case 6:
                menesaVards="Jūnijs";
                break;
            case 7:
                menesaVards="Jūlijs";
                break;
            case 8:
                menesaVards="Augusts";
                break;
            case 9:
                menesaVards="Septembris";
                break;
            case 10:
                menesaVards="Oktobris";
                break;
            case 11:
                menesaVards="Novembris";
                break;
            case 12:
                menesaVards="Decembris";
                break;
            default:
                menesaVards="Nezināms mēnesis";
        }
        System.out.println(menesaVards);
        System.out.println();

        //3.uzdevums ==========================
        System.out.println("3. uzdevums:");
        int lielakaisSkaitlis;
        System.out.println("Ievadi Skaitli 1!");
        int skaitlis1 = scanner.nextInt();
        System.out.println("Ievadi Skaitli 2!");
        int skaitlis2 = scanner.nextInt();
        System.out.println("Ievadi Skaitli 3!");
        int skaitlis3 = scanner.nextInt();

        if(skaitlis1>skaitlis2)
            {lielakaisSkaitlis = skaitlis1;}
        else
            {lielakaisSkaitlis=skaitlis2;}
        if(lielakaisSkaitlis>skaitlis3)
            {System.out.println("Lielākais skaitlis = " + lielakaisSkaitlis);}
        else
            {System.out.println("Lielākais skaitlis = " + skaitlis3);}
        System.out.println();
        scanner.nextLine(); //clearing the buffer

        //4.uzdevums ==========================
        System.out.println("4. uzdevums:");
        System.out.println("Ievadi luksofora krāsu: [sarkans] vai [s] / [dzeltens] vai [dz] / [zaļš] vai [z]!");
        String krasa = scanner.nextLine();
        if(krasa.equals("sarkans") || krasa.equals("s"))
        {
            System.out.println("Sarkans - stāvi un gaidi!");
        }
        else if(krasa.equals("dzeltens") || (krasa.equals("dz")))
        {
            System.out.println("Dzeltens - stāvi kāmēr nav zaļš!");
        }
        else if(krasa.equals("zaļš") || (krasa.equals("z")))
        {
            System.out.println("Zaļš - vari iet!");
        }
        else
        {
            System.out.println("Krāsa nav noteikta!");
        }
        System.out.println();

        //Darbs ar metodēm
        //5.uzdevums ==========================
        System.out.println("5. uzdevums:");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        System.out.println();

        //6.uzdevums ==========================
        System.out.println("6. uzdevums:");
        printBusinessCardTwo("Līga", "Kalniņa", "+371 123123313", 1965);
        printBusinessCardTwo("Juris", "Vītols", "+371 5142431", 1930);
        System.out.println();

        //7.uzdevums ==========================
        System.out.println("7. uzdevums:");
        int summa = sum(4, 10);
        System.out.println("Summa = " + summa);
        System.out.println();

        //8.uzdevums ==========================
        System.out.println("8. uzdevums:");
        System.out.println("Average = " + average(10, 2, 4));
    }

        //Metodes:
        static void printBusinessCard(){ //5.uzdevums
            String vards = "Jānis";
            String uzvards = "Berziņš";
            String telefons = "+371 12345678";
            int dzimsanasGads = 1990;

            System.out.println("Vizītkarte");
            System.out.println("##########");
            System.out.println(String.format("Vārds: %s" , vards));
            System.out.println(String.format("Uzvārds: %s" , uzvards));
            System.out.println(String.format("Telefona numurs: %s" , telefons));
            System.out.println(String.format("Dzimšanas gads: %s" , dzimsanasGads));
            System.out.println("##########");
        }
        static void printBusinessCardTwo(String vards, String uzvards, String telefons, int dzimsanasGads){ //6.uzdevums
            System.out.println("Vizītkarte");
            System.out.println("##########");
            System.out.println(String.format("Vārds: %s" , vards));
            System.out.println(String.format("Uzvārds: %s" , uzvards));
            System.out.println(String.format("Telefona numurs: %s" , telefons));
            System.out.println(String.format("Dzimšanas gads: %s" , dzimsanasGads));
            System.out.println("##########");
        }
        static int sum(int a, int b){ //7.uzdevums
            int sum = a + b;
            return sum;
        }
        static double average(double c, double d, double f){ //8.uzdevums
            double avg = (c + d + f) / 3;
            return avg;
        }
}


