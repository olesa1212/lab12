import  java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner one = new Scanner(System.in);
    Scanner two = new Scanner(System.in);
    User[] arr = new People[4];
    for(int i = 0; i <= 1; i++) {
        System.out.println("Введите ФИО:");
        String fio = one.nextLine();
        System.out.println("Введите возраст:");
        int age = two.nextInt();
        System.out.println("Введите должность:");
        String post = one.nextLine();
        arr[i] = new Teacher(fio, age, post);
        System.out.println("Введите логин:");
        String login = one.nextLine();
        System.out.println("Введите пароль:");
        String password = one.nextLine();
        arr[i].user(login, password);
    }
    for(int i = 0; i <= 1; i++) {
        System.out.println("Введите ФИО:");
        String fio = one.nextLine();
        System.out.println("Введите возраст:");
        int age = two.nextInt();
        System.out.println("Введите должность:");
        String post = one.nextLine();
        arr[i] = new Student(fio, age, post);
        System.out.println("Введите логин:");
        String login = one.nextLine();
        System.out.println("Введите пароль:");
        String password = one.nextLine();
        arr[i].user(login, password);
    }
  }
}

interface User {
    void user(String login, String password);
 }

 abstract class People implements User {
    String fio;
    int age;
    String post;

    People(String fio, int age, String post) {
        this.fio = fio;
        this.age = age;
        this.post = post;
    }
 }

 class Teacher extends People {
     Teacher(String fio, int age, String post) {
         super(fio, age, post);
     }

     @Override
     public void user(String login, String password) {
         System.out.println("Login:" + login);
         System.out.println("Password:" + password);
     }
 }

 class Student extends People {
     Student(String fio, int age, String post) {
         super(fio, age, post);
     }

     @Override
     public void user(String login, String password) {
         System.out.println("Login:" + login);
         System.out.println("Password:" + password);
     }
 }
