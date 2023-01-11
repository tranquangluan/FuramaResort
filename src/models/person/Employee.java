package models.person;

public class Employee extends Person{
    private String idEmployee;
    private String nameEmployee;
    private String dateOfBirthEmployee;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private Enum.Degree degree ;
    private Enum.Position position;
    private int salary;

    public Employee(String idEmp, String nameEmp, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, Enum.Degree degree, Enum.Position position, int salary) {
        this.idEmployee = idEmp;
        this.nameEmployee = nameEmp;
        this.dateOfBirthEmployee = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDateOfBirthEmployee() {
        return dateOfBirthEmployee;
    }

    public void setDateOfBirthEmployee(String dateOfBirthEmployee) {
        this.dateOfBirthEmployee = dateOfBirthEmployee;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum.Degree getDegree() {
        return degree;
    }

    public void setDegree(Enum.Degree degree) {
        this.degree = degree;
    }

    public Enum.Position getPosition() {
        return position;
    }

    public void setPosition(Enum.Position position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
