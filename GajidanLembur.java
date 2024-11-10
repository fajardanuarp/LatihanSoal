
    import java.util.Scanner;

public class GajidanLembur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji bulanan: ");
        int gajiBulanan = scanner.nextInt();
        
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();

        int upahLemburPerJam = (int) Math.ceil((double) gajiBulanan / 173);
        
        int totalUpahLembur;
        if (jamLembur <= 4) {
            totalUpahLembur = jamLembur * upahLemburPerJam;
        } else {
            totalUpahLembur = 4 * upahLemburPerJam;
            int kelebihanJam = jamLembur - 4;
            totalUpahLembur += kelebihanJam * 2 * upahLemburPerJam;

        int totalGaji = gajiBulanan + totalUpahLembur;

        System.out.println("\nUpah lembur per jam: " + upahLemburPerJam);
        System.out.println("Total upah lembur: " + totalUpahLembur);
        System.out.println("Total gaji yang diberikan: " + totalGaji);

        scanner.close();
    }
}
}

