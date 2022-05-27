package classroomTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticalTaskTwo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi savu vārdu!");
//        String name = scanner.nextLine();
//        System.out.println("Ievadi savu vecumu!");
//        int age = scanner.nextInt();
//        System.out.println("Esi sveicināts: " + name + "!");
//        //vai
//        System.out.println(String.format("Esi sveicināts: %s !" , name));
//        System.out.println("Jūsu vecums ir: " + age);
//
//        System.out.println("Ievadi skaitli 1!");
//        int skaitlis1 = scanner.nextInt();
//        System.out.println("Ievadi skaitli 2!");
//        int skaitlis2 = scanner.nextInt();
//        int summa = skaitlis1 + skaitlis2;
//        System.out.println("Summa = " + Summa);

//            int a = 5;
//            int b = 10;
//            int c = 5;
//            int d = 11;
//            //Lielāks >
//            System.out.println(b > a); //true
//            System.out.println(a > b); //false
//            //Mazāks <
//            System.out.println(a < b); //true
//            System.out.println(b < a); //false
//            //vienāds ==
//            System.out.println(a == c); //true
//            System.out.println(a == b); //false
//            System.out.println(b == c); //false
//            //nav vienāds !=
//            System.out.println(a != b); //true
//            System.out.println(a != c); //false
//            // mazāks vienāds <=
//            System.out.println(a <= c); //true
//            // lielāks vienāds >=
//            System.out.println(b >= d); //false
//
//
//            int vecums = 18;
//            boolean vaiDrikstBalsot = (vecums >= 18);
//            System.out.println("Vai cilvēks drīkst balsot? " + vaiDrikstBalsot);
//
//            String name = "Juris";
//            String secondName = "Jānis";
//            boolean vaiVardiSakrit = (name.equals(secondName));
//            System.out.println("Vai vārdi sakrīt? " + vaiVardiSakrit);
//
//            // loģiskais AND: &&
//            int e = 4;
//            boolean vaiIrPatiess = ((e < 5 ) && (e < 10));
//            System.out.println(vaiIrPatiess);
//
//            e = 5;
//            vaiIrPatiess = ((e < 5 ) && (e < 10));
//            System.out.println(vaiIrPatiess); //false
//
//            // loģiskais OR: ||
//            vaiIrPatiess = ((e < 5 ) || (e < 10));
//            System.out.println(vaiIrPatiess); //false
//
//            // loģiskais NOT:
//            e = 5;
//            vaiIrPatiess = (!(e < 5));
//            System.out.println(vaiIrPatiess); //true
//
//        int vecumsDivi = 17;
//        if(vecumsDivi >= 18) {
//                System.out.println("Cilvēks drīkst balsot");
//        }
//        else
//        {
//                System.out.println("Cilvēks nedrīkst balsot");
//        }
//
//
//
//
//        System.out.println("Ievadi savu vecumu..");
//        int vecumsTris = scanner.nextInt();
//        if(vecumsTris>=18) {
//                System.out.println("Cilvēks drīkst balsot");
//        }
//        else
//        {
//                System.out.println("Cilvēks nedrīkst balsot");
//        }
//
//       System.out.println("Koda turpinājums");
//
//        System.out.println("Ievadi skaitli..");
//        int skaitlisViens = scanner.nextInt();
//        if(skaitlisViens==10){
//            System.out.println("Skaitlis =10 ");
//        } else if(skaitlisViens==15){
//            System.out.println("Skaitlis =15 ");
//        } else if(skaitlisViens==20){
//            System.out.println("Skaitlis =20 ");
//        } else {
//            System.out.println("Skaitlis nav zināms");
//        }
//
//        System.out.println("Koda turpinājums");

// Jānodefinē cilvēks
//        int cilvekaVecums = 63;
//        char cilvekaDzimums = 'S';
//
//
//        if((cilvekaDzimums == 'S')&&(cilvekaVecums >= 60)) {
//            System.out.println("Sieviete - drīkst doties pensijā");
//        } else if((cilvekaDzimums == 'S')&&(cilvekaVecums < 60)){
//            System.out.println("Sieviete - nedrīkst doties pensijā");
//        } else if((cilvekaDzimums == 'V')&&(cilvekaVecums >= 65)){
//            System.out.println("Virietis - drīkst doties pensijā");
//        } else {
//            System.out.println("Virietis - nedrīkst doties pensijā");
//        }
////vai
//        boolean drikstDotiesPensija = false;
//
//        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
//            drikstDotiesPensija = true;
//        }
//        else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
//            drikstDotiesPensija = true;
//        }
//
//        if(drikstDotiesPensija){
//            System.out.println("Cilveks drikst doties pensija!");
//        }


        int diena = 6;
        String dienasVards;
        switch(diena) {
            case 1:
                dienasVards="Pirmdiena";
                break;
            case 2:
                dienasVards="Otrdiena";
                break;
            case 3:
                dienasVards="Trešdiena";
                break;
            case 4:
                dienasVards="Ceturtdiena";
                break;
            case 5:
                dienasVards="Pietdiena";
                break;
            case 6:
                dienasVards="Sestdiena";
                break;
            case 7:
                dienasVards="Svētdiena";
                break;
            default:
                dienasVards="Nezināma diena";
        }
        System.out.println(dienasVards);

//Praktiskie darbi
// vai skaitlis ir > 0
        System.out.println("Ievadi skaitli..");
        int veselsSkaitlis = scanner.nextInt();

        if (veselsSkaitlis > 0) {
            System.out.println("Lielāks par 0");
        }
        else {
            System.out.println("Mazāks par 0");
        }

// Vai drīkst balsot
        boolean drikstBalsot = false;
        System.out.println("Ievadi vecumu..");
        int cilvekaVecums = scanner.nextInt();

        if (cilvekaVecums >= 18) {
            drikstBalsot = true;
       }
        else {
            drikstBalsot = false;
        }
        if (drikstBalsot) {
        System.out.println("Cilveks drikst balsot!"); }
        else {
            System.out.println("Cilveks nedrikst balsot!");
        }



    }
}
