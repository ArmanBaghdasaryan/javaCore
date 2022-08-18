package homework.student;


import homework.student.command.Commands;
import homework.student.exception.LessonNotFoundException;
import homework.student.model.Lesson;
import homework.student.model.Student;
import homework.student.model.User;
import homework.student.model.UserType;
import homework.student.storage.LessonStorage;
import homework.student.storage.StudentsStorage;
import homework.student.storage.UserStorage;

import java.util.Scanner;


public class StudentDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);

    private static StudentsStorage studentsStorage = new StudentsStorage();
    private static LessonStorage lessonStorage = new LessonStorage();
    private static UserStorage userStorage = new UserStorage();

    private static User currentUser = null;


    public static void main(String[] args) {
        initData();


        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();

                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

    }

    private static void login() {
        System.out.println("Please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with " + emailPassword[0] + " does not exist");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser = user;
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }

            } else {
                System.out.println("Password is wrong!");
            }
        }
    }

    private static void loginUser() {
        System.out.println("Welcome " + currentUser.getName());

        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentsStorage.print();
                    break;
                case PRINT_STUDENT_BY_LESSON:
                    printStudentByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("Students count:" + studentsStorage.getSize());
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command!");


            }
        }
    }

    private static void register() {
        System.out.println("Please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct data!");
        } else {
            if (userStorage.getUserByEmail(userData[0]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserType(UserType.USER);
                userStorage.add(user);
                System.out.println("User created");

            } else {
                System.out.println("User with " + userData[0] + " already exist!");
            }
        }
    }

    private static void loginAdmin() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentsStorage.print();
                    break;
                case DELETE_STUDENTS_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENT_BY_LESSON:
                    printStudentByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("Students count:" + studentsStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON_LESSON:
                    changeStudentLessonName();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");


            }
        }
    }

    private static void initData() {
        User admin = new User("admin", "admin", "admin@mail.ru", "12345", UserType.ADMIN);
        userStorage.add(admin);
        Lesson java = new Lesson("java", "teacher", 7, 2500);
        Lesson mySql = new Lesson("mySql", "teacher", 5, 5000);
        Lesson php = new Lesson("php", "teacher", 3, 8000);
        lessonStorage.add(java);
        lessonStorage.add(mySql);
        lessonStorage.add(php);
        studentsStorage.add(new Student("Arman", "Baghdasaryan", 24, "098201131", "Gyumri", java, "Arman@mail.ru", 'M', admin));
        studentsStorage.add(new Student("Armen", "Hovahnnisyan", 28, "098112233", "Erevan", php, "Armen@mail.ru", 'M', admin));
        studentsStorage.add(new Student("Ani", "Vardanyan", 25, "098993377", "Vanadzor", mySql, "Ani@mail.ru", 'F', admin));
    }

    private static void printStudentByLessonName() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentsStorage.printStudentByLessonName(lessonName);
    }

    private static void addLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        System.out.println("Please input lesson teacher Name");
        String teacherName = scanner.nextLine();
        System.out.println("Please input lesson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());
        Lesson lesson = new Lesson(lessonName, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("Lesson created");
    }


    private static void changeStudentLessonName() {
        studentsStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentsStorage.getStudentByIndex(index);
        if (student == null) {
            System.out.println("Wrong Index!!!");
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.print();
                System.out.println("Please choose lesson index");
                Lesson lesson = null;
                try {
                    int lessonIndex = Integer.parseInt(scanner.nextLine());
                    lesson = lessonStorage.getLessonByIndex(lessonIndex);
                    student.setLesson(lesson);
                    System.out.println("Lesson changed");
                } catch (LessonNotFoundException | NumberFormatException e) {
                    System.out.println("Please input correct number or index!!!");
                    changeStudentLessonName();
                }


            }
        }

    }

    private static void deleteByIndex() {
        studentsStorage.print();
        System.out.println("Please choose student index");
        try {


            int index = Integer.parseInt(scanner.nextLine());
            studentsStorage.deleteByIndex(index);
        } catch (NumberFormatException e) {

        System.out.println("Please choose correct index");
        deleteByIndex();
        }
    }

    private static void addStudent() {
        if (lessonStorage.getSize() != 0) {
            lessonStorage.print();
            System.out.println("Please choose lesson index");
            Lesson lesson = null;
            try {
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                lesson = lessonStorage.getLessonByIndex(lessonIndex);
                System.out.println("Please input student's name");
                String name = scanner.nextLine();
                System.out.println("Please input student's surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student's phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student's city");
                String city = scanner.nextLine();
                System.out.println("Please input student's mail");
                String mail = scanner.nextLine();
                System.out.println("Please input student's gender");
                String genderStr = scanner.nextLine();
                System.out.println("Please input student's age");
                int age = Integer.parseInt(scanner.nextLine());
                char gender = genderStr.charAt(0);


                Student student = new Student(name, surname, age, phoneNumber, city, lesson, mail, gender, currentUser);
                studentsStorage.add(student);
                System.out.println("Student created");
            } catch (LessonNotFoundException | NumberFormatException e) {
                System.out.println("Please choose correct number or index!!!");
                addStudent();


            }
        }


    }

}