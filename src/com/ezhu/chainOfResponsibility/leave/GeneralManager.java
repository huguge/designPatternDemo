package com.ezhu.chainOfResponsibility.leave;

public class GeneralManager extends Approver {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void processRequest(LeaveRequest request) {
		if (request.getDayNumber() < 30) {
			System.err.println("总经理" + this.name + "审批请假条，请假天数为：" 
					+ request.getDayNumber() + ", 请假理由是：" + request.getPurpose());
		} else {
			this.successor.processRequest(request);
		}
	}

}
