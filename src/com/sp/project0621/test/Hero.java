package com.sp.project0621.test;
public class Hero {
	int hp=10;
	boolean fly=false;
	String name="�ް���";
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
	//Bullet �� ��ü�� �ڷ���
	public void fire(Bullet bullet){
		this.bullet = bullet;
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		//�⺻ �ڷ����� �����Ƿ�
		hero.setHp(500); //������
		hero.setFly(true);	//������
		//string �� �ν��Ͻ� �̴�.
		hero.setName("��");
		//�ν��Ͻ��� �;��Ѵ�.
		hero.fire(new Bullet());		
	}	
}
