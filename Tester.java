public class Tester{
  public static void main(String[] args){
    BankAccount justin = new BankAccount(999,"pass");
    System.out.println(justin.getBalance());
    System.out.println(justin.getAccountID());
  }
}
