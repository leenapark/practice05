package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
		
    	
        //메소드 내용작성
    	String sum = ""; //숫자랑 똑같음 0을 만든 상태에서 문자열을 더해줘야함
    	
    	for(int i=0; i<3; i++) {
    		sum = sum+strArray[i];
    	}
    	
    	return sum;
    	
    }

}
