
public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.firstName="Bilal";
		
		Student student=new Student();
		student.lastName="�zel";
		
		Instructor �nstructor=new Instructor();
		�nstructor.courses="Java React";

		StudentManager studentManager=new StudentManager();
		studentManager.Add(student);
		
		UserManager userManager=new UserManager();
		userManager.Add(user);
	}

}
