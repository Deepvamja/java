import java.util.Scanner;
public class lab_4a{
	public static void main (String[] args){
		Scanner Scanner = new Scanner(System.in);
		System.out.print("enter a line");
		String line = Scanner.nextLine();
		int vowels=0;
		int consonants =0;

		line = line.toLowerCase();

		for(int i=0;i<line.length(); i++){
			char ch = line.charAt(i);

			if (ch>='a' && ch<='z'){
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' ){
					vowels++;

				}else{
					consonants++;
				}
			}

		}
			System.out.println("Number of vowels:" + vowels);
			System.out.println("Number of consonants:" + consonants);

			Scanner.close();
		
	}
}