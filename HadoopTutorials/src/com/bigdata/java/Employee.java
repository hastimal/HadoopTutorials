package com.test.pkg;

class Employee {

	int id;             //100
	String name;        //Raj
	String role;        //TL
	double salary;      //1000000.00	
	static String companyName;
	final double pi = 3.14;
	
	public Employee(int i, String n, String r, double s){		
		Employee.companyName = "Google";
		this.id = i;
		this.name = n;
		this.role = r;
		this.salary = s;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee raj = new Employee(100, "Raj", "TL", 100000.00);       
		Employee dhaval = new Employee(101, "Dhaval", "SS", 100000.00);  
		
		System.out.println("Raj Record is ==>" + raj.id + " " + raj.name + " " + raj.role + " " + raj.salary + "Company is" + Employee.companyName);
		System.out.println("Dhaval Record is ==>" + dhaval.id + " " + dhaval.name + " " + dhaval.role + " " + dhaval.salary + " " + Employee.companyName);
	}

}
