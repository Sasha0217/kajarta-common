CREATE TABLE [dbo].[view_car](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[view_time_section] [tinyint] NOT NULL,
	[car_id] [int] NOT NULL,
	[sales_score] [int] NOT NULL,
	[factory_score] [int] NOT NULL,
	[view_car_date] [datetime] NOT NULL,
	[car_score] [int] NOT NULL,
	[deal] [tinyint] NOT NULL,
	[member_id] [int] NOT NULL,
	[view_car_assigned_id] [int] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
	[view_car_status] [tinyint] NOT NULL,
 CONSTRAINT [PK_view_car] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
