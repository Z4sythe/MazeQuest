package hero;

import java.util.Random;

import stats.BattleWardenStats;

public class BattleWarden implements BattleWardenStats {
	
	private double health = 0;
	// This healthCap increases with increasing levels.
	private double healthCap = 100;
	private double attack = 0;
	private double defense = 0;
	private double rage = 0;
	// This rage cap could vary based on in-game abilities
	private double rageCap = 100;
	
	Random rng = new Random();

	// BattleWarden constructors
	
	public BattleWarden() {
		health = 100;
		attack = 5;
		rage = 0;
		defense = 0;
	}
	
	public BattleWarden(double healthPool, double atkPower, double defProwess, double currentRage) {
		health = healthPool;
		attack = atkPower;
		rage = currentRage;
		defense = defProwess;

	}
	
	
	// Class Abilities
	
	// Provides a regenerative effect to the user.
	public double drinkBlood(double healthPool) {
		health = healthPool;
		healthPool += 50;

		if (healthPool > healthCap) {
			healthPool = healthCap;
			health = healthPool;
		} else
			health = healthPool;

		return health;
	}

	// Provides a rage boosting effect to the user.
	public double warShout(double currentRage) {
		rage = currentRage;
		currentRage += 15;

		if (currentRage > rageCap) {
			currentRage = rageCap;
			rage = currentRage;
		} else
			rage = currentRage;
		return rage;
	}
	
	// Provides an over-shield of health to brace for the next incoming attack.
	public void shieldsUp(int defenseIncrease) {
		defense += defenseIncrease;
	}
	

	// Returns an attack value to use in a battle sequence.
	public double attack(double atkPower, double currentRage) {
		// The plus 1 shaves the 0 off the 0-10 normal spectrum.
		// A minus 1 would lower the spectrum to encompass -1 as well.
		attack = rng.nextInt(10) + 1;
		
		//Boost of damage based on rage amount - should probably be 
		//stored to a variable that shifts on lvl change. int damageBoost...
		if (currentRage < 25) {
			attack += 1;
		} else if (25 <= currentRage && currentRage < 50){
			attack += 2;
		} else if (50 <= currentRage && currentRage < 75){
			attack += 4;
		} else if (75 <= currentRage && currentRage <= 100){
			attack += 6;
		}
		
		return attack;
	}
	
	//Character Status Check Methods
	
	//Checks if the character is alive.
	public boolean isAlive(double currentHealth) {
		if(currentHealth <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//CharacterStats Interface Methods
	

	// Getters
	public double getAttack() {
		return attack;
	}

	public double getHealth() {
		return health;
	}
	
	@Override
	public double getDefense() {
		return defense;
	}
	
	//Warrior-specific Getters

	@Override
	public double getRage() {
		return rage;
	}
	
	
	
	//Setters

	@Override
	public void setHealth(double newHealth) {
		health = newHealth;
		
	}


	@Override
	public void setHealthCap(double newHealthCap) {
		healthCap = newHealthCap;
		
	}


	@Override
	public void setAttack(double newAttack) {
		attack = newAttack;
		
	}


	@Override
	public void setDefense(double newDefense) {
		defense = newDefense;
		
	}
	
	
}
