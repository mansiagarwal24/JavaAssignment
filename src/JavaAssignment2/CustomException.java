
package JavaAssignment2;

public class CustomException {
        public static void main(String args[]) {
            try {
                throw new MyException("Custom exception has been occured");
            } catch(MyException e) {
                System.out.println(e);
            }
        }
}
