package com.sp.project0621.test;
class Dog{
   String name;
   Food f;

   //static �� ���� �ʾ����Ƿ� �ν��Ͻ� �޼���
   //�ν��Ͻ� �޼���� ȣ���� �ؾ� ����� �����ϴ�.

   public void setName(String d) {
	   //this�� ���� ����	//�ߺ��� �ȵǱ� ����
	   //name = d;
		this.name = d;
   }
	
	//Food�� ��ü�ڷ���
   public void setFood(Food fd) {
		this.f = fd;
   }
   public void setAge(int age){
	   this.age = age;
   }
}

class UseDog{
	public static void main(String[] args){
		Dog d = new Dog();

		int x =7;
		//�۸��̴� ��ü
		//���������δ� ��ü(�۸�) ��ü�� �Ѿ�� �� �ƴ϶�
		//�޸𸮿� ���۷��� �ּҰ�(@) �� ����Ǿ @ �� �Ѿ�� ����


		//�Ű������� �ִ� �޼��� ȣ���..
		//call by value
		//call by reference


		d.setName("�۸���");
		d.setFood(new Food());
		d.setAge(x);
	}
}
