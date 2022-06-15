package classroomFive.statika;

public class Auto {
    public String marka;
    public static String klasesNosaukums = "Autoklase"; //globālais mainīgais klases ietvaros
    public static int totalCarsCreated=0;

    Auto(String marka){
        this.marka = marka;
        totalCarsCreated++;    }

    public static void printText(){
        System.out.println("Printeju tekstu" + totalCarsCreated);
    }

    public static void increaseTotalCarsCreated(){
        totalCarsCreated++;
    }
}
