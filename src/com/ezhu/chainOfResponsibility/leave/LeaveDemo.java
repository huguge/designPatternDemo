package com.ezhu.chainOfResponsibility.leave;

import java.util.Scanner;

public class LeaveDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days;
		String purpose;
		System.err.print("请输入请假天数：");
		days = scanner.nextInt();
		System.err.print("请输入请假理由：");
		purpose = scanner.next();
		
		
		Approver tom, tony, jack, li;
		tom = new Director("tom");
		tony = new Manager("tony");
		jack = new GeneralManager("jack");
		li = new OtherProcess("li");
		
		// 创建职责链
		tom.setSuccessor(tony);
		tony.setSuccessor(jack);
		jack.setSuccessor(li);
		
		LeaveRequest lr = new LeaveRequest(days, purpose);
		tom.processRequest(lr);
		
		//@output:抛出错误：Exception in thread "main" java.lang.StackOverflowError
		// 明天解决。
		
		// 解决了，原因是当前处理者自己处理不好，因为代码原因，无法传递给后继者。
		
	}

}
