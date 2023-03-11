/*
    Given a list of objects of following class:
      class Employee{
      String fullName;
      Long salary;
      String city;
      }
     Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
     Note: Full name is concatenation of first name, middle name and last name with single space in between.
 */
package FeaturesPart2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
    String fullName;
    Long Salary;
    String City;

    Employee(){

    }

    Employee(String fullName,Long Salary,String City){
        this.fullName=fullName;
        this.Salary=Salary;
        this.City=City;
    }
    public String getFirstName(String fullName){
        String[] firstname=fullName.split(" ");
        return firstname[0];
    }

    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return Salary;
    }

    public String getCity() {
        return City;
    }
}


public class Ques5 {

    static List<Employee> createEmployee(){

        return Arrays.asList(
                new Employee("Mansi Aggarwal", 4000L,"Delhi"),
                new Employee("Shubham Rastogi",5800L,"Mumbai"),
                new Employee("Harshit Garg",2000L,"Delhi"),
                new Employee("Riya Sharma",3500L,"Chandigarh"),
                new Employee("Mansi Aggarwal",8000L,"Delhi"),
                new Employee("Esha Gupta",5000L,"Mumbai"),
                new Employee("Ansh kumar Singh",6570L,"Bangalore")
                );
    }
    public static void main(String[] args) {
        List<Employee> list = Ques5.createEmployee();
        Set<String> set = list.stream()
                .filter(e->e.getCity().equals("Delhi"))
                .filter(e->e.getSalary()<5000)
                .map(e->e.getFirstName(e.getFullName()))
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
