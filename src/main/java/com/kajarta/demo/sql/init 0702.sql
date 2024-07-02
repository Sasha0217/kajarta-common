

USE master;
GO
CREATE DATABASE kajarta


USE master ;
USE [kajarta]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[agenda](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[employee_id] [int] NOT NULL,
	[business_purpose] [nvarchar](50) NOT NULL,
	[unavailable_time_str] [datetime] NOT NULL,
	[unavailable_time_end] [datetime] NOT NULL,
	[unavailable_status] [tinyint] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
 CONSTRAINT [PK_agenda] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[car]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[car](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[production_year] [int] NOT NULL,
	[milage] [int] NOT NULL,
	[customer_id] [int] NOT NULL,
	[employee_id] [int] NOT NULL,
	[negotiable] [tinyint] NULL,
	[condition_score] [int] NOT NULL,
	[branch] [tinyint] NOT NULL,
	[state] [tinyint] NOT NULL,
	[price] [decimal](18, 0) NOT NULL,
	[launch_date] [datetime] NOT NULL,
	[carinfo_id] [int] NOT NULL,
	[color] [nvarchar](20) NOT NULL,
	[remark] [tinyint] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
 CONSTRAINT [PK_car_list] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[car_adjust]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[car_adjust](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[team_leader_id] [int] NOT NULL,
	[employee_id] [int] NOT NULL,
	[car_id] [int] NOT NULL,
	[approval_status] [tinyint] NOT NULL,
	[approval_type] [tinyint] NOT NULL,
	[floating_amount] [decimal](18, 0) NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
 CONSTRAINT [PK_car_adjust] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[carinfo]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[carinfo](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[brand] [tinyint] NOT NULL,
	[model_name] [tinyint] NOT NULL,
	[model] [tinyint] NOT NULL,
	[door] [tinyint] NOT NULL,
	[passenger] [tinyint] NOT NULL,
	[rear_wheel] [tinyint] NOT NULL,
	[gasoline] [tinyint] NOT NULL,
	[transmission] [tinyint] NOT NULL,
	[cc] [tinyint] NOT NULL,
	[hp] [int] NOT NULL,
	[torque] [float] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
 CONSTRAINT [PK_carinfo_list] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[customer]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[customer](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account_type] [tinyint] NOT NULL,
	[account] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[name] [nvarchar](20) NOT NULL,
	[tel] [varchar](20) NULL,
	[phone] [varchar](20) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
	[picture] [varbinary](max) NULL,
	[sex] [char](1) NOT NULL,
	[city] [tinyint] NOT NULL,
	[remarks] [nvarchar](50) NULL,
	[address] [nvarchar](50) NOT NULL,
	[id_number] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[employee]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account_type] [tinyint] NOT NULL,
	[account] [varchar](20) NOT NULL,
	[password] [varchar](20) NOT NULL,
	[name] [nvarchar](20) NOT NULL,
	[tel] [varchar](20) NULL,
	[phone] [varchar](20) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
	[picture] [varbinary](max) NULL,
	[sex] [char](1) NOT NULL,
	[start_date] [date] NOT NULL,
	[sick_leave_hours] [int] NULL,
	[personal_leave_hours] [int] NULL,
	[annual_leave_hours] [int] NULL,
	[bereavement_leave_hours] [int] NULL,
	[marriage_leave_hours] [int] NULL,
	[maternal_leave_hours] [int] NULL,
	[paternity_leave_hours] [int] NULL,
	[menstrual_leave_hours] [int] NULL,
	[official_leave_hours] [int] NULL,
	[team_leader_id] [int] NULL,
	[branch] [tinyint] NOT NULL,
	[end_date] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[image]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[image](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[image] [varbinary](max) NOT NULL,
	[car_id] [int] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
	[list_pic_id] [tinyint] NOT NULL,
	[is_main_pic] [tinyint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[kpi]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[kpi](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[season_str_day] [datetime] NOT NULL,
	[team_leader_rating] [int] NULL,
	[total_score] [decimal](5, 1) NULL,
	[sales_score] [int] NULL,
	[employee_id] [int] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
 CONSTRAINT [PK_kpi_list] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[leave]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[leave](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[leave_status] [tinyint] NOT NULL,
	[start_time] [datetime] NULL,
	[end_time] [datetime] NULL,
	[leave_type] [tinyint] NOT NULL,
	[employee_id] [int] NOT NULL,
	[deputy_id] [int] NULL,
	[team_leader_id] [int] NOT NULL,
	[permision_remarks] [nvarchar](50) NULL,
	[permision_status] [tinyint] NULL,
	[audit_time] [datetime] NULL,
	[reason] [nvarchar](50) NOT NULL,
	[actual_leave_hours] [int] NULL,
	[image] [varbinary](max) NULL,
	[special_leave_hours] [int] NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
	[validity_period_start] [datetime] NULL,
	[validity_period_end] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[like]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[like](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[car_id] [int] NOT NULL,
	[customer_id] [int] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
 CONSTRAINT [PK_like_list] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[notice]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[notice](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[category] [tinyint] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
	[viewable_notification] [tinyint] NOT NULL,
	[read_status] [tinyint] NOT NULL,
	[receiver] [int] NULL,
	[account_type] [tinyint] NOT NULL,
	[view_car_id] [int] NULL,
	[view_car_assigned_id] [int] NULL,
	[car_id] [int] NULL,
	[preference_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[preference]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[preference](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[select_name] [nvarchar](20) NOT NULL,
	[production_year] [int] NULL,
	[price] [decimal](18, 0) NULL,
	[milage] [int] NULL,
	[score] [int] NULL,
	[customer_id] [int] NOT NULL,
	[carinfo_id] [int] NULL,
	[brand] [tinyint] NULL,
	[suspension] [tinyint] NULL,
	[door] [tinyint] NULL,
	[passenger] [tinyint] NULL,
	[rear_wheel] [tinyint] NULL,
	[gasoline] [tinyint] NULL,
	[transmission] [tinyint] NULL,
	[cc] [tinyint] NULL,
	[hp] [int] NULL,
	[torque] [float] NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
	[preferences_lists] [tinyint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[view_car]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[view_car](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[view_time_section] [tinyint] NOT NULL,
	[car_id] [int] NOT NULL,
	[sales_score] [int] NOT NULL,
	[factory_score] [int] NOT NULL,
	[view_car_date] [datetime] NOT NULL,
	[car_score] [int] NOT NULL,
	[deal] [tinyint] NOT NULL,
	[customer_id] [int] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
	[view_car_status] [tinyint] NOT NULL,
 CONSTRAINT [PK_view_car] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[view_car_assigned]    Script Date: 2024/7/2 下午 05:08:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[view_car_assigned](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[team_leader_id] [int] NOT NULL,
	[employee_id] [int] NOT NULL,
	[view_car_id] [int] NOT NULL,
	[assigned_status] [tinyint] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
 CONSTRAINT [PK_view_car_assigned] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[agenda]  WITH CHECK ADD  CONSTRAINT [fk_agenda_employee] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[agenda] CHECK CONSTRAINT [fk_agenda_employee]
GO
ALTER TABLE [dbo].[car]  WITH CHECK ADD  CONSTRAINT [fk_car_carinfo] FOREIGN KEY([carinfo_id])
REFERENCES [dbo].[carinfo] ([id])
GO
ALTER TABLE [dbo].[car] CHECK CONSTRAINT [fk_car_carinfo]
GO
ALTER TABLE [dbo].[car]  WITH CHECK ADD  CONSTRAINT [fk_car_customer] FOREIGN KEY([customer_id])
REFERENCES [dbo].[customer] ([id])
GO
ALTER TABLE [dbo].[car] CHECK CONSTRAINT [fk_car_customer]
GO
ALTER TABLE [dbo].[car]  WITH CHECK ADD  CONSTRAINT [fk_car_employee] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[car] CHECK CONSTRAINT [fk_car_employee]
GO
ALTER TABLE [dbo].[car_adjust]  WITH CHECK ADD  CONSTRAINT [fk_caradjust_car] FOREIGN KEY([car_id])
REFERENCES [dbo].[car] ([id])
GO
ALTER TABLE [dbo].[car_adjust] CHECK CONSTRAINT [fk_caradjust_car]
GO
ALTER TABLE [dbo].[car_adjust]  WITH CHECK ADD  CONSTRAINT [fk_caradjust_employee] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[car_adjust] CHECK CONSTRAINT [fk_caradjust_employee]
GO
ALTER TABLE [dbo].[employee]  WITH CHECK ADD  CONSTRAINT [fk_employee_employee] FOREIGN KEY([team_leader_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[employee] CHECK CONSTRAINT [fk_employee_employee]
GO
ALTER TABLE [dbo].[image]  WITH CHECK ADD  CONSTRAINT [fk_image_car] FOREIGN KEY([car_id])
REFERENCES [dbo].[car] ([id])
GO
ALTER TABLE [dbo].[image] CHECK CONSTRAINT [fk_image_car]
GO
ALTER TABLE [dbo].[kpi]  WITH CHECK ADD  CONSTRAINT [fk_kpi_employee] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[kpi] CHECK CONSTRAINT [fk_kpi_employee]
GO
ALTER TABLE [dbo].[leave]  WITH CHECK ADD  CONSTRAINT [fk_leave_employee] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[leave] CHECK CONSTRAINT [fk_leave_employee]
GO
ALTER TABLE [dbo].[like]  WITH CHECK ADD  CONSTRAINT [fk_like_car] FOREIGN KEY([car_id])
REFERENCES [dbo].[car] ([id])
GO
ALTER TABLE [dbo].[like] CHECK CONSTRAINT [fk_like_car]
GO
ALTER TABLE [dbo].[like]  WITH CHECK ADD  CONSTRAINT [fk_like_customer] FOREIGN KEY([customer_id])
REFERENCES [dbo].[customer] ([id])
GO
ALTER TABLE [dbo].[like] CHECK CONSTRAINT [fk_like_customer]
GO
ALTER TABLE [dbo].[notice]  WITH CHECK ADD  CONSTRAINT [fk_notice_car] FOREIGN KEY([car_id])
REFERENCES [dbo].[car] ([id])
GO
ALTER TABLE [dbo].[notice] CHECK CONSTRAINT [fk_notice_car]
GO
ALTER TABLE [dbo].[notice]  WITH CHECK ADD  CONSTRAINT [fk_notice_preference] FOREIGN KEY([preference_id])
REFERENCES [dbo].[preference] ([id])
GO
ALTER TABLE [dbo].[notice] CHECK CONSTRAINT [fk_notice_preference]
GO
ALTER TABLE [dbo].[notice]  WITH CHECK ADD  CONSTRAINT [fk_notice_viewcar] FOREIGN KEY([view_car_id])
REFERENCES [dbo].[view_car] ([id])
GO
ALTER TABLE [dbo].[notice] CHECK CONSTRAINT [fk_notice_viewcar]
GO
ALTER TABLE [dbo].[notice]  WITH CHECK ADD  CONSTRAINT [fk_notice_viewcarassigned] FOREIGN KEY([view_car_assigned_id])
REFERENCES [dbo].[view_car_assigned] ([id])
GO
ALTER TABLE [dbo].[notice] CHECK CONSTRAINT [fk_notice_viewcarassigned]
GO
ALTER TABLE [dbo].[preference]  WITH CHECK ADD  CONSTRAINT [fk_preference_carinfo] FOREIGN KEY([carinfo_id])
REFERENCES [dbo].[carinfo] ([id])
GO
ALTER TABLE [dbo].[preference] CHECK CONSTRAINT [fk_preference_carinfo]
GO
ALTER TABLE [dbo].[preference]  WITH CHECK ADD  CONSTRAINT [fk_preference_customer] FOREIGN KEY([customer_id])
REFERENCES [dbo].[customer] ([id])
GO
ALTER TABLE [dbo].[preference] CHECK CONSTRAINT [fk_preference_customer]
GO
ALTER TABLE [dbo].[view_car]  WITH CHECK ADD  CONSTRAINT [fk_viewcar_car] FOREIGN KEY([car_id])
REFERENCES [dbo].[car] ([id])
GO
ALTER TABLE [dbo].[view_car] CHECK CONSTRAINT [fk_viewcar_car]
GO
ALTER TABLE [dbo].[view_car]  WITH CHECK ADD  CONSTRAINT [fk_viewcar_customer] FOREIGN KEY([customer_id])
REFERENCES [dbo].[customer] ([id])
GO
ALTER TABLE [dbo].[view_car] CHECK CONSTRAINT [fk_viewcar_customer]
GO
ALTER TABLE [dbo].[view_car_assigned]  WITH CHECK ADD  CONSTRAINT [fk_viewcarassigned_employee] FOREIGN KEY([employee_id])
REFERENCES [dbo].[employee] ([id])
GO
ALTER TABLE [dbo].[view_car_assigned] CHECK CONSTRAINT [fk_viewcarassigned_employee]
GO
ALTER TABLE [dbo].[view_car_assigned]  WITH CHECK ADD  CONSTRAINT [fk_viewcarassigned_viewcar] FOREIGN KEY([view_car_id])
REFERENCES [dbo].[view_car] ([id])
GO
ALTER TABLE [dbo].[view_car_assigned] CHECK CONSTRAINT [fk_viewcarassigned_viewcar]
GO
USE [master]
GO
ALTER DATABASE [kajarta] SET  READ_WRITE 
GO
