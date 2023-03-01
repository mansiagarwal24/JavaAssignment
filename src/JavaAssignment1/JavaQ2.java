package JavaAssignment1;
import java.util.Scanner;
public class JavaQ2 {

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String input="";

        while(true){
            String enter_string= scan.nextLine();
            if(enter_string.equals("xdone")){
                break;
            }
            input += enter_string+ "\n";
        }

        System.out.println("Input String is: ");
        System.out.println(input);
    }
}
