package overriding;

public class GetterSetter {
	private int x;
	private String y;
	public void setx(int b, String c) {
		this.x = b;
		this.y = c;
//		return b;
	}
	public int getx() {
		return x;
	}
	public String gety() {
		return y;
	}
}
