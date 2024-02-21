package overriding;

class Test04{
	public void test() { //부모가 가진 타입과 조금이라도 다르면 overriding 불가! 개수, 타입, 반환타입, 접근제한자 모두 동일해야 함
		System.out.println("부모 실행");
	}
}
class TestClass04 extends Test04{
	public void test() {
		System.out.println("자식 실행");
	}
}
public class Ex04 {

	public static void main(String[] args) {
//		TestClass04 t = new TestClass04();
//		t.test();
	}
}
