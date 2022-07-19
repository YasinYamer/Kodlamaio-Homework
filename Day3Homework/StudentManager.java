package Day3Homework;

public class StudentManager extends UserManager{
    @Override
    public void login(User user) {
	System.out.println("Student Login : "+user.getFullName());
    }
    public void  recordWatch(Student student) {
	System.out.println("Student Name : "+student.getFirstName()+" Watch day record.");
    }
    public void homeWorkDone(Student student) {
	System.out.println("Student number : "+ student.getStudentNumber()+" did the homework.");
    }
    
    public void multipleStudent(Student... student) {
	for (Student students : student) {
	    login(students);
	    recordWatch(students);
	    homeWorkDone(students);
	    
	}
	   
    }

}
