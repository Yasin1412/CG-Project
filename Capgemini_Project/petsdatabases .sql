-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 14, 2022 at 08:21 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petsdatabases`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `address`, `email`, `mobile`, `password`, `userName`) VALUES
(1, 'Solapur', 'tamboliyasin02@gmail.com', 7622002343, '123', 'yasin'),
(2, 'pune', 'vaishu@gmail.com', 7620843368, '0009', 'vaishu');

-- --------------------------------------------------------

--
-- Table structure for table `admin_seq`
--

CREATE TABLE `admin_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin_seq`
--

INSERT INTO `admin_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `bank_info`
--

CREATE TABLE `bank_info` (
  `account_Number` bigint(20) NOT NULL,
  `bank_Name` varchar(255) DEFAULT NULL,
  `ifsc` bigint(20) NOT NULL,
  `mob` double NOT NULL,
  `user_Name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bank_info`
--

INSERT INTO `bank_info` (`account_Number`, `bank_Name`, `ifsc`, `mob`, `user_Name`) VALUES
(123456789, 'sbi', 234455, 2345675411, 'rushi');

-- --------------------------------------------------------

--
-- Table structure for table `pets_details`
--

CREATE TABLE `pets_details` (
  `petId` int(11) NOT NULL,
  `petBreede` varchar(255) DEFAULT NULL,
  `petFood` varchar(255) DEFAULT NULL,
  `petName` varchar(255) DEFAULT NULL,
  `petPrice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pets_details`
--

INSERT INTO `pets_details` (`petId`, `petBreede`, `petFood`, `petName`, `petPrice`) VALUES
(20, 'Aegean', 'Almond', 'cat', 1000),
(30, 'Siberian', 'deer', 'Tiger', 5000),
(40, 'German', 'Purina.', 'dog', 2490),
(50, 'American', 'Berry', 'cat', 7654);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `Gender` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `Gender`, `address`, `email`, `mobile`, `password`, `userName`) VALUES
(1, 'male', 'latur', 'ruushi@gmail.com', 98990111294, '456', 'rushi');

-- --------------------------------------------------------

--
-- Table structure for table `user_seq`
--

CREATE TABLE `user_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_seq`
--

INSERT INTO `user_seq` (`next_val`) VALUES
(101);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bank_info`
--
ALTER TABLE `bank_info`
  ADD PRIMARY KEY (`account_Number`);

--
-- Indexes for table `pets_details`
--
ALTER TABLE `pets_details`
  ADD PRIMARY KEY (`petId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
