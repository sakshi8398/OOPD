package Assignment2;
public class RegisteredUser extends UserRegisteration {
	private String name;
	public String getname() {
	      return name;
	   }
	public void setname( String newusername) {
		   name= newusername;
	   }
		//verifying the registered user 
	  public boolean verify(String name) {
			if(name.equalsIgnoreCase(getusername()))
				return true;
			return false;
		}
}
