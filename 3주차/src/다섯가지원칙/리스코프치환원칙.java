package 다섯가지원칙;


class Sword{//검
	public void cutting() {
		
	}
	public void bigCutting() {
		System.out.println("------");	
	}
}

class GreatSword extends Sword{
}

class Dagger extends Sword{//단검
	@Override
	public void bigCutting() {
		System.out.println("에러");//단검은 크게 못 휘두른다.
	}
}


public class 리스코프치환원칙 {

	public 리스코프치환원칙() {
		// TODO Auto-generated constructor stub
	}

}
