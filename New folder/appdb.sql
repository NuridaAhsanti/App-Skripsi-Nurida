-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 14. Juni 2016 jam 06:25
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
  `kata` varchar(50) NOT NULL,
  `foto` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `appdb`
--

INSERT INTO `appdb` (`id`, `nama`, `konst`, `tipe`, `var`, `kata`, `foto`) VALUES
('1', 'kerja pegawai', 'a', 'a', 'a', 'tulis', 0x6a617661782e7377696e672e496d61676549636f6e4031643132383032),
('1', 'kerja pegawai', 'a', 'a', 'a', 'program', 0x6a617661782e7377696e672e496d61676549636f6e4031643132383032),
('1', 'kerja pegawai', 'a', 'a', 'a', 'untuk', 0x6a617661782e7377696e672e496d61676549636f6e4031643132383032),
('1', 'kerja pegawai', 'a', 'a', 'a', 'menentukan', 0x6a617661782e7377696e672e496d61676549636f6e4031643132383032),
('1', 'kerja pegawai', 'a', 'a', 'a', 'bekerja', 0x6a617661782e7377696e672e496d61676549636f6e4031643132383032),
('1', 'kerja pegawai', 'a', 'a', 'a', 'pegawai', 0x6a617661782e7377696e672e496d61676549636f6e4031643132383032),
('2', 'a', 'a', 'a', 'a', 'tulis', 0x6a617661782e7377696e672e496d61676549636f6e4031626362646135),
('2', 'a', 'a', 'a', 'a', 'program', 0x6a617661782e7377696e672e496d61676549636f6e4031626362646135),
('2', 'a', 'a', 'a', 'a', 'untuk', 0x6a617661782e7377696e672e496d61676549636f6e4031626362646135),
('2', 'a', 'a', 'a', 'a', 'menentukan', 0x6a617661782e7377696e672e496d61676549636f6e4031626362646135),
('2', 'a', 'a', 'a', 'a', 'bekerja', 0x6a617661782e7377696e672e496d61676549636f6e4031626362646135),
('2', 'a', 'a', 'a', 'a', 'pegawai', 0x6a617661782e7377696e672e496d61676549636f6e4031626362646135),
('3', 'd', 'a', 'a', 'd', 'jam', 0x6a617661782e7377696e672e496d61676549636f6e40396535393263),
('3', 'd', 'a', 'a', 'd', 'masuk', 0x6a617661782e7377696e672e496d61676549636f6e40396535393263),
('3', 'd', 'a', 'a', 'd', 'jam', 0x6a617661782e7377696e672e496d61676549636f6e40396535393263),
('3', 'd', 'a', 'a', 'd', 'pulang', 0x6a617661782e7377696e672e496d61676549636f6e40396535393263),
('3', 'd', 'a', 'a', 'd', 'diinput', 0x6a617661782e7377696e672e496d61676549636f6e40396535393263);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
