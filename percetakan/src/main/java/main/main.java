/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import model.Percetakan;
import model.ProdukCetak;
import model.Poster;
import model.Brosur;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Percetakan percetakan = new Percetakan();

        int pilihan;

        do {
            System.out.println("\n================================");
            System.out.println("   SISTEM MANAJEMEN PERCETAKAN");
            System.out.println("================================");
            System.out.println("1. Tampilkan Produk");
            System.out.println("2. Tambah Poster");
            System.out.println("3. Tambah Brosur");
            System.out.println("4. Update Produk");
            System.out.println("5. Hapus Produk");
            System.out.println("6. Hitung Biaya Cetak");
            System.out.println("7. Keluar");
            System.out.println("================================");

            System.out.print("Pilih menu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1:
                    percetakan.tampilkanProduk();
                    break;

                case 2:
                    System.out.println("\n===== TAMBAH POSTER =====");

                    System.out.print("ID Produk : ");
                    String idPoster = scanner.nextLine();

                    if (percetakan.cariProduk(idPoster) != null) {
                        System.out.println("ID produk sudah digunakan.");
                        break;
                    }

                    System.out.print("Nama Poster : ");
                    String namaPoster = scanner.nextLine();

                    System.out.print("Harga per lembar : ");
                    double hargaPoster = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Ukuran : ");
                    String ukuran = scanner.nextLine();

                    Poster poster = new Poster(
                            idPoster,
                            namaPoster,
                            hargaPoster,
                            ukuran
                    );

                    percetakan.tambahProduk(poster);
                    break;

                case 3:
                    System.out.println("\n===== TAMBAH BROSUR =====");

                    System.out.print("ID Produk : ");
                    String idBrosur = scanner.nextLine();

                    if (percetakan.cariProduk(idBrosur) != null) {
                        System.out.println("ID produk sudah digunakan.");
                        break;
                    }

                    System.out.print("Nama Brosur : ");
                    String namaBrosur = scanner.nextLine();

                    System.out.print("Harga per lembar : ");
                    double hargaBrosur = scanner.nextDouble();

                    System.out.print("Jumlah halaman : ");
                    int halaman = scanner.nextInt();
                    scanner.nextLine();

                    Brosur brosur = new Brosur(idBrosur, namaBrosur, hargaBrosur, halaman);

                    percetakan.tambahProduk(brosur);
                    break;

                case 4:
                    System.out.println("\n===== UPDATE PRODUK =====");

                    System.out.print("Masukkan ID Produk : ");
                    String idUpdate = scanner.nextLine();

                    if (percetakan.cariProduk(idUpdate) == null) {
                        System.out.println("Produk tidak ditemukan.");
                        break;
                    }

                    System.out.print("Nama baru : ");
                    String namaBaru = scanner.nextLine();

                    System.out.print("Harga baru : ");
                    double hargaBaru = scanner.nextDouble();
                    scanner.nextLine();

                    percetakan.updateProduk(
                            idUpdate,
                            namaBaru,
                            hargaBaru
                    );

                    System.out.println("Produk berhasil diupdate.");
                    break;

                case 5:
                    System.out.println("\n===== HAPUS PRODUK =====");

                    System.out.print("Masukkan ID Produk : ");
                    String idHapus = scanner.nextLine();

                    if (percetakan.hapusProduk(idHapus)) {
                        System.out.println("Produk berhasil dihapus.");
                    } else {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;

                case 6:
                    System.out.println("\n===== HITUNG BIAYA CETAK =====");

                    System.out.print("Masukkan ID Produk : ");
                    String idHitung = scanner.nextLine();

                    System.out.print("Jumlah cetak : ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();

                    percetakan.hitungBiaya(idHitung, jumlah);
                    break;

                case 7:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia.");
            }

        } while (pilihan != 7);

        scanner.close();
    }
}
