CREATE TABLE [dbo].[car_adjust](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[team_leader_id] [int] NOT NULL,
	[sales_id] [int] NOT NULL,
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
