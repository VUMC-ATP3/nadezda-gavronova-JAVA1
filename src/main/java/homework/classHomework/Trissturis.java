package homework.classHomework;

public class Trissturis {
    public int a;
    public int b;
    public int c;
    public double laukums;
    public double p;

    Trissturis (){
        System.out.println("Veidojam trijstūri..");
    }

    public Trissturis(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("\nVeidojam jaunu trijstūri..");
        p = (a+b+c)/2;
        this.laukums = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void printTrissturis(){
        System.out.println("Mala a = " + a);
        System.out.println("Mala b = " + b);
        System.out.println("Mala c = " + c);
        if((p-a) <= 0 || (p-b) <= 0 || (p-c) <= 0){
            System.out.println("Nav pieļaujami malu garumi!)"); //kvadrātsakne no negatīva skaitļa vai 0
        }
    }
    public boolean irVienadmalu(){
        if((a==b) && (a==c)){
            return true;}
        else {
            return false;}
    }

    public boolean irVienadsanu(){
        if((a==b) || (a==c) || (b==c)){
        //vienādmalu trijstūris - ja vismaz divas malas ir vienādas => vienādmalu trijstūris ir tāpat vienādsānu trijstūris
            return true;
        }
        else {
            return false;
        }
    }

}
