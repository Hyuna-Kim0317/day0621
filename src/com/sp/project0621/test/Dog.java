package com.sp.project0621.test;
class Dog{
   String name;
   Food f;

   //static 이 붙지 않았으므로 인스턴스 메서드
   //인스턴스 메서드는 호출을 해야 사용이 가능하다.

   public void setName(String d) {
	   //this는 생략 가능	//중복이 안되기 때문
	   //name = d;
		this.name = d;
   }
	
	//Food는 객체자료형
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
		//멍멍이는 객체
		//내부적으로는 객체(멍멍) 자체가 넘어가는 게 아니라
		//메모리에 레퍼런스 주소값(@) 이 복사되어서 @ 가 넘어가는 것임


		//매개변수가 있는 메서드 호출시..
		//call by value
		//call by reference


		d.setName("멍멍이");
		d.setFood(new Food());
		d.setAge(x);
	}
}
