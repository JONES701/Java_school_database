package my;

import java.sql.*;
import java.util.Objects;
import java.util.Scanner;


public class teacher_det implements Log_data {

    public void Login() throws SQLException, ClassNotFoundException {
        String username;
        String password;
        Scanner k = new Scanner(System.in);
        Scanner l = new Scanner(System.in);

        System.out.println("Enter username: ");
        username = k.nextLine();
        if (Objects.equals(username, Log_data.username2)) {
            System.out.println("Enter password: ");
            password = l.nextLine();
            if (Objects.equals(password, Log_data.password2)) {
                System.out.println("..  Login successful ..");
                menu();         //  Menu call
            } else {
                System.out.println("Wrong password please try again ------");
            }
        } else {
            System.out.println("Wrong username please try again ------");
        }
    }

    public void menu() throws SQLException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        Scanner cont = new Scanner(System.in);
        int choice = 0;
        int p;
        do {
            try {
                System.out.print("What do you want to do?\n1.View teacher details\n2.Modify student details\n3.view student details\n4.EXIT\n\nEnter choice: ");
                choice = scan.nextInt();
            }
            catch (Exception e)             // general exception
            {
                e.printStackTrace();
            }
            switch (choice) {
                case 1: {
                    ConnectionStudentView connectionStudentView=new ConnectionStudentView();
                    connectionStudentView.teacher();
                }
                break;
                case 2: {
                    ConnectionStudentView connectionStudentView=new ConnectionStudentView();
                    connectionStudentView.modifyStudent();

                }
                break;
                case 3: {
                    ConnectionStudentView connectionStudentView=new ConnectionStudentView();
                    connectionStudentView.student_admin();
                }
                break;

                case 4:
                    break;

                default:
                    System.out.println("Wrong choice !!!!");
                    break;
            }
            System.out.println("Do you want to continue?(1/0): ");
            p = cont.nextInt();
        } while (p != 0);
    }
}

