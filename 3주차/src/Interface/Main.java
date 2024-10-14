package Interface;



interface FormControl{
	
	default void formClosing() {}
	
	default void formStart() {}
	default void des() {}
	default void act() {}
	
	
}

public class Main implements FormControl{

	public Main() {
	}
	
	@Override
	public void des() {
	}
	
	@Override
	public void act() {
	}
	@Override
	public void formClosing() {
		System.out.println("종료");
	}
	
	@Override
	public void formStart() {
		System.out.println("시작");
	}

}
