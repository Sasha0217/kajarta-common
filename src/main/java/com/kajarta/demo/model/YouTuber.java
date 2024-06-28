package com.kajarta.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "youtuber")
public class YouTuber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@Column(name="channel_name")
	private String channelName;

	@Column(name="subscribe_count")
	private Integer subscribeCount;

	public YouTuber() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getSubscribeCount() {
		return subscribeCount;
	}

	public void setSubscribeCount(Integer subscribeCount) {
		this.subscribeCount = subscribeCount;
	}

}