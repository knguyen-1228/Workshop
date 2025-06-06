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

-- Sample data for dealerships
INSERT INTO dealerships (name, address, phone) VALUES
('Speedy Motors', '123 Fast Lane, Dallas, Tx', '214-555-1234'),
('Auto Galazy', '456 Star galaxy Blvd, Houston, Tx', '713-555-5678'),
('Prime Auto', '789 market st, Austin, Tx','512-555-7890');

-- Sample data for vehicles
INSERT INTO vehicles(VIN, Year, Make, Model, Type, Color, Odometer, Price) VALUES
(1001, 2020, 'Toyota', 'Camry', 'Sedan', 'White', 25000, 21000.00),
(1002, 2021, 'Honda', 'Civic', 'Sedan', 'Black', 12000, 19500.00),
(1003, 2019, 'Ford', 'F-150', 'Truck', 'Blue', 40000, 27500.00),
(1004, 2022, 'Tesla', 'Model 3', 'Sedan', 'Red', 5000, 39999.99),
(1005, 2023, 'Chevrolet', 'Tahoe', 'SUV', 'Silver', 8000, 48000.00);

-- Sample data for Inventory
INSERT INTO Inventory (dealershipID, VIN) VALUES
(1, 1001),
(1, 1004),
(2, 1002),
(2, 1003),
(3, 1005);

-- Sample data for sales contracts
INSERT INTO salesContract (salesDate, Name, Email, Financed, VIN, totalPrice, monthlyPrice) VALUES
('2025-05-15', 'John Doe', 'johndoe@example.com', TRUE, 1001, 22000.00, 366.67),
('2025-05-20', 'Alice Smith', 'alice.smith@example.com', FALSE, 1002, 19500.00, NULL);

-- Sample data for lease contracts
INSERT INTO leaseContract (salesDate, Name, Email, VIN, totalPrice, monthlyPrice) VALUES
('2025-06-01', 'Mark Johnson', 'markj@example.com', 1004, 23999.94, 666.67),
('2025-06-03', 'Emma Lee', 'emma.lee@example.com', 1005, 28800.00, 800.00);