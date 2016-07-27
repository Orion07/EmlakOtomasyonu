-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2016 at 11:49 AM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hibernate`
--

-- --------------------------------------------------------

--
-- Table structure for table `apartmentsandoffices`
--

CREATE TABLE IF NOT EXISTS `apartmentsandoffices` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `m2` int(11) NOT NULL,
  `roomcount` int(11) NOT NULL,
  `buildingage` int(11) NOT NULL,
  `heating` int(11) NOT NULL,
  `dues` int(11) NOT NULL,
  `floor` int(11) DEFAULT NULL,
  `totalfloor` int(11) DEFAULT NULL,
  `bathroomcount` int(11) DEFAULT NULL,
  `furniture` bit(1) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `address` int(11) NOT NULL,
  `state` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `cid` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `apartmentsandoffices`
--

INSERT INTO `apartmentsandoffices` (`id`, `date`, `m2`, `roomcount`, `buildingage`, `heating`, `dues`, `floor`, `totalfloor`, `bathroomcount`, `furniture`, `price`, `address`, `state`, `type`, `cid`) VALUES
(8, '2016-05-17', 180, 11, 6, 5, 50, 20, 14, 2, b'1', 350000, 7, 1, 1, 1),
(10, '2016-05-20', 120, 5, 4, 3, 30, 15, 7, 1, b'0', 200000, 7, 1, 1, 4),
(11, '2016-05-20', 150, 7, 2, 6, 30, 20, 10, 2, b'0', 750, 7, 2, 1, 6),
(12, '2016-05-20', 150, 1, 8, 9, 60, 14, 3, 1, b'1', 120, 20, 3, 1, 1),
(13, '2016-05-20', 150, 5, 6, 6, 60, 24, 16, 2, b'0', 900, 20, 2, 1, 5),
(14, '2016-05-20', 500, 8, 9, 8, 50, 8, 19, 1, b'0', 4000, 7, 2, 2, 3),
(15, '2016-05-20', 500, 10, 11, 11, 50, 8, 14, 2, b'0', 650000, 47, 1, 2, 1),
(16, '2016-05-20', 500, 3, 2, 6, 50, 8, 5, 1, b'0', 230000, 47, 1, 2, 4),
(17, '2016-05-20', 150, 5, 6, 2, 50, 21, 16, 2, b'0', 1250, 6, 2, 1, 5),
(18, '2016-05-20', 120, 4, 6, 5, 100, 13, 5, 1, b'1', 300000, 4, 1, 1, 6),
(19, '2016-05-20', 120, 3, 6, 2, 0, 15, 7, 1, b'1', 120, 5, 3, 1, 5);

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE IF NOT EXISTS `customers` (
  `cid` int(11) NOT NULL,
  `firstname` varchar(50) DEFAULT NULL,
  `lastname` varchar(70) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`cid`, `firstname`, `lastname`, `phone`) VALUES
(1, 'Ali', 'Göçmen', '05396257150'),
(2, 'Emine', 'Göçmen', '05554442233'),
(3, 'Ahmet', 'Gök', '05325648021'),
(4, 'Ahmet', 'Göral', '05327878758'),
(5, 'Recep', 'Göral', '02363661340'),
(6, 'Melis', 'Ufak', '05425975620');

-- --------------------------------------------------------

--
-- Table structure for table `estateads`
--

CREATE TABLE IF NOT EXISTS `estateads` (
  `customerid` int(11) NOT NULL,
  `adsid` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `estateads`
--

INSERT INTO `estateads` (`customerid`, `adsid`, `id`) VALUES
(1, 8, 6),
(1, 9, 7),
(2, 1, 8),
(1, 2, 9),
(5, 3, 10),
(5, 4, 11);

-- --------------------------------------------------------

--
-- Table structure for table `lands`
--

CREATE TABLE IF NOT EXISTS `lands` (
  `id` int(11) NOT NULL,
  `address` int(11) NOT NULL,
  `date` date NOT NULL,
  `m2` int(11) NOT NULL,
  `reconstruction` int(11) NOT NULL,
  `block` int(11) NOT NULL,
  `plot` int(11) NOT NULL,
  `layout` int(11) NOT NULL,
  `clearance` int(11) NOT NULL,
  `deedstate` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `kaks` int(11) NOT NULL,
  `state` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `type` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lands`
--

INSERT INTO `lands` (`id`, `address`, `date`, `m2`, `reconstruction`, `block`, `plot`, `layout`, `clearance`, `deedstate`, `price`, `kaks`, `state`, `cid`, `type`) VALUES
(1, 45, '2016-05-18', 19000, 15, 35, 10, 5, 11, 3, 2000000, 25, 1, 1, 3),
(2, 7, '2016-05-18', 16000, 15, 15193, 97, 5, 8, 1, 1000000, 32, 2, 2, 3),
(4, 34, '2016-05-20', 6000, 5, 51, 62, 2, 6, 1, 640000, 6, 1, 2, 3);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `uid` int(11) NOT NULL,
  `id` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `id`, `password`) VALUES
(19, 'admin', 'admin'),
(20, 'qqqq', 'qqqq');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apartmentsandoffices`
--
ALTER TABLE `apartmentsandoffices`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `estateads`
--
ALTER TABLE `estateads`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lands`
--
ALTER TABLE `lands`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `uid` (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `apartmentsandoffices`
--
ALTER TABLE `apartmentsandoffices`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `estateads`
--
ALTER TABLE `estateads`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `lands`
--
ALTER TABLE `lands`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
