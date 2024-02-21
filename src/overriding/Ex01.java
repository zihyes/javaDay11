package overriding;

class Ferrari{
	private int ye;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km 달립니다.");
	}
	public void onCar() {
		System.out.println("자동차 시동을 켭니다.");
	}
}
class NewFerrari extends Ferrari{// NewFerrari 마우스 가져다대면 add constructor
	public void speed() {// overriding
		System.out.println(getYe() + "년식 페라리 속도 변경"); //기존 메서드를 새로운 메서드로 사용 가능!!! 
		System.out.println("500km까지 달릴 수 있습니다.");
	}
	public NewFerrari(int ye) { 
		super(ye);
	}
	public void autoSystem() { //상속
		System.out.println("자동 운전모드를 실행합니다.");
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
	NewFerrari f = new NewFerrari(2025);
	f.onCar();
	f.speed();
	f.autoSystem();
}
}
