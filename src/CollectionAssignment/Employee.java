package CollectionAssignment;

public class Employee implements Comparable<Employee>{
    private Double Salary;
    private Double Age;
    private String Name;

    Employee(String name,double salary, double age){
        this.Name=name;
        this.Age=age;
        this.Salary=salary;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
    public Double getAge() {
        return Age;
    }
    public void setAge(Double age) {
        Age = age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public int compareTo(Employee o){
        return this.getName().compareTo(o.getName());
    }

    public String toString(){
        return ("Name: "+Name +" "+"Age: "+Age+" "+"Salary: "+Salary+ "\n" );
    }
}
