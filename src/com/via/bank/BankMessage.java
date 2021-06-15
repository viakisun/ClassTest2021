package com.via.bank;

public class BankMessage {
	public static final String MSG_HELLO = "> 군산은행에 오신 것을 환영합니다";
	public static final String MSG_SELECT_MENU = "> 업무를 선택해주세요\n1)개설 2)조회 3)입금 4)출금 5)종료";
	public static final String MSG_INPUT_NAME = "> 당신의 이름을 입력해주세요";
	public static final String MSG_GET_ACCOUNT_ID = "> 계좌 번호는 %d입니다";
	public static final String MSG_INPUT_ACCOUNT_ID = "> 계좌 번호를 입력하세요";
	public static final String MSG_SET_AMOUNT = "> 입금 금액을 넣으세요";
	public static final String MSG_SELECT_ACCOUNT = "> 계좌를 선택하세요";
	public static final String MSG_CURRENT_BALANCE = "> 현재 잔액 : %d";
	public static final String MSG_SET_DEPOSIT_AMOUNT = "> 입금할 금액을 입력하세요";
	public static final String MSG_LIST_ACCOUNT = "[%d] 소유주 %s : 계좌번호 %d, 잔액 %d원";
	
	public static final String ERR_INVALID_CMD = "[E] 유효하지 않은 명령어입니다";
	public static final String ERR_INVALID_ACCOUNT = "[E] 유효하지 않은 계좌입니다";
}
