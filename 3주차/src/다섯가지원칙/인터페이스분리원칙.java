package 다섯가지원칙;


interface Pysical_Strength{//체력
	void printPS();
}

interface Manna {//마나
	void printMN();
}


class Wizard implements Pysical_Strength,Manna{//마법사
	@Override
	public void printMN() {
		System.out.println("마나가 존재하는 캐릭터 입니다.");
	}

	@Override
	public void printPS() {
		System.out.println("체력이 존재하는 캐릭텨입니다.");
	}

}

class people implements Pysical_Strength{//평범한 마을사람

	@Override
	public void printPS() {
		System.out.println("체력이 존재하는 캐릭터입니다.");
	}
	
}

public class 인터페이스분리원칙 {

	
	public static void main(String[] args) {
		
	}
}
