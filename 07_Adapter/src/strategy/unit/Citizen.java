package strategy.unit;

import strategy.behavior.attack.Punch;
import strategy.behavior.movement.Walk;
import strategy.behavior.weapon.Fist;

public class Citizen extends Unit {
	public Citizen() {
		// TODO Auto-generated constructor stub
		super("Citizen");
		this.health = 10;
		this.weapon = new Fist();
		this.movement = new Walk();
		this.attack = new Punch();
		this.maxHealth = this.health*2;
		this.mana = this.maxHealth;
		this.maxMana = this.maxHealth;
}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.print("Ω√πŒ¿Ã \t");
		weapon.useWeapon();
		attack.attack();
		System.out.println();
		
		this.stackCountArr[0]+=1;
		stackCounterCheck();
	}
}
