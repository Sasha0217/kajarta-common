CREATE TABLE [dbo].[view_car_assigned](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[team_leader_id] [int] NOT NULL,
	[sales_id] [int] NOT NULL,
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
