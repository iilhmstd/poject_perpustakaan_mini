import java.io.*;

public class perpustakaan_mega {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Tema dan sub-tema
        String[] tema = {"Daftar List Buku", "Daftar List Jurnal", "Daftar List Novel", "Daftar List Komik"};
        String[][] subTema = {
            {"Kesehatan", "Bisnis dan Kewirausahaan", "Teknologi", "Psikologi", "Olahraga", "Sejarah"}, // BUKU
            {"Nasional", "Pendidikan", "Sosial", "Seni", "Teknik", "Hukum"}, // JURNAL
            {"Fiksi", "Non Fiksi"}, // NOVEL
            {"Fantasy", "Horor", "Komedi", "Percintaan", "Petualangan"} // KOMIK ARYA LOVE JOKOWI by SABILUR
        };
        
        String[][] daftarBuku = new String[200][7];
        String[][] daftarJurnal = new String[500][7];    
        String[][] daftarNovel = new String[500][7];
        String[][] daftarKomik = new String[500][7];    

        int indexBuku = 0, indexJurnal = 0, indexNovel = 0, indexKomik = 0;
        
        // Riwayat peminjaman
        String[][] riwayatPeminjaman = new String[200][3];
        int indexPeminjaman = 0;
        
        // Menambahkan buku kesehatan
        daftarBuku[indexBuku++] = new String[]{"Kesehatan", "1. ", "Asuhan Neonatus Bayi dan Anak Balita", "Vivian Lanny", "Salemba Medika", "2010", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Kesehatan", "2. ", "Atlas Berwarna tiga Bahasa Anatomi Tubuh Manusia", "Syaifudin", "Salemba Medika", "2010", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Kesehatan", "3. ", "Dasar-Dasar Kesehatan Masyarakat", "Prof.dr.Azrul Azwar, MPH", "Rajagrafindo Persada", "1996", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Kesehatan", "4. ", "Gizi Seimbang dalam Kesehatan Reproduksi Remaja", "Dr.Ir. Hardiansyah, MS", "IPB Press", "2011", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Kesehatan", "5. ", "Buku Pintar Kesehatan", "Dr. Handrawan Nadesul", "PT Gramedia Pustaka Utama", "2012", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Kesehatan", "6. ", "Promosi Kesehatan dan Perilaku kesehatan", "Notoadmodjo, Soekidjo", "Rineka Cipta", "2012", "Tersedia"};
            
        // Menambahkan buku bisnis dan kewirausahaan
        daftarBuku[indexBuku++] = new String[]{"Bisnis dan Kewirausahaan", "1. ", "Manajemen Keuangan dan Kewirausahaan Sukses", "Shoffa Saifillah Alfaruq, Maheni Ika Sari, Moh Suardi", "Deepublish", "2019", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Bisnis dan Kewirausahaan", "2. ", "Manajemen kewirausahaan untuk proyek merdeka belajar", "Abdul Rahmat, Mira Mirnawati", "Zahir Publishing", "2022", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Bisnis dan Kewirausahaan", "3. ", "kewirausahaan: Teori dan Praktik", "Dr. Suryana", "Salemba Empat", "2013", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Bisnis dan Kewirausahaan", "4. ", "Bisnis dan Kewirausahaan (Keunggulan dalam Era Globalisasi)", "buchari Alma", "Alfabet Bandung", "2013", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Bisnis dan Kewirausahaan", "5. ", "Strategi Kewirausahaan: Membangun Keunggulan Kompetitif", "Dr. Veithzal,Fauzi Amir", "Rajawali Pers", "2014", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Bisnis dan Kewirausahaan", "6. ", "Startup: Cara Gila Membuka Usaha", "Yasa Singgih", "Pt Elex Media Komputindo", "2017", "Dipinjam"};
        
        // Menambahkan buku teknologi
        daftarBuku[indexBuku++] = new String[]{"Teknologi", "1. ", "Ensiklopedia Teknologi Komputer", "Mad", "Andi", "2019", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Teknologi", "2. ", "Teknologi Perbankan", "Nurastuti, Wiji", "Graha Ilmu", "2011", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Teknologi", "3. ", "Pengantar Teknologi Informasi", "Jogiyanto Hartono", "Andi Offset", "2005", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Teknologi", "4. ", "Teknologi Jaringan Komputer", "Onno W. Purbo", "Elex Media Komputindo", "2014", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Teknologi", "5. ", "Internet Of Things: Konsep & Implementasi", "Smail, Iwan Sofana", "Informatika Bandung", "2018", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Teknologi", "6. ", "Rekayasa Perangkat Lunak (Software Engineering)", "Pressman, Roger S.", "Mcgraw-Hill", "2010", "tersedia"};

        // Menambahkan buku psikologi
        daftarBuku[indexBuku++] = new String[]{"Psikologi", "1. ", "Psikologi Pendidikan Dalam Wahana Bermain Anak", "Jasa Ungguh Muliawan", "Gava Media", "2022", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Psikologi", "2. ", "Psikologi Sosial : Integrasi Pengetahuan Wahyu & Pengetahuan Empirik", "Agus Abdul Rahman", "Rajawali Pers", "2020", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Psikologi", "3. ", "Psikologi Umum", "Drs. Suryabrata Sumadi", "Rajagrafindo Persada", "2015", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Psikologi", "4. ", "Pengantar Psikologi", "Richard J. Gerrig dan Philip G. Zimbardo", "Pearson", "2010", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Psikologi", "5. ", "Teori-Teori Kepribadian", "Feist, J. dan Feist, G. J.", "Salemba Humanika", "2010", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Psikologi", "6. ", "Psikologi Pendidikan", "Drs. Slameto", "Bumi Aksara", "2010", "Dipinjam"};
        
        // Menambahkan buku olahraga
        daftarBuku[indexBuku++] = new String[]{"Olahraga", "1. ", "Kamus Pendidikan Jasmani, Olahraga & Kesehatan", "Agung Ttri Haryanta, Eko Sujatmiko", "Aksara Sinergi Media", "2012", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Olahraga", "2. ", "Sehat & Bugar Di Usia Emas: Ragam Olahraga di Usia 50-An", "Samekto Budi Pramono, Lidya Mayasari", "rapha publishing", "2011", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Olahraga", "3. ", "Ilmu Kepelatihan Olahraga", "Bompa, Tudor O.", "Rajagrafindo Persada", "2010", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Olahraga", "4. ", "Dasar-Dasar Teori dan Praktik Pendidikan Jasmani", "Drs. M. Sajoto", "Rineka Cipta", "1995", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Olahraga", "5. ", "Fisiologi Olahraga: Teori dan Aplikasi", "Prof. Dr. Nurhasan, M.Kes.", "UNESA University Press", "2005", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Olahraga", "6. ", "Latihan Fisik untuk Kebugaran Jasmani", "Drs. Agus Mukholid, M.Pd.", "Cakrawala Media", "2016", "Tersedia"};
    
        // Menambahkan buku sejarah
        daftarBuku[indexBuku++] = new String[]{"Sejarah", "1. ", "Sejarah Indonesia masa Hindu-Buddha", "SUWARDONO, Aditya Pratama", "Ombak", "2013", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Sejarah", "2. ", "Pengantar sejarah Indonesia baru sejarah pergerakan Nasional Sartono", "Kartodirjo, Sartono", "Gramedia Pustaka Utama", "1999", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Sejarah", "3. ", "Sejarah Indonesia Modern 1200–2008", "M.C. Ricklefs", "Serambi Ilmu Semesta", "2008", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Sejarah", "4. ", "Indonesia dalam Arus Sejarah (Jilid 1–9)", "Taufik Abdullah", "kompas", "2012", "Tersedia"};        
        daftarBuku[indexBuku++] = new String[]{"Sejarah", "5. ", "Sejarah Dunia yang Disembunyikan", "Jonathan Black", "alfabet", "2013", "Dipinjam"};        
        daftarBuku[indexBuku++] = new String[]{"Sejarah", "6. ", "Api Sejarah 1: Mahakarya Perjuangan Ulama dan Santri dalam Menegakkan Negara Kesatuan Republik Indonesia", "Prof. Dr. Ahmad Mansur Suryanegara", "Salamadani Pustaka Semesta", "2010", "Dipinjam"};
        
        // Jurnal Nasional
        daftarJurnal[indexJurnal++] = new String[]{"Nasional", "1. ", "Perkembangan Indeks Wakaf Nasional di Indonesia: Pendekatan AHP yang Kabur", "Yuliani Dwi Lestari, Raditya Sukmana, Mahfud Sholihin", "Heliyon", "2023", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Nasional", "2. ", "Peran Perilaku Seksual dalam Penularan HIV dan AIDS pada Remaja di Wilayah Pesisir", "Dewi Rokhmah Khoiron", "Procedia Ilmu Lingkungan", "2015", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Nasional", "3. ", "Jurnal Ilmu Politik dan Pemerintahan", "Setiawan", "Jurnal Ilmu Politik dan Pemerintahan", "2025", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Nasional", "4. ", "JAGADDHITA: Jurnal Kebhinnekaan dan Wawasan Kebangsaan", "Manalu", "Universitas Indraprasta (Unindra)", "2019", "Dipinjam"};
        daftarJurnal[indexJurnal++] = new String[]{"Nasional", "5. ", "Citizenship: Jurnal Pancasila dan Kewarganegaraan", "Prasetiyo, Kusumawati", "Jurnal Citizenship, Pancasila & Kewarganegaraan", "2020", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Nasional", "6. ", "Nasionalisme Kebangsaan sebagai Spirit Perjuangan Tokoh Pejuang di Lombok Timur 1945–1949", "Abdul Rasyad, Badarudin, Lalu Murdi, Jujuk Ferdianto", "Jurnal Pendidikan Sejarah, Universitas Negeri Jakarta", "2021", "Tersedia"};
        
        // Jurnal Pendidikan
        daftarJurnal[indexJurnal++] = new String[]{"Pendidikan", "1. ", "Perbedaan Gaya Belajar dan Keterampilan Berpikir Tingkat Tinggi di antara Mahasiswa Teknik", "M. H. YeeJ. Md., Yunos Mimi, Mohaffyza Mohamad", "Ilmu Sosial dan Perilaku", "2015", "Dipinjam"};
        daftarJurnal[indexJurnal++] = new String[]{"Pendidikan", "2. ", "Sikap dan Motivasi Pelajar Terhadap Pembelajaran Bahasa Melayu", "Zaliza Mohamad Nasir, Zaitul Azma Zainon Hamzah", "Ilmu Sosial dan Perilaku", "2014", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Pendidikan", "3. ", "Pengembangan Media Pembelajaran Berbasis Android pada Mata Pelajaran Matematika", "Ahmad Riyadi, Nurlela", "Universitas Negeri Malang", "2023", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Pendidikan", "4. ", "Penggunaan Model Problem Based Learning untuk Meningkatkan Kemampuan Berpikir Kritis Siswa", "Wulan Ayu Lestari, Dwi Agustina", "Universitas Pendidikan Indonesia", "2024", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Pendidikan", "5. ", "Penerapan Media Pembelajaran Interaktif untuk Meningkatkan Hasil Belajar IPA di Sekolah Dasar", "Andi Kurniawan, Siti Nurhaliza", "Universitas Negeri Surabaya", "2023", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Pendidikan", "6. ", "Integrasi Nilai Karakter dalam Pembelajaran di Era Merdeka Belajar", "Yuslina Dewi, Rahmat Hidayat", "Badan Penelitian dan Pengembangan Kemendikbud", "2022", "Dipinjam"};
        
        // Jurnal Sosial
        daftarJurnal[indexJurnal++] = new String[]{"Sosial", "1. ", "Menghormati Keragaman dalam Praktik Bimbingan Karir", "Amla Salleh", "Ilmu Sosial dan Perilaku", "2010", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Sosial", "2. ", "Praktik Etika Konsultan Pajak Berbasis Budaya Lokal", "I. Nyoman Darmayasa, Yuyung Rizka Aneswari", "Ilmu Sosial dan Perilaku", "2015", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Sosial", "3. ", "Transformasi Nilai Sosial dalam Keluarga pada Era Digital", "Andi Prasetyo, Dwi Lestari", "Universitas Sanata Dharma Yogyakarta", "2023", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Sosial", "4. ", "Perubahan Perilaku Masyarakat Perkotaan Pasca Pandemi COVID-19", "Rudi Hartono, Siti Maemunah", "Universitas Indonesia", "2023", "Dipinjam"};
        daftarJurnal[indexJurnal++] = new String[]{"Sosial", "5. ", "Partisipasi Pemuda dalam Kegiatan Sosial Politik di Era Milenial", "Budi Santoso, Nia Wulandari", "Universitas Airlangga", "2023", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Sosial", "6. ", "Pemberdayaan Masyarakat Melalui Program Bank Sampah di Lingkungan Perkotaan", "Rahmat Hidayat, Dewi Indah Sari", "UIN Sunan Kalijaga Yogyakarta", "2023", "Tersedia"};
        
        // Jurnal Seni
        daftarJurnal[indexJurnal++] = new String[]{"Seni", "1. ", "Journal of Visual Culture", "Marquard Smith", "SAGE Publications", "2002", "Dipinjam"};
        daftarJurnal[indexJurnal++] = new String[]{"Seni", "2. ", "Jenis Motif Bunga dan Pola Ukiran Kayu Melayu di Kelantan dan Terengganu", "Nursuriani Shaffee, Ismail Said", "Ilmu Sosial dan Perilaku", "2013", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Seni", "3. ", "Leonardo", "Frank Malina, Roger Malina", "International Society for the Arts, Sciences and Technology (MIT Press)", "1968", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Seni", "4. ", "Artibus Asiae", "Amy McNair", "Museum Rietberg, Zurich, Swiss", "1925", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Seni", "5. ", "PAJ: A Journal of Performance and Art", "Bonnie Marranca", "MIT Press", "1976", "Dipinjam"};
        daftarJurnal[indexJurnal++] = new String[]{"Seni", "6. ", "Visual Resources", "Barbara Pezzini", "Routledge", "1980", "Tersedia"};
        
        // Jurnal Teknik
        daftarJurnal[indexJurnal++] = new String[]{"Teknik", "1. ", "Pengembangan Aplikasi Seluler untuk Tunarungu untuk Belajar Lebih Baik", "Helena Angelie Margaretha, Hendriarto Yudhistya, Ayu Kusumawati, Rudi Yulio Arindiono", "Ilmu Komputer Procedia", "2024", "Dipinjam"};
        daftarJurnal[indexJurnal++] = new String[]{"Teknik", "2. ", "Studi Kelayakan Produksi Bioetanol dari Limbah Padat Tapioka untuk Memenuhi Permintaan Nasional Biofuel", "Ruri Agung Wahyuono, Muhammad Naufal Hakim, Surya Alam Santoso", "Prosedur Energi", "2015", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Teknik", "3. ", "Empirical Software Engineering", "Robert Feldt, Thomas Zimmermann", "Springer", "1996", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Teknik", "4. ", "Acta Astronautica", "Rock Jeng‑Shing Chern", "Elsevier", "1955", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Teknik", "5. ", "Alexandria Engineering Journal", "Ayman Abdel‑Khalik", "Elsevier", "2000", "Dipinjam"};
        daftarJurnal[indexJurnal++] = new String[]{"Teknik", "6. ", "Progress in Aerospace Sciences", "K. J. Badcock, M. F. Platzer", "Elsevier", "1961", "Tersedia"};
        
        // Jurnal Hukum
        daftarJurnal[indexJurnal++] = new String[]{"Hukum", "1. ", "Penangkapan Ikan Ilegal Mengancam Keberlanjutan Komoditas Tuna di Masa Depan di Indonesia", "Alexander M. A., Khan Ming-guo Jiang, Buntora Pasaribu", "Kebijakan Kelautan", "2024", "Dipinjam"};
        daftarJurnal[indexJurnal++] = new String[]{"Hukum", "2. ", "Adat Istiadat dan Kekerasan dalam Konflik Lahan yang Berkepanjangan di Indonesia", "Laurens Bakker", "Ilmu Sosial & Humaniora Terbuka", "2023", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Hukum", "3. ", "Jurnal Hukum IUS QUIA IUSTUM", "Lailatul Husna, Fitriani", "Fakultas Hukum Universitas Islam Indonesia", "2024", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Hukum", "4. ", "Jurnal Hukum & Pembangunan", "Riska Amalia, Andi Hamzah", "Fakultas Hukum Universitas Indonesia", "2023", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Hukum", "5. ", "Jurnal Rechts Vinding: Media Pembinaan Hukum Nasional", "Diah Sulistyowati", "Badan Pembinaan Hukum Nasional Kementerian Hukum dan HAM RI", "2023", "Tersedia"};
        daftarJurnal[indexJurnal++] = new String[]{"Hukum", "6. ", "Jurnal Hukum PRIORIS", "Budi Santoso, Lina Mardiana", "Universitas Sriwijaya", "2023", "Dipinjam"};

        // Menambahkan novel fiksi
        daftarNovel[indexNovel++] = new String[]{"Fiksi", "1. ","perempuan batih", "A.R. Rizal", "laksana", "2018", "Tersedia"};        
        daftarNovel[indexNovel++] = new String[]{"Fiksi", "2. ","petualangan don quixote", "miguel de cervantes", "immortal publisher", "2017", "Tersedia"};        
        daftarNovel[indexNovel++] = new String[]{"Fiksi", "3. ","laut bercerita", "leila s.chudori", "gramedia", "2017", "Dipinjam"};        
        daftarNovel[indexNovel++] = new String[]{"Fiksi", "4. ","bumi", "tereliye", "gramedia pustaka utama", "2014", "Dipinjam"};        
        daftarNovel[indexNovel++] = new String[]{"Fiksi", "5. ","negeri 5 menara", "Ahmad fuadi", "gramedia pustaka utama", "2009", "Tersedia"};        
        daftarNovel[indexNovel++] = new String[]{"Fiksi", "6. ","perahu kertas", "dee lestari", "bentang pustaka", "2009", "Tersedia"};
        
        // Menambahkan novel non fiksi
        daftarNovel[indexNovel++] = new String[]{"Non Fiksi", "1. Biografi Pahlawan Nasional: Dewi Sartika", "Hanugrah R.M.", "Silda Impika", "2024", "Dipinjam"};
        daftarNovel[indexNovel++] = new String[]{"Non Fiksi", "2. Menjadi Istri Bahagia dan Membahagiakan Keluarga", "Jumriyah, M.Pd.I.", "Silda Impika", "2024", "Tersedia"};    
        daftarNovel[indexNovel++] = new String[]{"Non Fiksi", "3. Filosofi Teras: Filsafat Yunani-Romawi Kuno untuk Mental Tangguh Masa Kini", "Henry Manampiring", "Kompas Gramedia", "2018", "Tersedia"};
        daftarNovel[indexNovel++] = new String[]{"Non Fiksi", "4. Atomic Habits: Perubahan Kecil yang Memberikan Hasil Luar Biasa", "James Clear", "Gramedia Pustaka Utama", "2021", "Tersedia"};        
        daftarNovel[indexNovel++] = new String[]{"Non Fiksi", "5. Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "Harper", "2015", "Tersedia"};        
        daftarNovel[indexNovel++] = new String[]{"Non Fiksi", "6. How to Win Friends and Influence People", "Dale Carnegie", "Simon & Schuster", "1936", "Dipinjam"};

        // Komik Fantasy    
        daftarKomik[indexKomik++] = new String[]{"Fantasy", "1. ", "Perang Opium (The Poppy War)", "R.F. Kuang", "Gramedia Pustaka Utama", "2019", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Fantasy", "2. ", "Laut Bercerita", "Leila S. Chudori", "Kepustakaan Populer Gramedia", "2017", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Fantasy", "3. ", "Magi: The Labyrinth of Magic", "Shinobu Ohtaka", "Shogakukan", "2009", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Fantasy", "4. ", "The Promised Neverland", "Kaiu Shirai", "Shueisha", "2016", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Fantasy", "5. ", "Fairy Tail", "Hiro Mashima", "Kodansha", "2006", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Fantasy", "6. ", "Black Clover", "Yuki Tabata", "Shueisha", "2015", "Tersedia"};
        
        // Komik Horor
        daftarKomik[indexKomik++] = new String[]{"Horor", "1. ", "Samex: Sawarga Malapetaka", "Risa Saraswati", "Kawah Media", "2022", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Horor", "2. ", "Hilang dalam Dekapan Semeru", "Fajar Aditya", "Elex Media Komputindo", "2022", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Horor", "3. ", "Uzumaki", "Junji Ito", "Shogakukan", "1998", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Horor", "4. ", "Tomie", "Junji Ito", "Asahi Sonorama", "1987", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Horor", "5. ", "Bastard", "Carnby Kim", "Naver Webtoon", "2014", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Horor", "6. ", "Homunculus", "Hideo Yamamoto", "Shogakukan", "2003", "Dipinjam"};
        
        // Komik Komedi
        daftarKomik[indexKomik++] = new String[]{"Komedi", "1. ", "TEGUH SRIMULAT: Berpacu dalam Komedi dan Melodi", "Herry Gendut Janarto", "Gramedia Pustaka Utama", "2023", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Komedi", "2. ", "Martin & Friends", "Vernando Altamirano", "Bumi Aksara", "2025", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Komedi", "3. ", "One Punch Man", "ONE", "Shueisha", "2012", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Komedi", "4. ", "Gintama", "Hideaki Sorachi", "Shueisha", "2003", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Komedi", "5. ", "SKET Dance", "Kenta Shinohara", "Shueisha", "2007", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Komedi", "6. ", "Doraemon", "Fujiko F. Fujio", "Shogakukan", "1969", "Tersedia"};
        
        // Komik Percintaan
        daftarKomik[indexKomik++] = new String[]{"Percintaan", "1. ", "Alaska: Kenangan Manis Cinta Pertama", "Amanda Ferina", "m&c!", "2025", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Percintaan", "2. ", "Ao Haru Ride", "Io Sakisaka", "Shueisha", "2011", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Percintaan", "3. ", "Boys Over Flowers (Hana Yori Dango)", "Yoko Kamio", "Shueisha", "1992", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Percintaan", "4. ", "Fruits Basket", "Natsuki Takaya", "Hakusensha", "1998", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Percintaan", "5. ", "A Silent Voice (Koe no Katachi)", "Yoshitoki Oima", "Kodansha", "2013", "Dipinjam"};
        
        // Komik Petualangan
        daftarKomik[indexKomik++] = new String[]{"Petualangan", "1. ", "Petualangan Tintin: Bintang Misterius", "Herge", "Gramedia Pustaka Utama", "2014", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Petualangan", "2. ", "Asterix - Perjalanan Keliling Galia (Classic Edition)", "Uderzo & Goscinny", "Elex Media Komputindo", "2020", "Tersedia"};
        daftarKomik[indexKomik++] = new String[]{"Petualangan", "3. ", "Hunter x Hunter", "Yoshihiro Togashi", "Shueisha", "1998", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Petualangan", "4. ", "Fullmetal Alchemist", "Hiromu Arakawa", "Square Enix", "2001", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Petualangan", "5. ", "Conan: Detective Conan (Case Closed)", "Gosho Aoyama", "Shogakukan", "1994", "Dipinjam"};
        daftarKomik[indexKomik++] = new String[]{"Petualangan", "6. ", "One Piece", "Eiichiro Oda", "Shueisha", "1997", "Dipinjam"};

        String adminUser   = "admin";
        String adminPass = "admin123";

        boolean jalan = true;
        while (jalan) {
            System.out.println("========== Selamat Datang di Perpustakaan Jokowi ==========");
            System.out.print("Perpustakaan Cyber Media hadir sebagai ruang belajar yang hidup,");
            System.out.println("tempat berkumpulnya ide, imajinasi, dan inovasi.");
            System.out.println("Kami percaya bahwa teknologi dan literasi harus berjalan berdampingan.");
            System.out.println("Karena buku adalah jembatan menuju masa depan.");

            System.out.println("\n=== HALAMAN UTAMA ===");
            System.out.println("1. Masuk sebagai Admin");
            System.out.println("2. Masuk sebagai User");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            String pilihan = input.readLine();

            switch (pilihan) {
                case "1":
                // Verifikasi untuk masuk ke menu admin
                System.out.print("Masukkan username: ");
                String username = input.readLine();
                System.out.print("Masukkan password: ");
                String password = input.readLine();
                if (username.equals(adminUser ) && password.equals(adminPass)) {
                    System.out.println("Selamat datang, Admin Arya:) Anda telah berhasil masuk ke menu admin.");

                    // Menu Admin
                    boolean adminMenu = true;
                    while (adminMenu) {
                        System.out.println("\n=== MENU ADMIN ===");
                        System.out.println("1. Tambah Daftar Buku");
                        System.out.println("2. Tambah Daftar Jurnal");
                        System.out.println("3. Tambah Daftar Novel");
                        System.out.println("4. Tambah Daftar Komik");
                        System.out.println("5. Lihat Status Tersedia/di pinjam");
                        System.out.println("6. Keluar dari Menu Admin");
                        System.out.print("Pilih opsi: ");
                        String adminChoice = input.readLine();
                        
                        switch (adminChoice) {
                            case "1": 
                                System.out.print("Masukkan kategori: ");
                                String kategoriBuku = input.readLine();
                                System.out.print("Masukkan judul: ");
                                String judulBuku = input.readLine();
                                System.out.print("Masukkan pengarang: ");
                                String pengarangBuku = input.readLine();
                                System.out.print("Masukkan penerbit: ");
                                String penerbitBuku = input.readLine();
                                System.out.print("Masukkan tahun terbit: ");
                                String tahunBuku = input.readLine();

                                // Menambahkan buku ke daftarBuku
                                daftarBuku[indexBuku++] = new String[]{kategoriBuku,"7. ", judulBuku, pengarangBuku, penerbitBuku, tahunBuku, "Tersedia"};
                                System.out.println("Buku berhasil ditambahkan!");
                               
                                break;
                                
                            case "2":
                                System.out.print("Masukkan kategori: ");
                                String kategoriJurnal = input.readLine();
                                System.out.print("Masukkan judul: ");
                                String judulJurnal = input.readLine();
                                System.out.print("Masukkan pengarang: ");
                                String pengarangJurnal = input.readLine();
                                System.out.print("Masukkan penerbit: ");
                                String penerbitJurnal= input.readLine();
                                System.out.print("Masukkan tahun terbit: ");
                                String tahunJurnal = input.readLine();
    
                             
                                break;
                                
                            case "3":
                                System.out.print("Masukkan kategori: ");
                                String kategoriNovel = input.readLine();
                                System.out.print("Masukkan judul: ");
                                String judulNovel = input.readLine();
                                System.out.print("Masukkan pengarang: ");
                                String pengarangNovel = input.readLine();
                                System.out.print("Masukkan penerbit: ");
                                String penerbitNovel= input.readLine();
                                System.out.print("Masukkan tahun terbit: ");
                                String tahunNovel = input.readLine();
    
                                
                                break;
                                
                            case "4":
                                System.out.print("Masukkan kategori: ");
                                String kategoriKomik = input.readLine();
                                System.out.print("Masukkan judul: ");
                                String judulKomik = input.readLine();
                                System.out.print("Masukkan pengarang: ");
                                String pengarangKomik = input.readLine();
                                System.out.print("Masukkan penerbit: ");
                                String penerbitKomik= input.readLine();
                                System.out.print("Masukkan tahun terbit: ");
                                String tahunKomik = input.readLine();
    
                                 
                                break;
                            case "5" : //NANTI GUA MAU NAMBAHIN INI KALO SEMPET, KALO GA SEMPET GUA SESUAI FLOWCHART AJA  
                                       
                            case "6":
                                adminMenu = false;
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        }
                    }
                } else {
                    System.out.println("Username atau password salah.");
                  }
                    break;

                case "2":
                    // Menu User
                    boolean userMenu = true;
                    while (userMenu) {
                        System.out.println("\n=== TAMPILAN MENU USER ===");
                        System.out.println("1. Kategori");
                        System.out.println("2. Cari");
                        System.out.println("3. Peminjaman");
                        System.out.println("4. Pengembalian");
                        System.out.println("5. Riwayat Pengembalian");
                        System.out.println("6. Keluar dari Menu User");
                        System.out.print("Pilih opsi: ");
                        String userPilihan = input.readLine();
                        
                        switch (userPilihan) {
                            case "1":
                                // Implementasi kategori
                                System.out.println("\n=== Daftar Kategori ===");
                                for (int i = 0; i < tema.length; i++) {
                                     System.out.println((i + 1) + ". " + tema[i]);
                                }   
                                System.out.print("Pilih kategori: ");
                                int kategoriPilihan = Integer.parseInt(input.readLine()) - 1;

                                if (kategoriPilihan >= 0 && kategoriPilihan < tema.length) {
                                    System.out.println("\n=== " + tema[kategoriPilihan] + " ===");
                                    for (int j = 0; j < subTema[kategoriPilihan].length; j++) {
                                        System.out.println((j + 1) + ". " + subTema[kategoriPilihan][j]);
                                    }
                                    System.out.print("Pilih Tema: ");
                                    int subTemaPilihan = Integer.parseInt(input.readLine()) - 1;

                                    if (subTemaPilihan >= 0 && subTemaPilihan < subTema[kategoriPilihan].length) {
                                        // Disini untuk mengubah pesan berdasarkan kategori yang dipilih
                                        String daftarTitle = "";
                                        switch (kategoriPilihan) {
                                            case 0: // BUKU
                                                daftarTitle = "Daftar Buku di Tema ";
                                                break;
                                            case 1: // JURNAL
                                                daftarTitle = "Daftar Jurnal di Tema ";
                                                break;
                                            case 2: // NOVEL
                                                daftarTitle = "Daftar Novel di Tema ";
                                                break;
                                            case 3: // KOMIK
                                                daftarTitle = "Daftar Komik di Tema ";
                                                break;
                                        }
                                        System.out.println("\n=== " + daftarTitle + subTema[kategoriPilihan][subTemaPilihan] + " ===");

                                        switch (kategoriPilihan) {
                                            case 0: // Variabel Kategori Piliham BUKU
                                                for (int k = 0; k < indexBuku; k++) {
                                                    if (daftarBuku[k][0].equals(subTema[kategoriPilihan][subTemaPilihan])) {
                                                        System.out.println(daftarBuku[k][1] + daftarBuku[k][2]);
                                                    }
                                                } 
                                                break;
                                            case 1: // Variabel Kategori Pilihan JURNAL
                                                for (int k = 0; k < indexJurnal; k++) {
                                                    if (daftarJurnal[k][0].equals(subTema[kategoriPilihan][subTemaPilihan])) {
                                                        System.out.println(daftarJurnal[k][1] + daftarJurnal[k][2]);
                                                    }
                                                }
                                                break;
                                            case 2: // Variabel Kategori Pilihan NOVEL
                                                for (int k = 0; k < indexNovel; k++) {
                                                    if (daftarNovel[k][0].equals(subTema[kategoriPilihan][subTemaPilihan])) {
                                                        System.out.println(daftarNovel[k][1] + daftarNovel[k][2]);
                                                    }
                                                }
                                                break;
                                            case 3: // Variabel Kategori Pilihan KOMIK
                                                for (int k = 0; k < indexKomik; k++) {
                                                    if (daftarKomik[k][0].equals(subTema[kategoriPilihan][subTemaPilihan])) {
                                                        System.out.println(daftarKomik[k][1] + daftarKomik[k][2]);
                                                    }
                                                }
                                                break;
                                            default:
                                                System.out.println("Tema tidak valid.");
                                        }

                                        // untuk menampilkan judul buku terlebih dahulu
                                        System.out.print("\nPilih nomor untuk melihat detail: "); 
                                        int detailPilihan = Integer.parseInt(input.readLine()) - 1;

                                        // ini menampilkan detail berdasarkan pilihan
                                        if (kategoriPilihan == 0 && detailPilihan >= 0 && detailPilihan < indexBuku) {
                                            System.out.println("\n=== Detail Buku ===");
                                            System.out.println("Judul: " + daftarBuku[detailPilihan][2]);
                                            System.out.println("Pengarang: " + daftarBuku[detailPilihan][3]);
                                            System.out.println("Penerbit: " + daftarBuku[detailPilihan][4]);
                                            System.out.println("Tahun Terbit: " + daftarBuku[detailPilihan][5]);
                                            System.out.println("Status: " + daftarBuku[detailPilihan][6]);
                                        } else if (kategoriPilihan == 1 && detailPilihan >= 0 && detailPilihan < indexJurnal) {
                                            System.out.println("\n=== Detail Jurnal ===");
                                            System.out.println("Judul: " + daftarJurnal[detailPilihan][2]);
                                            System.out.println("Pengarang: " + daftarJurnal[detailPilihan][3]);
                                            System.out.println("Penerbit: " + daftarJurnal[detailPilihan][4]); 
                                            System.out.println("Tahun Terbit: " + daftarJurnal[detailPilihan][5]);
                                            System.out.println("Status: " + daftarJurnal[detailPilihan][6]);
                                        } else if (kategoriPilihan == 2 && detailPilihan >= 0 && detailPilihan < indexNovel) {
                                            System.out.println("\n=== Detail Novel ===");
                                            System.out.println("Judul: " + daftarNovel[detailPilihan][2]);
                                            System.out.println("Pengarang: " + daftarNovel[detailPilihan][3]);
                                            System.out.println("Penerbit: " + daftarNovel[detailPilihan][4]);
                                            System.out.println("Tahun Terbit: " + daftarNovel[detailPilihan][5]);
                                            System.out.println("Status: " + daftarNovel[detailPilihan][6]);
                                        } else if (kategoriPilihan == 3 && detailPilihan >= 0 && detailPilihan < indexKomik) {
                                            System.out.println("\n=== Detail Komik ===");
                                            System.out.println("Judul: " + daftarKomik[detailPilihan][2]);
                                            System.out.println("Pengarang: " + daftarKomik[detailPilihan][3]);
                                            System.out.println("Penerbit: " + daftarKomik[detailPilihan][4]);
                                            System.out.println("Tahun Terbit: " + daftarKomik[detailPilihan][5]);
                                            System.out.println("Status: " + daftarKomik[detailPilihan][6]);
                                        } else {
                                            System.out.println("Pilihan tidak valid.");
                                        }
                                    } else {
                                        System.out.println("Pilihan tema tidak valid.");
                                    }
                                } else {
                                    System.out.println("Pilihan tidak valid.");
                                }
                                break;

                            case "2":
                                // FItur pencarian
                                System.out.println("============ HALAMAN PENCARIAN ============");
                                System.out.print("Masukkan nama Buku/Penulis yang ingin dicari : ");
                                String cari = input.readLine().toLowerCase();
                                boolean dicari = false;

                                for (int n = 0; n < indexBuku; n++) {
                                    if (daftarBuku[n][2].toLowerCase().contains(cari.toLowerCase()) || daftarBuku[n][3].toLowerCase().contains(cari.toLowerCase())) {
                                        //ini buat nyari Buku
                                        System.out.println("=============== Detail Buku ===============");
                                        System.out.println("Judul        : " + daftarBuku[n][2]);
                                        System.out.println("Penulis      : " + daftarBuku[n][3]);
                                        System.out.println("Penerbit     : " + daftarBuku[n][4]);
                                        System.out.println("Tahun terbit : " + daftarBuku[n][5]);
                                        System.out.println("Status       : " + daftarBuku[n][6]);
                                        dicari = true;
                                        System.out.println("==========================================");
                                        System.out.println("1. Pinjam Buku");
                                        System.out.println("2. Kembali ke halaman utama");
                                        System.out.print("Pilih opsi (1/2): ");
                                        String opsi = input.readLine();
                                        //buat ngubah status "Tersedia" ke "Dipinjam"
                                        if (opsi.equals("1")) {
                                            if (daftarBuku[n][6].equalsIgnoreCase("Tersedia")) {
                                                daftarBuku[n][6] = "Dipinjam";
                                                System.out.println("==========================================");
                                                System.out.println("Buku Berhasil Dipinjam");
                                                System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                                input.readLine();
                                            } else {
                                                System.out.println("Maaf, Buku Sudah Dipinjam");
                                                System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                            }
                                        } else {
                                            System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                            input.readLine();
                                            break;
                                        }
                                        break;
                                    }

                                }
                                
                                //ini buat nyari Jurnal
                                for (int n = 0; n < indexJurnal; n++) {
                                    if (daftarJurnal[n][2].toLowerCase().contains(cari.toLowerCase()) || daftarJurnal[n][3].toLowerCase().contains(cari.toLowerCase())) {
                                        //ini buat nyari Jurnal
                                        System.out.println("=============== Detail Jurnal ===============");
                                        System.out.println("Judul        : " + daftarJurnal[n][2]);
                                        System.out.println("Penulis      : " + daftarJurnal[n][3]);
                                        System.out.println("Penerbit     : " + daftarJurnal[n][4]);
                                        System.out.println("Tahun terbit : " + daftarJurnal[n][5]);
                                        System.out.println("Status       : " + daftarJurnal[n][6]);
                                        dicari = true;
                                        System.out.println("==========================================");
                                        System.out.println("1. Pinjam Jurnal");
                                        System.out.println("2. Kembali ke halaman utama");
                                        System.out.print("Pilih opsi (1/2): ");
                                        String opsi = input.readLine();
                                        //buat ngubah status "Tersedia" ke "Dipinjam"
                                        if (opsi.equals("1")) {
                                            if (daftarJurnal[n][6].equalsIgnoreCase("Tersedia")) {
                                                daftarJurnal[n][6] = "Dipinjam";
                                                System.out.println("==========================================");
                                                System.out.println("Jurnal Berhasil Dipinjam");
                                                System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                                input.readLine();
                                            } else {
                                                System.out.println("Maaf, Jurnal Sudah Dipinjam");
                                                System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                            }
                                        } else {
                                            System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                            input.readLine();
                                            break;
                                        }
                                        break;
                                    }

                                }
                                //ini buat nyari Komik
                                for (int n = 0; n < indexKomik; n++) {
                                    if (daftarKomik[n][2].toLowerCase().contains(cari.toLowerCase()) || daftarKomik[n][3].toLowerCase().contains(cari.toLowerCase())) {
                                        //ini buat nyari Komik
                                        System.out.println("=============== Detail Komik ===============");
                                        System.out.println("Judul        : " + daftarKomik[n][2]);
                                        System.out.println("Penulis      : " + daftarKomik[n][3]);
                                        System.out.println("Penerbit     : " + daftarKomik[n][4]);
                                        System.out.println("Tahun terbit : " + daftarKomik[n][5]);
                                        System.out.println("Status       : " + daftarKomik[n][6]);
                                        dicari = true;
                                        System.out.println("==========================================");
                                        System.out.println("1. Pinjam Komik");
                                        System.out.println("2. Kembali ke halaman utama");
                                        System.out.print("Pilih opsi (1/2): ");
                                        String opsi = input.readLine();
                                        //buat ngubah status "Tersedia" ke "Dipinjam"
                                        if (opsi.equals("1")) {
                                            if (daftarKomik[n][6].equalsIgnoreCase("Tersedia")) {
                                                daftarKomik[n][6] = "Dipinjam";
                                                System.out.println("==========================================");
                                                System.out.println("Komik Berhasil Dipinjam");
                                                System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                                input.readLine();
                                            } else {
                                                System.out.println("Maaf, Komik Sudah Dipinjam");
                                                System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                            }
                                        } else {
                                            System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                            input.readLine();
                                            break;
                                        }
                                        break;
                                    }

                                }
                                //ini buat nyari Novel
                                for (int n = 0; n < indexNovel; n++) {
                                    if (daftarNovel[n][2].toLowerCase().contains(cari.toLowerCase()) || daftarNovel[n][3].toLowerCase().contains(cari.toLowerCase())) {
                                        //ini buat nyari Novel
                                        System.out.println("=============== Detail Novel ===============");
                                        System.out.println("Judul        : " + daftarNovel[n][2]);
                                        System.out.println("Penulis      : " + daftarNovel[n][3]);
                                        System.out.println("Penerbit     : " + daftarNovel[n][4]);
                                        System.out.println("Tahun terbit : " + daftarNovel[n][5]);
                                        System.out.println("Status       : " + daftarNovel[n][6]);
                                        dicari = true;
                                        System.out.println("==========================================");
                                        System.out.println("1. Pinjam Novel");
                                        System.out.println("2. Kembali ke halaman utama");
                                        System.out.print("Pilih opsi (1/2): ");
                                        String opsi = input.readLine();
                                        //buat ngubah status "Tersedia" ke "Dipinjam"
                                        if (opsi.equals("1")) {
                                            if (daftarNovel[n][6].equalsIgnoreCase("Tersedia")) {
                                                daftarNovel[n][6] = "Dipinjam";
                                                System.out.println("==========================================");
                                                System.out.println("Novel Berhasil Dipinjam");
                                                System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                                input.readLine();
                                            } else {
                                                System.out.println("Maaf, Novel Sudah Dipinjam");
                                                System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                            }
                                        } else {
                                            System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                            input.readLine();
                                            break;
                                        }
                                        break;
                                    }

                                }

                                if (!dicari) {
                                    System.out.println("==========================================");
                                    System.out.println("Judul atau nama penulis yang anda masukkan tidak dapat ditemukan");
                                    System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                    input.readLine();
                                }

                                break;
                            case "3":
                                // Fitur  peminjaman
                                System.out.println("============ HALAMAN PEMINJAMAN ============");
                                System.out.print("Masukkan nama Buku/Penulis yang ingin dipinjam : ");
                                String pinjam = input.readLine().toLowerCase();
                                boolean dipinjam = false;
                                //ini buat pinjam buku
                                for (int n = 0; n < indexBuku; n++) {
                                    if (daftarBuku[n][2].toLowerCase().contains(pinjam.toLowerCase()) || daftarBuku[n][3].toLowerCase().contains(pinjam.toLowerCase())) {
                                        //ini buat nampilin Buku
                                        System.out.println("=============== Detail Buku ===============");
                                        System.out.println("Judul        : " + daftarBuku[n][2]);
                                        System.out.println("Penulis      : " + daftarBuku[n][3]);
                                        System.out.println("Penerbit     : " + daftarBuku[n][4]);
                                        System.out.println("Tahun terbit : " + daftarBuku[n][5]);
                                        System.out.println("Status       : " + daftarBuku[n][6]);         
                                        System.out.println("==========================================");
                                        //buat ngubah status "Tersedia" ke "Dipinjam" tapi kalo misalnya status di pinjam gabisa lanjut, bakalan balik ke halaman utama
                                        
                                        if (daftarBuku[n][6].equalsIgnoreCase("Tersedia")) {
                                            System.out.print("Apakah Anda ingin meminjam buku ini? (ya/tidak): ");
                                            String konfirmasi = input.readLine();
                                            if (konfirmasi.equalsIgnoreCase("ya")) {
                                                daftarBuku[n][6] = "Dipinjam";
                                                System.out.println("==========================================");
                                                System.out.println("Buku berhasil dipinjam.");
                                            } else {
                                                System.out.println(" Peminjaman dibatalkan.");
                                            }
                                        } else {
                                            System.out.println("Buku tidak tersedia untuk dipinjam.");
                                        }

                                        System.out.println("Tekan ENTER untuk kembali ke menu...");
                                        input.readLine();
                                        dipinjam = true;
                                        break;
                                    }

                                }
                                //ini buat pinjam Jurnal
                                for (int n = 0; n < indexJurnal; n++) {
                                    if (daftarJurnal[n][2].toLowerCase().contains(pinjam.toLowerCase()) || daftarJurnal[n][3].toLowerCase().contains(pinjam.toLowerCase())) {
                                        //ini buat nampilin Jurnal
                                        System.out.println("=============== Detail Jurnal ===============");
                                        System.out.println("Judul        : " + daftarJurnal[n][2]);
                                        System.out.println("Penulis      : " + daftarJurnal[n][3]);
                                        System.out.println("Penerbit     : " + daftarJurnal[n][4]);
                                        System.out.println("Tahun terbit : " + daftarJurnal[n][5]);
                                        System.out.println("Status       : " + daftarJurnal[n][6]);         
                                        System.out.println("==========================================");
                                        //buat ngubah status "Tersedia" ke "Dipinjam" tapi kalo misalnya status di pinjam gabisa lanjut, bakalan balik ke halaman utama
                                        
                                        if (daftarJurnal[n][6].equalsIgnoreCase("Tersedia")) {
                                            System.out.print("Apakah Anda ingin meminjam buku ini? (ya/tidak): ");
                                            String konfirmasi = input.readLine();
                                            if (konfirmasi.equalsIgnoreCase("ya")) {
                                                daftarJurnal[n][6] = "Dipinjam";
                                                System.out.println("==========================================");
                                                System.out.println("Jurnal berhasil dipinjam.");
                                            } else {
                                                System.out.println(" Peminjaman dibatalkan.");
                                            }
                                        } else {
                                            System.out.println("Jurnal tidak tersedia untuk dipinjam.");
                                        }

                                        System.out.println("Tekan ENTER untuk kembali ke menu...");
                                        input.readLine();
                                        dipinjam = true;
                                        break;
                                    }

                                }
                                //ini buat pinjam Komik
                                for (int n = 0; n < indexKomik; n++) {
                                    if (daftarKomik[n][2].toLowerCase().contains(pinjam.toLowerCase()) || daftarKomik[n][3].toLowerCase().contains(pinjam.toLowerCase())) {
                                        //ini buat nampilin komik
                                        System.out.println("=============== Detail komik ===============");
                                        System.out.println("Judul        : " + daftarKomik[n][2]);
                                        System.out.println("Penulis      : " + daftarKomik[n][3]);
                                        System.out.println("Penerbit     : " + daftarKomik[n][4]);
                                        System.out.println("Tahun terbit : " + daftarKomik[n][5]);
                                        System.out.println("Status       : " + daftarKomik[n][6]);         
                                        System.out.println("==========================================");
                                        //buat ngubah status "Tersedia" ke "Dipinjam" tapi kalo misalnya status di pinjam gabisa lanjut, bakalan balik ke halaman utama
                                        
                                        if (daftarKomik[n][6].equalsIgnoreCase("Tersedia")) {
                                            System.out.print("Apakah Anda ingin meminjam buku ini? (ya/tidak): ");
                                            String konfirmasi = input.readLine();
                                            if (konfirmasi.equalsIgnoreCase("ya")) {
                                                daftarKomik[n][6] = "Dipinjam";
                                                System.out.println("==========================================");
                                                System.out.println("komik berhasil dipinjam.");
                                            } else {
                                                System.out.println(" Peminjaman dibatalkan.");
                                            }
                                        } else {
                                            System.out.println("komik tidak tersedia untuk dipinjam.");
                                        }

                                        System.out.println("Tekan ENTER untuk kembali ke menu...");
                                        input.readLine();
                                        dipinjam = true;
                                        break;
                                    }

                                }
                                //ini buat pinjam novel
                                for (int n = 0; n < indexNovel; n++) {
                                    if (daftarNovel[n][2].toLowerCase().contains(pinjam.toLowerCase()) || daftarNovel[n][3].toLowerCase().contains(pinjam.toLowerCase())) {
                                        //ini buat nampilin Novel
                                        System.out.println("=============== Detail Novel ===============");
                                        System.out.println("Judul        : " + daftarNovel[n][2]);
                                        System.out.println("Penulis      : " + daftarNovel[n][3]);
                                        System.out.println("Penerbit     : " + daftarNovel[n][4]);
                                        System.out.println("Tahun terbit : " + daftarNovel[n][5]);
                                        System.out.println("Status       : " + daftarNovel[n][6]);         
                                        System.out.println("==========================================");
                                        //buat ngubah status "Tersedia" ke "Dipinjam" tapi kalo misalnya status di pinjam gabisa lanjut, bakalan balik ke halaman utama
                                        
                                        if (daftarNovel[n][6].equalsIgnoreCase("Tersedia")) {
                                            System.out.print("Apakah Anda ingin meminjam buku ini? (ya/tidak): ");
                                            String konfirmasi = input.readLine();
                                            if (konfirmasi.equalsIgnoreCase("ya")) {
                                                daftarNovel[n][6] = "Dipinjam";
                                                System.out.println("==========================================");
                                                System.out.println("Novel berhasil dipinjam.");
                                            } else {
                                                System.out.println(" Peminjaman dibatalkan.");
                                            }
                                        } else {
                                            System.out.println("Novel tidak tersedia untuk dipinjam.");
                                        }

                                        System.out.println("Tekan ENTER untuk kembali ke menu...");
                                        input.readLine();
                                        dipinjam = true;
                                        break;
                                    }

                                }
                                if (!dipinjam) {
                                    System.out.println("==========================================");
                                    System.out.println("Judul atau nama penulis yang anda masukkan tidak dapat ditemukan");
                                    System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                    input.readLine();
                                }
                                break;
                            case "4":
                                // Implementasi pengembalian
                                System.out.println("============ HALAMAN PENGEMBALIAN ============");
                                System.out.print("Masukkan nama Buku/Penulis yang ingin dikembalikan : ");
                                String pengembalian = input.readLine().toLowerCase();
                                boolean kembalikan = false;
                                //ini buat pinjam buku
                                for (int n = 0; n < indexBuku; n++) {
                                    if (daftarBuku[n][2].toLowerCase().contains(pengembalian.toLowerCase()) || daftarBuku[n][3].toLowerCase().contains(pengembalian.toLowerCase())) {
                                        //ini buat nampilin Buku
                                        System.out.println("=============== Detail Buku ===============");
                                        System.out.println("Judul        : " + daftarBuku[n][2]);
                                        System.out.println("Penulis      : " + daftarBuku[n][3]);
                                        System.out.println("Penerbit     : " + daftarBuku[n][4]);
                                        System.out.println("Tahun terbit : " + daftarBuku[n][5]);
                                        System.out.println("Status       : " + daftarBuku[n][6]);         
                                        System.out.println("==========================================");
                                        //buat ngubah status "Dipinjam" ke "Tersedia" tapi kalo misalnya status di pinjam gabisa lanjut, bakalan balik ke halaman utama
                                        
                                        if (daftarBuku[n][6].equalsIgnoreCase("Dipinjam")) {
                                            System.out.print("Apakah Anda ingin mengembalikan buku ini? (ya/tidak): ");
                                            String konfirmasi = input.readLine();
                                            if (konfirmasi.equalsIgnoreCase("ya")) {
                                                daftarBuku[n][6] = "Tersedia";
                                                System.out.println("==========================================");
                                                System.out.println("Buku berhasil dikembalikan.");
                                            } else {
                                                System.out.println(" Pengembalian dibatalkan.");
                                            }
                                        } else {
                                            System.out.println("status Buku sedang tidak dipinjam.");
                                        }

                                        System.out.println("Tekan ENTER untuk kembali ke menu...");
                                        input.readLine();
                                        kembalikan = true;
                                        break;
                                    }

                                }
                                //ini yang Jurnal
                                for (int n = 0; n < indexJurnal; n++) {
                                    if (daftarJurnal[n][2].toLowerCase().contains(pengembalian.toLowerCase()) || daftarJurnal[n][3].toLowerCase().contains(pengembalian.toLowerCase())) {
                                        //ini buat nampilin Jurnal
                                        System.out.println("=============== Detail Jurnal ===============");
                                        System.out.println("Judul        : " + daftarJurnal[n][2]);
                                        System.out.println("Penulis      : " + daftarJurnal[n][3]);
                                        System.out.println("Penerbit     : " + daftarJurnal[n][4]);
                                        System.out.println("Tahun terbit : " + daftarJurnal[n][5]);
                                        System.out.println("Status       : " + daftarJurnal[n][6]);         
                                        System.out.println("==========================================");
                                        //buat ngubah status "Dipinjam" ke "Tersedia" tapi kalo misalnya status di pinjam gabisa lanjut, bakalan balik ke halaman utama
                                        
                                        if (daftarJurnal[n][6].equalsIgnoreCase("Dipinjam")) {
                                            System.out.print("Apakah Anda ingin mengembalikan buku ini? (ya/tidak): ");
                                            String konfirmasi = input.readLine();
                                            if (konfirmasi.equalsIgnoreCase("ya")) {
                                                daftarJurnal[n][6] = "Tersedia";
                                                System.out.println("==========================================");
                                                System.out.println("Jurnal berhasil dikembalikan.");
                                            } else {
                                                System.out.println(" Pengembalian dibatalkan.");
                                            }
                                        } else {
                                            System.out.println("status Jurnal sedang tidak dipinjam.");
                                        }

                                        System.out.println("Tekan ENTER untuk kembali ke menu...");
                                        input.readLine();
                                        kembalikan = true;
                                        break;
                                    }

                                }
                                //ini yang Komik
                                for (int n = 0; n < indexKomik; n++) {
                                    if (daftarKomik[n][2].toLowerCase().contains(pengembalian.toLowerCase()) || daftarKomik[n][3].toLowerCase().contains(pengembalian.toLowerCase())) {
                                        //ini buat nampilin Komik
                                        System.out.println("=============== Detail Komik ===============");
                                        System.out.println("Judul        : " + daftarKomik[n][2]);
                                        System.out.println("Penulis      : " + daftarKomik[n][3]);
                                        System.out.println("Penerbit     : " + daftarKomik[n][4]);
                                        System.out.println("Tahun terbit : " + daftarKomik[n][5]);
                                        System.out.println("Status       : " + daftarKomik[n][6]);         
                                        System.out.println("==========================================");
                                        //buat ngubah status "Dipinjam" ke "Tersedia" tapi kalo misalnya status di pinjam gabisa lanjut, bakalan balik ke halaman utama
                                        
                                        if (daftarKomik[n][6].equalsIgnoreCase("Dipinjam")) {
                                            System.out.print("Apakah Anda ingin mengembalikan Komik ini? (ya/tidak): ");
                                            String konfirmasi = input.readLine();
                                            if (konfirmasi.equalsIgnoreCase("ya")) {
                                                daftarKomik[n][6] = "Tersedia";
                                                System.out.println("==========================================");
                                                System.out.println("Komik berhasil dikembalikan.");
                                            } else {
                                                System.out.println(" Pengembalian dibatalkan.");
                                            }
                                        } else {
                                            System.out.println("status Komik sedang tidak dipinjam.");
                                        }

                                        System.out.println("Tekan ENTER untuk kembali ke menu...");
                                        input.readLine();
                                        kembalikan = true;
                                        break;
                                    }

                                }
                                //ini yang Novel
                                for (int n = 0; n < indexNovel; n++) {
                                    if (daftarNovel[n][2].toLowerCase().contains(pengembalian.toLowerCase()) || daftarNovel[n][3].toLowerCase().contains(pengembalian.toLowerCase())) {
                                        //ini buat nampilin Novel
                                        System.out.println("=============== Detail Novel ===============");
                                        System.out.println("Judul        : " + daftarNovel[n][2]);
                                        System.out.println("Penulis      : " + daftarNovel[n][3]);
                                        System.out.println("Penerbit     : " + daftarNovel[n][4]);
                                        System.out.println("Tahun terbit : " + daftarNovel[n][5]);
                                        System.out.println("Status       : " + daftarNovel[n][6]);         
                                        System.out.println("==========================================");
                                        //buat ngubah status "Dipinjam" ke "Tersedia" tapi kalo misalnya status di pinjam gabisa lanjut, bakalan balik ke halaman utama
                                        
                                        if (daftarNovel[n][6].equalsIgnoreCase("Dipinjam")) {
                                            System.out.print("Apakah Anda ingin mengembalikan buku ini? (ya/tidak): ");
                                            String konfirmasi = input.readLine();
                                            if (konfirmasi.equalsIgnoreCase("ya")) {
                                                daftarNovel[n][6] = "Tersedia";
                                                System.out.println("==========================================");
                                                System.out.println("Novel berhasil dikembalikan.");
                                            } else {
                                                System.out.println(" Pengembalian dibatalkan.");
                                            }
                                        } else {
                                            System.out.println("status Novel sedang tidak dipinjam.");
                                        }

                                        System.out.println("Tekan ENTER untuk kembali ke menu...");
                                        input.readLine();
                                        kembalikan = true;
                                        break;
                                    }

                                }
                                
                                if (!kembalikan) {
                                    System.out.println("==========================================");
                                    System.out.println("Judul atau nama penulis yang anda masukkan tidak dapat ditemukan");
                                    System.out.println("Tekan ENTER untuk Kembali ke halaman utama.....");
                                    input.readLine();
                                }
                                break;
                            case "5":
                                // Implementasi riwayat pengembalian
                                 System.out.println("============ RIWAYAT PEMINJAMAN ============");
                                if (indexPeminjaman == 0) {
                                    System.out.println("Belum ada data peminjaman.");
                                } else {
                                    for (int i = 0; i < indexPeminjaman; i++) {
                                    System.out.println((i+1) + ". [" + riwayatPeminjaman[i][0] + "] Judul: " + riwayatPeminjaman[i][1] + ", Penulis: " + riwayatPeminjaman[i][2]);
                                    }
                                }
                                System.out.println("============================================");
                                System.out.println("Tekan ENTER untuk kembali ke menu...");
                                input.readLine();
                                break;
                            case "6":
                                userMenu = false;
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        }
                    }
                    break;

                case "3":
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        input.close();
    }
}
