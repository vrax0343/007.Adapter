package strategy.unit;

import strategy.behavior.attack.CastFireball;
import strategy.behavior.movement.Teleport;
import strategy.behavior.weapon.Staff;
import strategy.check.MapLimitCheck;

public class Mage extends Unit {
	public Mage() {
		// TODO Auto-generated constructor stub
		super("Mage");
		this.health = 20;
		this.weapon = new Staff();
		this.movement = new Teleport();
		this.attack = new CastFireball();
		this.maxHealth = this.health*2;
		this.mana = this.maxHealth;
		this.maxMana = this.maxHealth;
}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.print("마법사가\t ");
		weapon.useWeapon();
		attack.attack();
		System.out.println();
		this.stackCountArr[0]+=1;
		stackCounterCheck();
	}
	

}
