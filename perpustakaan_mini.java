import java.io.*;

public class perpustakaan_mini {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] adminUsername = {"admin1", "superuser", "admin2", "admin3", "admin4"};
        String[] adminPassword = {"password123", "sipaling admin", "admin ke2", "admin magang", "admin resource"};

        // Tambahan untuk simpan data jurnal
        String[][] daftarJurnal = new String[100][4];
        int jurnalCount = 0;

        System.out.println(" =======================================");
        System.out.println(" ========== PERPUSTAKAAN MINI ==========");
        System.out.println(" =======================================");
        System.out.println();
        System.out.println("==== Silahkan login terlebih dahulu ====");
        System.out.print("username : ");
        String USERNAME = br.readLine();
        System.out.print("password : ");
        String PASSWORD = br.readLine();

        boolean isAdmin = false;

        for (int i = 0; i < adminUsername.length; i++) {
            if (adminUsername[i].equals(USERNAME) && adminPassword[i].equals(PASSWORD)) {
                isAdmin = true;
                break;
            }
        }

        if (isAdmin) {
            System.out.println("Selamat Anda berhasil LOGIN sebagi admin!");
            System.out.println("Selamat datang di perpustakaan mini, " + USERNAME + ":)");
            boolean isAdminLoggedIn = true;
            int MenuUtama, MenuDaftarBuku;
            do {
                System.out.println("========= ADMIN =========");
                System.out.println("1. Tambah Daftar Buku");
                System.out.println("2. Tambah Daftar jurnal");
                System.out.println("3. Tambah Daftar Novel");
                System.out.println("4. Tambah Daftar Komik");
                System.out.println("5. Masuk Sebagai USER");
                System.out.println("6. Keluar Program");
                System.out.print("Pilih Menu (1-6): ");
                MenuUtama = Integer.parseInt(br.readLine());

                switch (MenuUtama) {
                    case 1:
                        System.out.println("===== Pilih Tema Buku =====");
                        System.out.println("1. Buku Kesehatan");
                        System.out.println("2. Buku Bisnis & Kewirausahaan");
                        System.out.println("3. Buku Teknologi");
                        System.out.println("4. Buku Psikologi");
                        System.out.println("5. Buku Olahraga");
                        System.out.println("6. Buku Sejarah");
                        MenuDaftarBuku = Integer.parseInt(br.readLine());

                        System.out.println("===== Masukkan Data Buku =====");
                        System.out.print("Judul : "); String Judul = br.readLine();
                        System.out.print("Penulis : "); String Penulis = br.readLine();
                        System.out.print("Penerbit : "); String Penerbit = br.readLine();
                        System.out.print("Tanggal Terbit : "); String TanggalTerbit = br.readLine();
                        System.out.println("Data buku berhasil ditambahkan.");
                        break;

                    case 2:
                        System.out.println("========= Tambah Jurnal =========");
                        System.out.println("1. Jurnal Nasional");
                        System.out.println("2. Jurnal Pendidikan");
                        System.out.println("3. Jurnal Sains");
                        System.out.println("4. Jurnal Seni");
                        System.out.println("5. Jurnal Teknik");
                        System.out.println("6. Jurnal Hukum");

                        System.out.print("Judul: "); String judul = br.readLine();
                        System.out.print("Penulis: "); String penulis = br.readLine();
                        System.out.print("Penerbit: "); String penerbit = br.readLine();
                        System.out.print("Tanggal terbit: "); String tanggalterbit = br.readLine();

                        System.out.println("Data jurnal berhasil ditambahkan!\nKEMBALI KE HALAMAN UTAMA");
                        break;

                    case 3:
                        System.out.println("========= Tambah Novel =========");
                        System.out.println("1. Novel Fiksi");
                        System.out.println("2. Novel Non Fiksi");
                        System.out.println("Pilih jenis novel: ");
                        int jenisNovel = Integer.parseInt(br.readLine());




                        System.out.println("===== Masukkan Data Novel =====");
                        System.out.print("Judul Novel: "); String judulNovel = br.readLine();
                        System.out.print("Penulis Novel: "); String penulisNovel = br.readLine();
                        System.out.print("Penerbit Novel: "); String penerbitNovel = br.readLine();
                        System.out.print("Tahun Terbit Novel: "); String tahunTerbitNovel = br.readLine();
                        System.out.println("Novel " + judulNovel + " oleh " + penulisNovel + " pada tahun " + tahunTerbitNovel + " berhasil ditambahkan.");
                
                        break;

                    case 4:
                        System.out.println(" Tambah Komik");
                        System.out.println("Pilih jenis komik: ");
                        System.out.println("1. Komik Fantasi");
                        System.out.println("2. Komik Horor");
                        System.out.println("3. Komik Komedi");
                        System.out.println("4. Komik Percintaan");
                        System.out.println("5. Komik Petualangan");
                        
                        System.out.print("Judul Komik: "); String judulkomik = br.readLine();
                        System.out.print("Penulis: "); String penuliskomik = br.readLine();
                        System.out.print("Penerbit: "); String penerbitkomik = br.readLine();
                        System.out.print("Tahun Terbit: "); String tahunkomik = br.readLine();
                        System.out.println("Komik" + judulkomik + "oleh" + penuliskomik + tahunkomik + "Berhasil ditambahkan.");
                        break;

                    case 5:
                        System.out.println("Masuk sebagai USER");
                        System.out.print("Masukkan username: ");
                        String userUsername = br.readLine();
                        System.out.print("Masukkan password: ");
                        String userPassword = br.readLine();
                        if (userUsername.equals("user") && userPassword.equals("user123")) {
                            System.out.println("Login berhasil sebagai USER!");
                            isAdminLoggedIn = false;
                        } else {
                            System.out.println("Login gagal. Username atau password salah.");
                        }
                        break;

                    case 6:
                        System.out.println("Terima kasih telah menggunakan perpustakaan mini, sampai jumpa kembali.");
                        isAdminLoggedIn = false;
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            } while (MenuUtama != 6);
        } else {
            System.out.println("Anda berhasil LOGIN sebagai member!");
            int pilihan;
            do {
                System.out.println("========= MENU USER =========");
                System.out.println("1. Lihat Daftar Buku");
                System.out.println("2. Pinjam Buku");
                System.out.println("3. Kembalikan Buku");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                pilihan = Integer.parseInt(br.readLine());

                switch (pilihan) {
                    case 1:
                        System.out.println("Menampilkan daftar buku...");
                        break;
                    case 2:
                        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                        String pinjam = br.readLine();
                        System.out.println("Buku '" + pinjam + "' berhasil dipinjam.");
                        break;
                    case 3:
                        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                        String kembali = br.readLine();
                        System.out.println("Buku '" + kembali + "' berhasil dikembalikan.");
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan perpustakaan mini, sampai jumpa kembali.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 4);
        }

        br.close();
    }
}


