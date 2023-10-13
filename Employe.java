


public class Employe {


	
	    // Instance variables
	    private String name ;
	 private   String address;
	 private   int dob;
	   private String lastname ;




	    // Constructor to initialize instance variables
	    public Employe(String name, String address, int dob , String lastname) {
	        this.name = name;
	        this.address= address;
	        this.dob = dob;
	               this.lastname = lastname;

	    }

	    // Method to display car information
	    public void displayInfo() {
	    	 System.out.println("employee");
	        System.out.println("name : " + name );
	        System.out.println("address of home is : " + address);
	        System.out.println("dob of employe: " + dob);
	         System.out.println("lastname  of employe: " +lastname);
	    }

	    public static void main(String[] args) {
	        // Create two car objects with their own set of instance variables
	       Employe a = new Employe("KUMAR", "NPA1", 1994 , "RAJ");
	         Employe b = new Employe("KUMAR1", "NPA2", 1995 ,"RAJ1");

	        // Display information about each car
	       
	        a.displayInfo();

	        System.out.println("\nCar 2:");
	        b.displayInfo();
	    }
	}
