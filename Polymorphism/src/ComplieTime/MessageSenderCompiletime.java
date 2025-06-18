package ComplieTime;

public class MessageSenderCompiletime {
	void sendMessage(String message) {
		System.out.println("sending text message:"+message);
	}
	
	void sendMessage(String message,String recipent) {
		System.out.println("sending text message:"+recipent+":"+message);
	}
	void sendMessage(String message,boolean isUrgent) {
		if (isUrgent)
			System.out.println("Urgent:"+message);
		else
			System.out.println("Sending message:"+message);
	}

	public static void main(String[] args) {
		MessageSenderCompiletime sender = new MessageSenderCompiletime();
		sender.sendMessage("Hello!");
		sender.sendMessage("Hello","ABC");
		sender.sendMessage("Server domn!",true);
		
	}

}
