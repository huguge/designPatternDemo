package com.ezhu.chainOfResponsibility.leave;

public class OtherProcess extends Approver {

	public OtherProcess(String name) {
		super(name);
	}

	@Override
	public void processRequest(LeaveRequest request) {
		System.err.println("请假日期过长，不通过！");
	}

}
