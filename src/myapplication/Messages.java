
package myapplication;

public class Messages {
	private int id;
	private String text, recepient;
	public Messages(int id, String text, String recepient) {
		super();
		this.id = id;
		this.text = text;
		this.recepient = recepient;
	}
	public int getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getRecepient() {
		return recepient;
	}
	
}
