package assignments.week1;

public class Employee {
	private String empName;
	private String countryName;
	private String regionName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	public void getEmpDetails(String empName,String countryName,String regionName){
		this.empName = empName;
		this.countryName = countryName;
		this.regionName = regionName;
	}
	
	public void showDetails() {
		System.out.println(empName+","+countryName+","+regionName);
	}
}
