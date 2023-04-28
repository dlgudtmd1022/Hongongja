package chapter02.ex3;

public class Tire {

	public int mR;
	public int aR;
	public String location;
	
	public Tire(String location, int mR) {
		this.location = location;
		this.mR = mR;
	}
	
	public boolean roll(){
		++aR;
		if(aR < mR) {
			System.out.println(location + "타이어수명" + (mR-aR) + "회");
			return true;
		}else {
			System.out.println("***" + location + " 펑트 ***");
			return false;
		}
	}
	
}
