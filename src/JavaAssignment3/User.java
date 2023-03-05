/*
    Create a User class with fields:  firstname, lastname, age, phonenumber.
    Write a program which accepts values of user fields from commandline, create object and append that to a text file.
    After every user creation the program should prompt: "Do you want to continue creating users?
    (Type QUIT to exit)" and keep on accepting values and writing to file unitl user quits.
 */
package JavaAssignment3;

public class User {
    public String firstName;
    public String lastName;
    public String age;
    public String phoneNo;

    User(){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.phoneNo=phoneNo;
    }

    public String toString(){
        return "First Name: "+firstName+"|"+"Last Name: "+lastName+"|"+ "Age: "+age+"|"+"Phone No: "+phoneNo;
    }
}









