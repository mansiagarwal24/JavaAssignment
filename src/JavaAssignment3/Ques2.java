package JavaAssignment3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ques2{

    private String firstName;
    private String lastName;
    private int age;
    private int phoneNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String output(){
        return "First Name: "+firstName+"|"+"Last Name: "+lastName+"|"+ "Age: "+age+"|"+"Phone No: "+phoneNo;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        FileWriter write=null;
        try
        {
            write = new FileWriter("users.txt", true);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        while(true)
        {
            System.out.println("Enter your first name: ");
            String fName= scan.next();
            System.out.println("Enter your last name ");
            String lName= scan.next();
            System.out.println("Enter your age ");
            int age= scan.nextInt();
            System.out.println("Enter your phone number");
            int phoneNo = scan.nextInt();
            Ques2 u = new Ques2();
            u.firstName=fName;
            u.lastName=lName;
            u.age=age;
            u.phoneNo = phoneNo;
            try
            {
                write.write(u.output() + "\n");
                write.flush();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("Do you want to continue creating users ?");
            System.out.println("If not, type Quit");
            String input = scan.next();

            if(input.equalsIgnoreCase("Quit"))
            {
                break;
            }
        }
        try
        {
            write.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
