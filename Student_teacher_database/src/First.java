import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class First {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String username="root";
        String password="Kolkata@023";
        String url="jdbc:mysql://localhost:3306/SIT_Project_sem4";
        Connection connection =DriverManager.getConnection(url,username,password);

        String sql="Select prn,name,dob,DS_marks,OS_marks from students1";
        Statement statement=connection.createStatement();
        ResultSet result=statement.executeQuery(sql);

       while(result.next())
        {
            int id=result.getInt("prn");
            String name=result.getString("name");
            String DOB=result.getString("dob");
            int DS_marks=result.getInt("DS_marks");
            int OS_marks=result.getInt("OS_marks");

            System.out.println(id+","+name+","+DOB+","+DS_marks+","+OS_marks);

        }
       result.close();
       statement.close();
       connection.close();
    }
}
