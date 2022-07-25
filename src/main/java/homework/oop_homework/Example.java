package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        //Premium member
        Customer customerOne = new Customer("Nadežda Gavronova");
        customerOne.setMember(true);
        customerOne.setMemberType("Premium");

        //Gold member
        Customer customerTwo = new Customer("Agnese Antonova");
        customerTwo.setMember(true);
        customerTwo.setMemberType("Gold");

        //Silver member
        Customer customerThree= new Customer("Māris Apelis");
        customerThree.setMember(true);
        customerThree.setMemberType("Silver");

        //is not member
        Customer customerFour = new Customer("Raimonds Domeneks");
        customerFour.setMember(false);

        Visit visit1 = new Visit(customerOne, new Date());
        Visit visit2 = new Visit(customerTwo, new Date());
        Visit visit3 = new Visit(customerThree, new Date());
        Visit visit4 = new Visit(customerFour, new Date());


        visit1.setProductExpense(45.0);
        visit1.setServiceExpense(90.0);
        System.out.println(visit1);
        System.out.println("Total expense of " + visit1.getName() + ": " + visit1.getTotalExpense());
        System.out.println();

        visit2.setProductExpense(50.5);
        visit2.setServiceExpense(35.0);
        System.out.println(visit2);
        System.out.println("Total expense of " + visit2.getName() + ": " + visit2.getTotalExpense());
        System.out.println();

        visit3.setProductExpense(18.0);
        visit3.setServiceExpense(33.0);
        System.out.println(visit3);
        System.out.println("Total expense of " + visit3.getName() + ": " + visit3.getTotalExpense());
        System.out.println();

        visit4.setProductExpense(15.0);
        visit4.setServiceExpense(25.0);
        System.out.println(visit4);
        System.out.println("Total expense of " + visit4.getName() + ": " + visit4.getTotalExpense());
        System.out.println();
    }
}
