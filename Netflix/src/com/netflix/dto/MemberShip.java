package com.netflix.dto;

public abstract class MemberShip {
	private String id;
	private String nickname;
	private String signup_date;
	private int point;

	public MemberShip() {
	}

	public MemberShip(String id, String nickname, String signup_date, int point) {
		this.id = id;
		this.nickname = nickname;
		this.signup_date = signup_date;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSignup_date() {
		return signup_date;
	}

	public void setSignup_date(String signup_date) {
		this.signup_date = signup_date;
	}

	public int getPoint() {
		return point = 1000;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return id + "\t" + getMemberShip() + "\t" + nickname + "\t" + signup_date + "\t" + point;
	}

	public abstract String getMemberShip();
}
