package school.management.System;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher sumanM=new Teacher(201,"sumanMam",500);
		Teacher surbhiM=new Teacher(202,"surbhiMam",650);
		Teacher RashmikaM=new Teacher(203,"rashmika",750);
		Teacher sasankS=new Teacher(204,"sasankSir",800);
		
		List<Teacher> teacherList=new ArrayList<>();
		teacherList.add(sumanM);
		teacherList.add(surbhiM);
		teacherList.add(RashmikaM);
		teacherList.add(sasankS);
		
		
		Student niranjan=new Student(2001,"niranjan",4);
		Student sharwan=new Student(2002,"sharwan",5);
		Student Aditya=new Student(2003,"aditya",3);
		Student vivhan=new Student(2004,"vivhan",2);
		Student Arvind=new Student(2005,"arvind",1);
		
		List<Student> studentList=new ArrayList<>();
		studentList.add(niranjan);
		studentList.add(sharwan);
		studentList.add(Aditya);
		studentList.add(vivhan);
		studentList.add(Arvind);
		
		System.out.println("Student pay Salary After School Earn Money");
		System.out.println("      ");
		System.out.println("----------------------------------");
		
		School srm=new School(teacherList,studentList);
        
		niranjan.payFees(5000);  
		sharwan.payFees(6000);
		Aditya.payFees(7000);
		vivhan.payFees(4000);
		Arvind.payFees(5500);
		System.out.println("srm school has earned ₹:"+srm.getTotalMoneyEarned());
		System.out.println("-----------------------------------");
		
		
		System.out.println("      ");
		System.out.println("School pay salary of Teacher");
		System.out.println("       ");
		System.out.println("-----------------------------------");
		
		sumanM.recieveSalary(sumanM.getsalary());
		System.out.println("srm has spent for salary to "+sumanM.getname()
		+" and now has ₹:"+srm.getTotalMoneyEarned());
		
		surbhiM.recieveSalary(surbhiM.getsalary());
		System.out.println("srm has spent for salary to "+surbhiM.getname()
		+" and now has ₹:"+srm.getTotalMoneyEarned());
		
		RashmikaM.recieveSalary(RashmikaM.getsalary());
		System.out.println("srm has spent for salary to "+RashmikaM.getname()
		+" and now has ₹"+srm.getTotalMoneyEarned());
		
		sasankS.recieveSalary(sasankS.getsalary());
		System.out.println("srm has spent for salary to "+sasankS.getname()
		+" and now has ₹"+srm.getTotalMoneyEarned());
		
		System.out.println("---------------------------------------");
	
		
		System.out.println(niranjan);
		System.out.println(sharwan);
		
		
		System.out.println(sumanM);
		
	}

}
