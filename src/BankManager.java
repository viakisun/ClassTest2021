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
				break;
				
			case BankCommand.CMD_EXIT:
				bClose = true;
				break;
			}
		}
		
		scanner.close();
	}
}
