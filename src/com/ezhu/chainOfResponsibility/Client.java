package com.ezhu.chainOfResponsibility;

public class Client {

	public static void main(String[] args) {
		Approver tom, tony, jack, li;
		tom = new Director("tom");
		tony = new VicePresident("tony");
		jack = new President("jack");
		li = new Congress("li");
		
		// 创建职责链
		tom.setSuccessor(tony);
		tony.setSuccessor(jack);
		jack.setSuccessor(li);
		
		PurchaseRequest pr1 = new PurchaseRequest(49000, 1001, "购买一批笔记本电脑");
		tom.processRequest(pr1);
		
		PurchaseRequest pr2 = new PurchaseRequest(99999, 1002, "租一间写字间");
		tony.processRequest(pr2);
		
		PurchaseRequest pr3 = new PurchaseRequest(490000, 1003, "买一间写字楼");
		jack.processRequest(pr3);
		
		PurchaseRequest pr4 = new PurchaseRequest(1000000, 1004, "买一间公司");
		li.processRequest(pr4);
		
	}

}
