package com.javaex.ex08;

public class Account {

    private String accountNo;
    private static int balance;
    public static int money;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    
    //필요한 메소드 작성
    
    public static void deposit(int balance) {
    	money = money + balance;
    }
    
    public static void withdraw(int balance) {
    	money = money - balance;
 
    }

    
    public static int showBalance() {
    	System.out.println(money);
    	return money;
    }
    
}
