CREATE TABLE `Tareas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(200) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `vigente` bool NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

insert into Tareas values(0,'primera tarea','2020-04-12', false)