package classroomFive.encapsulation;

public class Weather {

    boolean isRaining; //default - varam pieklut klases un pakotnes limeni
    public boolean isSunShining; // public - varam pieklut visur
    private boolean isSnowing; // private - var pieklut tikai klases ietvaros
    private double temperatureAtDay; // private - var pieklut tikai klases ietvaros
    public double temperatureAtNight;// public - varam pieklut visur

    public void printWeather(){
        System.out.println("Šī ir publiska metode");
        System.out.println("Ārā līst lietus visu dienu");
        metodeDivi();
    }

    private void metodeDivi(){
        System.out.println("Šī ir privāta metode");
    }

    void metodeTris(){
        System.out.println("Šī ir default metode");
    }


}
