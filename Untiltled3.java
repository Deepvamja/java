import java.util.*;
public class Untiltled3{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
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
		int d=sc.nextInt();
		System.out.println("value of a:"+d);
		System.out.println("enter an number");
		int e=sc.nextInt();
		System.out.println("value of a:"+e);
		System.out.println("enter an number");

		double f=(a+b+c+d+e)/5.0;

		if(f>=60){
			System.out.println("first division");

		}
		else if(59>=f && f>=50){
			System.out.println("second division");
		}
		else if(49>=f && f>=40){
			System.out.println("third division");
		}else if(f<40){
			System.out.println("fail");
		}





		

	}
}