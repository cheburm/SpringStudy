package com.spring.study.di;

import org.springframework.stereotype.Component;

@Component("c2")
public class TvRemoteControl implements RemoteControl{
	
	private String company;
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void on() {
		System.out.println("TV 전원을켭니다");
	}

	@Override
	public void off() {
		System.out.println("TV 전원을끕니다");
		
	}

}
