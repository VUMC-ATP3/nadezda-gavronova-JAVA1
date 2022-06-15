package classroomFive.polymorfism;

public class Calculator {

    public int sum(int a, int b){
        System.out.println("Saskaitam veselus skaitļus");
        return a + b;
    }

    public double sum(double a, double b){
        System.out.println("Saskaitam daiļskaitļus");
        return a + b;
    }
    public int sum(int a, int b, int c) {
        System.out.println("Saskaitam trīs skaitļus");
        return a + b + c;
    }

}
