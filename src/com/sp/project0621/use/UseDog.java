//������ ���� ���� �ٰ� ���� �����ϰ��� �ϴ� ��Ű���� ���ش�.
package com.sp.project0621.use;

//����Ϸ��� Ŭ������ ���ʹ� �ٸ� ��ġ�� �������� �ݵ��
//import �ؾ��Ѵ�.. �̶� import�� ��ġ�� ��� �������� �ϳ�?
//ȯ�溯���� ��ϵ� ���̳ʸ� ��Ʈ�� �������� �Ѵ�...
import com.sp.project0621.animal.Dog;
class UseDog{
	public static void main(String[] args){
		Dog d = new Dog();
		boolean gender = d.isBoy();
		System.out.println(gender);
		//������ ���� ��θ� �����ص� �ȴ�.
		//new com.sp.project0621.animal.Dog();
	}
}