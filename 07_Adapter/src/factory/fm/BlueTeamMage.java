package factory.fm;

import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Mage;
import strategy.unit.Unit;

public class BlueTeamMage extends Unit {
	
	public BlueTeamMage() {
		super("Mage");
		setting(new Mage());
	}
//		// TODO Auto-generated constructor stub
//		type = "Mage";
//		health=20;
//		
//		attack = new CastFireball();
//		movement = new Teleport();
//		weapon = new Staff();
//	}
	
	public String toString(){
		this.setType("BlueTeam "+this.getType());
		return super.toString();
	}
}
