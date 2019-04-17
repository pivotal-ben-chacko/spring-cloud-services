package com.ben.chacko.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SCSProperties {
	@Value("${shared.properties.userName}")
	private String userName;

	public String getTestData() {
		return userName;
	}

	public void setTestData(String userName) {
		this.userName = userName;
	}
}
