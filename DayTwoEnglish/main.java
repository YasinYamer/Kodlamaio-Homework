package DayTwoEnglish;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Educator educator= new Educator();
		educator.id =1;
		educator.name="Engin ";
		educator.surName= "Demiroğ";
		educator.lectures ="Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)";
		
		Educator[] educatorAbout= {educator};
		
		for (Educator educators: educatorAbout) {
			System.out.println("Educator Name Surname : "+ educators.name+""+ educators.surName);
			System.out.println("Educator Lectures: "+educators.lectures);
		}
		
		EducatorManager educatorManager= new EducatorManager();
		educatorManager.courseAdedd(educator);
		
		Student student1=new Student();
		student1.id=1;
		student1.name= "Yasin";
		student1.surName="Yamer";
		student1.progress=95;
		student1.lectures = educator.lectures;
		
		Student[] students = {student1};
		
		for (Student student : students) {
			System.out.println("Student Name Surname: "+student.name+" "+student.surName);
			System.out.println("Lecturess: "+student.lectures);
			
		}
		StudentManager studentManager = new StudentManager();
		studentManager.couseStatus(educator);
		studentManager.courseProgress(student1);
		}

}
