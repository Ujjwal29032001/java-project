import java. util .Scanner;
Class BankAccount{
    private int balance;
    public BankAccount(int intialAmount){
        this.balance = intialAmount;
    }
    public int balance(){
        return balance;
    }
    public void deposit(int amount){
        if (amount>0){
            balance += amount;
            System.out.println("Deposit of" + "Rs was Successful");
        } else {
            System.out.pritln(x:"Invalid entry!. Please choose a number above 0");
        }
    } 
    public void withdraw(int amount){
        if (amount > 0 && amount ≤ balance){
            System.out.println("Deposit of" + amount + "Rs");
            amount -= balance;
        } else {
            System.out.println(x: "Invalid Entry!!. Insufficient balance or negative value entered");
        }
    }
}
Class ATM{
    private BanlAccount account;
    public ATM(BankAccount account){
        this.account = account;
    }
    public void display() {
        System.out.println(x :"Select options");
        System.out.println(x:"1. Deposits");
        System.out.println(x:"2. Withdraw");
        System.out.println(x:"3. Check Balance");
        System.out.println(x:"4. Leave");
    }
    public void run() {
        Scanner sc = new Scanner(System.in);
        int option
        do{
            display();
            System.out.println(x:"Pick an option");
            option = sc.nextInt();

            switch(option){
                case 1:
                     System.out.println("Current Balance " + account.balance);
                     break;
                case 2:
                     System.out.println(x:"Enter amount to deposit");
                     int depositAmount = sc.nextInt();
                     account.deposit(depositAmount);
                     break;
                case 3:
                     System.out.println(x:"Enter amount to withdraw");
                     int withdrawAmount = sc.nextInt();
                      account.withdraw(withdrawAmount);
                      break;
                case 4:
                     System.out.println(x:"Thanks for working with jain banks" );
                     break;
                default:
                System.out.println(x:"Invalid entry!!. Enter only given option ");         

            }
        }while (option ≠ 4)
         sc.close(); 
    }

}
public class main {
    public static void main(String[] args) {
      BankAccount userAccount = new BankAccount(intialAmount:30000);
      ATM atm = new ATM(userAccount);
      atm.run
    }
}