package JavaAssignment3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ques2 extends User{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<User> userlist = new ArrayList<>();
        FileWriter file = new FileWriter("/home/mansi/userfile.txt");
        BufferedWriter br = new BufferedWriter(file);

        while (true) {
            User u= new User();
            userlist.add(u);
            System.out.print("Enter First Name=");
            u.firstName = scan.nextLine();
            br.append("First Name: "+u.firstName);
            br.newLine();
            System.out.print("Enter Last Name=");
            u.lastName = scan.next();
            br.append("last Name: "+u.lastName);
            br.newLine();
            System.out.print("Enter age=");
            u.age = scan.next();
            br.append("Age: "+u.age);
            br.newLine();
            System.out.print("enter Phone_No=");
            u.phoneNo = scan.next();
            br.append("Phone No: "+u.phoneNo);
            br.newLine();
            br.newLine();
            System.out.println("Do you want to continue creating users? (Type QUIT to exit or YES for Continue)");
            String txt = scan.next();
            if ("QUIT".equalsIgnoreCase(txt)) {
                break;
            }
        }
        br.close();
    }
}
