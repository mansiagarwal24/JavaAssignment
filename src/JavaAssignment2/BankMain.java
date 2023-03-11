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
        sbi.setName("State Bank of India");
        sbi.setBranchCount(15);
        sbi.setChairmanName("Manish Kumar Singh");
        sbi.setFd_interest_rate(3.45);
        sbi.setHeadOfficeAddress("New Delhi");
        sbi.setHome_loan_interest_rate(4.7);
        sbi.setPersonalLoanInterestRate(6.5);
        System.out.println(sbi.toString());

        BOI boi = new BOI();
        boi.showBank();
        boi.setName("Bank of India");
        boi.setBranchCount(8);
        boi.setChairmanName("Pranav Gupta");
        boi.setFd_interest_rate(4.89);
        boi.setHeadOfficeAddress("Mumbai");
        boi.setHome_loan_interest_rate(9.6);
        boi.setPersonalLoanInterestRate(5.78);
        System.out.println(boi.toString());

        ICICI icici = new ICICI();
        icici.showBank();
        icici.setName("ICICI Bank");
        icici.setBranchCount(12);
        icici.setChairmanName("Abhishek Singh");
        icici.setFd_interest_rate(6.0);
        icici.setHeadOfficeAddress("Noida");
        icici.setHome_loan_interest_rate(6.5);
        icici.setPersonalLoanInterestRate(3.78);
        System.out.println(icici.toString());
    }
}
