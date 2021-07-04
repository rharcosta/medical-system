-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Pief
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Pief` ;

-- -----------------------------------------------------
-- Schema Pief
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Pief` DEFAULT CHARACTER SET utf8 ;
USE `Pief` ;

-- -----------------------------------------------------
-- Table `Pief`.`Pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Pessoa` (
  `Nome` VARCHAR(100) NOT NULL,
  `Sexo` VARCHAR(45) NOT NULL,
  `Nascimento` VARCHAR(45) NOT NULL,
  `CPF` VARCHAR(14) NOT NULL,
  `RG` VARCHAR(12) NOT NULL,
  `Orgao_Expedidor` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`RG`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pief`.`Medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Medico` (
  `CRM` INT NOT NULL,
  `Especialidade` VARCHAR(45) NOT NULL,
  `Pessoa_RG` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`Pessoa_RG`),
  CONSTRAINT `fk_Medico_Pessoa1`
    FOREIGN KEY (`Pessoa_RG`)
    REFERENCES `Pief`.`Pessoa` (`RG`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pief`.`Paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Paciente` (
  `Nome_pai` VARCHAR(45) NOT NULL,
  `Nome_mae` VARCHAR(45) NOT NULL,
  `Pessoa_RG` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`Pessoa_RG`),
  CONSTRAINT `fk_Paciente_Pessoa1`
    FOREIGN KEY (`Pessoa_RG`)
    REFERENCES `Pief`.`Pessoa` (`RG`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pief`.`Agendamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Agendamento` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Data` VARCHAR(10) NOT NULL,
  `Horario` VARCHAR(5) NOT NULL,
  `Especialidade` VARCHAR(45) NOT NULL,
  `Prioridade` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pief`.`Laudo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Laudo` (
  `id` INT NOT NULL,
  `Diagnostico` VARCHAR(120) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pief`.`Endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Endereco` (
  `Cidade` VARCHAR(45) NOT NULL,
  `Estado` VARCHAR(45) NOT NULL,
  `CEP` VARCHAR(45) NOT NULL,
  `Rua` VARCHAR(45) NOT NULL,
  `Bairro` VARCHAR(45) NOT NULL,
  `Numero` VARCHAR(45) NOT NULL,
  `Complemento` VARCHAR(45) NULL,
  `Pessoa_RG` VARCHAR(12) NOT NULL,
  INDEX `fk_Endereco_Pessoa1_idx` (`Pessoa_RG` ASC),
  CONSTRAINT `fk_Endereco_Pessoa1`
    FOREIGN KEY (`Pessoa_RG`)
    REFERENCES `Pief`.`Pessoa` (`RG`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pief`.`Telefone`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Telefone` (
  `Residencial` VARCHAR(20) NULL,
  `Celular` VARCHAR(20) NOT NULL,
  `Comercial` VARCHAR(20) NULL,
  `Pessoa_RG` VARCHAR(12) NOT NULL,
  INDEX `fk_Telefone_Pessoa1_idx` (`Pessoa_RG` ASC),
  CONSTRAINT `fk_Telefone_Pessoa1`
    FOREIGN KEY (`Pessoa_RG`)
    REFERENCES `Pief`.`Pessoa` (`RG`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pief`.`Login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Login` (
  `Senha` VARCHAR(45) NOT NULL,
  `Pessoa_RG` VARCHAR(12) NOT NULL,
  INDEX `fk_Login_Pessoa1_idx` (`Pessoa_RG` ASC),
  CONSTRAINT `fk_Login_Pessoa1`
    FOREIGN KEY (`Pessoa_RG`)
    REFERENCES `Pief`.`Pessoa` (`RG`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pief`.`Consulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pief`.`Consulta` (
  `Medico_Pessoa_RG` VARCHAR(12) NOT NULL,
  `Paciente_Pessoa_RG` VARCHAR(12) NOT NULL,
  `Laudo_id` INT NOT NULL,
  `Agendamento_id` INT NOT NULL,
  PRIMARY KEY (`Medico_Pessoa_RG`, `Paciente_Pessoa_RG`),
  INDEX `fk_Medico_has_Paciente_Paciente1_idx` (`Paciente_Pessoa_RG` ASC),
  INDEX `fk_Medico_has_Paciente_Medico1_idx` (`Medico_Pessoa_RG` ASC),
  INDEX `fk_Medico_has_Paciente_Laudo1_idx` (`Laudo_id` ASC),
  INDEX `fk_Medico_has_Paciente_Agendamento1_idx` (`Agendamento_id` ASC),
  CONSTRAINT `fk_Medico_has_Paciente_Medico1`
    FOREIGN KEY (`Medico_Pessoa_RG`)
    REFERENCES `Pief`.`Medico` (`Pessoa_RG`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Medico_has_Paciente_Paciente1`
    FOREIGN KEY (`Paciente_Pessoa_RG`)
    REFERENCES `Pief`.`Paciente` (`Pessoa_RG`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Medico_has_Paciente_Laudo1`
    FOREIGN KEY (`Laudo_id`)
    REFERENCES `Pief`.`Laudo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Medico_has_Paciente_Agendamento1`
    FOREIGN KEY (`Agendamento_id`)
    REFERENCES `Pief`.`Agendamento` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
