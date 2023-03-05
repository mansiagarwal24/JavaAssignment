/*
    Write a program to show application of Factory Design Pattern.
 */
package JavaAssignment3;

public class FactoryPatternMain {
    public static void main(String[] args){
        ProfessionFactory professionFactory = new ProfessionFactory();

        Profession doctor = professionFactory.getProfession("Doctor");
        doctor.print();

        Profession teacher = professionFactory.getProfession("teacher");
        teacher.print();

        Profession engineer = professionFactory.getProfession("Engineer");
        engineer.print();
    }
}
