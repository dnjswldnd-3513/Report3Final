package 클래스;

class 학교 {
	String name;

	public 학교(String name) {
		this.name = name;
	}

	void printSchool() {
		System.out.println("학교이름 :" + name);
	}

	public static class 학생 {
		String name;
		String id;

		public 학생(String id, String name) {
			this.name = name;
			this.id = id;
		}

		void print학생() {
			System.out.println("학생이름 :" + name + " 학생 ID :" + id);
		}

	}
}


public class StaticClass {//학생 관리 시스템 만들어보기
	

	public static void main(String[] args) {
		학교 mySchool = new 학교("충주공고");
		mySchool.printSchool();
		
		학교.학생 student1 = new 학교.학생("2418","원지웅"); 
		student1.print학생();
	}
}
