package com.ezhu.chainOfResponsibility.leave;

public class Director extends Approver {

	public Director(String name) {
		super(name);
	}

	@Override
	public void processRequest(LeaveRequest request) {
		if (request.getDayNumber() < 3) {
			System.err.println("主任" + this.name + "审批请假条，请假天数为：" 
					+ request.getDayNumber() + ", 请假理由是：" + request.getPurpose());
		} else {
			this.processRequest(request);
		}
	}

}
