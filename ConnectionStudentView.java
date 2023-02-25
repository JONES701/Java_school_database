package my;

import java.sql.*;
import java.util.Scanner;

public class ConnectionStudentView {
    void student() throws ClassNotFoundException, SQLException {

        Scanner scan=new Scanner(System.in);
        Scanner cont=new Scanner((System.in));

        System.out.println("Enter prn: ");
        int ca= scan.nextInt();

        System.out.println("You can only view details\n");
        Class.forName("com.mysql.cj.jdbc.Driver");
        String username="root";
        String password="Kolkata@023";
        String url="jdbc:mysql://localhost:3306/SIT_Project_sem4";
        Connection connection = DriverManager.getConnection(url,username,password);

    String sql="Select * from students1";
    Statement statement=connection.createStatement();
    ResultSet result=statement.executeQuery(sql);

            while(result.next())
    {
        int id=result.getInt("prn");
        String name=result.getString("name");
        String DOB=result.getString("dob");
        String branch=result.getString("branch");
        String phone=result.getString("phone");
        String email=result.getString("email");
        String address=result.getString("address");

        int DS_marks=result.getInt("DS_marks");
        int OS_marks=result.getInt("OS_marks");
        int em3_marks=result.getInt("EM_marks");
        int java_marks=result.getInt("Java_marks");

        if(ca==id)
            System.out.println("Info:\n"+id+" "+name+"  "+DOB+"  "+branch+"  "+phone+"  "+email+"  "+address+"\n Marks in DS OS EM3 java :  "+DS_marks+" "+OS_marks+" "+em3_marks+"  "+java_marks+",");

    }
            result.close();
            statement.close();
            connection.close();
    }

    void teacher()throws ClassNotFoundException, SQLException
    {
        Scanner scan=new Scanner(System.in);
        Scanner cont=new Scanner((System.in));

        System.out.println("Enter ID: ");
        int ca = scan.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        String username = "root";
        String password = "Kolkata@023";
        String url = "jdbc:mysql://localhost:3306/SIT_Project_sem4";
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "Select id,name,dob,branch,phone,email,address from teacher1";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            int id = result.getInt("id");
            String name = result.getString("name");
            String DOB = result.getString("dob");
            String branch = result.getString("branch");
            String phone = result.getString("phone");
            String email = result.getString("email");
            String address = result.getString("address");

            if (ca == id)
                System.out.println("Info:\n" + id + "," + name + "," + DOB + "  " + branch + " " + phone + " " + email + " " + address);

        }
        result.close();
        statement.close();
        connection.close();
    }

    void modifyStudent() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String username = "root";
        String password = "Kolkata@023";
        String url = "jdbc:mysql://localhost:3306/SIT_Project_sem4";
        Connection connection = DriverManager.getConnection(url, username, password);

        String q = "update students1 set name=?, branch=?, phone=?, address=?,DS_marks=?,OS_marks=?,Java_marks=?,EM_marks=?,dob=?,email=? where prn=?";

        Scanner n = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prn to be updated:");
        int prn1 = n.nextInt();


        System.out.println("Enter new branch:");
        String branch = sc.nextLine();
        System.out.println("Enter new name:");
        String new_name = sc.nextLine();
        System.out.println("Enter new phone:");
        String phone = sc.nextLine();
        System.out.println("Enter new address:");
        String address = sc.nextLine();
        System.out.println("Enter new date of birth:");
        String dob = sc.nextLine();
        System.out.println("Enter new email-address:");
        String email = sc.nextLine();

        System.out.println("Enter new DS marks:");
        int ds = n.nextInt();
        System.out.println("Enter new OperatingSys marks:");
        int os = n.nextInt();
        System.out.println("Enter new Java marks:");
        int java = n.nextInt();
        System.out.println("Enter new EM3 marks:");
        int em = n.nextInt();

        PreparedStatement preparedStatement = connection.prepareStatement(q);

        preparedStatement.setString(1, new_name);
        preparedStatement.setString(2, branch);
        preparedStatement.setString(3, phone);
        preparedStatement.setString(4, address);
        preparedStatement.setInt(5, ds);
        preparedStatement.setInt(6, os);
        preparedStatement.setInt(7, java);
        preparedStatement.setInt(8, em);
        preparedStatement.setString(9, dob);
        preparedStatement.setString(10, email);
        preparedStatement.setInt(11, prn1);

        preparedStatement.executeUpdate();

        connection.close();
    }

    void modifyTeacher() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String username = "root";
        String password = "Kolkata@023";
        String url = "jdbc:mysql://localhost:3306/SIT_Project_sem4";
        Connection connection = DriverManager.getConnection(url, username, password);

        String q = "update teacher1 set name=?, branch=?, phone=?, address=?,dob=?,email=? where id=?";

        Scanner n = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to be updated:");
        int ID = n.nextInt();


        System.out.println("Enter new branch:");
        String branch = sc.nextLine();
        System.out.println("Enter new name:");
        String new_name = sc.nextLine();
        System.out.println("Enter new phone:");
        String phone = sc.nextLine();
        System.out.println("Enter new address:");
        String address = sc.nextLine();
        System.out.println("Enter new date of birth:");
        String dob = sc.nextLine();
        System.out.println("Enter new email-address:");
        String email = sc.nextLine();

        PreparedStatement preparedStatement = connection.prepareStatement(q);

        preparedStatement.setString(1, new_name);
        preparedStatement.setString(2, branch);
        preparedStatement.setString(3, phone);
        preparedStatement.setString(4, address);
        preparedStatement.setString(5, dob);
        preparedStatement.setString(6, email);
        preparedStatement.setInt(7, ID);

        preparedStatement.executeUpdate();

        connection.close();
    }
    void student_admin() throws ClassNotFoundException, SQLException {

        Scanner scan=new Scanner(System.in);
        Scanner cont=new Scanner((System.in));

        System.out.println("Student details as follows");


        System.out.println("You can only view details\n");
        Class.forName("com.mysql.cj.jdbc.Driver");
        String username="root";
        String password="Kolkata@023";
        String url="jdbc:mysql://localhost:3306/SIT_Project_sem4";
        Connection connection = DriverManager.getConnection(url,username,password);

        String sql="Select * from students1";
        Statement statement=connection.createStatement();
        ResultSet result=statement.executeQuery(sql);

        while(result.next())
        {
            int id=result.getInt("prn");
            String name=result.getString("name");
            String DOB=result.getString("dob");
            String branch=result.getString("branch");
            String phone=result.getString("phone");
            String email=result.getString("email");
            String address=result.getString("address");

            int DS_marks=result.getInt("DS_marks");
            int OS_marks=result.getInt("OS_marks");
            int em3_marks=result.getInt("EM_marks");
            int java_marks=result.getInt("Java_marks");


            System.out.println("Info:\n"+id+" "+name+"  "+DOB+"  "+branch+"  "+phone+"  "+email+"  "+address+"\n Marks in DS OS EM3 java :  "+DS_marks+" "+OS_marks+" "+em3_marks+"  "+java_marks+",");

        }
        result.close();
        statement.close();
        connection.close();
    }

    void teacher_admin()throws ClassNotFoundException, SQLException
    {
        Scanner scan=new Scanner(System.in);
        Scanner cont=new Scanner((System.in));

        System.out.println("Teachers details as follows:");

        Class.forName("com.mysql.cj.jdbc.Driver");
        String username = "root";
        String password = "Kolkata@023";
        String url = "jdbc:mysql://localhost:3306/SIT_Project_sem4";
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "Select id,name,dob,branch,phone,email,address from teacher1";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {
            int id = result.getInt("id");
            String name = result.getString("name");
            String DOB = result.getString("dob");
            String branch = result.getString("branch");
            String phone = result.getString("phone");
            String email = result.getString("email");
            String address = result.getString("address");


            System.out.println("Info:\n" + id + "," + name + "," + DOB + "  " + branch + " " + phone + " " + email + " " + address);

        }
        result.close();
        statement.close();
        connection.close();
    }

}
