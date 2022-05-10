package classroom;

public class Main {
    public static void main(String[] args) {
        int vecumsSuns = 3; // Vesels skaitlis
        String vardsSuns = "Reksis"; //Teksts
        double svarsSuns = 15.8; //Daļskaitlis
        float augumsSuns = 60.245F;  //Daļskaitlis
        boolean isHungry = true;
        boolean isBreedDog = false;
        char dzimums = 'V';
        char dzimums2 = 'S';

        // (mainīgā tips) (mainiga nosaukums) = ()
        byte monthsInYear = 12;
        short autoPrice = 12344;
        long netIncome = 21324434343L;

        // Aritmētiskas operācijas
        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;
        int x = 5;
        int y = 10;


        double z = 5;
        double q = 10;
        double w = 12;

        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12%5;

        int skaitlis = 6;
        System.out.println("Ja atbilde ir 0, šis ir pāra skaitlis" + skaitlis%2);


        System.out.println("Summa=" + summa);
        System.out.println("Starpība=" + starpiba);
        System.out.println("Reizinājums=" + reizinajums);
        System.out.println("Dalījums=" + dalijums);
        System.out.println("Atlikums" + atlikums);

        int vecumsKakis = 2;
        String vardsKakis = "Murziks";



        System.out.println("Mans suns");
        System.out.println("Vecums:");
        System.out.println(vecumsSuns);
        System.out.println("Vārds:");
        System.out.println(vardsSuns);
        System.out.println("Svars:");
        System.out.println(svarsSuns + " kg" + "\n"); //tukša rinda beigās
        System.out.println("Suņa augstums:" + " " + augumsSuns + " cm");
        System.out.println("Vai mans suns ir izsalcis?:" + " " + vardsKakis);
        System.out.println("Vai mans suns ir šķirnes suns?:" + " " + isBreedDog);
        System.out.println(); //tukša rinda



        System.out.println("Mans kakis");
        System.out.println("Vecums:");
        System.out.println(vecumsKakis);
        System.out.println("Vārds:");
        System.out.println(vardsKakis);

        System.out.println(vecumsKakis + vecumsSuns);
        System.out.println(vardsKakis + " un " +vardsSuns);
        System.out.println("Hello Nadezda");
    }



}
