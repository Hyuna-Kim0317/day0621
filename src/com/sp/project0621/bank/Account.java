/*
��ü���� ����� Ư¡
1) ���
2) ����ȭ (���θ� �������� �ʴ� ��)
3) �߻�ȭ (������ �ڵ带 ����ȭ ��Ű�� ��)
4) ������***�߿�***(polymorphism)
*/

package com.sp.project0621.bank;

//���� ���¸� �����Ѵ�.
public class Account{
	//�ڹٿ����� �����ڰ� �ƹ��� ���������ڸ� ������� ������
	//����Ʈ�� default ���������ڰ� ����ȴ�..
	//public < protected < default(���� ���� ��Ű�������� ���ٰ���) < private
	//public ����X ��𼭰� ������ �� ���� ����
	//protected : ��� ���迡 ���� ���� ���� ��Ű���� ���� �� ���
	//private (�� class �������� ��� ����) ( ���� �� �� Ŭ���� �������� ���� ���� - �޼��忡�� ������)
	private String num="082-085468-89-567";
	private int balance =10000000;
	private String name = "batman";

	//�ܰ� ����
	public void setBalance(int b){
		//�ܺο��� ���޵� ���� �������, �� �����ʹ� ��ŷ���� ����!
		if(b>0){
			balance = b;
		}

		
	}
	public int getBalance(){
		return balance;
	}
}
