package JavaAssignment1;

public class JavaQ1 {
        static String firstname="Mansi";
        static String lastname="Aggarwal";
        static int age=23;

        static{
            System.out.println(firstname+" "+lastname+" "+"printing is done in static block");
        }
        static void display() {
            System.out.println("First name : " + firstname);
            System.out.println("Last name : " + lastname);
            System.out.println("Age : " + age);
        }
        public static void main(String[] args) {
            display();
        }

}
