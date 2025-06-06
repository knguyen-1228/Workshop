-- test


-- Get all dealerships
SELECT
	*
FROM
	dealerships;
    
-- Find all vehicles for a specific dealership
SELECT
	V.*
FROM 
	vehicles V
JOIN inventory I
	ON V.VIN = I.VIN
WHERE
	dealershipID = 2;
    
-- Find a car by vin
SELECT 
	*
FROM
	vehicles
WHERE
	VIN = 1005;
    
-- Find the dealership where a certain car is located, by vin
SELECT
	*
FROM 
	dealerships D
JOIN inventory I
	ON D.dealershipID = I.dealershipID
WHERE
	VIN = 1004;
    
-- Find all dealerships that have a certain car type
SELECT DISTINCT 
	*
FROM 
	dealerships D
JOIN inventory I
	ON D.dealershipID = I.dealershipID
JOIN vehicles V
	ON I.VIN = V.VIN
WHERE
	V.Type = 'Sedan';
    
-- Get all sales info for specific dealer for a specific date range
SELECT
	S.*,
    V.*,
    D.dealershipID,
    D.name
FROM
	salescontract S
JOIN vehicles V
	ON S.VIN = V.VIN
JOIN inventory I
	ON V.VIN = I.VIN
JOIN dealerships D
	ON I.dealershipID = D.dealershipID
WHERE
	D.dealershipID = 1 
    AND S.salesDate BETWEEN '2025-05-01' AND '2025-05-17';