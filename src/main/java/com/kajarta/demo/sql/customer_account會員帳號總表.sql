CREATE TABLE customer_account (
    id INT IDENTITY(1,1) PRIMARY KEY,
    account_type TINYINT NOT NULL,
    account VARCHAR(20) NOT NULL,
    password VARCHAR(20) NOT NULL,
    name NVARCHAR(20) NOT NULL,
    tel VARCHAR(20),
    phone VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL,
    picture VARBINARY(MAX),
    sex CHAR(1) NOT NULL,
    city TINYINT NOT NULL,
    remarks NVARCHAR(50),
    address NVARCHAR(50) NOT NULL,
    id_number VARCHAR(20) NOT NULL
);
