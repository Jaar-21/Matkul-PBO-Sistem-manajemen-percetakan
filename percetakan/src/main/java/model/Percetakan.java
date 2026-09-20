/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;

public class Percetakan {
    private ArrayList<ProdukCetak> daftarProduk;

    public Percetakan() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(ProdukCetak produk) {
        daftarProduk.add(produk);
        System.out.println("Produk berhasil ditambahkan.");
    }

    public void tampilkanProduk() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Belum ada produk.");
            return;
        }

        System.out.println("\n===== DAFTAR PRODUK =====");

        for (ProdukCetak produk : daftarProduk) {
            System.out.println("-------------------------");
            produk.tampilkanInfo();
        }
    }

    public ProdukCetak cariProduk(String id) {
        for (ProdukCetak produk : daftarProduk) {
            if (produk.getIdProduk().equalsIgnoreCase(id)) {
                return produk;
            }
        }

        return null;
    }

    public boolean hapusProduk(String id) {
        ProdukCetak produk = cariProduk(id);

        if (produk != null) {
            daftarProduk.remove(produk);
            return true;
        }

        return false;
    }

    public boolean updateProduk(String id, String nama, double harga) {
        ProdukCetak produk = cariProduk(id);

        if (produk != null) {
            produk.setNamaProduk(nama);
            produk.setHargaPerLembar(harga);
            return true;
        }

        return false;
    }

    public void hitungBiaya(String id, int jumlah) {
        ProdukCetak produk = cariProduk(id);

        if (produk != null) {
            double total = produk.getHargaPerLembar() * jumlah;

            System.out.println("\n===== TOTAL BIAYA =====");
            System.out.println("Produk       : " + produk.getNamaProduk());
            System.out.println("Harga/Lembar : Rp" + produk.getHargaPerLembar());
            System.out.println("Jumlah       : " + jumlah);
            System.out.println("Total        : Rp" + total);
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }
}