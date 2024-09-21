package demo;


public class Sample {
	// fields of parent class
		 String designation;
		  String collegeName;

		 Sample(String designation, String collegeName) {

			this.designation=designation;
			this.collegeName=collegeName;

		}

		 Sample() {
			System.out.println("Hello");
		}

		void display() {
			System.out.println("parent class method");
		}

		public static void main(String args[]) {

			Sample t = new Sample("PCCOER", "XYZ");
			Sample t1=new Sample();
			//System.out.println(t.collegeName +" "+t.designation);
			//t.display();

		}

		

}
