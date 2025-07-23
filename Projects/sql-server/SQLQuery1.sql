CREATE DATABASE MyFriendDB;
use MyFriendDB;
SELECT * FROM MyFriendDB.dbo.Friend;
SELECT * FROM Friend;
DROP TABLE MyFriendDB.dbo.Friend;
DROP TABLE Friend;
CREATE TABLE Friend(
    sr_num INT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
);
INSERT INTO Friend(sr_num,first_name, last_name)
VALUES
(1,'nandana','aravind');
INSERT INTO Friend(sr_num,first_name, last_name)
VALUES
(2,'hansika','pagadala'),
(3,'meenakshi','sundareshwar'),
(4,'charan','pydi'),
(5,'sathwik','PRL');
UPDATE Friend
SET 
   sr_num = 87, 
   first_name = 'sri sai charan'
WHERE 
  last_name = 'pydi';
