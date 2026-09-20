/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */

public class Brosur extends ProdukCetak {
    private int jumlahHalaman;

    public Brosur(String idProduk, String namaProduk, double hargaPerLembar, int jumlahHalaman) {
        super(idProduk, namaProduk, hargaPerLembar);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis           : Brosur");
        System.out.println("Jumlah Halaman  : " + jumlahHalaman);
    }
}