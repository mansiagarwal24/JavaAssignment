package JavaAssignment2;

public class ICICI extends Bank{
    Bank.bankType bank = Bank.bankType.ICICI;
    String name;
    String head_office_address;
    String chairman_name;
    int branch_count;
    double fd_interest_rate;
    double personal_loan_interest_rate;
    double home_loan_interest_rate;

    ICICI()
    {}

    public void showBank()
    {
        System.out.println("Bank : " + bank);
    }
    public void setICICI_Details(String name, String head_office_address, String chairman_name, int branch_count, double fd_interest_rate, double personal_loan_interest_rate, double home_loan_interest_rate)
    {
        this.name = name;
        this.head_office_address = head_office_address;
        this.chairman_name = chairman_name;
        this.branch_count = branch_count;
        this.fd_interest_rate = fd_interest_rate;
        this.personal_loan_interest_rate = personal_loan_interest_rate;
        this.home_loan_interest_rate = home_loan_interest_rate;
    }

    public  void getICICI_Details()
    {
        System.out.println("Values entered - " + name + ", " + head_office_address + ", " + chairman_name + ", " + branch_count + ", " + fd_interest_rate + ", " + personal_loan_interest_rate + ", " + home_loan_interest_rate);
    }

    @Override
    public String toString()
    {
        return "Bank - " + bank + ", Name - " + name + ", HeadOfficeAddress - " + head_office_address + ", ChairmanName - " + chairman_name + ", BranchCount - " + branch_count + ", FD Loan Interest rate - " + fd_interest_rate + ", Personal Loan Interest Rate - " + personal_loan_interest_rate + ", Home Loan Interest Rate - " + home_loan_interest_rate;
    }
}
