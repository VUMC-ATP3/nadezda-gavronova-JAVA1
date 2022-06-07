package classroomFour;

import java.sql.Timestamp;

public class Rinkis {
    double radiuss;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;

    Rinkis(){
        System.out.println("Mēs veidojam Riņķi ...");
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);

   //     laukums = aprekinatLaukumu();
   //     rinkaLinijasGarums = aprekinatRinkalinijasgarumu();
    }
    Rinkis(double padotaisRadiuss){
        radiuss = padotaisRadiuss;
        laukums = aprekinatLaukumu();
        rinkaLinijasGarums = aprekinatRinkalinijasgarumu();
    }

    public double aprekinatLaukumu(){
        System.out.println("Aprekinu rinka laukumu");
        return Math.pow(radiuss,2) * Math.PI; // = radiuss * radiuss * PI
    }

    public void printCreatedTime(){
        System.out.println(timestamp);
    }

    public double aprekinatRinkalinijasgarumu(){
        System.out.println("Aprekinu rinka līnijas garumu");
        return 2 * Math.PI * radiuss; // = radiuss * radiuss * PI
    }


}
