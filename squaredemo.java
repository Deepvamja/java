public class squaredemo{
	public static void main(String []args){

		square s=new square();
		s.area(2);


	}
}
	class square{
		void area(int l){
			double area =l*l;
			System.out.println(area);
		}
	}
