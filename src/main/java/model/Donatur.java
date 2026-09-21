/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */

public class Donatur extends Pengguna {
    private String alamat;

    public Donatur(int idPengguna, String nama, String noTelepon, String alamat) {
        super(idPengguna, nama, noTelepon);
        this.alamat = alamat;
    }

    // Getter
    public String getAlamat() {
        return alamat;
    }

    // Setter
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public void tampilkanData() {
        System.out.println("ID          : " + getIdPengguna());
        System.out.println("Nama        : " + getNama());
        System.out.println("No. Telepon : " + getNoTelepon());
        System.out.println("Alamat      : " + alamat);
    }
}
