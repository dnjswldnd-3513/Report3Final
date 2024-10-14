package 익명함수;



interface Move{
	void run();
}

public class Main {
	public static void main(String[] args) {
		Move my = () -> System.out.println("함수형");
		my.run();
	}
}
