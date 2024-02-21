package overriding;

class Test05{
	
}

public class Ex05 {

	public static void main(String[] args) {
		Test05 t = new Test05();
		System.out.println("aaa".getClass()); //getClass() : 현재 자료형이 어떤 자료형인지 알려줌
		System.out.println( t.getClass() );
		System.out.println( t.toString() ); // 자료형 + 어떤 공간에 있는지 알려줌 => overriding할 떄 많이 사용
		System.out.println( t ); //toString과 같음

	}

}
