package CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByNameSalary {

    public static void main(String[] args){
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Kritika",15000,22));
        emp.add(new Employee("Himani",8000,21));
        emp.add(new Employee("Shagun",10000,20));
        emp.add(new Employee("Anmol",21000,23));
        emp.add(new Employee("Kartik",9000,22));
        emp.add(new Employee("Shivam",13500,21));


        //Comparator Interface
        Comparator<Employee> com= new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if(emp1.getSalary()> emp2.getSalary()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        System.out.println("Sort acc to Salary:");
        Collections.sort(emp,com);
        System.out.println(emp);


        //comparable Interface
//        System.out.println("Sort acc to Name:");
//        Collections.sort(emp);
//        System.out.println(emp);

    }
}
