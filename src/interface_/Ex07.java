package interface_;

public class Ex07 {
	public static void main(String[] args) {
		TestInt07 t01 = Singletone07.getInstance();
		TestInt07 t02 = Singletone07.getInstance();
		TestInt07 t03 = Singletone07.getInstance();
		TestInt07 t04 = Singletone07.getInstance();
		TestInt07 t05 = Singletone07.getInstance();
		
		t01.test();
		
		/*
		TestClass07 t01 = new TestClass07_1();
		TestClass07 t02 = new TestClass07_1();
		TestClass07 t03 = new TestClass07_1();
		TestClass07 t04 = new TestClass07_1();
		TestClass07 t05 = new TestClass07_1();
		*/
	}

}
