package 객체지향;


class 현수형{
	public void code() {
		System.out.println("코드");
	}
}


class 대성이형 extends 현수형{
	public void code2() {
		System.out.println("코드2");
	}
}

public class 상속 {
	public static void main(String[] args) {
		대성이형 형 = new 대성이형();
		형.code();
		형.code2();
	}
}
