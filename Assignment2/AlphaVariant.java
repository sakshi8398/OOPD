package Assignment2;
import java.util.*;
public class AlphaVariant extends virusVariant {
	Scanner sc=new Scanner(System.in);
	//main function
	public int function(int durability1,int life2,int boost1,int attack1,int v1) {
		super.setDurability(durability1);
		super.setLife(life2);
		super.setBoost(boost1);
		super.setAttack(attack1);
		int durability=super.getDurability();
		int life=super.getLife();
		int attack=super.getAttack();
		System.out.println("Vaccine’s BOOST : 10 | Vaccine’s DURABILITY : 100 | Virus’s LIFE : 100 | Virus Variant: ALPHA");
		  int choice;
		  int v=v1;
		  do
		  {
			  System.out.println("Please select an action:");
			  System.out.println("1. INJECT");
			  System.out.println("2. EFFECT");
			  System.out.println("3. Exit");
			  choice=sc.nextInt();  
			  if(choice==1) {
				  int life1=vac.inject(life, v);
				  System.out.println("Your vaccine is boosted and it reduces the life of the virus by "+(life-life1));
				  life=life1;
				  }
			  else if(choice==2) {
				  attack=vac.effect(attack, v);
				  System.out.println("Virus’s action reduced by 10");
				  }
			  else if(choice==3) {
    			  System.out.println("Exited at wave 1!\r\n"
    					  + "Thanks for your participation. Let’s get Vaccinated !!!");
				  return 1;
				  }
			  System.out.println("Vaccine’s DURABILITY : " + durability+" | Virus’s LIFE : "+life);
			  if(life==0)
			  {
				  System.out.println("\nVirus Defeated !\r\n"
				  		+ "Vaccine proves to be effective during the first wave!!!\r\n"
				  		+ "Moving on to the next wave.");
				  return 0;
			  }
			  System.out.println("VIRUS’s ACTION !");
			  int randomnumber=0;
			  int max=life/4;
			  int min=0;
			  randomnumber=min + (int)(Math.random() * ((max - min) + 1));
			  durability=durability-randomnumber;
			  System.out.println("Virus reduces the vaccine’s DURABILITY by "+randomnumber);
			  System.out.println("Vaccine’s DURABILITY : " + durability+" | Virus’s LIFE : "+life);
			  if(durability<=0) {
				  System.out.println("Vaccine’s DURABILITY : 0 | Virus’s LIFE : "+ life +"\r\n" 
				  		+ "Oops! Your vaccine fails to affect the Alpha Variant.\r\n"
				  		+ "However, The vaccine helps you fight against several attacks of the virus and proves to\r\n"
				  		+ "be useful. This shows how important the vaccine is in the fight against COVID-19.\r\n"
				  		+ "Thanks for your participation. Now Let’s get Vaccinated !!!");
				  	return 2;
				  }
			  super.setLife(life);
			  super.setDurability(durability);
			  super.setAttack(attack);
			  
		  }while(life>0&&choice<3&&durability>0);
		  return 0;
	}
}
