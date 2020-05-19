package application.example.datafragment;

public class Person {

    private String firstname, lastName, contactNo;

    public Person(String firstname, String lastName, String contactNo) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.contactNo = contactNo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
