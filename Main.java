package tcbImpementation;

import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TCB tcb = new TCB();
		
		
		int attempts = 3;
		boolean program = true;
		
		/** 
		 * User is tested for access based on key provided,
		 * 3 failed attempts will lead to termination of program.
		 */
		do {
			System.out.println("[+] Welcome to File Handler");
			System.out.print("[+] Enter Key: ");
			tcb.setKey(scanner.nextLine());
			if (tcb.keyTest(tcb.getKey()) == true) {
				System.out.println("[+] Valid Key, Entry Granted");
				tcb.tcbMenu();
				break;
			}
			else { 
				while (attempts > 0) {
					System.out.println("[+] Invalid Key, Access Denied.\n");
					System.out.println("[+] Try Again, you have " + attempts + " attempts remaining...");
					System.out.print("[+] Enter Key: ");
					tcb.setKey(scanner.nextLine());
					attempts --;
					
					if(tcb.keyTest(tcb.getKey()) == true) {
						System.out.println("[+] Valid Key, Entry Granted");
						tcb.tcbMenu();
						break;
					}
					if(attempts == 0) 
						System.out.println("\nYou have run out of attempts, Access Denied.");
						program = false;
					}
			program = false;
			};
			scanner.close();
		}
		while(program);
	}

}
