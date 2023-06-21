package com.sp.project0621.use;
import com.sp.project0621.bank.Account;
//가능하긴한데, 프로그램의 의도를 알 수 없으므로 * 는 권고되지 않는다.
//import com.sp.project0621.bank.*;
class UseAccount{
	public static void main(String[] args){
		Account acc=new Account();		
		acc.balance = -5000000;
		System.out.println(acc.balance);
	}
}
