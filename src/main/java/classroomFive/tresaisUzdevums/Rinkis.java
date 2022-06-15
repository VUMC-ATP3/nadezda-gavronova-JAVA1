package classroomFive.tresaisUzdevums;

public class Rinkis{
    private double radius;
    private String color;

    public Rinkis() {
        this.radius = 1.0;
        this.color = "sarkana";
    }

    public Rinkis(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double calculateArea(){
        return Math.pow(radius, 2) * Math.PI; //radiuss kvadrātā reiz Pi
    }
}
