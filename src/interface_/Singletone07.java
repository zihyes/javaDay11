package interface_;

public class Singletone07 {
	private static TestInt07 t;//인터페이스형식으로 저장되어있어서 => 
	private Singletone07() {}; //생성자
	public static TestInt07 getInstance() {
		if(t == null) {
			t = new TestClass07_1();
		}
		return t;
	}
}
