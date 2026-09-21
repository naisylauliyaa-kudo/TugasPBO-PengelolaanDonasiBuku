/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Buku {
    private int idBuku;
    private String judul;
    private String penulis;
    private String kategori;
    private String kondisi;

    public Buku(int idBuku, String judul, String penulis, String kategori, String kondisi) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.kondisi = kondisi;
    }

    // Getter
    public int getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public String getKondisi() {
        return kondisi;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void tampilkanData() {
        System.out.println("ID Buku   : " + idBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Kategori  : " + kategori);
        System.out.println("Kondisi    : " + kondisi);
    }
}
    
