CREATE database Banks;
USE Banks;
CREATE TABLE ACCOUNTS (
	account_id INT,
    customer_name VARCHAR(50),
    balance DECIMAL(10,2)
);
INSERT INTO ACCOUNTS VALUES(10,'karthik',10000),(11,'rashi',150000),(13,'adithya',20000);
SELECT * FROM ACCOUNTS;
DELIMITER //
CREATE PROCEDURE processMonthlyInterest()
BEGIN
	UPDATE ACCOUNTS 
    SET balance=balance+(balance * 0.01);
END //
DELIMITER ;
CALL processMonthlyInterest();
SELECT * FROM ACCOUNTS;