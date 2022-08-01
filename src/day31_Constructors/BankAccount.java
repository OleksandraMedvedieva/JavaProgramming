package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Available balance is: " + balance);
    }

    public void deposit(double givenAmount){
        if (givenAmount<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        balance += givenAmount;

    }
    public void withdraw(double withdrawAmount){
        if (withdrawAmount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        if (withdrawAmount<=0){
            System.out.println("Withdrawing amount can not be zero or negative");
            return;

        }
        balance -= withdrawAmount;

    }

}

/*
 Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount

 */
