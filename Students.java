package week3assignement.day1;

public class Students {

	
	public void getStudentInfo(int StudId)

	{
		System.out.println("the studid is 1011");
	}
	
	public void getStudentInfo(int Studid,String Studname)

	{
		System.out.println("the student id and name is ");
	}
	
	public void getStudentInfo(String StudEmail,int StudPhno)

	{
		System.out.println("the student email and phonenumber is");
	}
	
	public static void main(String[] args) {

Students obj=new Students();
obj.getStudentInfo(1011);
obj.getStudentInfo(1011,"Harsh");
obj.getStudentInfo("ha@abc.com", 1011);



	}

}
