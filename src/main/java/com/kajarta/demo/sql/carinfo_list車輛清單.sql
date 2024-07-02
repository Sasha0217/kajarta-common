CREATE TABLE [dbo].[carinfo_list](
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