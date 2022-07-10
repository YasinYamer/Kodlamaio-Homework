package DayTwoEnglish;

public class StudentManager {
	public void courseProgress(Student student) {
		System.out.println("Course Progress : %"+student.progress);
		
	}
	
	public void couseStatus(Educator educator) {
		System.out.println("Course Status:"+ educator.lectures +"this was recorded");
	}

}
