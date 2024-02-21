package overriding;

final class Test03 { //final 키워드 => 상속받을 수 없다!!! => 사용하려면 extends 사용 안되고 new연산 통해 객체 생성해서 사용해야 함 
	public void test() {
		System.out.println("test03의 test 기능");
	}
}
class TestClass03{
	Test03 t = new Test03();
	public void test() { //부모의 test가 실행되는 게 아니라 자신의 test가 실행
		System.out.println("class03 test기능");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
}
}
