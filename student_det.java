package my;

import java.sql.*;
import java.util.Objects;
import java.util.Scanner;


public class student_det implements Log_data,Details  {
    public void Login() throws SQLException, ClassNotFoundException {
        String username;
        String password;
        Scanner k = new Scanner(System.in);
        Scanner l = new Scanner(System.in);

        System.out.println("Enter username: ");
        username = k.nextLine();
        if(Objects.equals(username, Log_data.username1)) {
            System.out.println("Enter password: ");
            password = l.nextLine();
            if (Objects.equals(password, Log_data.password1)) {
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
        Scanner scan = new Scanner(System.in);
        Scanner cont = new Scanner(System.in);
        try {

            System.out.println("Enter your dob in ddmmyyyy format: ");      // level of security
            String dob = scan.next();
            int v=Integer.parseInt(dob);
        }
        catch (NumberFormatException nf)
        {
            System.out.println("Number format exception: dob can't be alphanumeric");
        }
        int choice;
        int p = 0;

        do {
            ConnectionStudentView connectionStudentView=new ConnectionStudentView();
            connectionStudentView.student();
            try{
            System.out.println("Do you want to continue?(1/0): ");
            p=cont.nextInt();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }while (p!=0) ;
    }

}