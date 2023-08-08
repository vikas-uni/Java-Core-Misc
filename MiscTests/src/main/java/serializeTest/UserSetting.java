package serializeTest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class UserSettings implements Externalizable {

	// This is required
	public UserSettings() {

	}

	private String doNotStoreMe;

	private Integer fieldOne;
	private String fieldTwo;
	private boolean fieldThree;

	public String getDoNotStoreMe() {
		return doNotStoreMe;
	}

	public void setDoNotStoreMe(String doNotStoreMe) {
		this.doNotStoreMe = doNotStoreMe;
	}

	public Integer getFieldOne() {
		return fieldOne;
	}

	public void setFieldOne(Integer fieldOne) {
		this.fieldOne = fieldOne;
	}

	public String getFieldTwo() {
		return fieldTwo;
	}

	public void setFieldTwo(String fieldTwo) {
		this.fieldTwo = fieldTwo;
	}

	public boolean isFieldThree() {
		return fieldThree;
	}

	public void setFieldThree(boolean fieldThree) {
		this.fieldThree = fieldThree;
	}

	/**
	 * Only thing you need to remember is � The readExternal() method must read the
	 * values in the same sequence and with the same types as were written by
	 * writeExternal()
	 */
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		fieldOne = in.readInt();
		fieldTwo = in.readUTF();
		fieldThree = in.readBoolean();
	}

	/**
	 * writeExternal() method is used to provide the logic for serialization i.e.
	 * writing the fields of class into bytes. You are free to store only those
	 * fields which you want back after reading the serialized object back. Ignore
	 * rest of the field.
	 */
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(fieldOne);
		out.writeUTF(fieldTwo);
		out.writeBoolean(fieldThree);
	}

	@Override
	public String toString() {
		return "UserSettings [doNotStoreMe=" + doNotStoreMe + ", fieldOne=" + fieldOne + ", fieldTwo=" + fieldTwo
				+ ", fieldThree=" + fieldThree + "]";
	}
}