/*
    use record to create an immutable represent of student(name, id, age) and use its  constructor for initialization, equals to compare 2 students methods.
     Also keep a static counter to keep the count of objects created.
 */
package JavaAddition9_17;
record Student(int id,String name,int age){
    static int count=0;
    static void countId(){
        count++;
    }
    Student{
        countId();
    }

};
public class Ques11 {
    public static void main(String[] args) {
        Student st1 = new Student(9080,"Mansi Aggarwal",23);
        Student st3 = new Student(9080,"Mansi Aggarwal",23);
        Student st2 = new Student(8090,"Harshit Garg",18);

        System.out.println(st1.equals(st3));
        System.out.println(Student.count);

    }

}
