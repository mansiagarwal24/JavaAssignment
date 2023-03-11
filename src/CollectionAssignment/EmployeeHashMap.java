/*
    Create class Employee with attributes name,age,designation
    and use instances of these class as keys in a Map and their salary as value
 */

package CollectionAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

    private String name;
    private String designation;
    private int age;
    private int salary;

    public EmployeeHashMap() {
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "Name:" + name + " Designation:" + designation + " Age:" +age ;
    }

    public static void main(String[] args){
        EmployeeHashMap emp1 = new EmployeeHashMap();
        EmployeeHashMap emp2 = new EmployeeHashMap();
        EmployeeHashMap emp3 = new EmployeeHashMap();
        Map<EmployeeHashMap,Integer> map = new HashMap<>();

        emp1.setName("Arushi");
        emp1.setAge(23);
        emp1.setDesignation("Trainee");
        map.put(emp1,23000);

        emp2.setName("Shubham");
        emp2.setAge(21);
        emp2.setDesignation("HR");
        map.put(emp2,20000);

        emp3.setName("Ritika");
        emp3.setAge(23);
        emp3.setDesignation("Software Engineer");
        map.put(emp3,15000);

        System.out.println(map);
   }
}
