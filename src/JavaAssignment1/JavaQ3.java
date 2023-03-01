package JavaAssignment1;

import java.util.Scanner;
public class JavaQ3 {
        public static void getArea(int radius){
            System.out.println("Area of circle is: "+3.14*radius*radius);
        }

        public static void getCircumference(int radius){
            System.out.println("Circumference of circle is: "+2*radius*3.14);
        }
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            int choice;
            do {
                System.out.println("1.Area of Circle");
                System.out.println("2.Circumference of circle");
                System.out.println("3.Exit");
                System.out.print("Choose any one : ");
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter radius: ");
                        int radius = scan.nextInt();
                        getArea(radius);
                        break;

                    case 2:
                        System.out.println("Enter radius: ");
                        int rad = scan.nextInt();
                        getCircumference(rad);
                        break;

                    case 3:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 3);

        }
}
