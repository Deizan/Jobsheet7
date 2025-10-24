import java.util.Scanner;

public class ParkirKendaraan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenisKendaraan; 
        int durasi;
        int totalBayar = 0;

        System.out.println("=== PROGRAM BIAYA PARKIR ===");

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Selesai): ");
            jenisKendaraan = input.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            int biaya = 0;
            if (durasi > 5) {
                biaya = 12500; 
            } else {
                if (jenisKendaraan == 1) {
                    biaya = durasi * 3000; 
                } else if (jenisKendaraan == 2) {
                    biaya = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid!");
                    continue;
                }
            }

            System.out.println("Biaya parkir kendaraan ini: Rp " + biaya);
            totalBayar += biaya;
        }
        System.out.println();
        System.out.println("=== TOTAL PEMBAYARAN SEMUA KENDARAAN ===");
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        System.out.println("Terima kasih telah menggunakan layanan parkir, Hati-hati di jalan!");
    }
}
