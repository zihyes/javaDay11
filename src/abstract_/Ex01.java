package abstract_;

abstract class Test01{
	public abstract void speed(); // 공통으로 사용하는 기능이 있을때 서로 다르게 사용해야할 때 사용
//		System.out.println("2024년 속도 기능");
//	}
	public void myBreak() {
		System.out.println("멈춤 기능");
	}
}
class TestClass01 extends Test01{
	public void speed() {
		System.out.println("2025");
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드");
	}
	public void autoSystem1() {
		System.out.println("자동 운전 모드");
	}
	public void autoSystem2() {
		System.out.println("자동 운전 모드");
	}
	public void autoSystem3() {
		System.out.println("자동 운전 모드");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.speed(); t.myBreak(); t.autoSystem();
	}
}
