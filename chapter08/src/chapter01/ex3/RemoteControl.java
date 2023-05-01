package chapter01.ex3;

public interface RemoteControl {

	public int Max_V = 10;
	public int Min_V = 0;
	
	public void On();
	public void Off();
	public void sV(int volume);
}
