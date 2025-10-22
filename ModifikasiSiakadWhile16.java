import java.util.Scanner;

public class ModifikasiSiakadWhile16 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,jml;
        int i=0;
        System.out.print("Masukkan jumlah mahasiswaa: ");
        jml = sc.nextInt();
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": A");
                System.out.println("Bagus, pertahankan nilai anda");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": C+");
            } else if (nilai >= 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": E");
            }
            i++;
        }
        sc.close();
        
    }

    
}
