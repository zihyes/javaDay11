package singleton;

class Test02{
	int num;
	static int cnt;
	public Test02() {
		cnt++; 
		System.out.println(cnt + " : 객체 생성");
	}//생성자 호출 => 객체 생성 => 몇개까지 생성될까?
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t01 = new Test02(); //new연산 : 생성자 호출, 이때 생성자가 public이면 사용자가 언제든지 new연산 사용해서 객체 생성 가능해서 싱글톤이 꺠져버리니까 생성자를 private로 만들기!
		Test02 t02 = t01;
		Test02 t03 = t02;
//		Test02 t04 = new Test02();
		
		t01.num = 100;
		t02.num = 200;
		t03.num = 300;
		
		System.out.println(t01 + " : " + t01.num);
		System.out.println(t02 + " : " + t02.num);
		System.out.println(t03 + " : " + t03.num);
	}
}