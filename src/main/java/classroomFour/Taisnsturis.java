package classroomFour;

public class Taisnsturis {
    double malaViens;
    double malaDivi;

    public Taisnsturis(double malaViens, double malaDivi) {
        this.malaViens = malaViens;
        this.malaDivi = malaDivi;
    }

    Taisnsturis(){
        System.out.println("Taisu taisnstūri..");
    }

    public double aprekinatLaukumu(){
        return malaViens * malaDivi;
    }


}
