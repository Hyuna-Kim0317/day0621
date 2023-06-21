package com.sp.project0621.test;
public class Hero {
	int hp=10;
	boolean fly=false;
	String name="메가맨";
	Bullet bullet;
	
	public void setHp(int hp) {  
		this.hp = hp;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	public void setName(String name) {	
		this.name = name;
	}
	//Bullet 은 객체형 자료형
	public void fire(Bullet bullet){
		this.bullet = bullet;
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		//기본 자료형을 썼으므로
		hero.setHp(500); //데이터
		hero.setFly(true);	//데이터
		//string 도 인스턴스 이다.
		hero.setName("가");
		//인스턴스가 와야한다.
		hero.fire(new Bullet());		
	}	
}
