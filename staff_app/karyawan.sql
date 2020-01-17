-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2020 at 11:24 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.2.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uas`
--

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `nik` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tgl_lahir` varchar(40) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `kelamin` varchar(50) NOT NULL,
  `agama` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `pendidikan` varchar(50) NOT NULL,
  `jabatan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`nik`, `nama`, `tempat_lahir`, `tgl_lahir`, `alamat`, `kelamin`, `agama`, `status`, `pendidikan`, `jabatan`) VALUES
(1, 'Mario Pandi', 'Samosir', '15-06-1998', 'pekanbaru', 'laki-laki', 'Katolik', 'Pelajar', 'Smk', 'Tidak Ada'),
(2, 'pandi ', 'samosir', '15-06-1998', 'pekanbaru', 'laki-laki', 'katolik', 'aktif', 'd3', 'staff'),
(6, 'Mariono', 'samosir', '15-06-98', 'pekanbaru', 'laki-laki', 'katolik', 'aktif', 'd3', 'staff'),
(0, 'pandiangan', 'ndndnd', 'xnxnn', 'ndxnn', 'nxnxn', 'xnxn', 'xjdj', '', 'nznx'),
(7, 'angel', 'lanj', '', '', '', '', 'hdhdj', '', ''),
(10, 'Bleki', 'lobu', '', '', '', '', '', '', ''),
(11, 'Butet', 'jabu', '', '', '', '', '', '', ''),
(12, 'ucok', 'hotel\n', '', '', '', '', '', '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
