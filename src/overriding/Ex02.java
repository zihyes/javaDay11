package overriding;

import java.util.ArrayList;

class Test02 extends ArrayList<String>{
	public String get(int i) {// overriding
		System.out.println( super.get(i) );
		//return "";
		return super.get(i);
	}
}
public class Ex02 {
	public static void main(String[] args) {
	Test02 t = new Test02();
	t.add("111"); //부모가 가지고 있는게 아니라 내가 가지고 있는 메소드를 추가
	t.add("222");
	t.add("333");
	t.get( 2 ); //기존 사용 방법 => 출력 기능 없음
	}
}
