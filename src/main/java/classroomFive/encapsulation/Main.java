package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
       // weather.metodeDivi(); // nevar izsaukt jo ir private - klases ietvaros
        weather.metodeTris();
        weather.isRaining = true;
        weather.isSunShining = false;

        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12, 154.2, "Pēteris");

        System.out.println((cilveks3.toString()));
        cilveks3.setAge(-3);
        System.out.println((cilveks3.toString()));
        cilveks3.setAge(18);
        System.out.println(cilveks3.toString());
        System.out.println(cilveks3.getAge());
        System.out.println(cilveks3.getName());




    }
}
