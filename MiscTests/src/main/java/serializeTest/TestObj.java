package serializeTest;

import java.io.Serializable;

public class TestObj implements Serializable {
	private static long serialVersionUid = 1234567L;
	int num; 
	String s;
	String s2;
	Double d;
	OtherOb otherOb;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public Double getD() {
		return d;
	}
	public void setD(Double d) {
		this.d = d;
	}
	
	public OtherOb getOtherOb() {
		return otherOb;
	}
	public void setOtherOb(OtherOb otherOb) {
		this.otherOb = otherOb;
	}
	@Override
	public String toString() {
		return "TestObj [num=" + num + ", s=" + s + ", s2=" + s2 + ", d=" + d
				+ ", otherOb=" + otherOb + "]";
	}
	
	
	
}
