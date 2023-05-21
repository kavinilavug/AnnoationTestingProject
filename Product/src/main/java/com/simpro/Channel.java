package com.simpro;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix = "myapp")
//@Component
public class Channel {
	private String channelName;
	private Integer channelid;
	private Company company;
	private List<String> topics;
	private Map<String,String> stockprice;
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Integer getChannelid() {
		return channelid;
	}
	public void setChannelid(Integer channelid) {
		this.channelid = channelid;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<String> getTopics() {
		return topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	public Map<String, String> getStockprice() {
		return stockprice;
	}
	public void setStockprice(Map<String, String> stockprice) {
		this.stockprice = stockprice;
	}
	@Override
	public String toString() {
		return "Channel [channelName=" + channelName + ", channelid=" + channelid + ", company=" + company + ", topics="
				+ topics + ", stockprice=" + stockprice + "]";
	}
	
}
