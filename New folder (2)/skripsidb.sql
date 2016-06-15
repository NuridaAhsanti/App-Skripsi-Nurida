-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 15. Juni 2016 jam 07:34
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
-- Struktur dari tabel `appdb`
--

CREATE TABLE IF NOT EXISTS `appdb` (
  `id` varchar(15) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `kelas` varchar(30) NOT NULL,
  `konst` varchar(200) NOT NULL,
  `tipe` varchar(200) NOT NULL,
  `var` varchar(200) NOT NULL,
  `kata` varchar(50) NOT NULL,
  `foto` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `kata`
--

CREATE TABLE IF NOT EXISTS `kata` (
  `kata` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kata`
--

INSERT INTO `kata` (`kata`) VALUES
('program'),
('menghitung'),
('harga'),
('didiskon.'),
('tulis'),
('program'),
('untuk'),
('menentukan'),
('bekerja'),
('pegawai');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblogin`
--

CREATE TABLE IF NOT EXISTS `tblogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tblogin`
--

INSERT INTO `tblogin` (`username`, `password`) VALUES
('Nurida', '12345'),
('admin', 'admin');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
