package 객체지향;


abstract class Usb{
	public abstract void useUsb();
}

class 나 extends Usb{
	
	@Override
	public void useUsb() {
		System.out.println("내가 사용");
	}
}

class 형 extends Usb{
	@Override
	public void useUsb() {
		System.out.println("형이 사용");
	}
}


public class 추상화 {

	public static void main(String[] args) {
		Usb 나 = new 나();
		Usb 형 = new 형();
		
		나.useUsb();
		형.useUsb();
	}

}
