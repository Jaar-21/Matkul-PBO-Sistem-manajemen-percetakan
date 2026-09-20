/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */

public class Poster extends ProdukCetak {
    private String ukuran;

    public Poster(String idProduk, String namaProduk, double hargaPerLembar, String ukuran) {
        super(idProduk, namaProduk, hargaPerLembar);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis           : Poster");
        System.out.println("Ukuran          : " + ukuran);
    }
}
