package com.ezhu.chainOfResponsibility.leave;

import java.util.Scanner;

public class LeaveDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("请输入请假天数：");
		int num = Integer.parseInt(scanner.nextLine());
		
		System.err.println("num+++++++++"+num);
		
		Approver tom, tony, jack, li;
		tom = new Director("tom");
		tony = new Manager("tony");
		jack = new GeneralManager("jack");
		li = new OtherProcess("li");
		
		// 创建职责链
		tom.setSuccessor(tony);
		tony.setSuccessor(jack);
		jack.setSuccessor(li);
		
		LeaveRequest lr1 = new LeaveRequest(num, "请假理由稍后再写");
		tom.processRequest(lr1);
		
		LeaveRequest lr2 = new LeaveRequest(num, "请假理由稍后再写");
		tony.processRequest(lr2);
		
		LeaveRequest lr3 = new LeaveRequest(num, "请假理由稍后再写");
		jack.processRequest(lr3);
		
		LeaveRequest lr4 = new LeaveRequest(num, "请假理由稍后再写");
		li.processRequest(lr4);
		
		//@output:抛出错误：Exception in thread "main" java.lang.StackOverflowError
		// 明天解决。
		
	}

}
