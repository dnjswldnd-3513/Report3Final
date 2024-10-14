package 다섯가지원칙;


interface Animal{
	void sound();
}

class DogClass implements Animal{

	@Override
	public void sound() {
		System.out.println("멍");
	}
}

class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}


class Listen_animal_sound {
	public void sound(Animal animal) {
		animal.sound();
	}
}



public class 개방폐쇄원칙 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Listen_animal_sound listen  = new Listen_animal_sound();
		listen.sound(cat);
	}
}
