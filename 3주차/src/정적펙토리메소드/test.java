package 정적펙토리메소드;

import java.util.ArrayList;
import java.util.Map;

class 전자기기 {
	
	private String model;
	
	private 전자기기(String model) {
		this.model = model;
	}
	
	public static 전자기기 createPhone() {
		return new 전자기기("폰");
	}
	
	public static 전자기기 createComputer() {
		return new 전자기기("컴퓨터");
	}
	
	public String getmodel() {
		return this.model;
	}
}


public class test {//전자기기 ==> 폰,컴퓨터 

	public static void main(String[] args) {
		
		전자기기 phone = 전자기기.createPhone();
		전자기기 computer = 전자기기.createComputer();
		
		System.out.println(phone.getmodel());
		System.out.println(computer.getmodel());
	}
}
