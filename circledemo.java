public class circledemo{
	public static void main(String []args){

		circle c=new circle();
		c.area(2);


	}
}
	class circle{
		void area(int r){
			double area =3.14159*r*r;
			System.out.println(area);
		}
	}
