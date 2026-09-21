/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */

public class Pengguna {
    private int idPengguna;
    private String nama;
    private String noTelepon;

    public Pengguna(int idPengguna, String nama, String noTelepon) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.noTelepon = noTelepon;
    }

    // Getter
    public int getIdPengguna() {
        return idPengguna;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void tampilkanData() {
        System.out.println("ID          : " + idPengguna);
        System.out.println("Nama        : " + nama);
        System.out.println("No. Telepon : " + noTelepon);
    }
}
    
