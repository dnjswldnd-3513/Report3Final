package Abstract;

import javax.swing.JFrame;

abstract class Base extends JFrame{
	
	public void setFrame(JFrame f,String t,int x,int y) {
		
	}
	
	abstract void closing(); 
	abstract void des();
	abstract void act();
}


public class Main extends Base{

	public Main() {
		setFrame(null, getName(), EXIT_ON_CLOSE, ABORT);
	}
	
	public static void main(String[] args) {
		new Main();
	}

	@Override
	void closing() {
	}

	@Override
	void des() {
		
	}

	@Override
	void act() {
	}

}
