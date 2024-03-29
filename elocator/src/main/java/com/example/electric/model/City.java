package com.example.electric.model;

import org.springframework.beans.factory.annotation.Value;

public class City {
	
	@Value("${city.url}")
	private String url;
	@Value("${city.username}")
	private String userName;
	@Value("${city.password}")
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
