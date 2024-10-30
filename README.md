# Pemesanan Susu Segar

Aplikasi **Pemesanan Susu Segar** adalah sebuah aplikasi konsol berbasis Java yang memungkinkan pengguna untuk melakukan pemesanan susu segar dengan berbagai varian rasa, menghitung harga total setiap jenis susu yang dipesan, dan menampilkan ringkasan pesanan. Proyek ini telah di-refactor untuk modul 2, menambahkan fitur diskon dan pembulatan harga serta dokumentasi lengkap menggunakan JavaDoc.

## Fitur
- **Pemilihan Jenis Susu**: Mendukung tiga varian susu dengan harga berbeda:
    - Susu Murni - Rp 15.000 per liter
    - Susu Coklat - Rp 17.000 per liter
    - Susu Stroberi - Rp 18.000 per liter
- **Perhitungan Total Harga**: Menghitung total harga setiap jenis susu yang dipesan.
- **Diskon Otomatis**: Diskon 10% untuk total pembelian di atas Rp 50.000.
- **Pembulatan Harga**: Harga total akan dibulatkan ke nilai rupiah terdekat.
- **Ringkasan Pesanan**: Menampilkan rincian jumlah, harga setiap jenis susu, diskon yang diterapkan, dan total keseluruhan setelah diskon dan pembulatan.

## Prasyarat
- Java Development Kit (JDK) versi 8 atau lebih tinggi
- IDE seperti IntelliJ IDEA atau Eclipse untuk menjalankan proyek

## Petunjuk Instalasi dan Penggunaan

1. **Clone Repository**:
   ```bash
   git clone <URL_repository_Anda>
   cd PemesananSusuSegar
