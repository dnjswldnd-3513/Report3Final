package 다섯가지원칙;


interface MessageService{//의존성 역전원칙
	
	void sendMessage(String message);
}

class EmailService implements MessageService{
	@Override
	public void sendMessage(String message) {
		System.out.println("Sending message"+message);
	}
}

class InstargramDM implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending dm"+ message);
	}
}

class NotificationService{
	
	private MessageService service;
	
	public NotificationService(MessageService service) {
		this.service = service;
	}
	
	public void notifi(String t) {
		service.sendMessage(t);
	}
	
}

public class test {
	
	public static void main(String[] args) {
		MessageService email = new EmailService();
		NotificationService noti = new NotificationService(email);
		noti.notifi("안녕하세요! 이메일입니다.");
		
		MessageService dm = new InstargramDM();
		noti = new NotificationService(dm);
		noti.notifi("안녕하세요! dm입니다.");
		
	}
}
