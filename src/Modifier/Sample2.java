package Modifier;

  public class Sample2 {
	        public String name;        //public variable
	        protected int a;           //protected variable
	                  char b;          //default variable
	        private float c;           //private variable
	        
	        public void display() {
	        	System.out.println(name);
	        	System.out.println(a);
	        	System.out.println(b);
	        	System.out.println(c);
	        }
	        
	public static void main(String[] args) {
		     Sample2 s= new Sample2();
		     s.name="Advait";
		     s.a=100;
		     s.b='a';
		     s.c=1123.4f;
		     s.display();
	}
	       
	

}
