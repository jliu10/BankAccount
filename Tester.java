public class Tester{
  public static void main(String[] args){
    BankAccount justin = new BankAccount(999,"pass");
    BankAccount shmerp = new BankAccount(123,"shmerp4life");
    BankAccount anubis = new BankAccount(001,"anubis");
    System.out.println(justin.getBalance());
    System.out.println(justin.getAccountID());
    justin.setPassword("newPass");
    System.out.println(justin.deposit(10.50));
    System.out.println(justin.getBalance());
    System.out.println(shmerp.deposit(-0.1));
    System.out.println(shmerp.getBalance());
    System.out.println(justin.withdraw(0.23));
    System.out.println(justin.getBalance());
    System.out.println(justin.withdraw(100));
    System.out.println(justin.getBalance());
    System.out.println(shmerp.withdraw(-1));
    System.out.println(shmerp.getBalance());
    System.out.println(justin.toString());
    System.out.println(shmerp.toString());
    System.out.println(anubis.toString());
//    System.out.println(justin.authenticate("pass"));
    System.out.println(justin.transferTo(shmerp,1,"pass"));
    System.out.println(justin.toString());
    System.out.println(shmerp.toString());
    System.out.println(justin.transferTo(shmerp,1,"newPass"));
    System.out.println(justin.toString());
    System.out.println(shmerp.toString());
  }
}
