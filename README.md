# Tugas PBO Sistem Pengelolaan Donasi Buku

Naisyla Auliya Rahmi Putri  
Kelas: B  
NIM: 2509116078

## 1. Deskripsi Singkat Program 
Sistem Inventaris Laboratorium adalah program sederhana berbasis Java yang digunakan untuk mengelola data alat dan mencatat peminjaman serta pengembalian alat di laboratorium, seperti mikroskop, tabung reaksi, dan alat praktikum lainnya. Setiap alat memiliki tiga informasi utama, yaitu ID alat, nama alat, dan jumlah alat. Program ini menggunakan *package* yang terpisah agar kode lebih teratur.
Program memiliki enam menu utama, yaitu Tambah Data Alat, Lihat Data Alat, Ubah Data Alat, Hapus Data Alat, Peminjaman dan Pengembalian, serta Keluar. Pengguna dapat menambah, melihat, mengubah, dan menghapus data alat. Pengguna juga dapat mencatat peminjaman dan pengembalian berdasarkan ID alat yang sudah terdaftar.
Program ini menerapkan konsep Pemrograman Berorientasi Objek (PBO) dan menggunakan *ArrayList* untuk menyimpan data selama program berjalan. Validasi input digunakan untuk mencegah data yang tidak sesuai, seperti jumlah alat yang negatif atau nama alat yang kosong. Data yang dimasukkan hanya bersifat sementara dan akan hilang ketika program ditutup.

---
## 2. Tujuan Program
Program ini dibuat untuk memenuhi tugas mini project Pemrograman Berorientasi Objek dengan menerapkan pengelolaan data serta pencatatan transaksi pada sistem donasi buku. Tujuan dari program ini adalah:
- Memudahkan pencatatan data donatur, penerima, dan buku secara terstruktur.
- Menampilkan daftar lengkap data donatur, penerima, buku, serta riwayat transaksi donasi yang telah dimasukkan ke dalam sistem.
- Menghubungkan data donatur dan buku melalui fitur pencatatan donasi yang interaktif.
- Menerapkan mekanisme validasi input yang ketat untuk menjaga kualitas data, seperti mencegah kesalahan tipe data angka, penolakan teks kosong, serta validasi khusus format nomor telepon.
- Mengelola penyimpanan data sementara selama aplikasi berjalan dengan memanfaatkan konsep ArrayList pada Pemrograman Berorientasi Objek.

---
## 3. Struktur Program
Program ini terdiri dari beberapa class yang digunakan untuk menjalankan sistem pengelolaan donasi buku.
| No. | Class | Fungsi |
|---|---|---|
| 1 | `com.mycompany.pengeloladonasibuku.PengelolaDonasiBuku.java` | Menjalankan program utama (main), menampilkan menu navigasi, menerima input pengguna dengan validasi lengkap, serta mengatur alur fitur aplikasi. |
| 2 | `model.Pengguna.java` | Menjadi kelas induk (*parent class*) yang menyimpan atribut dasar umum untuk pengguna sistem seperti ID dan nama. |
| 3 | `model.Donatur.java` | Merupakan kelas turunan (*subclass*) dari Pengguna yang merepresentasikan data donatur beserta atribut nomor telepon dan alamat. |
| 4 | `model.Penerima.java` | Merupakan kelas turunan (*subclass*) dari Pengguna yang merepresentasikan data penerima bantuan beserta informasi kebutuhan buku. |
| 5 | `model.Buku.java` | Membuat objek buku yang menyimpan atribut ID buku, judul, penulis, kategori, dan kondisi buku. |
| 6 | `model.Donasi.java` | Menyimpan data transaksi donasi yang menghubungkan antara data donatur, buku yang didonasikan, jumlah buku, serta tanggal donasi. |

---
## 4. Hubungan Antarclass
Class PengelolaDonasiBuku menerima input dari pengguna dan mengelola objek-objek model (Donatur, Penerima, Buku, dan Donasi) yang disimpan menggunakan ArrayList.
PengelolaDonasiBuku
```text
├── Source Packages
│   ├── com.mycompany.pengeloladonasibuku
│   │   └── PengelolaDonasiBuku.java
│   └── model
│       ├── Buku.java
│       ├── Donasi.java
│       ├── Donatur.java
│       ├── Penerima.java
│       └── Pengguna.java
├── Test Packages
├── Dependencies
├── Java Dependencies
└── Project Files
```
---
## 5. Menu Program
```text
========================================
       SISTEM PENGELOLAAN DONASI BUKU
========================================
1. Kelola Data Donatur
2. Kelola Data Penerima
3. Kelola Data Buku
4. Catat Donasi
5. Lihat Data Donasi
6. Keluar
========================================
```
### 1. Kelola Data Donatur
Digunakan untuk mengelola data donatur. Pengguna dapat memilih opsi untuk menambahkan data donatur baru (mengisi ID, nama, nomor telepon dengan validasi khusus, dan alamat) serta melihat daftar donatur yang telah terdaftar.
### 2. Kelola Data Penerima
Digunakan untuk mengelola data penerima bantuan. Pengguna dapat menambah data penerima baru (mengisi ID, nama, nomor telepon, dan kebutuhan buku) serta menampilkan seluruh data penerima yang tersimpan.
### 3. Kelola Data Buku
Digunakan untuk mengelola inventaris buku. Pengguna dapat menambahkan data buku baru (mengisi ID buku, judul, penulis, kategori, dan kondisi buku) serta menampilkan daftar buku yang tersedia.
### 4. Catat Donasi
Digunakan untuk merekam transaksi donasi baru. Pengguna memasukkan ID donasi, memilih ID donatur dan ID buku yang tersedia, mengisi jumlah buku, serta memasukkan tanggal donasi dengan sistem validasi input yang aman.
### 5. Lihat Data Donasi
Digunakan untuk menampilkan seluruh rekapitulasi data transaksi donasi yang telah berhasil dicatat dan disimpan di dalam ArrayList.
### 6. Keluar
Digunakan untuk menghentikan program dan keluar dari aplikasi.

---
## 6. Konsep PBO dan Kegunaan Kode
| No. | Konsep PBO | Penerapan dalam Program | Kegunaan |
|---|---|---|---|
| 1 | Class dan Object | `Pengguna`, `Donatur`, `Penerima`, `Buku`, dan `Donasi` | Membuat data entitas pengguna, inventaris buku, dan transaksi sebagai object yang berbeda berdasarkan input pengguna. |
| 2 | Inheritance (Pewarisan) | `Donatur extends Pengguna` dan `Penerima extends Pengguna` | Atribut dasar seperti ID pengguna, nama, dan nomor telepon cukup dibuat sekali di class induk `Pengguna`, lalu diwarisi oleh donatur dan penerima. |
| 3 | Encapsulation | Atribut dibuat `private` dan diakses melalui getter atau setter | Mengatur cara data dibaca dan diubah dengan aman dari class lain tanpa mengubah nilai aslinya secara langsung. |
| 4 | Hubungan antar-object | Class `Donasi` menyimpan object `Donatur` dan `Buku` | Menunjukkan transaksi donasi tertentu dilakukan oleh donatur siapa dan menyumbangkan buku apa. |

### Kegunaan Beberapa Bagian Kode
- super(idPengguna, nama, noTelepon): Mengirim ID, nama, dan nomor telepon dari constructor Donatur atau Penerima ke constructor Pengguna.
- Method Getter & Setter: Seperti getNama(), getAlamat(), setKebutuhanBuku(), dan lainnya, digunakan untuk membaca serta memodifikasi data entitas di dalam sistem.
- Overriding: Digunakan pada method tampilkanData() di class Donatur dan Penerima untuk menyesuaikan format cetak informasi atribut spesifik masing-masing.
- ArrayList: Program menggunakan ArrayList untuk menyimpan daftar donatur, penerima, buku, dan riwayat transaksi donasi selama aplikasi berjalan.
- Validasi Input: Memeriksa kelengkapan data (mencegah input kosong), mencegah kesalahan tipe data angka, serta memvalidasi format nomor telepon pada setiap form interaktif.

### 1. Class dan Object
Program menggunakan class untuk menggambarkan entitas di dalam sistem donasi buku. Contohnya, class Donatur dan Penerima dipakai untuk membuat object baru berdasarkan input dari pengguna.
```java
Donatur donatur = new Donatur(idPengguna, nama, noTelepon, alamat);
```
Kode tersebut digunakan untuk merepresentasikan satu data donatur lengkap beserta atribut spesifiknya setelah diinput melalui menu aplikasi.

### 2. Inheritance (Pewarisan)
Donatur dan Penerima adalah class turunan dari class induk Pengguna.
```java
public class Donatur extends Pengguna {
    private String alamat;
}

public class Penerima extends Pengguna {
    private String kebutuhanBuku;
}
```
Kata kunci extends Pengguna berarti donatur dan penerima mewarisi atribut dasar seperti ID pengguna, nama, serta nomor telepon dari class Pengguna. Keduanya kemudian menambahkan atribut khusus masing-masing.  
```java
public Donatur(int idPengguna, String nama, String noTelepon, String alamat) {
    super(idPengguna, nama, noTelepon);
    this.alamat = alamat;
}
```
Penggunaan super(idPengguna, nama, noTelepon) mengirim ID, nama, dan nomor telepon ke constructor Pengguna, sehingga kode untuk mengisi data utama tersebut tidak perlu ditulis ulang.

### 3. Encapsulation
Atribut pada class dibuat private, sehingga data terlindungi dan tidak bisa diubah langsung secara sembarangan dari luar class.
```java
private String alamat;
private String kebutuhanBuku;
}
```
Data dibaca melalui getter dan diubah melalui setter. Contohnya:
```java
public String getAlamat() {
    return alamat;
}
public void setAlamat(String alamat) {
    this.alamat = alamat;
}
```
Method getter digunakan untuk membaca data, sedangkan method setter digunakan saat memodifikasi atribut entitas di dalam sistem.

### 4. Hubungan antar-object dalam Transaksi Donasi
Satu object Donasi menyimpan referensi ke object Donatur dan Buku yang terlibat dalam transaksi.
```java
private Donatur donatur;
private Buku buku;
```
Saat proses pencatatan donasi berhasil dilakukan, program membuat object transaksi baru yang merangkum data-data tersebut:

```java
Donasi donasi = new Donasi(idDonasi, donatur, buku, jumlah, tanggalDonasi);
```
Dengan begitu, program dapat menampilkan informasi detail mengenai siapa donatur yang menyumbangkan buku tertentu pada rekapitulasi data donasi.

### 5. Penyimpanan Data dengan ArrayList
Sistem mengelola banyak data donatur, penerima, buku, dan transaksi menggunakan struktur data ArrayList.

```java
private ArrayList<Donatur> daftarDonatur = new ArrayList<>();
private ArrayList<Buku> daftarBuku = new ArrayList<>();
private ArrayList<Donasi> daftarDonasi = new ArrayList<>();
```
Saat data baru berhasil diinput melalui menu interaktif, object tersebut langsung dimasukkan ke dalam list:

```java
public void tambahDonatur(Donatur donatur) {
    daftarDonatur.add(donatur);
}
```
Seluruh data di dalam ArrayList ini hanya bersifat sementara selama program berjalan dan akan hilang ketika aplikasi ditutup.  

### 6. Validasi Input Pengguna
Setiap form input dilengkapi dengan mekanisme validasi ketat untuk memastikan kualitas data yang masuk.  

```java
if (input.isEmpty()) {
    System.out.println("Input tidak boleh kosong. Silakan coba lagi.");
}
```
Logika validasi ini diterapkan di seluruh menu untuk mencegah kesalahan tipe data angka, penolakan string kosong, serta pengecekan format nomor telepon yang sesuai sebelum data berhasil disimpan ke sistem.  

---
## 7. Demo Program
### 1. Kelola Data Donatur
<img width="337" height="293" alt="image" src="https://github.com/user-attachments/assets/c32cae97-c47d-4ea4-bead-d9a7f9ef63ad" />

Pada bagian ini, pengguna memilih **Menu 1 (Kelola Data Donatur)** dari menu utama. Sistem kemudian mengarahkan pengguna ke sub-menu donatur yang berisi pilihan **Tambah Donatur**, **Lihat Donatur**, dan **Kembali**.  

<img width="351" height="150" alt="image" src="https://github.com/user-attachments/assets/11423548-f0a6-42db-b620-c4d841945199" />

Pada bagian ini, pengguna memasukkan data donatur baru dengan mengisi informasi yang diminta oleh sistem sesuai dengan alur program. Setelah seluruh data diisi dengan benar, sistem berhasil menambahkan data donatur ke dalam sistem.  

<img width="569" height="244" alt="image" src="https://github.com/user-attachments/assets/effe3db3-486b-420f-93d3-25f38463ac39" />

Program juga menerapkan mekanisme validasi input untuk memastikan data donatur yang dimasukkan sesuai dengan ketentuan yang telah ditentukan. Ketika pengguna melakukan kesalahan dalam memasukkan data, sistem akan mendeteksi kesalahan tersebut dan menampilkan pesan peringatan. Misalnya, jika pengguna memasukkan **ID donatur dengan format yang tidak sesuai**, mengisi **nomor telepon dengan data yang tidak sesuai**, atau membiarkan **data yang wajib diisi kosong**, sistem akan meminta pengguna untuk memasukkan data kembali. Proses ini akan terus dilakukan sampai seluruh data yang dimasukkan sudah sesuai dan dapat disimpan ke dalam sistem.  

<img width="318" height="282" alt="image" src="https://github.com/user-attachments/assets/a70cfa9b-4679-4249-895c-6fe88586ed08" />

Tangkapan layar di atas menunjukkan tampilan antarmuka saat pengguna memilih menu Lihat Donatur, yang berfungsi untuk menampilkan seluruh daftar data donatur yang telah berhasil disimpan di dalam sistem.  


<img width="348" height="295" alt="image" src="https://github.com/user-attachments/assets/8758f46a-f787-4efa-8c69-efb2800d1511" />

Pada bagian ini, pengguna memilih opsi **Kembali** untuk keluar dari menu yang sedang digunakan. Setelah dipilih, sistem secara otomatis mengarahkan pengguna kembali ke **menu utama aplikasi**, sehingga pengguna dapat memilih menu lainnya sesuai kebutuhan.  

---
### 2. Kelola Data Penerima
<img width="346" height="130" alt="image" src="https://github.com/user-attachments/assets/dc1e38b5-eebd-4128-9253-5395ecbce766" />

Pada bagian ini, pengguna memilih **Menu 2 (Kelola Data Penerima)** dari menu utama. Sistem kemudian mengarahkan pengguna ke sub-menu penerima yang berisi pilihan **Tambah Penerima**, **Lihat Penerima**, dan **Kembali**.

<img width="339" height="141" alt="image" src="https://github.com/user-attachments/assets/d646c0fe-b76d-4dfe-b3fa-2a3bb36d7182" />

Pada bagian ini, pengguna melakukan pengisian data penerima baru melalui Menu Tambah Penerima. Pengguna memasukkan informasi penerima sesuai dengan data yang diminta oleh sistem. Setelah seluruh data diisi dengan benar, sistem akan menyimpan data tersebut dan menampilkan pesan bahwa data penerima berhasil ditambahkan ke dalam sistem.  

<img width="569" height="318" alt="image" src="https://github.com/user-attachments/assets/0bd4ce15-ca63-4395-8446-595c20e99dac" />

Pada bagian ini, fitur **Tambah Penerima** juga menerapkan validasi input sebelum data disimpan ke dalam sistem. Validasi dilakukan untuk memastikan setiap data yang dimasukkan sesuai dengan ketentuan. Jika pengguna memasukkan data yang tidak sesuai atau terdapat data yang kosong, sistem akan menampilkan pesan peringatan dan meminta pengguna memasukkan data kembali. Setelah seluruh data dinyatakan valid, data penerima dapat disimpan ke dalam sistem.  

<img width="353" height="245" alt="image" src="https://github.com/user-attachments/assets/e7a591b6-4f02-4c21-8283-e2fcf3baeeaf" />

Pada bagian ini, pengguna memilih opsi **Lihat Penerima**, yang berfungsi untuk menampilkan seluruh daftar data penerima buku yang telah berhasil disimpan di dalam sistem.  

<img width="339" height="309" alt="image" src="https://github.com/user-attachments/assets/01bf5eca-4489-4204-98f9-8353a0799617" />

Pada bagian ini, pengguna memilih opsi **Kembali** pada sub-menu penerima. Setelah dipilih, sistem secara otomatis mengarahkan pengguna kembali ke **menu utama**, sehingga pengguna dapat memilih menu lainnya.  

---

### 3. Kelola Data Buku

<img width="325" height="289" alt="image" src="https://github.com/user-attachments/assets/4000ced4-63e7-4651-9874-2d481aba9310" />

Pada bagian ini, pengguna memilih **Menu 3 (Kelola Data Buku)** dari menu utama. Sistem kemudian mengarahkan pengguna ke sub-menu buku yang berisi pilihan **Tambah Buku**, **Lihat Buku**, dan **Kembali**.  

<img width="337" height="160" alt="image" src="https://github.com/user-attachments/assets/4ee5bbdf-933c-473d-941b-3efba4a8a3a8" />

Pada bagian ini, pengguna melakukan pengisian data buku baru melalui **Menu Tambah Buku**. Pengguna memasukkan informasi buku sesuai dengan data yang diminta oleh sistem. Setelah seluruh data diisi dengan benar, sistem akan menyimpan data tersebut dan menampilkan pesan konfirmasi bahwa **data buku berhasil ditambahkan ke dalam sistem**.  

<img width="363" height="216" alt="image" src="https://github.com/user-attachments/assets/fa10c1a1-0b91-44db-a4da-8625a5cdc352" />

Pada bagian ini, **Menu Tambah Buku** juga telah menerapkan validasi input pada setiap data yang dimasukkan. Jika pengguna membiarkan data kosong atau memasukkan data yang tidak sesuai dengan ketentuan, sistem akan menolak input tersebut dan menampilkan pesan peringatan. Pengguna kemudian diminta untuk mengisi kembali data sampai sesuai dengan ketentuan sebelum data dapat disimpan ke dalam sistem.  

<img width="359" height="268" alt="image" src="https://github.com/user-attachments/assets/5b1c9770-98ea-4282-9202-f1ba240922ed" />

Pada bagian ini, pengguna memilih opsi **Lihat Buku**, yang berfungsi untuk menampilkan seluruh daftar data buku yang telah berhasil disimpan di dalam sistem. Data yang ditampilkan merupakan buku-buku yang sudah terdaftar dan dapat dilihat oleh pengguna.  

<img width="342" height="301" alt="image" src="https://github.com/user-attachments/assets/5b0ad608-7a5a-4c49-9d71-3820589aca3d" />

Pada bagian ini, pengguna memilih opsi **Kembali** pada sub-menu penerima. Setelah dipilih, sistem secara otomatis mengarahkan pengguna kembali ke **menu utama**, sehingga pengguna dapat memilih menu lainnya.  

---
### 4. Catat Donasi

<img width="331" height="346" alt="image" src="https://github.com/user-attachments/assets/07300016-2201-4c85-844b-4b7287437eba" />

Pada bagian ini, pengguna memilih **Menu 4 (Catat Donasi)** dari menu utama. Sistem kemudian menampilkan data donatur dan buku yang sudah terdaftar. Pengguna diminta memasukkan **ID Donatur, ID Buku, jumlah buku, dan tanggal donasi**. Setelah data yang dimasukkan sesuai, sistem akan menyimpan transaksi dan menampilkan pesan bahwa **donasi berhasil dicatat**.

---
### 5. Lihat Data Donasi

<img width="369" height="276" alt="image" src="https://github.com/user-attachments/assets/8c703953-dad8-4aec-8224-f7bd6c9bac1d" />

Pada bagian ini, pengguna memilih **Menu 5 (Lihat Data Donasi)** dari menu utama untuk melihat data donasi yang telah dicatat sebelumnya. Sistem kemudian menampilkan seluruh daftar riwayat transaksi donasi yang tersimpan di dalam sistem. Informasi yang ditampilkan meliputi **ID donasi, nama donatur, judul buku, jumlah buku, dan tanggal donasi**. Dengan adanya menu ini, pengguna dapat melihat dan memeriksa kembali data donasi yang sudah tercatat dengan lebih mudah.  

---
### 6. Keluar

<img width="528" height="341" alt="image" src="https://github.com/user-attachments/assets/03c5f5c7-22d1-4949-97f1-d660860667b4" />

Pada bagian ini, pengguna memilih **Menu 6 (Keluar)** pada menu utama. Setelah opsi tersebut dipilih, sistem akan menampilkan pesan **“Terima kasih telah menggunakan sistem”** sebagai pesan penutup. Selanjutnya, program akan mengakhiri proses dan keluar dari sistem.  





















