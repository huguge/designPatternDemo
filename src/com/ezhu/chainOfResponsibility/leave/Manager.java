package com.ezhu.chainOfResponsibility.leave;

public class Manager extends Approver {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void processRequest(LeaveRequest request) {
		if (request.getDayNumber() < 10) {
			System.err.println("经理" + this.name + "审批请假条，请假天数为：" 
					+ request.getDayNumber() + ", 请假理由是：" + request.getPurpose());
		} else {
			this.successor.processRequest(request);
		}
	}

}
