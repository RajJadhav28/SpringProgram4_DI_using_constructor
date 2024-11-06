package in.quastech.bean;

public class Employee {
	private int empId;
	private String name;
	private Address add;
	
	public Employee(int empId, String name, Address add) {
		super();
		this.empId = empId;
		this.name = name;
		this.add = add;
	}
	
	public void display() {
		System.out.println("EmpId:"+empId);
		System.out.println("Name:"+name);
		System.out.println("Address:"+add);
	} 

}
