package RunTime;

public class Messenger {
	void send() {
		System.out.println("sending a generic message");
	}
}
class WhatsAppMessenger extends Messenger {
	void send() {
		System.out.println("sending via whatsapp");
	}
}
class EmailMessenger extends Messenger{
	void send() {
		System.out.println("sending via email");
	}
	public static void main(String[] args) {
		Messenger messenger;
		messenger = new WhatsAppMessenger();
		messenger.send();
		messenger = new EmailMessenger();
		messenger.send();

	}

}
