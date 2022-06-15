package classroomFive.pirmaisUzdevums;

import classroomFive.encapsulation.Weather;

public class Main {

    public static void main(String[] args) {
        Author JKRowling = new Author("JK Rowling", "JK@gmail.com", 'F');
        Author Rainis = new Author("Jānis Rainis", "JR@gmail.com", 'M');
        Cena cena1 = new Cena (10.99, 'e');
   //     Cena cena2 = new Cena (9.99, '$');
        Book bookOne = new Book("Harry Potter", JKRowling, cena1);
        Book bookTwo = new Book("Debesis", Rainis, new Cena (9.99, '$'));
        System.out.println(bookTwo.toString());
        bookTwo.price.discount(30); //pielietojam atlaidi
        System.out.println(bookTwo.toString());

        System.out.println(bookOne.author.toString());

        Weather weather = new Weather();

    }
}
