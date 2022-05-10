package classroom;

public class MainTwo {
    public static void main(String[] args) {
        String vards = "Nadežda";
        String uzvards = "Gavronova";
        int vecums = 38;
        boolean isPresent = true;

        System.out.println("Vārds: " + vards + "\n" + "Uzvārds: " + uzvards + "\n"
        + "Vecums: " + vecums + "\n" + "Vai bija nodarbībā? " + isPresent);


        String teikums = String.format("Vārds: %s \n Uzvārds: %s \n Vecums: %s \n isPresent %s" , vards, uzvards, vecums, isPresent);
        System.out.println(teikums);

        System.out.println((2*(2+2))/2);
    }
}
