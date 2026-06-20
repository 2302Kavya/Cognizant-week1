CREATE database bank;
use bank;
CREATE TABLE customers (
	customer_id INT,
    customer_name VARCHAR(50),
    age INT,
    interest_rate DECIMAL(10,2)
);
INSERT INTO customers values(1,'santhosh',65,10),(2,'kavya',55,12),(3,'anusha',70,9),(4,'varun',50,8);
select * from customers;
SET SQL_SAFE_UPDATES=0;
UPDATE customers 
SET interest_rate=interest_rate - 1 
WHERE age >60;
select * from customers;