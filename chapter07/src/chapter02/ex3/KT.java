package chapter02.ex3;

public class KT extends Tire{

	public KT(String location, int mR) {
		super(location, mR);
	}
	
	@Override
	public boolean roll() {
		++aR;
		if(aR < mR) {
			System.out.println(location + "한타 수명 :" + (mR-aR) + "회");
		return true;
		}else {
			System.out.println("***" + location + " 한타 펑크 ***");
		return false;
		}
	}
}
