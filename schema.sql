-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `onlinebookings` DEFAULT CHARACTER SET utf8 ;
USE `onlinebookings` ;

-- -----------------------------------------------------
-- Table `onlinebookings`.`subscriber`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `onlinebookings`.`subscriber` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `telephone` INT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`flight`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `onlinebookings`.`flight` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `flight_number` VARCHAR(45) NOT NULL,
  `airline` VARCHAR(45) NOT NULL,
  `capacity` INT NOT NULL,
  `price` FLOAT NULL,
  `departure_date_time` DATETIME NULL,
  `arrival_date_time` DATETIME NULL,
  `departure_airport` VARCHAR(45) NULL,
  `arrival_airport` VARCHAR(45) NULL,
  `subscriber_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_flight_subscriber_idx` (`subscriber_id` ASC) VISIBLE,
  CONSTRAINT `fk_flight_subscriber`
    FOREIGN KEY (`subscriber_id`)
    REFERENCES `mydb`.`subscriber` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
