package com.ezhu.chainOfResponsibility.leave;

public class LeaveRequest {

	private int dayNumber;// 请假天数
	private String purpose;// 请假目的

	public LeaveRequest(int dayNumber, String purpose) {
		super();
		this.dayNumber = dayNumber;
		this.purpose = purpose;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}
