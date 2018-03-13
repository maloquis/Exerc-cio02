CREATE DATABASE pais;
USE pais;

CREATE TABLE pais (
  id INT NOT NULL auto_increment,
  nome VARCHAR(100) NOT NULL,
  populacao bigint NOT NULL,
  area numeric(15,2),
  PRIMARY KEY (id));
  
  USE pais;
INSERT INTO `pais` (`id`,`nome`,`populacao`,`area`) VALUES (1,'Brasil','207.7','12345.12000');
INSERT INTO `pais` (`id`,`nome`,`populacao`,`area`) VALUES (2,'Argentina','43.85','12345.12000');
INSERT INTO `pais` (`id`,`nome`,`populacao`,`area`) VALUES (3,'Bolivia','10.89','12345.12000');
INSERT INTO `pais` (`id`,`nome`,`populacao`,`area`) VALUES (4,'Estados Unidos','323.1','12345.12000');
INSERT INTO `pais` (`id`,`nome`,`populacao`,`area`) VALUES (5,'Portugal','10.32','12345.12000');
INSERT INTO `pais` (`id`,`nome`,`populacao`,`area`) VALUES (6,'Alemanha','82.67','12345.12000');
INSERT INTO `pais` (`id`,`nome`,`populacao`,`area`) VALUES (7,'Colombia','48.65','12345.12000');

select * from
 pais;