package Inheritance;

public class Teacher {
    private  String designation;
    private  String collegeName;

    // Parameterized constructor 
    //initializing the instance variables designation and collegeName of the Teacher class.
    public Teacher(String designation, String collegeName) {
        this.designation = designation;
        this.collegeName = collegeName;
    }
   Teacher(){
	  // this("Default Designation", "Default College");//this keyword Invoking Another Constructor of the Same Class:
		System.out.println("no arg constructor of parent class");
   }
    // Getter and setter methods for designation
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Getter and setter methods for collegeName
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    // Method to demonstrate functionality
    void does() {
        System.out.println("Teaching");
    }

    public static void main(String[] args) {
    	Teacher t =new  Teacher();
    	System.out.println(t.collegeName +t.designation);
        // Creating an object using the parameterized constructor
        Teacher teacher = new Teacher("Professor", "ABC University");

        // Accessing and printing the values
        System.out.println("Designation: " + teacher.designation);
        System.out.println("College Name: " + teacher.collegeName);

        // Calling the method
        teacher.does();
    }
}
