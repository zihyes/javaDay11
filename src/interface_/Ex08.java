package interface_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

interface Testin{
	int num = 100; //intetface에 메소드뿐만 아니라 변수도 생성 가능
	// interface안에서 만드는 변수는 무조건 static final로 생성
	// static들어간건 => 해당 클래스이름 or interface이름으로 접근 가능
	
	// public static final은 생략해도 자동으로 붙음
	public static final String msg = "내용";
	public final String msg1 = "내용";
	public static String msg2 = "내용";
}
public class Ex08 {
	public final int num = 1000;
	//public static int num;
	public static void main(String[] args) {
		System.out.println( Testin.num );
		//Testin.num = 4567; // final로 만든거 변경 불가능해서 변경시도하면 error발생
		List<String> arr = new ArrayList<>(); //앞뒤 형이 다르면 부모로 존재하는 구나
		HashMap<String, String> m = new HashMap<>();
	}
}
