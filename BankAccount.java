package c2-52-77-232-42.ap-southeast-1.compute.amazonaws.com;

public class BankAccount {

  private double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

}
