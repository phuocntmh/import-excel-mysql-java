-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 27, 2021 at 06:54 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sinhvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_bangdiem`
--

CREATE TABLE `tbl_bangdiem` (
  `id` int(11) NOT NULL,
  `mssv` varchar(255) NOT NULL,
  `toan` int(11) NOT NULL,
  `ly` int(11) NOT NULL,
  `hoa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_bangdiem`
--

INSERT INTO `tbl_bangdiem` (`id`, `mssv`, `toan`, `ly`, `hoa`) VALUES
(1, '1511060249', 7, 8, 9),
(2, '1511060250', 10, 9, 8),
(3, '1511060251', 6, 7, 8);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_thongtinsv`
--

CREATE TABLE `tbl_thongtinsv` (
  `id` int(11) NOT NULL,
  `hoten` varchar(255) NOT NULL,
  `mssv` varchar(255) NOT NULL,
  `diachi` varchar(255) NOT NULL,
  `sdt` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_thongtinsv`
--

INSERT INTO `tbl_thongtinsv` (`id`, `hoten`, `mssv`, `diachi`, `sdt`) VALUES
(1, 'Phước Nguyễn 1', '1511060249', 'binh duong', '0868895261'),
(2, 'Phước Nguyễn 2', '1511060250', 'tp hcm', '0868895262'),
(3, 'Phước Nguyễn 3', '1511060251', 'dong nai', '0868895263');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_bangdiem`
--
ALTER TABLE `tbl_bangdiem`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `tbl_thongtinsv`
--
ALTER TABLE `tbl_thongtinsv`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`),
  ADD KEY `id_2` (`id`),
  ADD KEY `id_3` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
