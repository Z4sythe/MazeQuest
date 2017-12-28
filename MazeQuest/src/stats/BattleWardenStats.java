package stats;

public interface BattleWardenStats extends CharacterStats {
	// General Setters
	
	// Sets a new health value.
	public void setHealth(double newHealth);
	
	//Sets a new health cap value.
	public void setHealthCap(double newHealthCap);
	
	// Sets a new attack value.
	public void setAttack(double newAttack);
	
	// Sets a new defense value.
	public void setDefense(double newDefense);

	
	// General Getters
	public double getAttack();
	
	public double getDefense();

	public double getHealth();


	// BattleWarden specific
	
	// BattleWarden Getters
	
	public double getRage();
	
}
