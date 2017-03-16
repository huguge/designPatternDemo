package com.ezhu.chainOfResponsibility;

public class Client {

	public static void main(String[] args) {
		Approver tom, tony, jack, li;
		tom = new Director("tom");
		tony = new VicePresident("tony");
		jack = new President("jack");
		li = new Congress("li");
		
		Approver joe = new Manager("joe");
		
		// 创建职责链
		tom.setSuccessor(tony);
		tony.setSuccessor(jack);
		jack.setSuccessor(li);
		
		PurchaseRequest pr1 = new PurchaseRequest(49000, 1001, "购买一批笔记本电脑");
		tom.processRequest(pr1);
		
		PurchaseRequest pr11 = new PurchaseRequest(79000, 10011, "购买一批打印机");
		joe.processRequest(pr11);
		
		PurchaseRequest pr2 = new PurchaseRequest(99999, 1002, "租一间写字间");
		tony.processRequest(pr2);
		
		PurchaseRequest pr3 = new PurchaseRequest(490000, 1003, "买一间写字楼");
		jack.processRequest(pr3);
		
		PurchaseRequest pr4 = new PurchaseRequest(1000000, 1004, "买一间公司");
		li.processRequest(pr4);
		
		/*
		 * @output:
		 * 	主任tom审批采购单：1001,金额：49000.0元，采购目的：购买一批笔记本电脑。
			副董事长tony审批采购单：1002,金额：99999.0元，采购目的：租一间写字间。
			董事长jack审批采购单：1003,金额：490000.0元，采购目的：买一间写字楼。
			召开董事会审批采购单1004,金额：1000000.0元，采购目的：买一间公司。
			
			新增管理者后的输出
		   	主任tom审批采购单：1001,金额：49000.0元，采购目的：购买一批笔记本电脑。
			经理joe审批采购单：10011,金额：79000.0元，采购目的：购买一批打印机。
			副董事长tony审批采购单：1002,金额：99999.0元，采购目的：租一间写字间。
			董事长jack审批采购单：1003,金额：490000.0元，采购目的：买一间写字楼。
			召开董事会审批采购单1004,金额：1000000.0元，采购目的：买一间公司。
		 */
		
	}

}
