package com.sp.project0621.use;
import com.sp.project0621.bank.Account;
//�����ϱ��ѵ�, ���α׷��� �ǵ��� �� �� �����Ƿ� * �� �ǰ���� �ʴ´�.
//import com.sp.project0621.bank.*;
class UseAccount{
	public static void main(String[] args){
		Account acc=new Account();		
		acc.balance = -5000000;
		System.out.println(acc.balance);
	}
}
