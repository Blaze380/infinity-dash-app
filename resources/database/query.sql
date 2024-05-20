CREATE TABLE
    `user` (
        `id` varchar(255) NOT NULL,
        `birth_date` date DEFAULT NULL,
        `email` varchar(255) DEFAULT NULL UNIQUE,
        `name` varchar(255) DEFAULT NULL,
        `password` varchar(255) DEFAULT NULL,
        `phone_number` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`id`)
    );
    
CREATE TABLE
    `category` (
        `id` varchar(255) NOT NULL,
        `name` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`id`)
    );
    
CREATE TABLE
    `product` (
        `id` varchar(255) NOT NULL,
        `brand` varchar(255) DEFAULT NULL,
        `image_src` varchar(255) DEFAULT NULL,
        `name` varchar(255) DEFAULT NULL,
        `price` decimal(38, 2) DEFAULT NULL,
        `quantity` decimal(38, 0) DEFAULT NULL,
        `category_id` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`id`),
        FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
    );