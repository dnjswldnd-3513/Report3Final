package Stream라이브러리;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Member{
	
	int id;
	String name;
	  String birth;
	String address;
	
	public Member(int id,String name,String birth,String addres) {
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.address = addres;
	}
}
class Member2{
	
	int id;
	String name;
	 int age;
	String address;
	
	public Member2(int id,String name,int age,String addres) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = addres;
	}
}


public class 과제 {

	public 과제() {
		
		List<Member> list = new ArrayList<>();
		list.add(new Member(0, "이름1", "2007-03-12", "한국"));
		list.add(new Member(1, "이름2", "2007-03-13", "한국"));
		list.add(new Member(2, "이름3", "2007-03-14", "한국"));
		
		List<Member2> list2 = list.stream()
				.map(e -> {
					LocalDate birthdate = LocalDate.parse(e.birth);
					int age = Period.between(birthdate, LocalDate.now()).getYears();
					return new Member2(e.id, e.name,age,e.address);
				}).
				collect(Collectors.toList());
		
		list2.forEach(e -> System.out.println(e.age));
		
	}
	
	public static void main(String[] args) {
		new 과제();
	}
}
