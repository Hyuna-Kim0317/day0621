//실행할 때는 다음 줄과 같이 실행하고자 하는 패키지를 써준다.
package com.sp.project0621.use;

//사용하려는 클래스가 나와는 다른 위치에 있을때는 반드시
//import 해야한다.. 이때 import의 위치는 어디를 기준으로 하나?
//환경변수에 등록된 바이너리 루트를 기준으로 한다...
import com.sp.project0621.animal.Dog;
class UseDog{
	public static void main(String[] args){
		Dog d = new Dog();
		boolean gender = d.isBoy();
		System.out.println(gender);
		//다음과 같이 경로를 명시해도 된다.
		//new com.sp.project0621.animal.Dog();
	}
}
