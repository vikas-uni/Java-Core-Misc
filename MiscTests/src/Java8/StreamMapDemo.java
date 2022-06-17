package Java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapDemo {
	public static void main(String[] args) {

		List<Staff> staff = Arrays.asList(new Staff("mkyong", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));
		
		// convert inside the map() method directly.
		//one type of stream is converted to another type of stream
		Function<Staff, StaffPublic> staffPublicfunction = temp -> {
			StaffPublic obj = new StaffPublic();
			obj.setName(temp.getName());
			obj.setAge(temp.getAge());
			if ("mkyong".equals(temp.getName())) {
				obj.setExtra("this field is for mkyong only!");
			}
			return obj;
		};
		List<StaffPublic> result = staff.stream().map(staffPublicfunction).collect(Collectors.toList());
		
		System.out.println(result);
		
		//filter
		List<Staff> filtered = staff.stream().filter(s -> s.getName().contains("a")).collect(Collectors.toList());
		filtered.forEach(s -> System.out.println(s.getName()));

		
	}
}

class StaffPublic {
	private String name;
	private int age;
	private String extra;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return "StaffPublic [name=" + name + ", age=" + age + ", extra=" + extra + "]";
	}

}

class Staff {

	private String name;
	private int age;
	private BigDecimal salary;

	public Staff(String string, int i, BigDecimal bigDecimal) {
		this.name = string;
		this.age = i;
		this.salary = bigDecimal;
	}

	// ...
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}