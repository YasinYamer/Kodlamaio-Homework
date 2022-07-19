package Day3Homework;

public class InstructorManager extends UserManager{
    //addcourse
    //deletecourse 
    //removeHomeWork
    public void login(Instructor instructor) {
   	System.out.println("Instructor Login : "+instructor.getFullName());
       }
    
    public void theCourseHeGave(Instructor instructor) {
	System.out.println("The Course He Gave "+instructor.getTheCourseHeGave());
    }
    public void addCourse(Instructor instructor) {
	System.out.println("Added Course"+instructor.getCourse());
    }
    
    public void deleteCourse(Instructor instructor) {
	System.out.println("Deleted course"+instructor.getCourse());
    }
    public void removeHomeWork(Instructor instructor) {
	System.out.println("Remove HomeWork this Couse :"+instructor.getCourse());
    }

}
