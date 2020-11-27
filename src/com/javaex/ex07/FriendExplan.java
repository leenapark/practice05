package com.javaex.ex07;

public class FriendExplan {
	
	// 필드
	private String name;
	private String hp;
	private String school;
	// 생성자 -> 메모리의 올리는 작엉ㅂ
	//두개다 만들자
	public FriendExplan() {}
	public FriendExplan(String name, String hp, String school) {
		
	// getter/setter	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("이름: " + name + " 핸드폰: " + hp + " 학교: " + school);
	}
	
	
	
	@Override
	public String toString() {
		return "FriendExplan [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}
	
	
	
	
	
}
