import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankManager {

	public static void main(String[] args) {
		ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
		
		System.out.println(BankMessage.MSG_HELLO);
		Scanner scanner = new Scanner(System.in);
		
		boolean bClose = false;
		
		while(!bClose) {
			System.out.println(BankMessage.MSG_SELECT_MENU);
			
			int cmd = 0;
			
			try {
				cmd = scanner.nextInt();				
			} catch (InputMismatchException ex) {
				System.out.println(ex.toString());
				continue;
			}
			
			switch(cmd) {
			case BankCommand.CMD_CREATE:
				System.out.println(BankMessage.MSG_INPUT_NAME);
				String inputName = scanner.next();
				
				BankAccount newAccount = new BankAccount(inputName);
				bankAccounts.add(newAccount);
				
				System.out.println(String.format(BankMessage.MSG_GET_ACCOUNT_ID, newAccount.getAccountID()));
				continue;
				
			case BankCommand.CMD_DEPOSIT:
				System.out.println(BankMessage.MSG_INPUT_ACCOUNT_ID);
				
				int accountID = 0;
				try {
					accountID = scanner.nextInt();				
				} catch (InputMismatchException ex) {
					System.out.println(ex.toString());
					continue;
				}
				
				boolean bFoundAccount = false;
				
				for(BankAccount bankAccount : bankAccounts) {
					if (bankAccount.getAccountID() == accountID) {
						bFoundAccount = true;
						
						System.out.println(BankMessage.MSG_SET_AMOUNT);
						
						int amount = 0;
						try {
							amount = scanner.nextInt();				
						} catch (InputMismatchException ex) {
							System.out.println(ex.toString());
							continue;
						}
						
						bankAccount.deposit(amount);
						System.out.println(String.format(BankMessage.MSG_GET_ACCOUNT_ID, bankAccount.getAccountID()));
						break;
					}
				}
				
				if (bFoundAccount == false) {
					System.out.println(BankMessage.MSG_CANNOT_FIND_ACCOUNT);
					continue;
				}
				
				break;
				
			case BankCommand.CMD_EXIT:
				bClose = true;
				break;
			}
		}
		
		scanner.close();
	}
}
