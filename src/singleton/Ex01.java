package singleton;

class Test01{
	int num;
	static int cnt;
	public Test01() { //생성자 생성 > 객체가 생성됐다.
		cnt++; 
		System.out.println(cnt + " : 객체 생성");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t01 = new Test01(); //new연산 만날때마다 생성자 호출 > 객체가 생성
		Test01 t02 = new Test01();
		Test01 t03 = new Test01();
		
		t01.num = 100;
		t02.num = 100;
		t03.num = 100;
		
		System.out.println(t01 + " : " + t01.num);
		System.out.println(t02 + " : " + t02.num);
		System.out.println(t03 + " : " + t03.num);
	}
}
