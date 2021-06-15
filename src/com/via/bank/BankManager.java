package com.via.bank;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankManager {

	// hashmap
	private HashMap<Integer, BankAccount> bankAccounts = new HashMap<>();
	private Scanner scanner;

	public BankManager() {

		System.out.println(BankMessage.MSG_HELLO);
		this.scanner = new Scanner(System.in);

		runManager();
	}

	private void runManager() {

		boolean bClose = false;

		while (!bClose) {

			// main menu
			int cmd = getCommand();
			if (cmd == BankDef.INVALID_CMD) {
				System.out.println(BankMessage.ERR_INVALID_CMD);
				continue;
			}

			switch (cmd) {
			case BankCommand.CMD_CREATE:
				processCreate();
				continue;

			case BankCommand.CMD_LOOKUP:
				processLookup();
				break;

			case BankCommand.CMD_DEPOSIT:
				processDeposit();
				break;

			case BankCommand.CMD_EXIT:
				bClose = true;
				break;
			}
		}

		this.scanner.close();
	}

	private int getCommand() {
		System.out.println(BankMessage.MSG_SELECT_MENU);

		try {
			printPrompt();
			int cmd = this.scanner.nextInt();

			if (cmd < 0 || cmd > 5)
				return BankDef.INVALID_CMD;

			return cmd;
		} catch (InputMismatchException ex) {
			System.out.println(ex.toString());
			return BankDef.INVALID_CMD;
		}
	}

	private void processCreate() {
		System.out.println(BankMessage.MSG_INPUT_NAME);
		printPrompt();
		String inputName = this.scanner.next();

		BankAccount newAccount = new BankAccount(inputName);
		this.bankAccounts.put(newAccount.getAccountID(), newAccount);

		System.out.println(String.format(BankMessage.MSG_GET_ACCOUNT_ID, newAccount.getAccountID()));
	}

	private void processLookup() {
		BankAccount bankAccount = getAccount();
		if (bankAccount == null)
			return;
		
		printCurrentBalance(bankAccount);
	}

	private void processDeposit() {
		BankAccount bankAccount = getAccount();
		if (bankAccount == null)
			return;

		System.out.println(BankMessage.MSG_SET_DEPOSIT_AMOUNT);
		int amount = 0;

		try {
			printPrompt();
			amount = this.scanner.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println(ex.toString());
			return;
		}

		bankAccount.deposit(amount);
		printCurrentBalance(bankAccount);
	}

	private BankAccount getAccount() {
		
		for (BankAccount bankAccount : this.bankAccounts.values()) {
			System.out.println(String.format(BankMessage.MSG_LIST_ACCOUNT, bankAccount.getOwner(),
					bankAccount.getAccountID(), bankAccount.getBalance()));
		}

		System.out.println(BankMessage.MSG_INPUT_ACCOUNT_ID);

		int accountID = -1;

		try {
			printPrompt();
			accountID = this.scanner.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println(ex.toString());
			return null;
		}
		
		return this.bankAccounts.get(accountID);
	}
	
	private void printCurrentBalance(BankAccount bankAccount) {
		System.out.println(String.format(BankMessage.MSG_CURRENT_BALANCE, bankAccount.getBalance()));
	}
	
	private void printPrompt() {
		System.out.print("> ");
	}
}
