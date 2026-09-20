/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */

public class ProdukCetak {
    private String idProduk;
    private String namaProduk;
    private double hargaPerLembar;

    public ProdukCetak(String idProduk, String namaProduk, double hargaPerLembar) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.hargaPerLembar = hargaPerLembar;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHargaPerLembar() {
        return hargaPerLembar;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHargaPerLembar(double hargaPerLembar) {
        this.hargaPerLembar = hargaPerLembar;
    }

    public void tampilkanInfo() {
        System.out.println("ID Produk       : " + idProduk);
        System.out.println("Nama Produk     : " + namaProduk);
        System.out.println("Harga/Lembar    : Rp" + hargaPerLembar);
    }
}