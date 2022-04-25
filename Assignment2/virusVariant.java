package Assignment2;

public class virusVariant {
	private int durability;
	private int life;
	private int boost;
	private int waveType;
	private int attack;
	
	Vaccine vac=new Vaccine();
	RegisteredUser registeredUser=new RegisteredUser();
	
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getBoost() {
		return boost;
	}
	public void setBoost(int boost) {
		this.boost = boost;
	}
	public int getWaveType() {
		return waveType;
	}
	public void setWaveType(int waveType) {
		this.waveType = waveType;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	//If incase we want to check the life and durability of the virus
	public void display()
	{
		System.out.println("#####################");
		System.out.println("Life : "+life);
		System.out.println("Durability : "+durability);
		System.out.println("######################");
	}
}
