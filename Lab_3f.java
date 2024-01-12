import java.util.*;
public class Lab_3f{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String empty="";
		String str=sc.next();
		System.out.println("string is:+str");

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(str.length()-1-i);

			empty=empty+ch;
		}
		if(empty.equals(str)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
}
