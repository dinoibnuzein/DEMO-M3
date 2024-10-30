import java.util.Scanner;

/**
 * Kelas PemesananSusuSegar merupakan aplikasi sederhana untuk melakukan pemesanan susu
 * dengan berbagai varian rasa, menghitung harga total setiap jenis susu yang dipesan,
 * dan menampilkan ringkasan pesanan.
 *
 * <p>Aplikasi ini memiliki 3 jenis susu dengan harga yang sudah ditentukan:
 * susu murni, susu coklat, dan susu stroberi. Pengguna dapat memasukkan jumlah
 * liter untuk setiap jenis susu yang ingin dipesan, dan program akan menghitung
 * total harga berdasarkan pesanan tersebut.</p>
 *
 * @author Author
 */
public class PemesananSusuSegar {

    /** Harga untuk susu murni per liter */
    private static final double HARGA_SUSU_MURNI = 15000;

    /** Harga untuk susu coklat per liter */
    private static final double HARGA_SUSU_COKLAT = 17000;

    /** Harga untuk susu stroberi per liter */
    private static final double HARGA_SUSU_STROBERI = 18000;

    /**
     * Metode utama untuk menjalankan aplikasi PemesananSusuSegar.
     *
     * <p>Metode ini meminta pengguna untuk memasukkan jumlah liter setiap
     * jenis susu yang ingin dipesan, lalu menghitung total harga per jenis susu
     * dan total keseluruhan. Setelah itu, ringkasan pesanan akan ditampilkan.</p>
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memanggil metode untuk pemesanan dan menghitung total
        int jumlahSusuMurni = ambilPesanan(input, "susu murni");
        int jumlahSusuCoklat = ambilPesanan(input, "susu coklat");
        int jumlahSusuStroberi = ambilPesanan(input, "susu stroberi");

        double totalHargaMurni = hitungTotalHarga(jumlahSusuMurni, HARGA_SUSU_MURNI);
        double totalHargaCoklat = hitungTotalHarga(jumlahSusuCoklat, HARGA_SUSU_COKLAT);
        double totalHargaStroberi = hitungTotalHarga(jumlahSusuStroberi, HARGA_SUSU_STROBERI);

        double totalSemua = totalHargaMurni + totalHargaCoklat + totalHargaStroberi;

        // Menampilkan ringkasan pesanan
        tampilkanRingkasan(jumlahSusuMurni, jumlahSusuCoklat, jumlahSusuStroberi,
                totalHargaMurni, totalHargaCoklat, totalHargaStroberi, totalSemua);

        input.close();
    }

    /**
     * Mengambil input jumlah liter susu dari pengguna untuk jenis susu tertentu.
     *
     * @param input Scanner untuk membaca input pengguna
     * @param jenisSusu nama jenis susu yang dipesan
     * @return jumlah liter susu yang dipesan oleh pengguna
     */
    private static int ambilPesanan(Scanner input, String jenisSusu) {
        System.out.print("Masukkan jumlah liter " + jenisSusu + " yang dipesan: ");
        return input.nextInt();
    }

    /**
     * Menghitung total harga untuk jenis susu berdasarkan jumlah liter yang dipesan.
     *
     * @param jumlah jumlah liter susu yang dipesan
     * @param hargaPerLiter harga per liter dari jenis susu yang dipesan
     * @return total harga untuk jenis susu yang dipesan
     */
    private static double hitungTotalHarga(int jumlah, double hargaPerLiter) {
        return jumlah * hargaPerLiter;
    }

    /**
     * Menampilkan ringkasan pesanan berdasarkan jumlah liter setiap jenis susu dan harga totalnya.
     *
     * <p>Metode ini menampilkan setiap pesanan susu, jumlah liter, harga per liter,
     * serta total harga masing-masing jenis susu. Selain itu, juga ditampilkan
     * total keseluruhan pesanan.</p>
     *
     * @param jumlahMurni jumlah liter susu murni yang dipesan
     * @param jumlahCoklat jumlah liter susu coklat yang dipesan
     * @param jumlahStroberi jumlah liter susu stroberi yang dipesan
     * @param totalMurni total harga susu murni yang dipesan
     * @param totalCoklat total harga susu coklat yang dipesan
     * @param totalStroberi total harga susu stroberi yang dipesan
     * @param totalSemua total keseluruhan harga semua pesanan
     */
    private static void tampilkanRingkasan(int jumlahMurni, int jumlahCoklat, int jumlahStroberi,
                                           double totalMurni, double totalCoklat, double totalStroberi, double totalSemua) {
        System.out.println("\n--- Ringkasan Pesanan Anda ---");
        System.out.printf("Susu Murni    : %d liter x Rp%.0f = Rp%.0f%n", jumlahMurni, HARGA_SUSU_MURNI, totalMurni);
        System.out.printf("Susu Coklat   : %d liter x Rp%.0f = Rp%.0f%n", jumlahCoklat, HARGA_SUSU_COKLAT, totalCoklat);
        System.out.printf("Susu Stroberi : %d liter x Rp%.0f = Rp%.0f%n", jumlahStroberi, HARGA_SUSU_STROBERI, totalStroberi);
        System.out.printf("Total harga semua pesanan: Rp%.0f%n", totalSemua);
        System.out.println("\nTerima kasih telah memesan di Toko Susu Segar!");
    }
}
/**
 * 
 */