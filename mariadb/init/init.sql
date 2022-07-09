CREATE TABLE `client` (`client_id` int(10) NOT NULL,`client_name` varchar(100) NOT NULL);
ALTER TABLE `client` CHANGE `client_id` `client_id` varchar(36) NOT NULL FIRST;