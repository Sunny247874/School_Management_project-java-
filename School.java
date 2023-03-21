package school.management.System;

import java.util.List;

/**
 * Create many Techer and many Student
 * Implement Techer and Student Using 
 * ArrayList
 * @author LENOVO
 *
 */

public class School {
private List<Teacher> teachers;
private List<Student> students;
private static int totalMoneyEarned;
private static int totalMoneySpeant;


public School(List<Teacher> teachers,List<Student> students)
{
	this.teachers=teachers;
	this.students=students;
	totalMoneyEarned=0;
	totalMoneySpeant=0;
}


/**
 * teacher to be added
 * @param  add a teacher to the School
 */
public void addTeacher( Teacher teacher)
{
	teachers.add(teacher);
}

/**
 * 
 * @return the list of teacher in School
 */
public List<Teacher> getTeacher()
{
	return teachers;
}
/**
 * Student to be added
 * @param student add to student in the School
 */

public void addStudent(Student student)
{
	students.add(student);
}

/**
 * 
 * @return to The List of Student
 */

public List<Student> getStudent()
{
	return students;
}

/**
 * Adds the total money earns by School
 * @param MoneyEarned Total money earned added by the school
 */

public static  void updateTotalMoneyEarned(int MoneyEarned)
{
	totalMoneyEarned+=MoneyEarned;
}

/**
 * 
 * @return total money earned by the School
 */
public int getTotalMoneyEarned()
{
	return totalMoneyEarned;
}
/**
 * updates this money why School management by Spent money
 * for payment Teacher and Another work
 * @param totalMoneySpeant 
 */

public  static void updateTotalMoneySpeant(int MoneySpeant)
{
	totalMoneyEarned-=MoneySpeant;
	
}
/**
 * total money Spend by the School
 * @return total money Spend on our School
 */

public int getTotalMoneySpeant()
{
	return totalMoneySpeant; 
}


}
