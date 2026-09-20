# 🖨️ Sistem Manajemen Percetakan

> Program sederhana berbasis Java untuk membantu mengelola produk dan perhitungan biaya pada usaha percetakan.

---

## 👨‍🎓 Identitas Mahasiswa

| Keterangan | Data |
|---|---|
| **Nama** | [Ahmad Fajar Novia] |
| **NIM** | [Ahmad Fajar Novia] |
| **Mata Kuliah** | Pemrograman Berorientasi Objek |

---

## 📌 Deskripsi Studi Kasus

Usaha percetakan merupakan usaha yang menyediakan berbagai layanan cetak untuk memenuhi kebutuhan pelanggan, seperti mencetak poster, brosur, dan produk cetak lainnya. Dalam prosesnya, pengelolaan data produk dan perhitungan biaya cetak perlu dilakukan dengan baik agar tidak terjadi kesalahan dalam pencatatan maupun penentuan harga.

Berdasarkan permasalahan tersebut, dibuat **Sistem Manajemen Percetakan** berbasis Java dengan tampilan konsol. Sistem ini digunakan untuk mengelola data produk percetakan dan membantu proses perhitungan biaya cetak.

---

## 🎯 Tujuan

Program ini dibuat dengan tujuan:

- Membantu mengelola data produk percetakan.
- Mempermudah proses penambahan, perubahan, dan penghapusan data.
- Membantu menghitung biaya cetak berdasarkan produk dan jumlah cetakan.
- Menerapkan konsep Pemrograman Berorientasi Objek menggunakan bahasa Java.

---

## ⚙️ Fitur Program

| No | Fitur | Keterangan |
|---|---|---|
| 1 | Tampilkan Produk | Menampilkan seluruh produk yang tersedia |
| 2 | Tambah Poster | Menambahkan data produk Poster |
| 3 | Tambah Brosur | Menambahkan data produk Brosur |
| 4 | Update Produk | Mengubah nama dan harga produk |
| 5 | Hapus Produk | Menghapus produk berdasarkan ID |
| 6 | Hitung Biaya | Menghitung total biaya berdasarkan jumlah cetak |
| 7 | Keluar | Mengakhiri program |

---

## 📁 Struktur Project

    percetakan
    │
    ├── model
    │   ├── ProdukCetak.java
    │   ├── Poster.java
    │   ├── Brosur.java
    │   └── Percetakan.java
    │
    └── main
        └── main.java

---

## 🏗️ Diagram Kelas / Hierarki Class

                    ProdukCetak
                   /           \
                  /             \
             Poster             Brosur
                  
                  Percetakan
                       |
                      Main

**Keterangan:**

`ProdukCetak` merupakan superclass, sedangkan `Poster` dan `Brosur` merupakan subclass yang mewarisi sifat dan method dari `ProdukCetak`.

`Percetakan` digunakan untuk mengelola objek produk, sedangkan `Main` digunakan untuk menjalankan program.

---

## 🔗 Penerapan Inheritance

Inheritance diterapkan dengan menjadikan `ProdukCetak` sebagai superclass dan `Poster` serta `Brosur` sebagai subclass.

Pada class `Poster` digunakan:

    public class Poster extends ProdukCetak

Sedangkan pada class `Brosur` digunakan:

    public class Brosur extends ProdukCetak

Kata `extends` menunjukkan bahwa class `Poster` dan `Brosur` mewarisi atribut dan method dari class `ProdukCetak`.

Selain atribut yang diwarisi, masing-masing subclass memiliki atribut tambahan:

- **Poster** → `ukuran`
- **Brosur** → `jumlahHalaman`

Dengan inheritance, atribut dan method yang sama tidak perlu ditulis ulang pada setiap class turunan.

---

## 🧠 Konsep Pemrograman Berorientasi Objek

### 🔹 1. Class dan Object

Class digunakan sebagai rancangan dari objek yang akan digunakan dalam program. Contohnya adalah class `ProdukCetak`, `Poster`, `Brosur`, dan `Percetakan`.

Object kemudian dibuat berdasarkan class tersebut, misalnya object `Poster` dan `Brosur`.

### 🔹 2. Encapsulation

Encapsulation diterapkan dengan membuat atribut menggunakan access modifier `private`.

Contohnya:

    private String namaProduk;
    private double hargaPerLembar;

Data tersebut tidak diakses secara langsung dari luar class, tetapi melalui method seperti getter dan setter.

### 🔹 3. Constructor

Constructor digunakan untuk memberikan nilai awal ketika sebuah object dibuat.

Contohnya:

    public Poster(String idProduk, String namaProduk, double hargaPerLembar, String ukuran)

Constructor membantu memberikan data awal yang dibutuhkan ketika object dibuat.

### 🔹 4. Inheritance

Inheritance diterapkan pada class `Poster` dan `Brosur` yang mewarisi class `ProdukCetak`.

    Poster extends ProdukCetak
    Brosur extends ProdukCetak

### 🔹 5. Polymorphism

Polymorphism diterapkan melalui method `tampilkanInfo()` yang terdapat pada class `ProdukCetak` kemudian dioverride pada class `Poster` dan `Brosur`.

Dengan demikian, masing-masing jenis produk dapat menampilkan informasi tambahan yang berbeda.

### 🔹 6. ArrayList

`ArrayList` digunakan pada class `Percetakan` untuk menyimpan daftar produk.

Contohnya:

    ArrayList<ProdukCetak> daftarProduk;

Karena tipe data yang digunakan adalah `ProdukCetak`, object `Poster` dan `Brosur` dapat disimpan dalam satu daftar.

### 🔹 7. CRUD

Program menerapkan proses pengelolaan data atau CRUD:

- **Create** → menambahkan produk
- **Read** → menampilkan produk
- **Update** → mengubah data produk
- **Delete** → menghapus produk

---

## 🔄 Alur Program

Alur program dimulai dari menu utama. Pengguna memilih fitur yang ingin digunakan, kemudian program menjalankan proses sesuai pilihan.

                         ┌─────────────┐
                         │    MULAI    │
                         └──────┬──────┘
                                ↓
                       ┌─────────────────┐
                       │   MENU UTAMA    │
                       └────────┬────────┘
                                ↓
                       ┌─────────────────┐
                       │   PILIH MENU    │
                       └────────┬────────┘
                                ↓
             ┌──────────────────┼──────────────────┐
             ↓                  ↓                  ↓
       Tampilkan            Tambah             Update/
        Produk          Poster / Brosur          Hapus
             │                  │                  │
             └──────────────────┼──────────────────┘
                                ↓
                       Hitung Biaya Cetak
                                ↓
                         Kembali ke Menu
                                │
                                ↓
                              Keluar
                                ↓
                         ┌─────────────┐
                         │   SELESAI   │
                         └─────────────┘

Program akan terus berjalan dan kembali ke menu utama selama pengguna belum memilih menu **Keluar**.

---

## 📸 Screenshot Program Saat Running

### 1. Menu Utama

<img width="403" height="444" alt="image" src="https://github.com/user-attachments/assets/d6306ad0-9768-4476-8481-ca36ee5412a3" />

Menu ini digunakan untuk melihat seluruh data produk percetakan yang tersimpan. Informasi yang ditampilkan meliputi ID produk, nama produk, harga per lembar, serta informasi tambahan sesuai jenis produk.

### 2. Tampilan Data Produk

<img width="412" height="396" alt="image" src="https://github.com/user-attachments/assets/02abf3fd-5188-42d5-b08a-afced378e43b" />

Menu ini digunakan untuk menambahkan produk Poster ke dalam daftar. Pengguna memasukkan ID produk, nama poster, harga per lembar, dan ukuran poster.

### 3. Tambah Produk

<img width="419" height="412" alt="image" src="https://github.com/user-attachments/assets/bb7e766c-7382-4700-8e46-3e834bb438e8" />

Menu ini digunakan untuk menambahkan produk Brosur. Pengguna memasukkan ID produk, nama brosur, harga per lembar, dan jumlah halaman.

### 4. Update Produk

<img width="414" height="555" alt="image" src="https://github.com/user-attachments/assets/9634be3c-46fb-4d44-b4f8-927cc0e5ae0a" />

Menu ini digunakan untuk mengubah data produk yang sudah tersimpan. Pengguna memasukkan ID produk yang ingin diubah, kemudian memasukkan nama dan harga baru.

### 5. Hapus Produk

<img width="359" height="343" alt="image" src="https://github.com/user-attachments/assets/bb67eba0-dd72-435d-af8c-1beb30e7e02e" />

Menu ini digunakan untuk menghapus produk berdasarkan ID. Jika ID ditemukan, data produk akan dihapus dari daftar.

### 6. Perhitungan Biaya Cetak

<img width="412" height="473" alt="image" src="https://github.com/user-attachments/assets/f778f71c-b19d-47b7-83fe-3a3be155e5c0" />

Menu ini digunakan untuk menghitung total biaya cetak. Pengguna memasukkan ID produk dan jumlah cetakan, kemudian sistem menghitung total berdasarkan harga per lembar.

### 7. Keluar

<img width="353" height="279" alt="image" src="https://github.com/user-attachments/assets/4c0c3d1b-84ec-4fb5-8e1a-16264714a71c" />

Menu ini digunakan untuk mengakhiri program. Setelah memilih menu ini, program akan berhenti dan menampilkan pesan bahwa program telah selesai.

