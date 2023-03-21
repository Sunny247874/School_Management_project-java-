package school.management.System;

/**
 * Created by JavCode Ayush kumar on 24/02/2023
 * This class is responsible for keeping the 
 *track of students fees,name,grade & fees
 *paid.
 */


public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	
	/**
	 * To Create  a new student by initializing.
	 * Fees for every Student per year 60,000rupya
	 * Fee pays innately by Student 0rupya
	 * @param id : id for the Student: unique
	 * @param name :name of the Student  
	 * @param grade :grade of the Student
	 */
	
	
	
	public Student(int id,String name,int grade) //constructor
	{
		this.feesPaid=0;
		this.feesTotal=60000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	//Not Goes to Another Students Name,Students id
	/**
	 * Student grade is updates 
	 * @param grade : new grade is adding
	 */
	
	public  void setgrade(int grade)
	{
		this.grade=grade;
	}
	  
	/**
	 * Fee is updates After that feepaid
	 * School is going to Fee receive
	 * @param fee :Student is fee pay
	 */
	
	public void payFees(int fee)
	{
		feesPaid+=fee;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	/**
	 * 
	 * @return id of Student
	 */
	public int getId()
	{
		return id;
	}
	
	/**
	 * 
	 * @return name of Student
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return grade of Student
	 */
	
	public int getGrade()
	{
		return grade;
	}
	
	/**
	 * 
	 * @return feespade by the Student
	 */
	
	public int getFeesPaid()
	{
		return feesPaid;
	}
	
	/**
	 * 
	 * @return FeesTotal of Student
	 */
	public int getFeesTotal()
	{
		return feesTotal;
	}
	
	/**
	 * 
	 * @return remaining Fees
	 */
	
	public int getRemainingFees()
	{
		return feesTotal-feesPaid;
	}
	
	//@override
	
	public String toString()
	{
		return "Student,s "+ name+
				" Total fees payed so far ₹:"+feesPaid;
	}
	
	
}
