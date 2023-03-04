/*
    Write a java program to show following menu to the user:

*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3):

Take radius as user input.

Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
 */

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
