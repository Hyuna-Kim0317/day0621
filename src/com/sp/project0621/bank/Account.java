/*
객체지향 언어의 특징
1) 상속
2) 은닉화 (내부를 노출하지 않는 것)
3) 추상화 (복잡한 코드를 간략화 시키는 것)
4) 다형성***중요***(polymorphism)
*/

package com.sp.project0621.bank;

//고객의 계좌를 정의한다.
public class Account{
	//자바에서는 개발자가 아무런 접근제한자를 명시하지 않으면
	//디폴트로 default 접근제한자가 적용된다..
	//public < protected < default(오직 같은 패키지에서만 접근가능) < private
	//public 보안X 어디서건 누구나 다 접근 가능
	//protected : 상속 관계에 있을 때와 같은 패키지에 있을 때 허용
	//private (내 class 내에서만 사용 가능) ( 나만 즉 내 클래스 내에서는 접근 가능 - 메서드에서 변수를)
	private String num="082-085468-89-567";
	private int balance =10000000;
	private String name = "batman";

	//잔고 변경
	public void setBalance(int b){
		//외부에서 전달된 값이 음수라면, 이 데이터는 해킹으로 보자!
		if(b>0){
			balance = b;
		}

		
	}
	public int getBalance(){
		return balance;
	}
}
