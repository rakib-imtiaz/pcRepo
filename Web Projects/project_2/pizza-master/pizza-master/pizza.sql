-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 27, 2020 at 08:49 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pizza`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(120) NOT NULL,
  `name` varchar(120) NOT NULL,
  `username` varchar(120) NOT NULL,
  `phone` int(120) NOT NULL,
  `password` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `username`, `phone`, `password`) VALUES
(1, 'Anik Aich', 'anik@gmail.com', 185776699, '1234');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(120) NOT NULL,
  `name` varchar(120) NOT NULL,
  `username` varchar(120) NOT NULL,
  `phone` varchar(120) NOT NULL,
  `password` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `username`, `phone`, `password`) VALUES
(1, 'Anik Aich', 'anik@gmail.com', '01369685789', '12345'),
(3, 'Dipto Das', 'dipto@gmail.com', '0125698745', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(120) NOT NULL,
  `name` varchar(120) NOT NULL,
  `username` varchar(120) NOT NULL,
  `phone` int(120) NOT NULL,
  `subject` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `name`, `username`, `phone`, `subject`) VALUES
(1, '', 'shaikat@gmail.com', 1853392377, 'Good'),
(2, '', 'shaikat@gmail.com', 1853392377, 'ok'),
(3, 'Shaikat Das Joy', 'shaikat@gmail.com', 1853392377, 'Satisfied'),
(4, 'Ankon Biswas', 'ankon@gmail.com', 16396895, 'Good');

-- --------------------------------------------------------

--
-- Table structure for table `orderp`
--

CREATE TABLE `orderp` (
  `id` int(200) NOT NULL,
  `name` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `phone` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `o1` varchar(200) NOT NULL,
  `q1` varchar(200) NOT NULL,
  `tot_amount1` varchar(200) NOT NULL,
  `e1` varchar(120) NOT NULL,
  `o2` varchar(200) NOT NULL,
  `q2` varchar(200) NOT NULL,
  `tot_amount2` varchar(200) NOT NULL,
  `e2` varchar(120) NOT NULL,
  `total` varchar(200) NOT NULL,
  `status` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderp`
--

INSERT INTO `orderp` (`id`, `name`, `username`, `phone`, `address`, `o1`, `q1`, `tot_amount1`, `e1`, `o2`, `q2`, `tot_amount2`, `e2`, `total`, `status`) VALUES
(10, 'Shaikat Das Joy', 'shaikat@gmail.com', '1853392377', 'Dewan Bazar ,Chattagram', 'Pizza Mania', '1', '600', '--', '--', '2', '1000', '--', '', 'Pending'),
(11, 'Shaikat Das Joy', 'shaikat@gmail.com', '1853392377', 'Dewan Bazar ,Chattagram', 'Pizza Mania', '1', '600', '--', 'Chicken cheesy', '1', '500', '--', '1100', 'Cancelled'),
(13, 'Ankon Biswas', 'ankon@gmail.com', '16396895', 'Teribazar,Chattagram', 'Pizza Mania', '1', '600', 'Cheese', 'Chicken cheesy', '2', '1000', 'Cheese', '1600', 'Delivered');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(120) NOT NULL,
  `name` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `phone` int(200) NOT NULL,
  `address` varchar(500) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `username`, `phone`, `address`, `password`) VALUES
(2, 'Anik Aich', 'anik@gmail.com', 1671102103, '28,SHIRAJ-UD-DOULLAH ROAD,DEWAN BAZAR,SUB AREA,CHITTAGONG,BANGLADESH', 'wifi'),
(3, 'Shaikat Das Joy', 'shaikat@gmail.com', 1853392377, 'Dewan Bazar ,Chattagram', '1236'),
(4, 'Ankon Biswas', 'ankon@gmail.com', 16396895, 'Teribazar,Chattagram', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orderp`
--
ALTER TABLE `orderp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(120) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(120) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(120) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `orderp`
--
ALTER TABLE `orderp`
  MODIFY `id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(120) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
