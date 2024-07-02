CREATE TABLE notice (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    category TINYINT NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME NOT NULL,
    viewable_notification TINYINT NOT NULL,
    read_status TINYINT NOT NULL,
    receiver INT,
    account_type TINYINT NOT NULL,
    view_car_id INT,
    view_car_assigned_id INT,
    car_id INT,
    preference_list_id INT
);
