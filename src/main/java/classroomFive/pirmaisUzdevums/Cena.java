package classroomFive.pirmaisUzdevums;

public class Cena {
    public double amount;
    public char currency;

    public Cena(double amount, char currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Cena:" +
                amount + currency;
    }

    public void discount(double discount){
        amount = amount - (amount *(discount/100));

    }
}
