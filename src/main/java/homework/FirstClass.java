package homework;

public class FirstClass {
    public static void main(String[] args) {
        String nameCountry = "Itālija"; //Valsts nosaukums
        double population = 447.7; //Iedzīvotāju skaits (miljoni iedzīvotāju)
        int area = 4000000; //Platība (kvadrātkilometri)
        String capital = "Roma"; // Galvaspilsēta
        String nationalLanguage = "itāļu"; //Oficiālā valoda
        boolean isEUmember = true; //Vai ir ES dalībvalsts
        String memberEU;
        char currency = '€'; //Valūta

        System.out.println("Valsts nosaukums: " + nameCountry);
        System.out.println("Iedzīvotāju skaits: " + population + " miljoni iedzīvotāju");
        System.out.println("Platība: " + area + " km²");
        System.out.println("Galvaspilsēta: " + capital);
        System.out.println("Oficiālā valoda: " + nationalLanguage);
        if (isEUmember==true) { memberEU="jā"; }
            else { memberEU="nē"; }
        System.out.println("Vai ir ES dalībvalsts: " + memberEU);
        System.out.println("Valūta: " + currency);

        System.out.println();
        System.out.println(nameCountry + ", oficiāli Itālijas Republika (Repubblica italiana), ir valsts Dienvideiropas" +
                " centrālajā daļā." + "\n" +
                "Itālijas galvaspilsēta ir " + capital + ". Vairums iedzīvotāji ir itāļi. Oficiālā valoda ir "
                + nationalLanguage +
                    " valoda.");
        System.out.format("Itālijas platība ir %s km². Aptuveni trīs ceturtdaļas " +
                "no valsts teritorijas  klāj kalnienes un kalni.", area);
        System.out.println();

        // Aritmētiskas operācijas
        int summa1;
        double summa2;
        int summa3;
        int starpiba1;
        double starpiba2;
        double starpiba3;
        int reizinajums1;
        double reizinajums2;
        double reizinajums3;
        double dalijums1;
        double dalijums2;
        double dalijums3;
        int atlikums1;
        int atlikums2;
        int atlikums3;
        int multiple;
        int x = 5;
        int y = 10;
        double z = 25.5;
        double q = 2;
        double w = 20.55;

        //Saskaitīšana
        summa1 = x + y;
        summa2 = z + q;
        summa3 = summa1 + y;
        System.out.println();
        System.out.println("Summa1=" + summa1);
        System.out.println("Summa2=" + summa2);
        System.out.println("Summa3=" + summa3);
        System.out.println();

        //Atņemšana
        starpiba1 = y - x;
        starpiba2 = w - z;
        starpiba3 = q - starpiba2;
        System.out.println("Starpiba1=" + starpiba1);
        System.out.println("Starpiba2=" + starpiba2);
        System.out.println("Starpiba3=" + starpiba3);
        System.out.println();

        //Reizināšana
        reizinajums1 = x * y;
        reizinajums2 = z * q;
        reizinajums3 = z * q * reizinajums2;
        System.out.println("Reizinajums1=" + reizinajums1);
        System.out.println("Reizinajums2=" + reizinajums2);
        System.out.println("Reizinajums3=" + reizinajums3);
        System.out.println();

        //Dalīšana
        dalijums1 = z / w;
        dalijums2 = z / q;
        dalijums3 = w / q;
        System.out.println("Dalijums1=" + dalijums1);
        System.out.println("Dalijums2=" + dalijums2);
        System.out.println("Dalijums3=" + dalijums3);
        System.out.println();

        //Atlikums
        atlikums1 = 28 % 5;
        atlikums2 = x % y;
        atlikums3 = x % 3;
        System.out.println("Atlikums1=" + atlikums1);
        System.out.println("Atlikums2=" + atlikums2);
        System.out.println("Atlikums3=" + atlikums3);
        System.out.println();

        //Multiple
        multiple = (x*y + (x + y)*(y - x) - starpiba1);
        System.out.println("Multiple=" + multiple);

    }
}
