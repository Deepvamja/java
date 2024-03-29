class a implements Runnable{
	public void run(){

	try{
		while(true)
		{
	    Thread.sleep(1000);
			System.out.println("good morning");
	    }
	}
	catch(Exception e){
		System.out.println(e);

	 }
   }
}

class b implements Runnable{
	public void run(){

	try{while(true){
		Thread.sleep(3000);
		System.out.println("good Afternoon");
	    }
	    
	}
	catch(Exception e){
		System.out.println(e);

	 }
   }
}

public class lab_9b{
	public static void main(String [] args){
		a a1 = new a();
		b b1 = new b();

		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(b1);
		t1.start();
		t2.start();
	}
}