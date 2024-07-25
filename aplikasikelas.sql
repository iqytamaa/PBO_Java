-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 25, 2024 at 08:17 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aplikasikelas`
--

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NIM` varchar(50) NOT NULL,
  `Nama` varchar(50) DEFAULT NULL,
  `JenisKelamin` varchar(10) DEFAULT NULL,
  `NoHP` varchar(50) DEFAULT NULL,
  `Alamat` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `Nama`, `JenisKelamin`, `NoHP`, `Alamat`) VALUES
('11', 'aa', 'Laki-Laki', '11', 'qqq'),
('111', 'TASYA', 'Perempuan', '22222', 'PNJ'),
('112', 'Yanti', 'Perempuan', '123456', 'Bumi'),
('12', 'daa', 'Laki-Laki', '2', 'wq'),
('123', 'ASEP', 'Laki-Laki', '08123456', 'Depok'),
('20622001', 'ADELYA DWI FURBANI', 'Perempuan', '08123477823', 'TanjungPinang'),
('2307413007', 'Muhammad Rizqy Pratama', 'Laki-Laki', '081224736643', 'Perum Prim Kopti'),
('2307413015', 'hakim', 'Laki-Laki', '4646434', 'jladajsk');

-- --------------------------------------------------------

--
-- Table structure for table `uangkas`
--

CREATE TABLE `uangkas` (
  `No` int(20) NOT NULL,
  `Tanggal` date NOT NULL,
  `Nama` varchar(200) NOT NULL,
  `Keterangan` varchar(300) NOT NULL,
  `Pemasukan` int(20) NOT NULL,
  `Pengeluaran` int(20) NOT NULL,
  `SaldoAkhir` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `uangkas`
--

INSERT INTO `uangkas` (`No`, `Tanggal`, `Nama`, `Keterangan`, `Pemasukan`, `Pengeluaran`, `SaldoAkhir`) VALUES
(1, '2024-07-17', 'ASEP', 'Uang Masuk', 10000, 0, 30000),
(2, '2024-07-18', 'aa', 'Uang Masuk', 10000, 0, 30000),
(3, '2024-07-13', 'Muhammad Rizqy Pratama', 'Uang Masuk', 10000, 0, 20000),
(4, '2024-07-18', 'hakim', 'Uang Keluar', 20000, 0, 50000),
(5, '2024-07-17', 'daa', 'Uang Masuk', 10000, 0, 40000),
(6, '2024-07-17', 'Yanti', 'Uang Masuk', 10000, 0, 20000),
(7, '2024-07-17', 'aa', 'Uang Masuk', 20000, 0, 30000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `nama` text NOT NULL,
  `username` text NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`nama`, `username`, `password`) VALUES
('muhammad', 'pratama', '111');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`);

--
-- Indexes for table `uangkas`
--
ALTER TABLE `uangkas`
  ADD PRIMARY KEY (`No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
