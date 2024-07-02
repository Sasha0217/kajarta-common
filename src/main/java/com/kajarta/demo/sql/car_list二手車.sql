CREATE TABLE [dbo].[car_list](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[production_year] [int] NOT NULL,
	[milage] [int] NOT NULL,
	[list_pic_id] [int] NOT NULL,
	[pic_id] [int] NOT NULL,
	[member_id] [int] NOT NULL,
	[sales_id] [int] NOT NULL,
	[negotiable] [tinyint] NULL,
	[condition_score] [int] NOT NULL,
	[branch] [tinyint] NOT NULL,
	[state] [tinyint] NOT NULL,
	[price] [decimal](18, 0) NOT NULL,
	[launch_date] [datetime] NOT NULL,
	[model_id] [int](20) NOT NULL,
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
