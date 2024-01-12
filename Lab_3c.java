import java.util.*;
public class Lab_3c{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an number:");
		int a=sc.nextInt();
		System.out.println("value of a:"+a);
		System.out.println("enter an number");
		int b=sc.nextInt();
		System.out.println("value of a:"+b);
		System.out.println("enter an number");
		int c=sc.nextInt();
		System.out.println("value of a:"+c);
		System.out.println("enter an number");
		if(a>b){
			if(a>c){
				System.out.println("a is greater");
			}
			System.out.println("c is greater");
		}
		else if (b>c){
			System.out.println("b is greater");
		}
	}
}