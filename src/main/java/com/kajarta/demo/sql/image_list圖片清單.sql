CREATE TABLE image_list (
   id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    image VARBINARY(MAX) NOT NULL,
    car_id INT NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL
);
