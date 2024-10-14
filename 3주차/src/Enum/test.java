package Enum;



class Base{
	enum UserControl {
		NotUser,
		User,
		Admin
	}
}

public class test extends Base{

	public test(UserControl control,int move) {
		
	}
	//예전에는 User라는 리스트로 값을 담아서 가독성 없는 느낌이였고 
	//막상 생성자에서 제어할때도 숫자를 넣어서 비교하거나 boolean변수를 사용했는데 고정되어있지않아.
	//계속 헷갈리는 상황이 계속되었는데 이걸 base의 담아서 각 객체들이 불러낼때 고유한 값을 설정해놓으면 훨씬 가독성 있지 않을까요?
	//고착화 되면 move도 enum으로 해버릴수도 있을거 같습니다. 

}
