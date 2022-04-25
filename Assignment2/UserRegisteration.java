package Assignment2;
public class UserRegisteration {
	private String username;
	private String adhar;
	private String vaccine;
	private int vaccineType;
	
	//getter and setter of the data  variables
	public String getusername() {
	      return username;
	   }

	   public String getadhar() {
	      return adhar;
	   }

	   public String getvaccine() {
	      return vaccine;
	   }
	   public int getvaccineType() {
		      return vaccineType;
		   }
	   public void setusername( String newusername) {
		   username= newusername;
	   }

	   public void setadhar(String newadhar) {
	      adhar = newadhar;
	   }

	   public void setvaccine( String newvaccine) {
	      vaccine = newvaccine;
	   }
	   public void setvaccineType(int newvaccineType) {
		      vaccineType=newvaccineType;
	   }
	   //Display  information of the registered user
	   public void display()
	   {
		   System.out.println("Username is : "+getusername());
		   System.out.println("Aadhar Number : "+adhar);
		   System.out.println("Vaccine Opted : "+ vaccine);
	   }
}
