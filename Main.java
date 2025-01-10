//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        login log = new login();
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter username: ");
//        String user = sc.next();
//        System.out.print("Enter password: ");
//        String pass = sc.next();
//
//        log.userLogin(user, pass);

        System.out.print("Add Song name: ");
        String name1 = sc.next();

        System.out.print("Add Song duration: ");
        int duration1 = sc.nextInt();
        Song s = new Song(name1,duration1);

    }
}