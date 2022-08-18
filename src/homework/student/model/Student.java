package homework.student.model;

public class Student {
    private String name;
    private String surname;
    private int age;

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    private String phoneNumber;
    private String city;
    private Lesson lesson;
    private String mail;
    private char gender;

    private User registeredUser;


    @Override
    public String toString() {
        return "Student {" +
                " name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", gender = '" + gender + '\'' +
                ", lesson = '" + getLesson() + '\'' +
                ", registeredUser = '" + registeredUser + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                ", city = '" + city + '\'' +
                ", mail = '" + mail + '\'' +
                '}';


    }

    public Student() {
    }

    public Student(String name, String surname, int age, String phoneNumber, String city, Lesson lesson, String mail, char gender, User registeredUser) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.lesson = lesson;
        this.mail = mail;
        this.gender = gender;
        this.registeredUser = registeredUser;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
