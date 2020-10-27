public class Tester{
  public static void main(String[] args){
    BankAccount justin = new BankAccount(999,"pass");
    BankAccount shmerp = new BankAccount(123,"shmerp4life");
    System.out.println(justin.getBalance());
    System.out.println(justin.getAccountID());
    justin.setPassword("newPass");
    System.out.println(justin.deposit(10.50));
    System.out.println(justin.getBalance());
    System.out.println(shmerp.deposit(-0.1));
    System.out.println(shmerp.getBalance());
  }
}
