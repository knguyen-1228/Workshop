-- Drop and recreate database
DROP DATABASE IF EXISTS CarDealership;
CREATE DATABASE CarDealership;
USE CarDealership;

-- Table 1: dealership
CREATE TABLE dealerships (
	dealershipID INT AUTO_INCREMENT,
    name VARCHAR(50),
    address VARCHAR(50),
    phone VARCHAR(12),
    PRIMARY KEY (dealershipID)
);

-- Table 2: Vehicles
CREATE TABLE vehicles (
	VIN INT NOT NULL,
    Year INT,
    Make VARCHAR(30),
    Model VARCHAR(30),
    Type VARCHAR(30),
    Color VARCHAR(20),
    Odometer INT,
    Price DECIMAL(10,2),
    PRIMARY KEY (VIN)
);

-- Table 3: Inventory
CREATE TABLE Inventory(
	dealershipID INT,
    VIN INT,
    PRIMARY KEY (dealershipID, VIN),
    FOREIGN KEY (dealershipID) 
		REFERENCES dealerships(dealershipID)
        ON DELETE CASCADE,
	FOREIGN KEY (VIN) 
		REFERENCES vehicles(VIN)
        ON DELETE CASCADE
);

-- Table 4: salesContract
CREATE TABLE salesContract(
	contractID INT AUTO_INCREMENT,
    salesDate DATE,
    Name VARCHAR(30),
    Email VARCHAR(40),
    Financed BOOLEAN,
    VIN INT,
    totalPrice DECIMAL(10,2),
    monthlyPrice DECIMAL(10,2) DEFAULT NULL,
    PRIMARY KEY (contractID),
    FOREIGN KEY (VIN)
		REFERENCES vehicles(VIN)
        ON DELETE SET NULL
) AUTO_INCREMENT = 10000;

-- Table 5: leaseContract
CREATE TABLE leaseContract(
	contractID INT AUTO_INCREMENT,
    salesDate DATE,
    Name VARCHAR(30),
    Email VARCHAR(40),
    VIN INT,
    totalPrice DECIMAL(10,2),
    monthlyPrice DECIMAL(10,2),
    PRIMARY KEY (contractID),
    FOREIGN KEY (VIN)
		REFERENCES vehicles(VIN)
        ON DELETE SET NULL
	
) AUTO_INCREMENT = 10000;