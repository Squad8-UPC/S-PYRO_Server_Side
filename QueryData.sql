-- CREANDO LAS BASE DE DATOS --
create schema spyro;
SET GLOBAL time_zone = '0:00';
-- CREANDO LAS VARIABLES --
SET @UUIDEMERGENCY = uuid();

SET @UUIDFIREFIGHTER1 = uuid();
SET @UUIDFIREFIGHTER2= uuid();
SET @UUIDFIREFIGHTER3 = uuid();
SET @UUIDFIREFIGHTER4= uuid();

SET @UUIDDEVICE1 = uuid();
SET @UUIDDEVICE2 = uuid();
SET @UUIDDEVICE3 = uuid();
SET @UUIDDEVICE4 = uuid();

SET @UUIDDSCBA1 = uuid();
SET @UUIDDSCBA2 = uuid();

SET @UUIDDSUPERVISOR1= uuid();
SET @UUIDDSUPERVISOR2= uuid();

SET @UUIDDFIREFIGHTEREQUIPMENT1= uuid();
SET @UUIDDFIREFIGHTEREQUIPMENT2= uuid();
SET @UUIDDFIREFIGHTEREQUIPMENT3= uuid();
SET @UUIDDFIREFIGHTEREQUIPMENT4= uuid();

SET @UUIDDFIREEXTINCIONOPERATION= uuid();

SET @UUIDDINCIDENT= uuid();
-- ###################################### -- 

-- INSERTANDO LA EMERGENCIA --
INSERT INTO `spyro`.`emergency`(`emergency_id`,`address`,`date`,`end_time`,`location_latitude`,`location_longitude`,`part_number`,`reported_time`,`state`)
VALUES(@UUIDEMERGENCY,"Av. Universitaria",curdate(),"2018-11-23",1.42,1.21,"22200111", "2018-11-23 17:31:26", "Atendiendo");
-- ########################################################################## -- 

-- INSERTANDO A LOS BOMBEROS --
INSERT INTO `spyro`.`firefighter`(`firefighter_id`,`birthdate`,`dni`,`email`,`first_name`,`height`,`last_name`,`weight`)
VALUES(@UUIDFIREFIGHTER1,curdate(),'12345678','bbqms@hotmail.com','Bryan',176,'Miramira',76.1);

INSERT INTO `spyro`.`firefighter`(`firefighter_id`,`birthdate`,`dni`,`email`,`first_name`,`height`,`last_name`,`weight`)
VALUES(@UUIDFIREFIGHTER2,curdate(),'87654321','slayz02@hotmail.com','Juanelv',180,'Salgado',82.1);

INSERT INTO `spyro`.`firefighter`(`firefighter_id`,`birthdate`,`dni`,`email`,`first_name`,`height`,`last_name`,`weight`)
VALUES(@UUIDFIREFIGHTER3,curdate(),'32123432','cpizarrollanos@hotmail.com','César',175,'Pizarro',74.1);

INSERT INTO `spyro`.`firefighter`(`firefighter_id`,`birthdate`,`dni`,`email`,`first_name`,`height`,`last_name`,`weight`)
VALUES(@UUIDFIREFIGHTER4,curdate(),'54678965','pepino@hotmail.com','Sebastián',180,'Pinillos',82.1);
-- ########################################################################## -- 


-- INSERTANDO A LOS DISPOSITVIOS IOT --
INSERT INTO `spyro`.`device`(`device_id`,`serial_number`,`type`)
VALUES(@UUIDDEVICE1,'123124123213213','Heart Check');

INSERT INTO `spyro`.`device`(`device_id`,`serial_number`,`type`)
VALUES(@UUIDDEVICE2,'231231235671123','Air Check');

INSERT INTO `spyro`.`device`(`device_id`,`serial_number`,`type`)
VALUES(@UUIDDEVICE3,'21231232132123','Heart Check');

INSERT INTO `spyro`.`device`(`device_id`,`serial_number`,`type`)
VALUES(@UUIDDEVICE4,'412312321312123','Air Check');
-- ########################################################################## -- 

-- INSERTANDO LOS SCBA --
INSERT INTO `spyro`.`scba`(`scba_id`,`due_date`,`last_test_date`,`device_id`)
VALUES(@UUIDDSCBA1,curdate(),"2018-11-23", @UUIDDEVICE1);

INSERT INTO `spyro`.`scba`(`scba_id`,`due_date`,`last_test_date`,`device_id`)
VALUES(@UUIDDSCBA2,curdate(),"2018-11-24", @UUIDDEVICE3);
-- ########################################################################## -- 

-- INSERTANDO LOS SUPERVISORES --
INSERT INTO `spyro`.`supervisor`(`supervisor_id`,`email`,`password`,`firefighter_id`)
VALUES (@UUIDDSUPERVISOR1,'bbqms@hotmail.com','bryanpipipi', @UUIDFIREFIGHTER1);

INSERT INTO `spyro`.`supervisor`(`supervisor_id`,`email`,`password`,`firefighter_id`)
VALUES (@UUIDDSUPERVISOR2,'slayz02@hotmail.com','juanelvpass', @UUIDFIREFIGHTER2);
-- ########################################################################## -- 

-- INSERTANDO LOS EQUIPAMENTOS --
INSERT INTO `spyro`.`firefighter_equipment`(`firefighter_equipment_id`,`device_id`,`firefigther_id`,`scba_id`)
VALUES(@UUIDDFIREFIGHTEREQUIPMENT1,@UUIDDEVICE2,@UUIDFIREFIGHTER1,@UUIDDSCBA1);

INSERT INTO `spyro`.`firefighter_equipment`(`firefighter_equipment_id`,`device_id`,`firefigther_id`,`scba_id`)
VALUES(@UUIDDFIREFIGHTEREQUIPMENT2,@UUIDDEVICE4,@UUIDFIREFIGHTER2,@UUIDDSCBA2);

INSERT INTO `spyro`.`firefighter_equipment`(`firefighter_equipment_id`,`device_id`,`firefigther_id`,`scba_id`)
VALUES(@UUIDDFIREFIGHTEREQUIPMENT3,@UUIDDEVICE1,@UUIDFIREFIGHTER3,@UUIDDSCBA1);

INSERT INTO `spyro`.`firefighter_equipment`(`firefighter_equipment_id`,`device_id`,`firefigther_id`,`scba_id`)
VALUES(@UUIDDFIREFIGHTEREQUIPMENT4,@UUIDDEVICE3,@UUIDFIREFIGHTER4,@UUIDDSCBA2);
-- ########################################################################## -- 

-- INSERTANDO LAS OPERACIONES --
INSERT INTO `spyro`.`fire_extinction_operation`(`fire_extinction_operation_id`,`end_time`,`entry_time`,`emergency_id`,`firefighter_equipment_1_id`,`firefighter_equipment_2_id`)
VALUES(@UUIDDFIREEXTINCIONOPERATION,curdate(),curdate(),@UUIDEMERGENCY,@UUIDDFIREFIGHTEREQUIPMENT1,@UUIDDFIREFIGHTEREQUIPMENT2);

SET @UUIDDFIREEXTINCIONOPERATION2 = uuid();
INSERT INTO `spyro`.`fire_extinction_operation`(`fire_extinction_operation_id`,`end_time`,`entry_time`,`emergency_id`,`firefighter_equipment_1_id`,`firefighter_equipment_2_id`)
VALUES(@UUIDDFIREEXTINCIONOPERATION2,curdate(),curdate(),@UUIDEMERGENCY,@UUIDDFIREFIGHTEREQUIPMENT3,@UUIDDFIREFIGHTEREQUIPMENT4);

-- ########################################################################## -- 

-- INSERTANDO LOS INCIDENTES --
INSERT INTO `spyro`.`incident`(`incident_id`,`gsr`,`heart_rate`,`hours`,`psi`,`stress_level`,`type`,`fire_extinction_operation_id`,`firefighter_equipment_id`)
VALUES(@UUIDDINCIDENT,20.1,200,curdate(),800,6,'Tipo',@UUIDDFIREEXTINCIONOPERATION,@UUIDDFIREFIGHTEREQUIPMENT1);
-- ########################################################################## -- 

-- VERIFICANDO DATOS --
use spyro;
select * from emergency;
select * from firefighter;
select * from device;
select * from scba;
select * from supervisor;
select * from firefighter_equipment;
select * from fire_extinction_operation;
select * from incident;

-- INSERTANDO OPERACIONES

-- ########################################################################## -- 