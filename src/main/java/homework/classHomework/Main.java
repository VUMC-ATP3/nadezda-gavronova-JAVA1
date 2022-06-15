package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturisViens = new Trissturis();
        trissturisViens.a = 8;
        trissturisViens.b = 10;
        trissturisViens.c = 8;
        trissturisViens.printTrissturis();
        System.out.println("Vai trīstūris ir vienādmalu: " + trissturisViens.irVienadmalu());
        System.out.println("Vai trīstūris ir vienādsānu: " + trissturisViens.irVienadsanu());

        Trissturis trissturisDivi = new Trissturis(15,13,4);
        trissturisDivi.printTrissturis();
        System.out.println("Trīsstūra laukums = " + trissturisDivi.laukums);
        System.out.println("Vai trīstūris ir vienādmalu: " + trissturisDivi.irVienadmalu());
        System.out.println("Vai trīstūris ir vienādsānu: " + trissturisDivi.irVienadsanu());
    }
}
