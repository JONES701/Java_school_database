package my;

import java.sql.SQLException;

public interface Log_data {

    String username="admin";
    String password="boss";

    String username1="student";
    String password1="iris";

    String username2="teacher";
    String password2="guide";

    String username3="parent";
    String password3="control";

    void Login() throws SQLException,ClassNotFoundException ;       //  abstract method
}
