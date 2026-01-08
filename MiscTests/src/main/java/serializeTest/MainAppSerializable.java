package serializeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainAppSerializable {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * 
	 * Adding or removing fields from TestObj will throw java.io.InvalidClassException upon deserialization 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			TestObj obj = new TestObj();
			obj.setD(34.0);
			obj.setNum(4);
			obj.setS("s1");
			obj.setS2("s2");
			OtherOb otherOb = new OtherOb();
			otherOb.setOther("other");
			obj.setOtherOb(otherOb);  //we get java.io.NotSerializableException if OtherOb does'nt implements serializable
			
			System.out.println("begin serialization..");
			FileOutputStream fileOutputStream = new FileOutputStream(new File("obj.ser"));
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(obj);
			fileOutputStream.flush();
			objectOutputStream.flush();
			fileOutputStream.close();
			objectOutputStream.close();
			
			System.out.println("serialization completed.");
			
			FileInputStream fileInputStream = new FileInputStream(new File("obj.ser"));
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			TestObj read = (TestObj) objectInputStream.readObject();
			System.out.println("object read: "+read);
	}

}
