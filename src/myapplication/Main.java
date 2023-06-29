
package myapplication;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		My_Process process = new My_Process();
		boolean finished = false;
		System.out.println("Hello Bakpiaa");
                
		do {
				System.out.println("\n");
				System.out.println("Option: ");
				System.out.println("\t 1. Message Contact");	
				System.out.println("\t 2. Messages");	
				System.out.println("\t 3. Quit");
				String choose = input.next();
                                
				switch(choose) {
				case "1":
					boolean finish_myContact = false;
					do {
						System.out.println("\n");
						System.out.println("Option: ");
						System.out.println("\t 1. Show all contact");	
						System.out.println("\t 2. Add a new contact");	
						System.out.println("\t 3. Search a contact");
						System.out.println("\t 4. Delete a contact");
						System.out.println("\t 5. Go back to the previous menu");
						String chooseContact = input.next();
						switch(chooseContact) {
							case "1":
								System.out.println("Contact List: ");	
								process.list();
								s.nextLine();
								break;
                                                                
							case "2":
								System.out.println("Add contact name: ");
								input.nextLine();
								String name = input.nextLine();
								System.out.println("Add contact number: ");
								String num = input.next();
								System.out.println("Add contact email: ");
								String email = input.next();
								process.add(name, num, email);
								System.out.println("Contact successfully added");
								s.nextLine();
								break;
                                                                
							case "3":
								System.out.println("Search contact: ");
								input.nextLine();
								String searchContact = input.nextLine();
								list = process.search(searchContact);
								if(list.size() == 0) {
									System.out.println(searchContact + " doesn't exist in your contact");
								} else {
									for(int i = 0; i < list.size(); i++) {
										System.out.println((i+1) + ". " + list.get(i));
									}
									int index = input.nextInt();
									Contact temp = process.detail(list.get(index  - 1));
									System.out.println("Name: " + temp.getName());
									System.out.println("Number: " + temp.getNum());
									System.out.println("Email: " + temp.getEmail());
								}
								s.nextLine();
								break;
                                                                
							case "4":
								process.list();
								System.out.println("Delete contact: ");
								int deleteContact = input.nextInt();
								process.delete(deleteContact);
								System.out.println("Contact successfully deleted");
								s.nextLine();
								break;
							case "5":
								finish_myContact = true;
								break;
                                                                
							default:
								System.out.println("Wrong input!");
						}
					} while (finish_myContact == false);
					break;
				
				case "2":
					boolean finish_Messages = false;
					do {
						System.out.println("\n");
						System.out.println("Option: ");
						System.out.println("\t 1. See the list of all messages");	
						System.out.println("\t 2. Send a new message");	
						System.out.println("\t 3. Go back to the previous menu");
						int chooseMessage = input.nextInt();
                                                
						switch(chooseMessage) {
						case 1:
							process.list();
							System.out.println("Check Message: ");
							int msgIndex = input.nextInt();
							process.checkMsg(msgIndex);
							s.nextLine();
							break;
                                                        
						case 2:
							System.out.println("Where to: ");
							input.nextLine();
							String recp = input.nextLine();
							if(process.detail(recp) != null) {
								System.out.println("Message: ");
								String msg = input.nextLine();
								process.addMsg(msg, recp);
								System.out.println("Message sent!");
							} else {
								System.out.println(recp + "doesn't exist in your contact!!");
							}
							s.nextLine();
							break;
                                                        
						case 3:
							finish_Messages = true;
							break;
						}
					} while (finish_Messages == false);
					break;
                                        
				case "3":
					finished = true;
					break;
                                        
				default:
						System.out.println("Wrong input!!");
				}
		}while(finished == false);
		input.close();
		s.close();
	}
}

    

