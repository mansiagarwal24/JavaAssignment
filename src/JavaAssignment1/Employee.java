/*
        Create a class named Employee with fields firstname,lastname,age and designation.
        The class should:
    have all types of constructors to initialize the object
    class should also have setter methods to update a particular field
    Override its toString method to display a meaningful message using all these fields.

*/

package JavaAssignment1;

public class Employee {
    public String first_name="Mansi";
    public String last_name="Aggarwal";
    public int age=22;
    public String designation="Trainee";

    Employee(){
        this.first_name="mansi";
        this.last_name="aggarwal";
        this.age=21;
        this.designation="trainee";
        System.out.println("this is a default constructor");
        System.out.println(first_name+" "+last_name+" "+age+" "+designation);
    }

    Employee(String first_name,String last_name,int age,String designation){
        System.out.println("this is a parameterize constructor");
        System.out.println(first_name+" "+last_name+" "+" "+age+" "+designation);
    }

    public String getfirst_name(){
        return first_name;
    }
    public String getlast_name(){
        return last_name;
    }
    public int getage(){
        return age;
    }
    public String getdesignation(){
        return designation;
    }

    public void setFirstName(String firstname){
        this.first_name=firstname;
    }
    public void setLastName(String lastname){
        this.last_name=lastname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setDesignation(String desg){
        this.designation=desg;
    }

    public String toString(){
        return "Information {"+
                "First Name : " + first_name + " " +
                "Last Name : " + last_name + " " +
                "Age : " + age + " " +
                "Designation : " + designation + " } " ;

    }


    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Mansi","Aggarwal",22,"Trainee");

        emp1.setAge(23);
        emp1.setDesignation("Engineer");
        emp2.setDesignation("Software Engineer");
        emp2.getdesignation();
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

    }

}

