
public class BankUtil {
	private static int lastAccountID = 1000000000;
	
	public static int getNewAccountID() {
		lastAccountID++;
		return lastAccountID;
	}
}
