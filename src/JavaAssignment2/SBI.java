package JavaAssignment2;

public class SBI extends Bank{
        Bank.bankType bank = Bank.bankType.SBI;
        String name;
        String headOfficeAddress;
        String chairmanName;
        int branchCount;
        double fdInterestRate;
        double personalLoanInterestRate;
        double homeLoanInterestRate;

        SBI()
        {}

        public void showBank()
        {
            System.out.println("Bank : " + bank);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeadofficeAddress() {
            return headOfficeAddress;
        }

        public void setHeadOfficeAddress(String headOfficeAddress) {
            this.headOfficeAddress = headOfficeAddress;
        }

        public String getChairmanName() {
            return chairmanName;
        }

        public void setChairmanName(String chairmanName) {
            this.chairmanName = chairmanName;
        }

        public int getBranchCount() {
            return branchCount;
        }

        public void setBranchCount(int branchCount) {
            this.branchCount = branchCount;
        }

        public double getFdInterestRate() {
            return fdInterestRate;
        }

        public void setFd_interest_rate(double fdInterestRate) {
            this.fdInterestRate = fdInterestRate;
        }

        public double getPersonalLoanInterestRate() {
            return personalLoanInterestRate;
        }

        public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
            this.personalLoanInterestRate = personalLoanInterestRate;
        }

        public double getHomeLoanInterestRate() {
            return homeLoanInterestRate;
        }

        public void setHome_loan_interest_rate(double homeLoanInterestRate) {
            this.homeLoanInterestRate = homeLoanInterestRate;
        }

        @Override
        public String toString()
        {
            return "Bank - " + bank + ", Name - " + name + ", HeadOfficeAddress - " + headOfficeAddress + ", ChairmanName - " + chairmanName + ", BranchCount - " + branchCount + ", FD Loan Interest rate - " + fdInterestRate + ", Personal Loan Interest Rate - " + personalLoanInterestRate + ", Home Loan Interest Rate - " + homeLoanInterestRate;
        }

}


