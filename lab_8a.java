class multiplication{
	public void repetativemultiplication(int x,int y){
		int multiple=0;
		for(int i=0;i<=y;i++){
			multiple=multiple*x;
		}
		 System.out.println();
			}

}


public class lab_8a{
	public static void main(String [] args){
		try{

			int x=Integer.parseInt(args [0]);
			int y=Integer.parseInt(args [1]);

			multiplication m = new multiplication();
			m.repetativemultiplication(x,y);

		}catch(Exception e){
			e.printStackTrace();


		}
		System.out.println("end");

	}
}