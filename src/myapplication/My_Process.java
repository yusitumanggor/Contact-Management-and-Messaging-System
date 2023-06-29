
package myapplication;

import java.util.ArrayList;

public class My_Process extends Main{

   private ArrayList<Contact> contact = new ArrayList<>();
	private ArrayList<String> list = new ArrayList<>();
	
	public My_Process() {
		contact.add(new Contact("Icy", "082254339911", "icyitnow@gmail.com"));
		contact.add(new Contact("Mala", "085730675831", "nirmalapr@gmail.com"));
		contact.add(new Contact("Manik", "082144234143", "Manikkartika@gmail.com"));
		contact.add(new Contact("Nolla", "081338641249", "nollaarista@gmail.com"));
		contact.add(new Contact("Niken", "082329239776", "dndlion@gmail.com"));
	}
	
	private void sort(ArrayList<Contact> list) {
		list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
	}
	 
	public void list() {
		sort(contact);
		for(int i = 0; i < contact.size(); i++) {
			System.out.println("\t" + (i+1) + ". " + contact.get(i).getName());
		}
	}
	
	public void add(String name, String num, String email) {
		contact.add(new Contact(name, num, email));
	}
	
	public Contact detail(String name) {
		for(Contact con: contact) {
			if(con.getName().equals(name)) {
				return con;
			}
		}
		return null;
	}
	
	public ArrayList<String> search(String name) {
		list.clear();
		for(Contact con: contact) {
			if(con.getName().toLowerCase().contains(name)) {
				list.add(con.getName());
			}
		}
		return list;
	}
	
	public boolean isExist(String name) {
		if(detail(name) == null) {
			return false;
		}
		return true;
	}

	public void delete(int index) {
		contact.remove(index - 1);
	}
	
	public void addMsg(String msg, String recp) {
		for(int i = 0; i < contact.size(); i++) {
			if(contact.get(i).getName().equals(recp)) {
				this.contact.get(i).addMessages(msg, recp);
			}
		}
	}
	
	public void checkMsg(int index) {
		if(!contact.get(index - 1).getMessages().isEmpty()) {
			for(Messages msg: contact.get(index - 1).getMessages()) {
				System.out.println("Id: " + msg.getId());
				System.out.println("Text: " + msg.getText());
				System.out.println("Recipient: " + msg.getRecepient());
			};
		} else {
			System.out.println("There is no message!!");
		}
	}
}
    

