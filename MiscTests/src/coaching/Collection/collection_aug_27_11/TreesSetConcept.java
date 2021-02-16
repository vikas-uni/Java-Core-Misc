package coaching.Collection.collection_aug_27_11;

import java.util.TreeSet;

class Employee implements Comparable{
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	Employee(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int hashCode(){
		//System.out.println("hash code called for "+name+" and hashcode=="+name.length());
		return name.length();
	}
	public boolean equals(Object o){
		return ((Employee)o).name.equals(this.name);
	}
	public String toString()
	{
		return name;
	}
	public int compareTo(Object o) {
		//return this.name.compareTo(((Employee)o).name);
		Employee e=((Employee)o);
		if(this.age==e.age)
		{
			return 0;
		}
		else if(this.age>e.age){
			return 1;
		}
		else if(this.age<e.age){
			return -1;
		}
		else{
			return 0;
		}
	}
}
public class TreesSetConcept {
	public static void main(String dfd[])
	{
		TreeSet empSet=new TreeSet();
		
		Employee e1=new Employee("raj",20);
		Employee e2=new Employee("tim",23);
		Employee e3=new Employee("mohit",24);
		Employee e4=new Employee("harrick",20);;
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		
		System.out.println(empSet);
		
		System.out.println("corejava".compareTo("advancejava"));
	}

}








