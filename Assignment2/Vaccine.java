package Assignment2;
//vaccine functionality
public class Vaccine {
	public int inject(int life,int vaccine)
	{
		if(vaccine==1)
			life=life-10;
		else if (vaccine==2)
			life=life-5;
		else if (vaccine==3)
			life=life-6;
		else if (vaccine==4)
			life=life-4;
		return life;
		
	}
	public int effect(int attack,int vaccine)
	{
		if(vaccine==1)
			attack=attack-10;
		else if(vaccine==2)
			attack=attack-5;
		else if(vaccine==3)
			attack=attack-4;
		else if(vaccine==4)
			attack=attack-8;
		return attack;
	}
}
