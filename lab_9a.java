class A extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			if(i%2==0){
				System.out.println("good morning");

			}
			sleep(1000);
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			if(i%2!=0){
				System.out.println("good afternoon");
			}
			sleep(3000);
		}
		
	}
}

public class lab_9a{
	
}