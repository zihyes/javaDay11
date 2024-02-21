package singleton;

class Test03{
	private static Test03 t;
	int num;
	private Test03() {
		System.out.println("생성자 실행");
	}
	public static Test03 getInstance() {//static 메소드로 생성 시 => 해당 클래스 이름으로 접근 가능
		System.out.println("객체생성 메소드 연동");
		System.out.println("t : " + t);
		if( t == null )
			t = new Test03();
		return t;
		//Test03 t = new Test03();
		//return null;
	}
	//public static void test() {} //static 메소드로 생성 시 => 해당 클래스 이름으로 접근 가능
	//public void test() {} //일반적메소드 생성 시 => 객체.
	
}
public class Ex03 {
	public static void main(String[] args) {
		//Test03 t = new Test03();
		Test03 t01 = Test03.getInstance(); //최초로는 null값, 그 후에는 t의값이 들어오니까 객체에 대한 정보 있음
		Test03 t02 = Test03.getInstance();
		Test03 t03 = Test03.getInstance();
		
		t01.num = 1000; t02.num = 2000;
		
		System.out.println( t01 + " : " + t01.num);
		System.out.println( t02 + " : " + t02.num);
		System.out.println( t03 + " : " + t03.num);
	}
}
