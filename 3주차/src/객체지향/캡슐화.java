package 객체지향;



class BankAccount{
	
	private double balance;

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
				System.out.println("돈이 "+amount+"만큼 임금되었습니다.");
		}
	}
	
	
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("돈이 "+ amount  + "만큼 출금되었다.");
		}else {
			System.out.println("출금이 불가능합니다.");
		}
	}
}

public class 캡슐화 {
	
	public static void main(String[] args) {
		
		BankAccount myAcount = new BankAccount();
		myAcount.deposit(100);
		System.out.println("현재 잔액"+myAcount.getBalance());
		
		myAcount.withdraw(30);
		System.out.println("현재 잔액" +myAcount.getBalance());
	}
}
