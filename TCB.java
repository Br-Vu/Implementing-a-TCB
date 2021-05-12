package tcbImpementation;

import java.util.Scanner;

public class TCB {
	
	private String key;
	private String[] keys = {"A00","B001","200D","300C"};
	
	public void setKey(String key) {
		this.key = key;
	}
	public String getKey() {
		return key;
	}

	public void printKey() {
		System.out.println(key);
	}
	
	/**
	 * Method tests to see if user provided a key that matches
	 * one of our hard coded security keys for access.
	 * @param key
	 * @return boolean
	 */
	public boolean keyTest(String key){
		if(key.equals(keys[0])) {
			return true;
		}
		else if (key.equals(keys[1])) {
			return true;
		}
		else if (key.equals(keys[2])) {
			return true;
		}
		else if (key.equals(keys[3])) {
			return true;
		}
		else return false;
	}
	
	/**
	 * Menu allows user to select actions that they would like
	 * to perform, if access granted will print to screen action
	 * they would be allowed to perform, otherwise program terminates.
	 */
	
	public void tcbMenu() {
		Scanner scanner = new Scanner(System.in);
		SecurityLevel secLvl = new SecurityLevel();
		int selection = 0;
		
		do {
		System.out.println("\n");
		System.out.println("[+] Menu Options: ");
		System.out.println("[1] Create New File");
		System.out.println("[2] Open File for Reading");
		System.out.println("[3] Open File for Appending");
		System.out.println("[4] Close a File");
		System.out.println("[5] Delete a file");
		System.out.println("[x] Any other number to quit");

		System.out.print("\n[+] Enter Selection: \n");
		
		
		
		try {
			selection = scanner.nextInt();}
		catch(Exception e) {
			scanner.next();
		}
		
		switch(selection) {
		
			case 1 : if(secLvl.newFile(getKey())) {
						System.out.println("Create a new file");
						break;
					}else {
						deny(selection);
					}
			case 2 : if(secLvl.openForRead(getKey())) {
						System.out.println("Open file for reading");
						break;
					}else {
						deny(selection);
					}
			case 3 : if(secLvl.openForAppend(getKey())) {
						System.out.println("Open file for appending");
						break;
					}else {
						deny(selection);
					}
			case 4 : if(secLvl.closeFile(getKey())) {
						System.out.println("Close a file");
						break;
					}else {
						deny(selection);
					}
			case 5 : if(secLvl.deleteFile(getKey())){
						System.out.println("Delete a file");
						break;
					}else {
						deny(selection);
					}
			default : System.out.println("Quiting ...");
					  break;
				}
			scanner.close();
			}
		while (true);
	}
	
	
	private void deny(int selection) {
		System.out.println("[+] Access denied. Program Terminated.");
		System.exit(selection);
	}

	
}