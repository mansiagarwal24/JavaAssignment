/*
    Using java 8 date/time api:

    WAP to get two dates from user and print if the first date occurs bfore or after the second date supplied by the user.

 */
package FeaturesPart2;

import java.time.LocalDate;
import java.util.Scanner;

public class Ques6a {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Date (YYYY-MM-DD):");
            String firstDate = sc.nextLine();
            LocalDate st =LocalDate.parse(firstDate);

            System.out.println("Enter the Second Date(YYYY-MM-DD): ");
            String secondDate = sc.nextLine();
            LocalDate sn =LocalDate.parse(secondDate);

            if(st.isBefore(sn)){
                System.out.println("First Date occurs before Second Date");
            }
            else if (st.isAfter(sn)){
                System.out.println("First Date occurs after Second Date");
            }else {
                System.out.println("Both Dates are same ");
            }
        }
}
