package Inheritance;

public class PhysicsTeacher extends Teacher {
    private String mainSubject;

    
    // Parameterized constructor for PhysicsTeacher
    public PhysicsTeacher(String designation, String collegeName, String mainSubject) {
        // Invoking parameterized constructor of parent class to initialize the instance variables of parent class
    	
    
        super(designation, collegeName);
        this.mainSubject = mainSubject;
    }
    PhysicsTeacher(){
    	//this();
    	System.out.println("no arg constructor of child class");
    }

    // Getter and setter method for mainSubject
    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    // Overriding the does method from the superclass
   
    void does() {
        System.out.println("Teaching Physics");
        super.does();// call method of parent class
    }
    

    public static void main(String[] args) {
    	
    	//invoke no arg constructor of both parent and child class
    	PhysicsTeacher physicsTeacher1 = new PhysicsTeacher();
        // Creating an object of PhysicsTeacher using the parameterized constructor
       PhysicsTeacher physicsTeacher = new PhysicsTeacher("Associate Professor", "XYZ University", "Physics");

       // Accessing and printing the values
        System.out.println("Designation: " + physicsTeacher.getDesignation());
        System.out.println("College Name: " + physicsTeacher.getCollegeName());
        System.out.println("Main Subject: " + physicsTeacher.mainSubject);

         //Calling the overridden does method
       //  physicsTeacher.does();
        
//        Teacher teacher = new Teacher("Associate Professor", "XYZ University");
//        System.out.println("Designation: " + teacher.getDesignation());
//        teacher.does();
    }
}
