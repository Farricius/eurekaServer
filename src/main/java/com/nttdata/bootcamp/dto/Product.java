package com.nttdata.bootcamp.dto;

import org.springframework.beans.factory.annotation.Value;

public class Product {

	private Integer productId;
	private String channel; // specify ¿?
	@Value("${local.server.port}")
	private String serverPort;

	public Product(Integer productId, String channel) {
		this.productId = productId;
		this.channel = channel;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getServerPort() {
		return serverPort;
	}

}
