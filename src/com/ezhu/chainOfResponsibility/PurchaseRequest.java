package com.ezhu.chainOfResponsibility;

public class PurchaseRequest {

	private double amout;// 采购金额
	private int number;// 采购编号
	private String purpose;// 采购目的

	public PurchaseRequest(double amout, int number, String purpose) {
		super();
		this.amout = amout;
		this.number = number;
		this.purpose = purpose;
	}

	public double getAmout() {
		return amout;
	}

	public void setAmout(double amout) {
		this.amout = amout;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}

// 审批者类：抽象处理者
abstract class Approver {
	protected Approver successor;// 定义后继对象
	protected String name;// 审批者姓名

	public Approver(String name) {
		this.name = name;
	}

	// 设置后继者
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	// 抽象处理请求方法
	public abstract void processRequest(PurchaseRequest request);

}

// 主任类：具体处理者
class Director extends Approver {

	public Director(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmout() < 50000) {
			System.out.println("主任" + this.name + "审批采购单："
					+ request.getNumber() + ",金额：" + request.getAmout()
					+ "元，采购目的：" + request.getPurpose() + "。");// 处理请求
		} else {
			this.successor.processRequest(request);// 转发请求给后继者
		}
	}
}

// 新增经理类
// 经理类：具体处理者
class Manager extends Approver {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmout() < 80000) {
			System.out.println("经理" + this.name + "审批采购单："
					+ request.getNumber() + ",金额：" + request.getAmout()
					+ "元，采购目的：" + request.getPurpose() + "。");// 处理请求
		} else {
			this.successor.processRequest(request);// 转发请求给后继者
		}
	}
}

// 副董事长：具体处理者
class VicePresident extends Approver {

	public VicePresident(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmout() < 100000) {
			System.out.println("副董事长" + this.name + "审批采购单："
					+ request.getNumber() + ",金额：" + request.getAmout()
					+ "元，采购目的：" + request.getPurpose() + "。");// 处理请求
		} else {
			this.successor.processRequest(request);
		}
	}
}

// 董事长：具体处理者
class President extends Approver {

	public President(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmout() < 500000) {
			System.out.println("董事长" + this.name + "审批采购单："
					+ request.getNumber() + ",金额：" + request.getAmout()
					+ "元，采购目的：" + request.getPurpose() + "。");// 处理请求
		} else {
			this.successor.processRequest(request);
		}
	}
}

// 董事会类：具体处理者
class Congress extends Approver {

	public Congress(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		System.out.println("召开董事会审批采购单" + request.getNumber() + ",金额："
				+ request.getAmout() + "元，采购目的：" + request.getPurpose() + "。");// 处理请求
	}
}
