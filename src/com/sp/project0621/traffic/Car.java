package com.sp.project0621.traffic;
/*�ڵ����� �����ϵ�, �ִ��� ������ �ݿ�*/

//oop : ��ü���� ���
//objective orient programming
//�ڹ� = oop = ������ ��� �繰�� �ݿ��ϴ� ����!!
//�ڵ����� ������ ������ �ִ�.
//Car has a wheel : has a ����, ��ü�� �ٸ� ��ü�� �����ϰ� �ִ� ���
//has a ����� �Ѵ�...

public class Car{
	//���� ������ ������..
	//Car has a wheel
	Wheel w;
	Handle h;

	//car��� �̸��� �޼��� ����

	/*
	������(constructor)��?
	- �޼��� �̴�.
	- ��ü�� ������ ��, �� new �����ڰ� ȣ��Ǿ��� ��
	������ ������ ȣ��Ǵ� �޼���
	- �� ����ϳ�?
	�Ϲ� ������(����,����,������)�ʹ� �޸� ��ü�� �ʱ�ȭ ������
	�����ϰ� �Ŵ��ϴ�... ���� ���� �������� �ʱ�ȭ�� �ʿ��ϱ� ����
	- �����ڴ� ������ new ������ �ڿ� ���� ȣ���� �Ͼ�� ������
	������ ȣ���� ���� ���� ����..

	- �����ڴ� �Ϲ� �޼��尡 �ƴϱ⿡ ��ȯ�� ��ü�� ����...

	- ���� void �� ��ȯ���� �־������, �׶����� �׳� �Ϲݸ޼��尡 �Ǿ�
	������... �� �����ɷ� ����Ѵ�.. ( ������ �ȳ�..�ФѤ�)

	public void Car () : �Ϲ� �޼���
	public Car() : ������ �޼���
	*/
	/*
	����Ʈ ������ 
	��������? �ּ����� ������ �߻����� �ʵ��� �����Ŵ...
	new ������ �ڿ� ���� ȣ��Ǵ� ������ �޼���� ���Ͽ�,
	������ �߻��ϴ� ���� ����...
	�� �����ڰ� �����ڸ� �������� ������ �ּ��� ������ ���� �ʾƾ� 
	�ϹǷ� ����Ʈ �����ڰ� �����ȴ�..

	������, �����ڰ� �����ڸ� ���������� �����Ѵٸ�,
	����Ʈ �����ڴ� �������� �ʰ� �ȴ�.
	*/
	public Car(){
		System.out.println("���� ������ ������");

		//���� �� �ڵ����� �¾ ��, ������ ��� ��ü���� �޸𸮿� �÷��ش�.
		w = new Wheel();
		h = new Handle();
	}
	
}