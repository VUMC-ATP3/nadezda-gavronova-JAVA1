package classromThree;

public class Metodes {
    public static void main(String[] args) {
        int a = kvadrataLaukums(3);
        float c = taisnsturaLaukums(3, 5);
        printetTekstu(kvadrataLaukums(3),taisnsturaLaukums(3.4F, 5.3F));
        printetTekstu(a,c);
        //vai
        Metodes.printetTekstu(a,c);
        System.out.println(prettyPrint("fgfgfgfgf"));
    }

    static String prettyPrint(String a){
        return "adsdsd" + a + "gfgshfgh";
    }
    static int kvadrataLaukums(int mala){
        int laukums = mala * mala;
        return laukums;
    }
    static float taisnsturaLaukums(float a, float b){
        float s = a * b;
        return s;
    }

    static void printetTekstu(int a, float c) {
        System.out.println("Kvadrata Laukums ="+ a);
        System.out.println("Taisnstura Laukums ="+ c);
    }

}
