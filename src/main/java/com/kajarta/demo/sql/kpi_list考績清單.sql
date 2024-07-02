CREATE TABLE [dbo].[kpi_list](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[season_str_day] [datetime] NOT NULL,
	[team_leader_rating] [int] NULL, 
	[total_score] [decimal](5, 1) NULL,
	[sales_score] [int] NULL,
	[member_id] [int] NOT NULL,
	[create_time] [datetime] NOT NULL,
	[update_time] [datetime] NOT NULL,
 CONSTRAINT [PK_kpi_list] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
