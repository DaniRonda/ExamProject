package easv.dk.BE;

public class Teacher {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String school;
    private int id;

    public Teacher(String firstName, String lastName, String email, String password, String school, int id) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email = email;
        this.password = password;
        this.school=school;
        this.id = id;

    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getSchool() {return school;}
    public void setSchool(String school) {this.school = school;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
}