package Modifier;

public class Sample3 {
	int g=10;
	float h=90.90f;
	String i="Shantanu";
	char j='d';
	
	public void display() {               //public method
		System.out.println(g);      
	}
	
	protected void display1() {          //protected method
		System.out.println(h);
		
	}
	
	      void display2() {               //Default method
	    System.out.println(i);
	 }
	      
	/* private void  display3() {           //private method
		 System.out.println(j);
	 }
	 
	 public static void main(String[] args) {
		 Sample3 s3=new Sample3();
		 s3.display();
		 s3.display1();
		 s3.display2();
		 s3.display3();
	 }*/

}
