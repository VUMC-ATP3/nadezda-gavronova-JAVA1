package classroomFour;



public class Main {
    public static void main(String[] args) {
        House majaViens = new House(4,true, false, "zala", "Brīvības iela", 55);
        majaViens.printHouse();

        House majaDivi = new House();
        majaDivi.stavuSkaits = 12;
        majaDivi.majasNumurs = 5;
        majaDivi.ielasNosaukums = "Klusā iela";
        majaDivi.irLifts = true;
        majaDivi.irAutoStavvieta = false;
        majaDivi.krasa="dzeltena";
        majaDivi.printHouse();

        Velosipeds zzk = new Velosipeds();
        zzk.bremzuTips = 'D';
        System.out.println(zzk.atrums);
        System.out.println("Cilvēks min pedaļus");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.printetAtrumu();
        System.out.println("Priekšā izlec kaķis. vajag bremzēt");
        zzk.bremzet();
        zzk.bremzet();
        System.out.println("Velo atrums ir " + zzk.atrums);
        Velosipeds merida = new Velosipeds();
        merida.printetAtrumu();
        merida.bremzuTips = 'V';
        merida.printetAtrumu();

        Velosipeds vecsVelosipeds = new Velosipeds();
        vecsVelosipeds.bremzuTips = 'S';
        vecsVelosipeds.bremzet();

        Koks egle = new Koks();
        egle.suga = "egle";
        egle.lapuTips = 'S';
        egle.zals = 'Z';
        egle.vecums = 20;
        egle.augstums = 10;
        egle.printKoks();

        //Riņķa laukuma aprēķins
        Rinkis mansRinkis = new Rinkis();
        System.out.println(Math.PI);
        mansRinkis.radiuss = 5;
        System.out.println(Math.PI);
        System.out.println(mansRinkis.aprekinatLaukumu());

        Rinkis mansRinkis2 = new Rinkis();
        System.out.println(Math.PI);
        mansRinkis2.radiuss = 53;
        System.out.println(mansRinkis2.radiuss);
        System.out.println(mansRinkis2.aprekinatLaukumu());
        System.out.println(mansRinkis2.aprekinatRinkalinijasgarumu());
        mansRinkis.printCreatedTime();
        mansRinkis2.printCreatedTime();

        Rinkis mansRinkis3 = new Rinkis(12.3);
        System.out.println(mansRinkis3.laukums);
        System.out.println(mansRinkis3.rinkaLinijasGarums);

        Taisnsturis taisnsturisViens = new Taisnsturis(12.4, 34.32);
        System.out.println("Taisnstūra laukums ir " + taisnsturisViens.aprekinatLaukumu());


        // Suns - Animal
        Suns reksis = new Suns();
        reksis.vaiRej = false;
        reksis.name = "Dingo";
        System.out.println(reksis.vaiRej);
        reksis.astesGarums = 10;
        reksis.printName();
        reksis.izdodSkanu();

        Animal dzivnieks = new Animal();
        dzivnieks.name = "Dzivnieks kaut kāds";
        dzivnieks.printName();
        dzivnieks.izdodSkanu();

        Cat cat = new Cat();
        cat.name = "Muris";
        cat.printName();
        cat.izdodSkanu();










    }

}
