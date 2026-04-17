class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount(String name, int accNo, double balance) {
        this.accountHolder = name;
        this.accountNumber = accNo;
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

        // Display balance 
        public void displayBalance() {
         System.out.println("Account Holder: " + accountHolder);
         System.out.println("Account Number: " + accountNumber);
            System.out.println("Current balance: " + balance);
        }
    }
