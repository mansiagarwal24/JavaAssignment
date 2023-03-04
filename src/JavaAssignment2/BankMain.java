/*
    Implement a banking system using java. Create 3 sub class of Bank : SBI,BOI,ICICI
    Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate. All 3 should have following methods:

    add getters and setters for the fields
    print details of every bank (override toString)

 */

package JavaAssignment2;
public class BankMain {
    public static void main(String[] args)
    {
        SBI sbi = new SBI();
        sbi.showBank();
        sbi.setSBI_Details("State Bank of India", "Mumbai", "Vikas Singh", 25, 5.6, 10, 7.6);
        sbi.getSBI_Details();
        System.out.println(sbi.toString());

        BOI boi = new BOI();
        boi.showBank();
        boi.setBOI_Details("Bank of India", "New Delhi", "Sahil Shekhawat", 8, 5.5, 9.5, 10.4);
        boi.getBOI_Details();
        System.out.println(boi.toString());

        ICICI icici = new ICICI();
        icici.showBank();
        icici.setICICI_Details("ICICI", "Noida", "Subash Verma", 18, 10, 4.7, 7);
        icici.getICICI_Details();
        System.out.println(icici.toString());
    }
}
