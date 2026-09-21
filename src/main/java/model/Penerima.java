/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */

public class Penerima extends Pengguna {
    private String kebutuhanBuku;

    public Penerima(int idPengguna, String nama, String noTelepon, String kebutuhanBuku) {
        super(idPengguna, nama, noTelepon);
        this.kebutuhanBuku = kebutuhanBuku;
    }

    // Getter
    public String getKebutuhanBuku() {
        return kebutuhanBuku;
    }

    // Setter
    public void setKebutuhanBuku(String kebutuhanBuku) {
        this.kebutuhanBuku = kebutuhanBuku;
    }

    @Override
    public void tampilkanData() {
        System.out.println("ID             : " + getIdPengguna());
        System.out.println("Nama           : " + getNama());
        System.out.println("No. Telepon    : " + getNoTelepon());
        System.out.println("Kebutuhan Buku : " + kebutuhanBuku);
    }
}
    

