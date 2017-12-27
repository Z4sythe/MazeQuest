package stats;

public class CharacterStats {
	
	private double health = 0;
	// This healthCap increases with increasing levels.
	private double healthCap = 100;
	private double attackPower = 0;
	private double defensiveProwess = 0;
	
	// Setters
	
	// General Setters
	// Sets a new health value.
	public void setHealth(double newHealth) {
		health = newHealth;
	}
	
	//Sets a new health cap value.
	public void setHealthCap(double newHealthCap) {
		health = newHealthCap;
	}
	
	// Sets a new attack value.
	public void setAttack(double newAttack) {
		attackPower = newAttack;
	}
	
	// Sets a new defense value.
	public void setDefense(double newDefense) {
		defensiveProwess = newDefense;
	}

	
	// General Getters
	public double getAttack() {
		return attackPower;
	}
	
	public double getDefense() {
		return defensiveProwess;
	}

	public double getHealth() {
		return health;
	}



	
	
	
	// BattleWarden specific
	
	// This rage cap is constant no matter what level the character is.
	private double rageCap = 100;
	private int rage = 0;
	
	
	// BattleWarden Getters
	
	public int getRage() {
		return rage;
	}
	
}
