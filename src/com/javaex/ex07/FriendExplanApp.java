package com.javaex.ex07;

import java.util.Scanner;

public class FriendExplanApp {
	public static void main(String[] args) {
	
		FriendExplan[] friendArray = new FriendExplan[3];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("친구 세명을 등록해주세요");
		
			
		
		for(int i=0; i<friendArray.length; i++) {
			//이름
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			//전화번호
			System.out.print("핸드폰: ");
			String hp = sc.nextLine();
			
			//학교
			System.out.print("학교: ");
			String school = sc.nextLine();
			
			FriendExplan fr = new FriendExplan();
			fr.setName(name);
			fr.setHp(hp);
			fr.setSchool(school);
			
			friendArray[i] = fr;
			
			System.out.println("------------------------------");
		}
		
		for(int i=0; i<friendArray.length; i++) {
			//System.out.println(friendArray[i].toString());
			friendArray[i].showInfo();
		}
		
		
		sc.close();
		
	}
	

}
