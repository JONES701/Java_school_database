package my;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        int User;
        System.out.println("============================================");
        System.out.println("======##########==============#########=====");// design not required
        System.out.println("============================================");

        System.out.printf("\nWELCOME TO STUDENT/TEACHER DATABASE SYSTEM (Program starts here:)\n");
        int p;
        do {
            System.out.printf("1.STUDENT\n2.TEACHER\n3.ADMIN\n4.PARENT\n5.EXIT\n\n Enter choice: ");
            User = s.nextInt();

            switch (User) {
                case 1:
                    my.student_det student = new my.student_det();
                    student.Login();
                    break;
                case 2:
                    my.teacher_det teacher = new my.teacher_det();
                    teacher.Login();
                    break;
                case 3:
                    Admin admin = new Admin();
                    admin.Login();
                    break;
                case 4:
                    my.Parent parent = new my.Parent();
                    parent.Login();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice -------");
                    break;
            }
            System.out.println("\n\nWant to continue in any accessor mode?  (1 / 0) : ");
            p=s.nextInt();
        }while(p!=0);
    }
}

