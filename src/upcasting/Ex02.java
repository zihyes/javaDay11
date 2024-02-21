package upcasting;

class Parents{
	public void familyName() {
	System.out.println("이");
}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		/*
		Parents par = new Parents();
		par.name();
		Daughter d = new Daughter();
		d.name();
		Son s = new Son(); s.name();
		*/
		
		Parents par;// = new Parents(); //객체 생성 => 객체를 미리 생성하면 저장소 차지해서 비효율적 => upcasting
		//par.name(); //name 호출
		//Daughter d;// = new Daughter();
		//d.name();
		//Son s;// = new Son();
		
		//1번 아빠이름, 2번 딸, 3번 아들이름
		int num = 1;
		if(num == 1) {
			par = new Parents();
			par.name();
		}else if(num == 2) {
			par = new Daughter(); //동일 부모 가지고 있으니까 par로 받기
			par.name();
		}else {
			par = new Son();
			par.name();
		}
	}
}
