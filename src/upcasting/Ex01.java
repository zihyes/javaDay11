package upcasting;

class A01{
	public void test() {
		System.out.println("aaaaa");
	}
}
class B01 extends A01{
	public void test() {
		System.out.println("bbbbb");
	}
}
class C01 extends A01{
	public void test() {
		System.out.println("ccccc");
	}
}
public class Ex01 { //casting : 형 변환, upcasting : 자식형태 > 부모형태로 형변환, downcasting : 부모형태 > 자식형태로 형변환
	//int n = (int)1.11; // 이방식은 casting이 아님 =>  upcasting사용하면 코드가 간결해지고 은닉화도 가능함
	public static void main(String[] args) {
		A01 a; // 자식형태 > 부모형태로 형변환 => upcasting
		a = new B01(); a.test(); //B01,C01은  A01라는 공통 부몰르 가지고 있으니까 A01로 저장할 수 있다
		a = new C01(); a.test();
		/*
		B01 b;
		C01 c;
		b = new B01(); b.test();
		c = new C01(); c.test();	
		*/
	}
}
