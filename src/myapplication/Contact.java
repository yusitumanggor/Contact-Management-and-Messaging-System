
package myapplication;

import java.util.ArrayList;

public class Contact extends Main {
	private int i = 1;
	private String name, num, email;
	private ArrayList<Messages> messages = new ArrayList<>();

	public Contact(String name, String num, String email) {
		super();
		this.name = name;
		this.num = num;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getNum() {
		return num;
	}

	public String getEmail() {
		return email;
	}

	public ArrayList<Messages> getMessages() {
		return messages;
	}

	public void addMessages(String msg, String recp) {
		this.messages.add(new Messages(i, msg, recp));
		i++;
	}
	
	
}
