import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        String lanjut = "ya";
        System.out.println("=== Program Penjualan Tiket Bioskop ===");

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            int jumlahTiket = input.nextInt();


            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif.");
                continue; 
            }

            double hargaTotal = jumlahTiket * HARGA_TIKET;
            double diskon = 0;


            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }


            hargaTotal -= hargaTotal * diskon;

     
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTotal;

            System.out.println("Diskon yang didapat: " + (diskon * 100) + "%");
            System.out.println("Total harga untuk pelanggan ini: Rp " + hargaTotal);

            System.out.print("Apakah ada pelanggan lain? (ya/tidak): ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("ya"));
        System.out.println("Terima kasih telah menggunakan layanan kami.");
        System.out.println();

        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        input.close();
    }
}
