import java.util.*;
public class Lab_3e{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an number:");
		int a=sc.nextInt();
		System.out.println("value of a:"+a);
		int count=0;
		for (int i=1;i<a;i++){
			if (a%i==0){
				count++;
			}
		}
		if(count==1){
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
}