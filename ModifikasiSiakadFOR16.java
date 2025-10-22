import java.util.Scanner;
public class ModifikasiSiakadFOR16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lulus = 0, tidaklulus = 0;
        double nilai, tertinggi = 0, terendah = 100;
        int i;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        
        for ( i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;

            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            }else {
                tidaklulus++;
            }

           
         }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidaklulus);
        sc.close();
    }
}