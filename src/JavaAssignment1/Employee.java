/*
        Create a class named Employee with fields firstname,lastname,age and designation.
        The class should:
    have all types of constructors to initialize the object
    class should also have setter methods to update a particular field
    Override its toString method to display a meaningful message using all these fields.

*/

package JavaAssignment1;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    Employee(){
        System.out.println("This is a default constructor");
    }

    Employee(String firstName,String lastName,int age,String designation){
        System.out.println("This is a parameterized constructor");
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.designation=designation;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getDesignation(){
        return designation;
    }

    public void setFirstName(String firstname){
        this.firstName=firstname;
    }
    public void setLastName(String lastname){
        this.lastName=lastname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setDesignation(String desg){
        this.designation=desg;
    }

    public String toString(){
        return "Information {"+
                "First Name : " + firstName + " " +
                "Last Name : " + lastName + " " +
                "Age : " + age + " " +
                "Designation : " + designation + " } " ;

    }


    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Mansi","Aggarwal",22,"Trainee");

        emp1.setAge(23);
        emp1.setDesignation("Engineer");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

    }

}

