-- kotlin_template.template_table definition
CREATE TABLE `template_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `content` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `create_date` date DEFAULT curdate(),
  `modified_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `AUTHOR_IDX` (`author`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
