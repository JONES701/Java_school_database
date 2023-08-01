package my;

import java.sql.*;
import java.util.Objects;
import java.util.Scanner;



public class Parent implements Log_data{
    public void Login() throws SQLException, ClassNotFoundException {
        String username;
        String password;
        Scanner k = new Scanner(System.in);
        Scanner l = new Scanner(System.in);

        System.out.println("Enter username: ");
        username = k.nextLine();

            if (Objects.equals(username, Log_data.username3)) {
                System.out.println("Enter password: ");
                password = l.nextLine();
                if (Objects.equals(password, Log_data.password3)) {
                    System.out.println("..  Login successful ..");
                    menu();                                         //  Menu call
                } else {
                    System.out.println("Wrong password please try again ------");
                }
            } else {
                System.out.println("Wrong username please try again ------");
            }
    }
    public void menu() throws ClassNotFoundException, SQLException {

        Scanner cont=new Scanner(System.in);
        int p;
        do {
        System.out.print("\n<<<<<  You can only view marks and details of ward >>>>>>\n");

        ConnectionStudentView connectionStudentView=new ConnectionStudentView();
        connectionStudentView.student();

        System.out.println("Do you want to continue?(1/0): ");
        p=cont.nextInt();
        }while(p!=0);
    }
}
