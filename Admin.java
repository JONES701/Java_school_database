package my;
import java.sql.*;
import java.util.Objects;
import java.util.Scanner;


public class Admin implements my.Log_data {
    public void Login() throws SQLException, ClassNotFoundException {
        String username;
        String password;
        Scanner k = new Scanner(System.in);
        Scanner l = new Scanner(System.in);

        System.out.println("Enter username: ");
        username = k.nextLine();
        if(Objects.equals(username, my.Log_data.username)) {
            System.out.println("Enter password: ");
            password = l.nextLine();
            if (Objects.equals(password, my.Log_data.password)) {
                System.out.println("..  Login successful ..");
                menu();         //  Menu call
            }
            else
            {
                System.out.println("Wrong password please try again ------");
            }
        }
        else
        {
            System.out.println("Wrong username please try again ------");
        }
    }

    public void menu() throws ClassNotFoundException, SQLException {
        Scanner scan=new Scanner(System.in);
        Scanner cont=new Scanner(System.in);
        int choice = 0;
        int p;
        do {
            try {
                System.out.print("What do you want to do?\n1.View student\n2.View teacher\n3.Modify student details\n4.Modify teacher details\n5.EXIT\n\nEnter choice: ");
                choice = scan.nextInt();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            switch (choice) {
                case 1:
                {
                    ConnectionStudentView connectionStudentView=new ConnectionStudentView();
                    connectionStudentView.student_admin();
                }
                    break;
                
                case 2:
                {
                    ConnectionStudentView connectionStudentView=new ConnectionStudentView();
                    connectionStudentView.teacher_admin();
                }
                    break;
                
                case 3:
                {
                    ConnectionStudentView connectionStudentView=new ConnectionStudentView();
                    connectionStudentView.modifyStudent();
                }
                    break;

                case 4:
                {
                    ConnectionStudentView connectionStudentView=new ConnectionStudentView();
                    connectionStudentView.modifyTeacher();
                }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice retry. -----");
                    break;
            }
            System.out.println("Do you want to continue?(1/0): ");
            p=cont.nextInt();
        }while(p!=0);
    }
    
}
