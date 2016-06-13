-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 13. Juni 2016 jam 11:54
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
  `konst` varchar(200) NOT NULL,
  `tipe` varchar(200) NOT NULL,
  `var` varchar(200) NOT NULL,
  `kata` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `appdb`
--

INSERT INTO `appdb` (`id`, `nama`, `konst`, `tipe`, `var`, `kata`) VALUES
('1', 'jam', 'j=12', 'int j', 'j', 'jam'),
('1', 'lama kerja', 'j=1; j<=12', 'int j', 'j', 'tulis'),
('1', 'lama kerja', 'j=1; j<=12', 'int j', 'j', 'program'),
('1', 'lama kerja', 'j=1; j<=12', 'int j', 'j', 'untuk'),
('1', 'lama kerja', 'j=1; j<=12', 'int j', 'j', 'menentukan'),
('1', 'lama kerja', 'j=1; j<=12', 'int j', 'j', 'bekerja'),
('1', 'lama kerja', 'j=1; j<=12', 'int j', 'j', 'pegawai');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
