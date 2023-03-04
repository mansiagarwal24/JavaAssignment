package JavaAssignment2;

public class BOI extends Bank{
    Bank.bankType bank = Bank.bankType.BOI;
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    double homeLoanInterestRate;

    BOI(){

    }

    public void showBank(){
        System.out.println("Bank : " + bank);
    }
    public void setBOI_Details(String name, String head_office_address, String chairman_name, int branch_count, double fd_interest_rate, double personal_loan_interest_rate, double home_loan_interest_rate)
    {
        this.name = name;
        this.headOfficeAddress = head_office_address;
        this.chairmanName = chairman_name;
        this.branchCount = branch_count;
        this.fdInterestRate = fd_interest_rate;
        this.personalLoanInterestRate = personal_loan_interest_rate;
        this.homeLoanInterestRate = home_loan_interest_rate;
    }
    public  void getBOI_Details()
    {
        System.out.println("Values entered - " + name + ", " + headOfficeAddress + ", " + chairmanName + ", " +
                branchCount + ", " + fdInterestRate + ", " + personalLoanInterestRate + ", " + homeLoanInterestRate);
    }
    @Override
    public String toString()
    {
        return "Bank - " + bank + ", Name - " + name + ", HeadOfficeAddress - " + headOfficeAddress + ", ChairmanName - " + chairmanName +
                ", BranchCount - " + branchCount + ", FD Loan Interest rate - " + fdInterestRate +
                ", Personal Loan Interest Rate - " + personalLoanInterestRate+ ", Home Loan Interest Rate - " + homeLoanInterestRate;
    }
}
