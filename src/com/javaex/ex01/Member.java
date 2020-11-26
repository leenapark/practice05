package com.javaex.ex01;

public class Member {
	
	//필드
	private String id;
	private String name;
	private int point;
	
	//생성자 생략 -> 초기화 생성자가 바탕에 자동 생성되어 있음
	
	//메소드 getter/setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//메소드 일반 : test용 toString
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", point=" + point + "]";
	}
	
	//메소드 일반 : 최종 출력용
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + "), " + point + "점");		
	}
	

}
