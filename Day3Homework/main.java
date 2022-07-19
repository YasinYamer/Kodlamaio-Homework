package Day3Homework;

public class main {

    public static void main(String[] args) {
	
	User user = new User();
	user.setFirstName("Ozge");
	
	UserManager userManager = new UserManager();
	userManager.login(user);
	
	Instructor instructor = new Instructor();
	instructor.setFirstName("Engin");
	instructor.setLastName("Demiroğ");
	instructor.setCourse("C# + Angular");
	instructor.setTheCourseHeGave("Java + React");
	instructor.getFullName();
	
	InstructorManager ınstructorManager = new InstructorManager();
	ınstructorManager.login(instructor);
	ınstructorManager.addCourse(instructor);
	ınstructorManager.removeHomeWork(instructor);
	
	
	Student student = new Student();
	student.setStudentNumber("123456");
	student.setFirstName("Yasin");
	student.setLastName("Yamer");
	
	Student student2 =  new  Student();
	student2.setStudentNumber("000000000");
	student2.setFirstName("Cihan");
	student2.setLastName("Yamer");
	
	
	StudentManager studentManager = new StudentManager();
	studentManager.multipleStudent(student);
	studentManager.multipleStudent(student2);
	
	
    }

}
