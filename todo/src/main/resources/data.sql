CREATE TABLE IF NOT EXISTS`todo`.`todo`(
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `number` INT NOT NULL,
  PRIMARY KEY (`id`));

--INSERT INTO todotable(id,name,number) VALUES(1,'BOOK','AUTHOR');