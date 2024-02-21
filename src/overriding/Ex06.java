package overriding;

class TestDTO{
	String name;
	int age;
	@Override
	public String toString() { //object가 가지고 있는 toString을 overriding 했다.
		return "[name : " + name + ", age : " + age + "]";
	}
	
}

class Test06{
	TestDTO t;
	public Test06() { 
		t = new TestDTO();
	}
	public void setDTO() {
		t.name = "홍길동"; t.age = 200;
	}
	public void print() {
		System.out.println( t.name );
		System.out.println( t.age );
		System.out.println("------------------------");
		System.out.println( t.toString() );
		System.out.println( t );
	}
}
public class Ex06 {
	public static void main(String[] args) {
		Test06 t = new Test06();
		t.setDTO(); t.print();
	}

}
