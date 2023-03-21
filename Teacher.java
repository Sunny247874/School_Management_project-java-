package school.management.System;

/**
 * Created by JavCode Ayush kumar 24/02/2023
 * This class is responsible for keeping the track
 *Id ,name,and salary
 *
 */

public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Teacher all detail initialize
	 * @param id :Teacher unique id value
	 * @param name: Teacher Unique Name
	 * @param salary : Techer purchace salary by School
	 * @param salaryEarned 
	 */
	
	
	public  Teacher(int id,String name,int salary)  //constructer
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=salaryEarned;
		
	}
	
	/**
	 * Get id number of Teacher
	 * @return id value of Teacher
	 */
	
	public int getid()
	{
		return id;
	}
	
	
	/**
	 * Get name of Teacher 
	 * @return name of Teacher
	 */
	
	
	public String getname()
	{
		return name;
	}
	
	/**
	 * Get salary of teacher
	 * Give salary of teacher
	 * @return salary for teacher which days work in School
	 */
	
	public int getsalary()
	{
		return salary;
	}
	
	/**
	 * Set salary because of this reason
	 * Expreance after in increase Salary
	 * @param salary
	 */
	
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	
	/**
	 * All the teacher are Recieve salary by School
	 * School pay salary all the teacher
	 * total salry remove teacher salary
	 * add total Earaned salary
	 * @param salary
	 */
	public void recieveSalary(int salary)
	{
		salaryEarned+=salary;
		School.updateTotalMoneySpeant(salary);
	}

	@Override
	public String toString() {
		return " Name of the Teacher "+ name+
				" Total salary Earned so far ₹: "+salaryEarned;
	}
	
	
	
}
