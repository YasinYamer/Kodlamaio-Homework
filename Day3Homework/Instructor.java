package Day3Homework;

public class Instructor extends User {
    private int NumberOfStudentsEnrolled;
    private String TheCourseHeGave;
    private String course;
    
    public int getNumberOfStudentsEnrolled() {
 	return NumberOfStudentsEnrolled;
     }
    public String getTheCourseHeGave() {
	
	return TheCourseHeGave;
    }

    public void setTheCourseHeGave( String theCourseHeGave) {
	TheCourseHeGave = theCourseHeGave;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
