package com.netflix.dto;

public class Basic extends MemberShip {

	public Basic() {
		super();
	}

	public Basic(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}

	@Override
	public String getMemberShip() {
		return "Basic";
	}
}
