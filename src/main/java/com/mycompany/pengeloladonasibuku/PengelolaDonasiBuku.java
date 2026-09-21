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

    // --- FUNGSI VALIDASI INPUT ---

    // 1. Validasi untuk input berupa Angka (Integer) agar tidak crash jika diisi huruf
    public static int inputAngka(String pesan) {
        int hasil = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(pesan);
            if (input.hasNextInt()) {
                hasil = input.nextInt();
                valid = true;
            } else {
                System.out.println(" Input harus berupa angka. Silakan coba lagi.");
            }
            input.nextLine(); // membersihkan buffer
        }
        return hasil;
    }

    // 2. Validasi untuk input Teks (String) agar tidak boleh kosong
    public static String inputTeks(String pesan) {
        String hasil = "";
        boolean valid = false;
        while (!valid) {
            System.out.print(pesan);
            hasil = input.nextLine().trim();
            if (hasil.isEmpty()) {
                System.out.println(" Input tidak boleh kosong. Silakan coba lagi.");
            } else {
                valid = true;
            }
        }
        return hasil;
    }

    // 3. Validasi khusus untuk No. Telepon (hanya boleh angka dan simbol nomor)
    public static String inputNoTelepon(String pesan) {
        String hasil = "";
        boolean valid = false;
        while (!valid) {
            System.out.print(pesan);
            hasil = input.nextLine().trim();
            
            if (hasil.isEmpty()) {
                System.out.println("❌ Nomor telepon tidak boleh kosong");
            } else if (!hasil.matches("^[0-9+\\-\\s()]+$")) {
                System.out.println("❌ Nomor telepon hanya boleh berisi angka dan simbol nomor. Silakan coba lagi.");
            } else {
                valid = true;
            }
        }
        return hasil;
    }

    // -----------------------------

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
            
            pilihan = inputAngka("Pilih menu: ");

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
            
            pilihan = inputAngka("Pilih menu: ");

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

        int id = inputAngka("ID Donatur    : ");
        String nama = inputTeks("Nama          : ");
        String noTelepon = inputNoTelepon("No. Telepon   : "); // Sudah pakai validasi khusus angka/simbol telepon
        String alamat = inputTeks("Alamat        : ");

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
            
            pilihan = inputAngka("Pilih menu: ");

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

        int id = inputAngka("ID Penerima       : ");
        String nama = inputTeks("Nama              : ");
        String noTelepon = inputNoTelepon("No. Telepon       : "); // Sudah pakai validasi khusus angka/simbol telepon
        String kebutuhan = inputTeks("Kebutuhan Buku    : ");

        Penerima penerima = new Penerima(id, nama, noTelepon, kebutuhan);
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
            
            pilihan = inputAngka("Pilih menu: ");

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

        int id = inputAngka("ID Buku      : ");
        String judul = inputTeks("Judul        : ");
        String penulis = inputTeks("Penulis      : ");
        String kategori = inputTeks("Kategori     : ");
        String kondisi = inputTeks("Kondisi      : ");

        Buku buku = new Buku(id, judul, penulis, kategori, kondisi);
        daftarBuku.add(buku);

        System.out.println("\nData buku berhasil ditambahkan!");
    }

    public static void tampilkanBuku() {
        System.out.println("\n ^-^ ========== DATA BUKU ========== ^-^");

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

        int idDonasi = inputAngka("ID Donasi      : ");

        System.out.println("\n--- Pilih Donatur ---");
        for (Donatur donatur : daftarDonatur) {
            System.out.println(donatur.getIdPengguna() + ". " + donatur.getNama());
        }

        int idDonatur = inputAngka("Masukkan ID Donatur: ");
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
            System.out.println(buku.getIdBuku() + ". " + buku.getJudul());
        }

        int idBuku = inputAngka("Masukkan ID Buku: ");
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

        int jumlah = inputAngka("Jumlah Buku   : ");
        String tanggal = inputTeks("Tanggal Donasi: ");

        Donasi donasi = new Donasi(idDonasi, donaturDipilih, bukuDipilih, jumlah, tanggal);
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