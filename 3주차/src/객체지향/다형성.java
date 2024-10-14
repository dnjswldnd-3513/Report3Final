package 객체지향;


class 리모컨{
	public void click() {
		System.out.println("클릭");
	}
}

class 에어컨 extends 리모컨
{
	@Override
	public void click() {
		System.out.println("냉풍");
	}
}

class 교실에어컨 extends 리모컨{
	@Override
	public void click() {
		System.out.println("온풍");
	}
}


public class 다형성 {//에어컨 리모컨
	
	public static void main(String[] args) {
		리모컨[] lm = {new 교실에어컨(),new 에어컨()};
		
		for (리모컨 리모컨 : lm) {
			리모컨.click();
		}
	}
}
