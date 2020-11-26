package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		//메인
		Member user01 = new Member();
		
		user01.setName("정우성");
		user01.setId("jws");
		user01.setPoint(50000);
		
		user01.showInfo();
		
		Member user02 = new Member();
		
		user02.setName("유재석");
		user02.setId("yjs");
		user02.setPoint(30000);
		
		user02.showInfo();
		
		Member user03 = new Member();
		
		user03.setName("이효리");
		user03.setId("lhr");
		user03.setPoint(40000);
		
		user03.showInfo();
		
		//test 용 toString
		//System.out.println(user03.toString());
	}

}
