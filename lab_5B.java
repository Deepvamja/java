class ComplexNumber{
 
    int real;
	int imaginary;

 ComplexNumber(){
      this.real=5;
      this.imaginary=10;
 }

 ComplexNumber(int real,int imaginary){
 	this.real=real;
 	this.imaginary=imaginary;

 }
 void addition(ComplexNumber c ){
	int r=this.real+c.real;
	int i=this.imaginary+c.imaginary;
      
     System.out.println(r+"+ "+i+"i");
    }
}
public class lab_5B{
	public static void main(String [] args){
		ComplexNumber r = new ComplexNumber(10,5);
		ComplexNumber i = new ComplexNumber();
		r.addition(i);

  }
}
