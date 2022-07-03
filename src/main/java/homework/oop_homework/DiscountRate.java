package homework.oop_homework;

public class DiscountRate {
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold = 0.15;
    double serviceDiscountSilver = 0.1;
    double productDiscountPremium = 0.1;
    double productDiscountGold = 0.1;
    double productDiscountSilver = 0.1;


    public double getServiceDiscountRate (String type){
        if (type equals("Premium")) { return serviceDiscountPremium }
        else if (type equals("Gold")) { return serviceDiscountGold }
        else if (type equals("Silver")) { return serviceDiscountSilver }
        else{return 0}
    }

    public double getProductDiscountRate (String type){

    }
}
