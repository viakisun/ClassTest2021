import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		System.out.println("계좌 : 123-456789  (예금주 : 홍길동)");

		int select;
		int sum = 0;
		int money;

		while (true) {
			System.out.println("1.잔액\n2.입금\n3.출금\n4.거래완료");
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			if (select == 1) {
				System.out.println("잔액은 " + sum + "원 입니다.");
			} else if (select == 2) {
				money = sc.nextInt();
				if (money >= 0) {
					sum += money;
					System.out.println("잔액 : " + sum + "원 입니다.");
				} else {
					System.out.println("*음수 입력 불가* 다시 입력 해주세요. ");
					money = sc.nextInt();
					sum += money;
					System.out.println("잔액 : " + sum + "원 입니다.");
				}
			} else if (select == 3) {
				money = sc.nextInt();
				if (money >= 0) {
					sum -= money;
					System.out.println("잔액 : " + sum + "원 입니다.");
				} else {
					System.out.println("*음수 입력 불가* 다시 입력 해주세요.");
					money = sc.nextInt();
					sum -= money;
					System.out.println("잔액 : " + sum + "원 입니다.");
				}
			} else if (select == 4) {
				System.out.println("거래 완료. 안녕히가세요");
				break;
			} else
				System.out.println("다시 입력 해주세요. ");
		}
	}
}
