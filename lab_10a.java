import java.io.*;

public class lab_10a{
	public static void main (String [] args){
		int readline=0;
		int Char=0;
		String line;
		try{
			
			FileReader fr = new FileReader("abc.txt");
			BufferedReader br = new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				readline++;
			    Char+=line.length();

			}
	}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("no of line=" +readline);
		System.out.println("no of Character="+Char);
	}

}
