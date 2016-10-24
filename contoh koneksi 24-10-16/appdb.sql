-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 24. Oktober 2016 jam 07:21
-- Versi Server: 5.5.16
-- Versi PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tutorialdb`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `appdb`
--

CREATE TABLE IF NOT EXISTS `appdb` (
  `autoid` int(11) NOT NULL AUTO_INCREMENT,
  `id` varchar(50) DEFAULT NULL,
  `nama` varchar(200) DEFAULT NULL,
  `kelas` varchar(30) DEFAULT NULL,
  `konst` varchar(100) DEFAULT NULL,
  `tipe` varchar(100) DEFAULT NULL,
  `var` varchar(100) DEFAULT NULL,
  `kata` varchar(15000) DEFAULT NULL,
  `soal` varchar(15000) DEFAULT NULL,
  `foto` blob,
  PRIMARY KEY (`autoid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data untuk tabel `appdb`
--

INSERT INTO `appdb` (`autoid`, `id`, `nama`, `kelas`, `konst`, `tipe`, `var`, `kata`, `soal`, `foto`) VALUES
(1, '1', 'Lama Bekerja', 'Runtunan & Pemilihan', 'iLama = iKeluar - iMasuk', 'int iLama, iKeluar, iMasuk', 'iLama, iKeluar, iMasuk', 'tulis program untuk tentu kerja gawai jam masuk jam pulang input catat jam upa dan gawai kerja kurang jam contoh masu luar jam masuk jam keluar luar tampil kerja jam kerja jam kerja jam', 'Tulis program untuk menentukan lama bekerja seorang pegawai, jika jam masuk dan jam pulang diinput. Catatan: jam berupa angka 1-12, dan seorang pegawai bekerja kurang dari 12 jam.\r\nContoh Masukan dan keluaran:\r\nJam masuk	Jam keluar	Keluaran/tampilan\r\n10	11	Lama bekerja 1 jam\r\n10	  2	Lama bekerja 4 jam \r\n10	  7	Lama bekerja 9 jam ', 0x6a617661782e7377696e672e496d61676549636f6e4031366136353132),
(2, '2', 'Biaya Parkir', 'Runtunan & Pemilihan', 'iBiaya = 2000', ' int iLama, iKeluar, iMasuk; long int iBiaya', ' iLama, iKeluar, iMasuk, iBiaya', 'tulis program untuk tentu biaya parkir hitung dasar parkir parkir hitung selisih jam masuk jam keluar input biaya parkir jam pertama jam ikut contoh masu luar jam masuk jam keluar luar tampil biaya biaya', 'Tulis program untuk menentukan biaya parkir yang dihitung berdasarkan lama parkir. Lama parkir dihitung dari selisih jam masuk dan jam keluar diinput. Biaya parkir 2 jam pertama 2000, perjam berikutnya 500.\r\nContoh Masukan dan keluaran:\r\nJam masuk	Jam keluar	Lama	keluaran/tampilan\r\n10	11	1	Biaya = 2000\r\n10	2	4	Biaya = 3000', 0x6a617661782e7377696e672e496d61676549636f6e4031376561353566),
(3, '3', 'Penggabungan Resistor', 'Runtunan & Pemilihan', 'Seri: Rgab  = R1 + R2 + R3; Paralel: 1/Rgab = 1/R1 + 1/R2 + 1/R3', 'int iPilihan; float fR1, fR2, fR3; float fResPengganti', 'iPilihan, fR1, fR2, fR3, fResPengganti', 'tulis program untuk hitung resistor ganti buah resistor susun cara atau paralel rumus untuk resistor ganti sbb rgab r paralel rgab r besar r r jenis susun paralel input user', 'Tulis program untuk menghitung resistor pengganti dari 3 buah resistor yang disusun secara seri atau paralel. Rumus untuk resistor pengganti sbb:\r\nSeri:                       Rgab = R1 + R2 + R3\r\nParalel:                 1/Rgab = 1/R1 + 1/R2 + 1/R3\r\nBesar R1, R2 dan R3 serta jenis penyusunan (seri/paralel) diinput oleh user.', 0x6a617661782e7377696e672e496d61676549636f6e40326437313635),
(4, '4', 'Harga Barang', 'Runtunan & Pemilihan', 'd', 'd', 'd', 'buat program untuk lesai masalah ikut program terima masu upa kode jenis harga jenis "a" "b" "c" untuk jenis masing ikan diskon besar untuk untuk dan untuk program hitung harga skon contoh masu jenis kode harga contoh luar jenis barang tdapat diskon harga skon', 'Buatlah program untuk menyelesaikan masalah berikut :\r\nProgram akan menerima masukan berupa kode, jenis dan harga, dengan jenis adalah "A", "B", dan "C". Untuk setiap jenis, masing-masing akan diberikan diskon sebesar 10% untuk A, 15% untuk B, dan 20% untuk C. Program akan menghitung berapa harga setelah didiskon.\r\nContoh masukan :\r\nJenis = B\r\nkode = 10\r\nharga = 10000\r\nContoh keluaran :\r\nJenis barang B mendapat diskon = 15%, Harga setelah didiskon = 8500', 0x6a617661782e7377696e672e496d61676549636f6e4031623038316533),
(5, '5', 'Gaji Karyawan Mingguan ', 'Runtunan', 'A', 's', 's', 'usaha swasta gaji karyawan cara minggu hitung ikut golong upah jam rupiah golong upah jam rupiah golong upah jam rupiah golong upah jam rupiah orang karyawan kerja kurang sama jam minggu hitung upah jam di atas apabila kerja dari jam lebih hitung lembur upah jam ½ upah tulis algoritma untuk hitung gaji minggu karyawan golong jam kerja input yboard', 'Sebuah perusahaan swasta menggaji karyawannya secara mingguan dengan hitungan sebagai berikut :\r\n\r\ngolongan 1 dengan upah per jam 3.000 rupiah\r\ngolongan 2 dengan upah per jam 3.500 rupiah\r\ngolongan 3 dengan upah per jam 4.000 rupiah\r\ngolongan 4 dengan upah per jam 5.000 rupiah\r\n\r\nBila seorang karyawan bekerja kurang atau sama dengan 40 jam per minggu, akan dihitung dengan upah per jam seperti di atas, tetapi apabila bekerja lebih dari 40 jam, maka lebihnya akan dihitung sebagai lembur dengan upah per jam 1½ kali upah biasa.\r\nTulis algoritma untuk menghitung gaji mingguan karyawan, bila golongan dan jam kerja diinput dari keyboard.', 0x6a617661782e7377696e672e496d61676549636f6e40373431383761);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
