USE [kajarta]
GO

INSERT INTO suspension(Suspension, code, type)
	VALUES('SEDAN', 1, '轎車'),
	('SUV', 2, '休旅車'),
	('CONVERTIBLE', 3, '敞篷車'),
	('SPORTS_CAR', 4, '跑車'),
	('JEEP', 5, '吉普車'),
	('HATCHBACK', 6, '掀背車')
GO


INSERT INTO door(Door, code, cardoor)
	VALUES('TWO' ,1, '二門'),
	('THREE', 2, '三門'),
	('FOUR', 3, '四門'),
	('FIVE', 4, '五門'),
	('SIX', 5, '六門')
GO


INSERT INTO rearwheel(Rearwheel, code, wheel)
	VALUES('FRONT', 1, '前驅'),
	('REAR', 2, '後驅'),
	('FOUR', 3, '四驅')
GO

INSERT INTO brand(Brand, code, trademark)
	VALUES('HONDA', 1, '本田'),
	('TOYOTA', 2, '豐田'),
	('MAZDA', 3, '馬自達'),
	('BENZ', 4, '賓士'),
	('PORSCHE', 5, '保時捷'),
	('BMW', 6, '寶馬'),
	('VOLKSWAGEN', 7, '福斯'),
	('NISSAN', 8, '日產'),
	('SUBARU', 9, '速霸陸')
GO


INSERT INTO [kajarta].[dbo].[passenger] (Passenger, code, seat)
	VALUES
	('twoseater', 2, '二人座'),
	('fourseater', 4, '四人座'),
	('fiveseater', 5, '五人座'),
	('sevenupseater', 7, '七人座以上')
GO


INSERT INTO [kajarta].[dbo].[gasoline] (Gasoline, code, gaso)
	VALUES
	('gasoline', 1, '汽油'),
	('diesel', 2, '柴油'),
	('hybrid ', 3, '油電複合'),
	('electric', 4, '純電')
GO


INSERT INTO displacement(Displacement, code, cc)
	VALUES('THOUSANDTWO' ,1, '1200以下'),
	('THOUSANDEIGHT', 2, '1201-1800'),
	('TWOTHOUSANDFOUR', 3, '1801-2400'),
	('THREETHOUSAND', 4, '2401-3000'),
	('FOURTHOUSANDTWOHUNDRED', 5, '3001-4200'),
	('FIVETHOUSANDFOURHUNDRED', 6, '4201-5400'),
	('UPFIVETHOUSANDFOURHUNDRED', 7, '5401以上')
GO


INSERT INTO transmission(Transmission, code, trans)
	VALUES('automatic' ,1, '自排'),
	('manual', 2, '手排'),
	('semiAutomatic', 3, '手自排'),
	('automaticManual', 4, '自手排')
GO

INSERT INTO [dbo].[carinfo]
			([brand],[model_name],[model],[door],[passenger],[rear_wheel],[gasoline],[transmission],[cc],[hp],[torque],[create_time],[update_time])
	
     VALUES
           (1,'YARISCROSS',1,1,1,1,1,1,1,101,1000.5,'2024-06-09','2024-06-09'),
		   (1,'CROWN',1,1,1,1,1,1,1,102,2000.5,'2024-06-09','2024-06-09'),
		   (1,'TOWNACEVAN',1,1,1,1,1,1,1,103,3000.5,'2024-06-09','2024-06-09'),
		   (1,'VIOS',1,1,1,1,1,1,1,104,4000.5,'2024-06-09','2024-06-09'),
		   (1,'ALTIS',1,1,1,1,1,1,1,105,5000.5,'2024-06-09','2024-06-09')
GO

INSERT INTO [dbo].[customer]
			([account_type],[account],[password],[name],[tel],[phone],[email],[create_time],[update_time],[picture],[sex],[city],[remarks],[address],[id_number])

     VALUES
           (1,'account01','password01','name01',11111111,09111111111,'111@gmail' ,'2024-06-09','2024-06-09',null,'f',1,null,'address01','a00000001'),
		   (1,'account02','password02','name02',22222222,09222222222,'222@gmail' ,'2024-06-09','2024-06-09',null,'f',1,null,'address02','a00000002'),
		   (2,'account03','password03','name03',33333333,09333333333,'333@gmail' ,'2024-06-09','2024-06-09',null,'m',1,null,'address03','a00000003'),
		   (2,'account04','password04','name04',44444444,09444444444,'444@gmail' ,'2024-06-09','2024-06-09',null,'m',1,null,'address04','a00000004'),
		   (2,'account05','password05','name05',55555555,09555555555,'555@gmail' ,'2024-06-09','2024-06-09',null,'m',1,null,'address05','a00000005')

GO

INSERT INTO [dbo].[employee]
           ([account_type],[account],[password],[name],[tel],[phone],[email],[create_time],[update_time],[picture],[sex],[start_date],[sick_leave_hours],[personal_leave_hours],[annual_leave_hours],[bereavement_leave_hours],[marriage_leave_hours],[menstrual_leave_hours],[official_leave_hours],[team_leader_id],[branch],[end_date])
     
	 VALUES
           (3,'account-emp01','password-emp01','name-emp01','00000001','090000001','email@emp01',2024-06-09,2024-06-09,null,'f','2020-06-09',11,11,11,11,11,11,111,null,1,null),
		   (3,'account-emp02','password-emp02','name-emp02','00000002','090000002','email@emp02',2024-06-09,2024-06-09,null,'f','2020-06-09',12,12,12,12,12,12,222,null,1,null),
		   (3,'account-emp03','password-emp03','name-emp03','00000003','090000003','email@emp03',2024-06-09,2024-06-09,null,'m','2020-06-09',13,13,13,13,13,13,333,null,1,null),
		   (4,'account-emp04','password-emp04','name-emp04','00000004','090000004','email@emp04',2024-06-09,2024-06-09,null,'m','2020-06-09',14,14,14,14,14,14,444,null,1,null),
		   (4,'account-emp05','password-emp05','name-emp05','00000005','090000005','email@emp05',2024-06-09,2024-06-09,null,'m','2020-06-09',15,15,15,15,15,15,444,null,1,null)
GO	

INSERT INTO [dbo].[car]
			([production_year],[milage],[customer_id],[employee_id],[negotiable],[condition_score],[branch],[state],[price],[launch_date],[carinfo_id],[color],[remark],[create_time],[update_time])
         
     VALUES
           (2021,1000,1,1,1,91,1,1,100000,'2024-06-09',1,'green',1,'2022-06-09','2022-06-09'),
		   (2022,2000,2,2,2,92,1,1,200000,'2024-06-09',1,'red',1,'2022-06-09','2022-06-09'),
		   (2023,3000,3,3,3,93,1,1,300000,'2024-06-09',1,'blue',1,'2022-06-09','2022-06-09'),
		   (2024,4000,4,4,4,94,1,1,400000,'2024-06-09',1,'white',1,'2022-06-09','2022-06-09'),
		   (2025,5000,5,5,5,95,1,1,500000,'2024-06-09',1,'silver',1,'2022-06-09','2022-06-09')
GO

INSERT INTO [dbo].[preference]
			([select_name],[production_year],[price],[milage],[score],[customer_id],[carinfo_id],[brand],[suspension],[door],[passenger],[rear_wheel],[gasoline],[transmission],[cc],[hp],[torque],[create_time],[update_time],[preferences_lists])

     VALUES
           ('select_name01',2021,1000000,10000,90,1,1,null,null,null,null,null,null,null,null,null,null,'2024-06-09','2024-06-09',1),
		   ('select_name02',null,null,null,null,2,2,null,null,null,null,null,null,null,null,null,null,'2024-06-09','2024-06-09',1),
		   ('select_name03',2023,3000000,30000,93,3,null,1,1,1,1,1,1,1,1,null,null,'2024-06-09','2024-06-09',1),
		   ('select_name04',null,null,null,null,4,null,1,1,1,1,1,1,1,1,null,null,'2024-06-09','2024-06-09',1),
		   ('select_name05',null,null,null,null,5,null,1,1,1,1,1,1,1,1,null,null,'2024-06-09','2024-06-09',1)
GO

INSERT INTO [dbo].[leave]
			([leave_status],[start_time],[end_time],[leave_type],[employee_id],[deputy_id],[team_leader_id],[permision_remarks],[permision_status],[audit_time],[reason],[actual_leave_hours],[image],[special_leave_hours],[create_time],[update_time],[validity_period_start],[validity_period_end])

     VALUES
           (0,'2024-06-09 09:00','2024-06-09 18:00',1,1,5,5,'permision_remarks01',1,'2024-06-01','reason01',8,null,null,'2024-05-09','2024-05-09',null,null),
		   (0,'2024-06-10 09:00','2024-06-09 18:00',1,2,5,5,'permision_remarks02',1,'2024-06-01','reason02',8,null,null,'2024-05-09','2024-05-09',null,null),
			(0,'2024-06-11 09:00','2024-06-09 18:00',1,3,5,5,'permision_remarks03',1,'2024-06-01','reason03',8,null,null,'2024-05-09','2024-05-09',null,null),
           (1,null,null,5,4,null,5,'permision_remarks04',1,'2024-06-01','reason04',null,null,44,'2024-05-09','2024-05-09','2024-06-09','2025-05-09'),
		   (1,null,null,5,5,null,5,'permision_remarks05',1,'2024-06-01','reason05',null,null,55,'2024-05-09','2024-05-09','2024-06-10','2025-05-10')
GO

INSERT INTO [dbo].[agenda]
           ([employee_id],[business_purpose],[unavailable_time_str],[unavailable_time_end],[unavailable_status],[create_time],[update_time])
     VALUES
           (1,'business_purpose01','2024-06-01 09:00','2024-06-01 10:00',1,'2023-06-01 09:00','2024-06-01 09:00'),
		   (2,'business_purpose02','2024-06-01 09:00','2024-06-01 18:00',2,'2023-06-01 09:00','2024-06-01 09:00'),
		   (3,'business_purpose03','2024-06-01 09:00','2024-06-01 18:00',3,'2023-06-01 09:00','2024-06-01 09:00'),
		   (1,'business_purpose04','2024-06-01 10:00','2024-06-01 14:00',1,'2023-06-01 09:00','2024-06-01 09:00'),
		   (1,'business_purpose05','2024-06-01 15:00','2024-06-01 18:00',1,'2023-06-01 09:00','2024-06-01 09:00')
GO

INSERT INTO [dbo].[kpi]
           ([season_str_day],[team_leader_rating],[total_score],[sales_score],[employee_id],[create_time],[update_time])
     VALUES
           ('2024-01-01',91,91,91,1,'2024-03-31','2024-03-31'),
		   ('2024-01-01',92,92,92,2,'2024-03-31','2024-03-31'),
		   ('2024-01-01',93,93,93,3,'2024-03-31','2024-03-31'),
		   ('2024-04-01',94,94,94,1,'2024-06-30','2024-06-30'),
		   ('2024-07-01',95,95,95,1,'2024-09-30','2024-09-30')
GO

/*Counter 表*/

INSERT INTO [dbo].[view_car]
           ([view_time_section],[car_id],[sales_score],[factory_score],[view_car_date],[car_score],[deal],[customer_id],[create_time],[update_time],[view_car_status])
     VALUES
           (1,1,91,91,'2024-06-09',91,1,1,'2023-06-09','2023-06-09',1),
		   (1,2,92,92,'2024-06-09',92,1,2,'2023-06-09','2023-06-09',1),
		   (1,3,93,93,'2024-06-09',93,1,3,'2023-06-09','2023-06-09',1),
		   (1,4,94,94,'2024-06-09',94,1,4,'2023-06-09','2023-06-09',1),
		   (1,5,95,95,'2024-06-09',95,1,5,'2023-06-09','2023-06-09',1)

GO

INSERT INTO [dbo].[like]
           ([car_id],[customer_id],[create_time],[update_time])
     VALUES
           (1,1,'2023-06-09','2023-06-09'),
		   (2,2,'2023-06-09','2023-06-09'),
		   (3,3,'2023-06-09','2023-06-09'),
		   (4,4,'2023-06-09','2023-06-09'),
		   (5,5,'2023-06-09','2023-06-09')
GO

INSERT INTO [dbo].[image]
           ([image],[car_id],[create_time],[update_time],[is_list_pic],[is_main_pic])
     VALUES
		   (0x0000,1,'2023-06-09','2023-06-09',0,1),
		   (0x0000,2,'2023-06-09','2023-06-09',0,1),
		   (0x0000,3,'2023-06-09','2023-06-09',1,0),
		   (0x0000,4,'2023-06-09','2023-06-09',1,0),
		   (0x0000,5,'2023-06-09','2023-06-09',1,0)
GO

INSERT INTO [dbo].[car_adjust]
           ([team_leader_id],[employee_id],[car_id],[approval_status],[approval_type],[floating_amount],[create_time],[update_time])
     VALUES
           (5,1,1,1,1,1000000000,'2023-06-09','2023-06-09'),
		   (5,2,2,1,2,2000000000,'2023-06-09','2023-06-09'),
		   (5,3,3,1,3,null,'2023-06-09','2023-06-09'),
		   (5,4,4,1,1,4000000000,'2023-06-09','2023-06-09'),
		   (5,5,5,1,2,5000000000,'2023-06-09','2023-06-09')
GO

INSERT INTO [dbo].[view_car_assigned]
           ([team_leader_id],[employee_id],[view_car_id],[assigned_status],[create_time],[update_time])
     VALUES
           (5,1,2,2,'2023-06-09','2023-06-09'),
		   (5,2,2,1,'2023-06-09','2023-06-09'),
		   (5,3,3,1,'2023-06-09','2023-06-09'),
		   (5,4,4,1,'2023-06-09','2023-06-09'),
		   (5,5,5,1,'2023-06-09','2023-06-09')
GO

INSERT INTO [dbo].[notice]
           ([category],[create_time],[update_time],[viewable_notification],[read_status],[receiver],[account_type],[view_car_id],[view_car_assigned_id],[car_id],[preference_id])
     VALUES
           (2,'2023-06-09','2023-06-09',1,1,1,1,2,1,null,null),
		   (2,'2023-06-09','2023-06-09',1,1,2,2,2,2,null,null),
		   (2,'2023-06-09','2023-06-09',1,1,3,3,3,3,null,null),
		   (1,'2023-06-09','2023-06-09',1,1,4,4,null,null,4,4),
		   (1,'2023-06-09','2023-06-09',1,1,5,1,null,null,5,5)
GO