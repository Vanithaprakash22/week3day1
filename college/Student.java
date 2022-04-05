package org.college;



public class Student extends Department  {

	
public void studentName()
	
	{
		
		System.out.println("This is Student Name");
	}
	
	
public void studentDept()

{
	
	System.out.println("This is Student Department");
}

public void studentId()

{
	
	System.out.println("This is student ID");
}
	


public static void main(String[] args)
{
	
//	College col=new College();
//	col.collegeName();
//	col.collegeRank();
//	col.collegeCode();
//
//
//Department dept=new Department();
//dept.deptName();


Student stud=new Student();
stud.studentDept();
stud.studentId();
stud.studentName();

stud.deptName();
stud.collegeName();
stud.collegeCode();
stud.collegeRank();


}
}

