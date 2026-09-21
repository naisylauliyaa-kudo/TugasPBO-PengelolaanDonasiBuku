package com.mycompany.pengeloladonasibuku;

import java.util.ArrayList;
import java.util.Scanner;

import model.Donatur;
import model.Penerima;
import model.Donasi;
import model.Buku;

public class PengelolaDonasiBuku {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Donatur> daftarDonatur = new ArrayList<>();
    static ArrayList<Penerima> daftarPenerima = new ArrayList<>();
    static ArrayList<Buku> daftarBuku = new ArrayList<>();
    static ArrayList<Donasi> daftarDonasi = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("       SISTEM PENGELOLAAN DONASI BUKU");
            System.out.println("========================================");
            System.out.println("1. Kelola Data Donatur");
            System.out.println("2. Kelola Data Penerima");
            System.out.println("3. Kelola Data Buku");
            System.out.println("4. Catat Donasi");
            System.out.println("5. Lihat Data Donasi");
            System.out.println("6. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    menuDonatur();
                    break;

                case 2:
                    menuPenerima();
                    break;

                case 3:
                    menuBuku();
                    break;

                case 4:
                    tambahDonasi();
                    break;

                case 5:
                    tampilkanDonasi();
                    break;

                case 6:
                    System.out.println("\nTerima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("\nPilihan tidak tersedia!");
            }

        } while (pilihan != 6);
    }

    // MENU DONATUR

    public static void menuDonatur() {

        int pilihan;

        do {
            System.out.println("\n ^-^ ========== MENU DONATUR ========== ^-^");
            System.out.println("1. Tambah Donatur");
            System.out.println("2. Lihat Donatur");
            System.out.println("3. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahDonatur();
                    break;

                case 2:
                    tampilkanDonatur();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 3);
    }

    public static void tambahDonatur() {

        System.out.println("\n ^-^ ========== TAMBAH DONATUR ========== ^-^");

        System.out.print("ID Donatur   : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Nama         : ");
        String nama = input.nextLine();

        System.out.print("No. Telepon  : ");
        String noTelepon = input.nextLine();

        System.out.print("Alamat       : ");
        String alamat = input.nextLine();

        Donatur donatur = new Donatur(id, nama, noTelepon, alamat);

        daftarDonatur.add(donatur);

        System.out.println("\nData donatur berhasil ditambahkan!");
    }

    public static void tampilkanDonatur() {

        System.out.println("\n ^-^ ========== DATA DONATUR ========== ^-^");

        if (daftarDonatur.isEmpty()) {
            System.out.println("Belum ada data donatur.");
            return;
        }

        for (Donatur donatur : daftarDonatur) {
            donatur.tampilkanData();
            System.out.println("----------------------------------");
        }
    }

    // MENU PENERIMA

    public static void menuPenerima() {

        int pilihan;

        do {
            System.out.println("\n ^-^ ========== MENU PENERIMA ========== ^-^");
            System.out.println("1. Tambah Penerima");
            System.out.println("2. Lihat Penerima");
            System.out.println("3. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPenerima();
                    break;

                case 2:
                    tampilkanPenerima();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 3);
    }

    public static void tambahPenerima() {

        System.out.println("\n ^-^ ========== TAMBAH PENERIMA ========== ^-^");

        System.out.print("ID Penerima       : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Nama              : ");
        String nama = input.nextLine();

        System.out.print("No. Telepon       : ");
        String noTelepon = input.nextLine();

        System.out.print("Kebutuhan Buku    : ");
        String kebutuhan = input.nextLine();

        Penerima penerima = new Penerima(
                id,
                nama,
                noTelepon,
                kebutuhan
        );

        daftarPenerima.add(penerima);

        System.out.println("\nData penerima berhasil ditambahkan!");
    }

    public static void tampilkanPenerima() {

        System.out.println("\n ^-^ ========== DATA PENERIMA ========== ^-^");

        if (daftarPenerima.isEmpty()) {
            System.out.println("Belum ada data penerima.");
            return;
        }

        for (Penerima penerima : daftarPenerima) {
            penerima.tampilkanData();
            System.out.println("----------------------------------");
        }
    }

    // MENU BUKU

    public static void menuBuku() {

        int pilihan;

        do {
            System.out.println("\n ^-^ ========== MENU BUKU ========== ^-^");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahBuku();
                    break;

                case 2:
                    tampilkanBuku();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 3);
    }

    public static void tambahBuku() {

        System.out.println("\n ^-^ ========== TAMBAH BUKU ========== ^-^");

        System.out.print("ID Buku      : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Judul        : ");
        String judul = input.nextLine();

        System.out.print("Penulis      : ");
        String penulis = input.nextLine();

        System.out.print("Kategori     : ");
        String kategori = input.nextLine();

        System.out.print("Kondisi      : ");
        String kondisi = input.nextLine();

        Buku buku = new Buku(
                id,
                judul,
                penulis,
                kategori,
                kondisi
        );

        daftarBuku.add(buku);

        System.out.println("\nData buku berhasil ditambahkan!");
    }

    public static void tampilkanBuku() {

        System.out.println("\n ^-^ ========== DATA BUKU ==========^-^");

        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada data buku.");
            return;
        }

        for (Buku buku : daftarBuku) {
            buku.tampilkanData();
            System.out.println("----------------------------------");
        }
    }

    // MENU DONASI

    public static void tambahDonasi() {

        System.out.println("\n ^-^ ========== CATAT DONASI ========== ^-^");

        if (daftarDonatur.isEmpty()) {
            System.out.println("Belum ada data donatur.");
            return;
        }

        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada data buku.");
            return;
        }

        System.out.print("ID Donasi      : ");
        int idDonasi = input.nextInt();

        System.out.println("\n--- Pilih Donatur ---");

        for (Donatur donatur : daftarDonatur) {
            System.out.println(
                    donatur.getIdPengguna()
                    + ". "
                    + donatur.getNama()
            );
        }

        System.out.print("Masukkan ID Donatur: ");
        int idDonatur = input.nextInt();

        Donatur donaturDipilih = null;

        for (Donatur donatur : daftarDonatur) {
            if (donatur.getIdPengguna() == idDonatur) {
                donaturDipilih = donatur;
                break;
            }
        }

        if (donaturDipilih == null) {
            System.out.println("Donatur tidak ditemukan!");
            return;
        }

        System.out.println("\n--- Pilih Buku ---");

        for (Buku buku : daftarBuku) {
            System.out.println(
                    buku.getIdBuku()
                    + ". "
                    + buku.getJudul()
            );
        }

        System.out.print("Masukkan ID Buku: ");
        int idBuku = input.nextInt();
        input.nextLine();

        Buku bukuDipilih = null;

        for (Buku buku : daftarBuku) {
            if (buku.getIdBuku() == idBuku) {
                bukuDipilih = buku;
                break;
            }
        }

        if (bukuDipilih == null) {
            System.out.println("Buku tidak ditemukan!");
            return;
        }

        System.out.print("Jumlah Buku   : ");
        int jumlah = input.nextInt();
        input.nextLine();

        System.out.print("Tanggal Donasi: ");
        String tanggal = input.nextLine();

        Donasi donasi = new Donasi(
                idDonasi,
                donaturDipilih,
                bukuDipilih,
                jumlah,
                tanggal
        );

        daftarDonasi.add(donasi);

        System.out.println("\nDonasi berhasil dicatat!");
    }

    public static void tampilkanDonasi() {

        System.out.println("\n ^-^ ========== DATA DONASI ========== ^-^");

        if (daftarDonasi.isEmpty()) {
            System.out.println("Belum ada data donasi.");
            return;
        }

        for (Donasi donasi : daftarDonasi) {
            donasi.tampilkanData();
            System.out.println("----------------------------------");
        }
    }
}
