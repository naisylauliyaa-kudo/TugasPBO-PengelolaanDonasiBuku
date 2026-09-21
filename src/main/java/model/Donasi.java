/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class Donasi {
    private int idDonasi;
    private Donatur donatur;
    private Buku buku;
    private int jumlah;
    private String tanggalDonasi;

    public Donasi(int idDonasi, Donatur donatur, Buku buku, int jumlah, String tanggalDonasi) {
        this.idDonasi = idDonasi;
        this.donatur = donatur;
        this.buku = buku;
        this.jumlah = jumlah;
        this.tanggalDonasi = tanggalDonasi;
    }

    // Getter
    public int getIdDonasi() {
        return idDonasi;
    }

    public Donatur getDonatur() {
        return donatur;
    }

    public Buku getBuku() {
        return buku;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getTanggalDonasi() {
        return tanggalDonasi;
    }

    // Setter
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTanggalDonasi(String tanggalDonasi) {
        this.tanggalDonasi = tanggalDonasi;
    }

    public void tampilkanData() {
        System.out.println("ID Donasi      : " + idDonasi);
        System.out.println("Donatur        : " + donatur.getNama());
        System.out.println("Buku           : " + buku.getJudul());
        System.out.println("Jumlah         : " + jumlah);
        System.out.println("Tanggal Donasi : " + tanggalDonasi);
    }
}
