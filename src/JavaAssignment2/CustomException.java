/*
    Create a custom exception that do not have any stack trace.
 */
package JavaAssignment2;

public class CustomException {
        public static void main(String args[]) {
            try {
                throw new MyException("Custom exception has been occured");
            } catch(MyException e) {
                System.out.println(e.getMessage());
            }
        }
}
