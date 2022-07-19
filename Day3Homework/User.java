package Day3Homework;

public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private String emailAdress;
    private String identificationNumber;
    private String fullName;
    
    
 
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmailAdress() {
        return emailAdress;
    }
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
    public String getFullName() {
	fullName = getFirstName()+" "+getLastName();
        return fullName;
    } 
 
    

}
