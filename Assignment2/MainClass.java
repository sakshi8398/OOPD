package Assignment2;
import java.util.*;
public class MainClass {
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 RegisteredUser registeredUser=new RegisteredUser();
	      int ch;
	      String username;  //username entered by the person
	      String adhar;
	      int v;			//vaccine type entered by user
	      int choiceReturned=0;
	      System.out.println("Welcome the Portal: ");
	      do {
		      //Inside the portal
	    	  System.out.println("Please select your option: ");
	    	  System.out.println("1. New User");
	    	  System.out.println("2. Existing Patient");
	    	  System.out.println("3. Exit");
	    	  ch=sc.nextInt();
	    	  if(ch==1) {
	    		  System.out.println("Enter Username:");
	    		  sc.nextLine();
	    		  username=sc.nextLine();
	    		  registeredUser.setusername(username);
	    		  System.out.println("Enter Aadhar Number:");
	    		  adhar=sc.nextLine();
	    		  registeredUser.setadhar(adhar);
	    		  System.out.println("Choose your vaccine:");
	    		  System.out.println("1. Covishield");
	    		  System.out.println("2. Covaxin");
	    		  System.out.println("3. Pfizer");
	    		  System.out.println("4. Sputnik");
	    		  v=sc.nextInt();
	    		  registeredUser.setvaccineType(1);
	    		  if(v==1)
	    			  registeredUser.setvaccine("Covishield");
	    		  else if(v==2)
	    			  registeredUser.setvaccine("Covaxin");
	    		  else if(v==3)
	    			  registeredUser.setvaccine("Pfizer");
	    		  else
	    			  registeredUser.setvaccine("Sputnik");
	    		 
	    		  System.out.println("Patient has been registered.");
	    		  registeredUser.display();
	    	  }
	    	    else if(ch==2) {
	    		  System.out.println("Enter Registered Username:");
	    		  sc.nextLine();
	    		  String name=sc.nextLine();
	    		  registeredUser.setname(name);
	    		  boolean verified=registeredUser.verify(name);
	    		  //registeredUser.display();
	    		  v=registeredUser.getvaccineType();
	    		  System.out.println("Verifying ...");
	    		  if(!verified) {
	    			  System.out.println("Patient not found !!! If you haven’t registered yet then please register first.");
	    		  }
	    		  else
	    		  {
	    			  System.out.println("Patient Found !*/");
	    			  System.out.println("Welcome "+name +" ,\n"
	    			  		+ "You’re being tested for the 1st wave for the alpha variant of the virus :");
	    			  virusVariant vv=new virusVariant();
	    			  int i=1;    //first variant of virus(First wave)
	    			  do {
	    			  vv.setWaveType(i++);
	    			  if(vv.getWaveType()==1) {

	    				  vv.setDurability(100);
	    				  vv.setLife(100);
	    				  vv.setBoost(10);
	    				  vv.setAttack(100);//assuming initial value of attack to be 100 for all the variant of virus
	    				  AlphaVariant alpha=new AlphaVariant();
	    				  choiceReturned=alpha.function(100,100,10,100,v);
	    			}
	    			  else if(vv.getWaveType()==2) {
	    				  
	    				  vv.setDurability(150);
	    				  vv.setLife(100);
	    				  vv.setBoost(20);
	    				  vv.setAttack(100);
	    				  BetaVariant alpha=new BetaVariant();
	    				  choiceReturned=alpha.function(150,100,20,100,v);
	    			}
	    			  else if(vv.getWaveType()==3) {
	    				  
	    				  vv.setDurability(150);
	    				  vv.setLife(200);
	    				  vv.setBoost(30);
	    				  vv.setAttack(100);
	    				  GamaVariant alpha=new GamaVariant();
	    				  choiceReturned=alpha.function(200,200,20,100,v);
	    			}
	    			  else if(vv.getWaveType()==4) {
	    				  vv.setDurability(250);
	    				  vv.setLife(250);
	    				  vv.setBoost(40);
	    				  vv.setAttack(100);
	    				  SigmaVariant alpha=new SigmaVariant();
	    				  choiceReturned=alpha.function(250,250,20,100,v);
	    			}
	    		  }while(i<=4&&choiceReturned==0);
	    		}
	    	}
	      }while(ch<3&&choiceReturned==0);
	     sc.close();
	    }
}
