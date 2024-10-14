package 다섯가지원칙;

class Dog{
	
	String name;
	int weight;
	
	public Dog(String name,int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void sound() {
		System.out.println(name+" : 멍멍");
	}
	
	public void info() {
		System.out.println("이름 "+name + ", 무게 :"+weight); 
	}
	
}

class DogMove{
	public void dogRun(Dog dog) {
		System.out.println(dog.name + "가 뛰고 있다.");
	}
}

public class 단일책임 {

	public static void main(String[] args) {
		Dog 백구 = new Dog("백구", 30);
		DogMove move = new DogMove();
		move.dogRun(백구);
	}
}
