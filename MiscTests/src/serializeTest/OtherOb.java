package serializeTest;

import java.io.Serializable;

public class OtherOb implements Serializable{

	String other;

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "OtherOb [other=" + other + "]";
	}
	

}
