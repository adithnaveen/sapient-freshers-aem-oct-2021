package com.naveen.collections;

public class Employee implements Comparable<Employee> {
	private int empId; 
	private String empName; 
	private int age;
	
	public Employee() {}
	
	public Employee(int empId, String empName, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.empName.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj; 
		
		return 
			this.empId == emp.empId && 
			this.empName.equals(emp.getEmpName()) && 
			this.age==emp.getAge(); 
	}

	@Override
	public int compareTo(Employee o) {
//		return this.empId - o.empId; 
//		return this.empName.compareTo(o.getEmpName());
		// sort on age descending 
		return 0; 
	} 
}
