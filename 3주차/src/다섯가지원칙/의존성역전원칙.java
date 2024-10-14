package 다섯가지원칙;

interface DogBehavior {
	void bark();
}



class Dog2 implements DogBehavior{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}

class DogTrainer {
	private DogBehavior dog;

	public DogTrainer(DogBehavior dog) {
		this.dog = dog;
	}
	
	public void train() {
		dog.bark();
		System.out.println("강아지가 훈련받고 있습니다.");
	}
}


public class 의존성역전원칙 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		DogTrainer trainer = new DogTrainer(dog);
		trainer.train();
	}
}
