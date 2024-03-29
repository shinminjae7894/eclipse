package bytestream;

import java.io.Serializable;

public class Employee implements Serializable {
	private int no;
	private String name;
	private String job;
	private int dept;
	private double sal;
	
	public Employee(int no, String name, String job, int dept, double sal) {
		
		this.no = no;
		this.name = name;
		this.job = job;
		this.dept = dept;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + job + "\t" + dept + "\t" + sal;
	}
	
	
}
