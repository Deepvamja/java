import java.util.Scanner;

class count_vowel{

     int a=0,e=0,i=0,o=0,u=0;
	void count(String str){
		for(int j=0;j<str.length();j++){
			if(str.charAt(j)=='a'){
				a++;
			}
			else if (str.charAt(j)=='e'){
				e++;
			}
			else if (str.charAt(j)=='i'){
				i++;
			}else if (str.charAt(j)=='o'){
				o++;
			}else if (str.charAt(j)=='u'){
				u++;
			}


		}
	}
}
public class lab_5a{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		count_vowel vo = new count_vowel();
		while(true){
			String str=sc.nextLine();
			if(str.equals("quit")){
				break;
			}
			else{
				
				vo.count(str);

			}
			
		
	  }
	  System.out.println("a="+vo.a);
	System.out.println("e="+vo.e);
	System.out.println("i="+vo.i);
	System.out.println("0="+vo.o);
	System.out.println("u="+vo.u);

	}
	
    
}

