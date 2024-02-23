import java.util.Scanner;
class Bank_Account{
	int accountno;
	String username;
	String email;
	String accounttype;
	double accountbalance;

	void getAccountDetails(int accountno,String username,String email,String accounttype,double accountbalance){

		this.accountno=accountno;
		this.username=username;
		this.email=email;
		this.accounttype=accounttype;
		this.accountbalance=accountbalance;
	}
	 void DisplayAccountDetails(){
	 	System.out.println("your accountno="+accountno);
	 	System.out.println("your username="+username);
	 	System.out.println("your email="+email);
	 	System.out.println("your accounttype="+accounttype);
	 	System.out.println("your accountbalance="+accountbalance);

	 }


}
public class lab_5{
	public static void main (String [] args){
	int accountno=0;
	String username="deep";
	String email="dfr";
	String accounttype="hjh";
	double accountbalance=456;

	Scanner sc = new Scanner(System.in);
	System.out.println("enter a accountno");
	accountno = sc.nextInt();
	sc.nextLine();
	System.out.println("enter a username");
	username = sc.nextLine();
	System.out.println("enter a email");
	email = sc.nextLine();
	System.out.println("enter a accounttype");
	accounttype = sc.nextLine();
	System.out.println("enter a accountbalance");
	accountbalance = sc.nextInt();;
	
	
      Bank_Account b1=new Bank_Account();
      b1.getAccountDetails(accountno,username,email,accounttype,accountbalance);
      b1.DisplayAccountDetails();

	}
}