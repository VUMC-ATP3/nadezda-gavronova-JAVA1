package classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cik auto objekti uztaisīti" + Auto.klasesNosaukums);
        Auto masina = new Auto("BMW");

        Auto masinaDivi = new Auto("Mercedes");
        masinaDivi.marka = "Mercedes";
        System.out.println(masinaDivi.klasesNosaukums);
        System.out.println("Cik auto objekti uztaisīti" + Auto.klasesNosaukums);
        Auto masina3i = new Auto("Opel");
        Auto masina5i = new Auto("Fiat");
        System.out.println("Cik auto objekti uztaisiti: " + Auto.totalCarsCreated);
        Auto.printText();
        Auto.increaseTotalCarsCreated();
        Auto.increaseTotalCarsCreated();
        Auto.increaseTotalCarsCreated();
        System.out.println("Cik auto objekti uztaisiti: " + Auto.totalCarsCreated);

    }
}
