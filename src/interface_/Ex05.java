package interface_;

class A지상군05 implements TestInt05{

	@Override
	public void attack() {
		attack1();
		attack2();
		attac();
		System.out.println("지상군 공격");
	}
	public void attack1() {
		System.out.println("총알 장전");
	}
	public void attack2() {
		System.out.println("총을 들어 올립니다.");
	}
	public void attac() {
		System.out.println("조준을 합니다.");
	}
	@Override
	public void defense() {	
		System.out.println("지상군 방어");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		TestInt05 a = new A지상군05(); // 부모코드로 upcasting > 
		//A지상군05 a = new A지상군05(); 자식코드
		a.attack(); a.defense();
	}
}
