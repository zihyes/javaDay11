package upcasting;

class Test{}

public class Ex03 {
	public static void main(String[] args) {
	//int num = 100; //기존 방법
	Object num = 100; // int형과 String 자료형도 Object로 받을 수 있음
	Object name = "홍길동";
	Object t;
//	System.out.println(num);
//	System.out.println(name);
	System.out.println( num.getClass() );
	System.out.println( name.getClass() );
	
	int a = 100 + (int)num; // downcasting : 부모형태 > 자식형태 :자기 자신이 원래형태로 돌아옴 
	//int a = 100 + num => num을 object로 받아서 정수와 연산 불가오류 / 하나의 형태로 받는건 편한데 다시 형변환 해줘야 하는 번거로움 존재 
	System.out.println( a );
	
	}
	
	
}
