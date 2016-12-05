-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 25. Nopember 2016 jam 10:17
-- Versi Server: 5.5.16
-- Versi PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `skripsidb`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `appindex`
--

CREATE TABLE IF NOT EXISTS `appindex` (
  `autoid` int(11) NOT NULL AUTO_INCREMENT,
  `Kata` varchar(15000) NOT NULL,
  `idLama` int(11) DEFAULT NULL,
  `SimDocAkhir` double DEFAULT NULL,
  PRIMARY KEY (`autoid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=92 ;

--
-- Dumping data untuk tabel `appindex`
--

INSERT INTO `appindex` (`autoid`, `Kata`, `idLama`, `SimDocAkhir`) VALUES
(1, 'tulis program kerja gawai jam masuk jam pulang input catat jam gawai kerja kurang jam', 1, 0.028338524418929766),
(2, 'tulis program biaya parkir hitung dasar parkir parkir hitung selisih jam masuk jam keluar input biaya parkir jam pertama jam', 2, 0.024291227597433726),
(3, 'tulis program hitung resistor ganti resistor susun cara seri paralel rumus resistor ganti seri rgab paralel rgab besar jenis susun seri paralel input user', 3, 0.004508786145119294),
(4, 'program laku urut kumpul nilai uji mahasiswa data nilai uji mahasiswa baca keyboard urut kecil besar akhir hasil urut tampil monitor', 4, 0.05326765600964767),
(5, 'program cetak tabel fahrenheit celcius naik besar step masuk program suhu awal suhu akhir step luar tabel konversi suhu', 5, 0.038316477357187934),
(6, 'karyawan kerja kurang jam minggu hitung upah jam atas kerja lebih jam lebih hitung lembur upah jam kali upah tulis algoritma hitung gaji minggu karyawan golong jam kerja input keyboard', 6, 0.02986611099526676),
(7, 'hitung cepat rambat cahaya ilmu fisika rumus jarak cahaya detik satuan kilometer selesai algoritma java masalah', 7, 0.005862821613881579),
(8, 'program cari gcd dua bilangan bulat negatif gcd bilangan bulat positif besar habis bagi', 8, 0),
(9, 'buat program selesai masalah program terima masukan kode jenis harga jenis jenis diskon besar program hitung harga diskon', 9, 0.0034609271757620273),
(10, 'flowchart hitung luas bangun buat flowchart hitung volume balok luas lingkar', 10, 0.32635844592797514),
(11, 'tentu nilai besar dua bilangan bulat andai', 11, 0),
(12, 'tentu bilangan bulat bilangan genap ganjil', 12, 0),
(13, 'tentu nilai besar tiga bilangan', 13, 0),
(14, 'program cetak hello word masuk program luar tulis hello word cetak layar', 14, 0.06642304147414944),
(15, 'tulis algoritma baca nama keyboard menampilkan ucap halo ikut nama orang', 15, 0.04744664394137045),
(16, 'tulis algoritma baca dua nilai nilai ubah tukar nilai dua ubah misal tukar nilai nilai tukar nilai nilai', 16, 0.00722662725730673),
(17, 'tulis algoritma baca panjang lebar empat segi panjang hitung luas segiempat bentuk empat segi panjang luas segiempat panjang kali lebar luas segiempat cetak piranti luar', 17, 0.11857142407323912),
(18, 'tulis algoritma hitung komisi terima salesman dasar nilai jual capai salesman dapat komisi hasil jual algoritma terima data nama salesman nilai jual capai hitung komisi cetak nama salesman besar komisi oleh', 18, 0.00789197342506652),
(19, 'tulis algoritma baca nama karyawan gaji pokok bulan hitung gaji bersih karyawan gaji bersih terima gawai gaji bersih gaji pokok tunjang pajak tunjang karyawan hitung gaji pokok pajak gaji pokok tambah tunjang nama karyawan gaji bersih cetak piranti luar', 19, 0.01852467317586369),
(20, 'tulis algoritma baca dua titik hitung titik tengah titik tengah dua hitung rumus', 20, 0.018178560299619263),
(21, 'lari maraton tempuh waktu lari ukur satuan jam menit detik tulis algoritma baca waktu tempuh lari maraton konversi waktu tempuh dalam detik ingat menit detik jam detik misal waktu tempuh lari maraton jam menit detik detik waktu tempuh detik', 21, 0.003111954937269318),
(22, 'tulis algoritma baca cakap telepon satuan detik konversi jam menit detik contoh misal cakap detik detik jam menit detik', 22, 0.0069686019249169005),
(23, 'tulis algoritma baca dua jam pertama waktu hh mm ss waktu dua hh mm ss syarat hitung selisih jam durasi', 23, 0.01159351371600382),
(24, 'misal telepon warung telekomunikasi pulai cakap pukul selesai pukul andai pulsa detik biaya pulsa rp tulis algoritma hitung cakap jam menit detik biaya bayar telpon sederhana masalah andai wartel tutup tepat pukul malam', 24, 0.006074324582616402),
(25, 'buat algoritma baca bilangan bulat cetak pesan genap bilangan genap', 25, 0.007884510716469678),
(26, 'tulis algoritma baca karakter menuliskan pesan huruf hidup karakter salah satu huruf vokal', 26, 0.00886935113889904),
(27, 'matematika kenal nilai mutlak absolute value sembarang bilangan riil nilai mutlak lambang besaran hitung tanda nilai mutlak positif jadi nilai negatif nilai mutlak oleh kali negatif buat algoritma baca bilangan riil nilai mutlak', 27, 0.0042939821224284),
(28, 'tulis algoritma baca bilangan bulat menuliskan pesan genap bilangan genap ganjil bilangan ganjil', 28, 0.011519074388322037),
(29, 'buat algoritma baca dua bilangan bulat bilangan besar', 29, 0.013486682697753005),
(30, 'tulis algoritma baca tiga bilangan bulat tiga bilangan besar', 30, 0.01481898350435178),
(31, 'karyawan honorer pt abc gaji dasar jumlah jam kerja satu minggu upah jam misal rp jumlah jam kerja lebih besar jam sisa jam lembur upah lembur misal rp jam tulis algoritma baca jumlah jam kerja karyawan satu minggu upah minggu', 31, 0.004464602701482571),
(32, 'buat algoritma baca tahun masehi keyboard tahun tahun kabisat cara sederhana tahun kabisat tahun habis bagi tahun kabisat bulan februari berjum hari', 32, 0.01719622980549625),
(33, 'tulis algoritma baca bilangan bulat bilangan positif negatif nol', 33, 0.018309062062221795),
(34, 'tulis algoritma baca temperatur air satuan derajat celcius tekan normal wujud air ada padat derajat celcius cair gas', 34, 0.006516290728526764),
(35, 'buat algoritma baca titik bidang kartesian kuadran letak titik', 35, 0.005736263663417903),
(36, 'misal karyawan pt abc kelompok dasar golong upah jam karyawan bergatung golong jumlah jam kerja normal minggu jam lebih jam kerja anggap lembur upah lembur jam golong karyawan buat algoritma baca nama karyawan jumlah jam kerja minggu hitung gaji minggu', 36, 0.004355677041638858),
(37, 'indeks nilai mahasiswa tentu dasar nilai uji raih buat algoritma baca nilai uji mahasiswa indeks nilai cetak nilai indeks keyboard', 37, 0.02300779461279042),
(38, 'buat algoritma baca bilangan bulat nilai letak cetak tulis misal baca letak tulis satu baca letak layar tulis dua masuk tulis pesan masuk salah', 38, 0.07412391017243361),
(39, 'buat algoritma baca nomor bulan integer menuliskan nama bulan sesuai bulan misal baca bulan cetak agustus', 39, 0.0065245392786778015),
(40, 'buat algoritma baca jam hh mm ss jam baru jam tambah increment satu detik', 40, 0.005198389781840392),
(41, 'simulasi kalkulator sederhana laku operasi aritmetika baca operand operator operand cetak hasil', 41, 0.002350032992655295),
(42, 'konstruksi case sering guna pilih menu program program awar sejum menu guna cukup ketik nomor menu ingin kali nomor menu pilih prosedur asosiasi nomor eksekusi buat algoritma cetak menu baca nomor pilih menu', 42, 0.0016763694529526767),
(43, 'buat algoritma baca nomor bulan tahun menuliskan jumlah hari bulan misal baca bulan bulan agustus jumlah hari', 43, 0.0060383954460862845),
(44, 'misal cetak pesan hello world kali algoritma', 44, 0.003907312781925433),
(45, 'misal cetak layar satu baris', 45, 0),
(46, 'misal cetak nilai baca', 46, 0.012074185494157934),
(47, 'misal hitung jumlah deret', 47, 0.016101345000876396),
(48, 'misal hitung nilai rata rata data bilangan bulat baca keyboard nilai rata rata jumlah data bagi banyak data misal data bilangan baca turut turut nilai rata rata', 48, 0.021992749821393893),
(49, 'roket luncur hitung mundur mulai algoritma hitung mundur', 49, 0.013546459464201055),
(50, 'misal jumlah deret jumlah inisialisasi kali baca periksa proses ulang henti jumlah', 50, 0.0027904053728139457),
(51, 'tulis program baca data integer arsip hitung nilai rata rata data luar program nilai rata rata luar program cetak layar', 51, 0.06746864265291212),
(52, 'telpon warung telekomunikasi wartel catat jam awal cakap jam akhir cakap bicara format hh mm ss tulis algoritma baca jam awal akhir cakap hitung cakap format waktu hh mm ss cara analisis kasus', 52, 0.007445903888469274),
(53, 'tulis algoritma nilai kecil buahh data integer baca keyboard nilai baca', 53, 0.07474216345489784),
(54, 'nilai pecahan saji bentuk syarat sebut bilang sebut dua tipe integer bilangan bulat nyata bentuk pecahan tulis algoritma baca dua nilai pecahan hitung hasil jumlah dua selisih kalian bagi hasil hitung tetap bentuk pecahan', 54, 0.009953416959256877),
(55, 'bulan februari punya jumlah hari unik jumlah hari hari bulan februari punya jumlah hari ada tahun kabisat tahun kabisat jumlah hari misal baca tanggal bulan februari tulis algoritma tanggal hari', 55, 0.004131791066560471),
(56, 'tulis algoritma hitung jumlah karakter baca cara ulang ulang keyboard baca karakter selesai karakter baca karakter titik titik masuk hitung jumlah karakter misal karakter baca turut turut kum karakter masuk titik', 56, 0.05022859803726267),
(57, 'buat algoritma konversi bilangan bulat negatif sistem desimal jadi bilangan sistem biner misal', 57, 0.0024290925582316084),
(58, 'tulis program cetak segitiga bintang tinggi segitiga asumsi', 58, 0.16096084047379183),
(59, 'tulis algoritma hitung jumlah muncul digit jumlah spasi jumlah karakter karakter baca cara ulang ulang keyboard baca karakter selesai karakter sibaca karakter titik titik masuk hitung jumlah karakter', 59, 0.04015234791873818),
(60, 'tulis algoritma nilai kecil buahh data integer baca keyboard nilai baca banyak data baca data akhir data baca', 60, 0.05079579737051699),
(61, 'baca sejum bilangan bulat baca cara ulang ulang akhir baca tulis algoritma hitung banyak bilangan genap', 61, 0.026341923302394314),
(62, 'tulis algoritma menuliskan teks lagu anak ayam turun jumlah anak ayam nilai positif baca', 62, 0.008205586410575692),
(63, 'tulis algoritma hitung jumlah deret pecahan bilangan bulat positif baca', 63, 0.029450401954862745),
(64, 'buat algoritma baca bilangan bulat hitung nilai pangkat pangkat arti kali kali', 64, 0.011001464704350232),
(65, 'faktorial bilangan bulat negatif definisi khusus faktorial definisi tulis algoritma baca nilai hitung faktorial', 65, 0.011122386417188691),
(66, 'jurus tentu universitas punya orang mahasiswa mahasiswa mengambil mata kuliah tulis algoritma baca nama nama mahasiswa serta daftar nilai mata kuliah ambil nilai tipe riil hitung rata rata nilai mahasiswa', 66, 0.007974961844294389),
(67, 'buat algoritma tiru mekanisme baca sandi lewat password masuk sistem atm server reaktor nuklir lemari besi sandi lewat baca salah baca sandi lewat ulang maksimum kali sandi lewat benar simpan dalam algoritma konstanta praktek sandi lewat simpan dalam basis data enkripsi jaga aman', 67, 0.013030453011067106),
(68, 'tulis program cetak segitiga bintang tinggi segitiga asumsi', 68, 0.16096084047379183),
(69, 'buat program guna define hitung volume tabung rumus volume tabung phi jari jari jari jari tinggi luas tabung rumus luas tabung phi jari jari tinggi', 69, 0.05198567817426211),
(70, 'buat program hitung luas bangun geometri bujur sangkar lingkar segitiga trapesium data dimasukan user lalu piranti masuk luas bangun tampil luar', 70, 0.6678417780621602),
(71, 'buat program hitung harga total mana barang input user harga barang unit', 71, 0.0044716564048926655),
(72, 'buat program menampilkan bilangan ganjil mana dimasukan operator', 72, 0),
(73, 'buat program cetak deret', 73, 0),
(74, 'buat program menampilkan bilangan mulai bilangan bilangan nilai awal bilangan tampil bilangan turun contoh bilangan oleh bilangan oleh', 74, 0.04398630766161667),
(75, 'buat fungsi hitung luas segitiga', 75, 0.26282757228500225),
(76, 'buat program catat data mahasiswa field nama nim nilai', 76, 0),
(77, 'buat program cetak bintang bentuk segitiga guna for while', 77, 0.06859551456727894),
(78, 'usaha punya orang karyawan asumsi gaji gaji karyawan jumlah gaji karyawan hitung cara gaji pokok tambah tunjang kurang pajak pajak berla usaha gaji pokok tambah tunjang tunjang dapat usaha gaji pokok ubah gantung bija usaha hitung gaji gaji keluar karyawan detail pajak orang detail tunjang orang', 78, 0.003030880292296056),
(79, 'program tukar isi gelas nilai', 79, 0),
(80, 'program hitung konversi jam menit detik jadi jumlah detik', 80, 0.007891294422570557),
(81, 'program hitung luas keliling segi panjang', 81, 0.12032417471688411),
(82, 'buat program pasuk dua nilai integer laku operasi aritmetika dua bilangan', 82, 0),
(83, 'buat algoritma terima input dua bilangan bulat tunjuk contoh guna operator relasional logika', 83, 0.0026447846278062296),
(84, 'algoritma terima input jarak tempuh cepat mengoutputkan waktu butuh tempuh', 84, 0.002384404450342627),
(85, 'algoritma pinta input jari jari mengoutputkan luas lingkar', 85, 0.16012584938731722),
(86, 'buat prosedur ambah bilangan deklarasi prosedur ambah bilangan simpan hasil', 86, 0),
(87, 'buat prosedur ambah hitung rata rata bilangan', 87, 0.007916308722906138),
(88, 'buat program hitung luas bangun bujursangkar data masuk baca piranti masuk luas bangun tampil luar', 88, 0.7263947230726214),
(89, 'buat program hitung luas bangun trapesium data masuk baca piranti masuk luas bangun tampil luar', 89, 0.7119416028395011),
(90, 'sejum pelajar', 90, 0),
(91, 'tulis algoritma hitung luas bangun geometri lingkar bujursangkar segitiga trapesium masuk baca keyboard luas bangun tampil luar', NULL, NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
