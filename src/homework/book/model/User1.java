package homework.book.model;


public class User1 {
    private String name;
    private String surname;


    private String email;
    private String password;

    private UserType1 userType;

    public User1() {

    }


    public void setUserType(UserType1 userType) {
        this.userType = userType;
    }
    public UserType1 getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public User1(String name, String surname, String email, String password,UserType1 userType) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

}