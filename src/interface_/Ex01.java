package interface_;

interface A01{//실질적인 코드가 없어야지만 interface 생성가능(중괄호 형태 불가능)
	public void test1(); 
	/*
	public void test() { //이러한 형태 불가능!!
	}
	*/
}	
interface B01{
	public void test1(); //코드 없어서 이 인터페이스 상속받는 클래스는 실체화 시켜야 함!!
}
class Class01{}
class Class02{}


public class Ex01 extends Class01 implements A01, B01{// inplements : interface 상속 키워드
	//Class끼리는 하나의 클래스만 상속 가능
	//implements : interface 상속키워드; 인터페이스에 정의된 멤버들을 클래스에서 대신 구현하겠다라는 의미
	@Override
	public void test1() {
		// TODO Auto-generated method stub 
	}
}
