package assignments.week1;

public class EmpMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.getEmpDetails("a1", "ind", Region.EAST.toString());
		e1.showDetails();
		
		Employee e2 = new Employee();
		e2.getEmpDetails("z1", "us", Region.WEST.toString());
		e2.showDetails();
	}

}
