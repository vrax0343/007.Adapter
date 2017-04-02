package factory.fm;

import strategy.behavior.attack.SwingSword;
import strategy.behavior.movement.Walk;
import strategy.behavior.weapon.Sword;
import strategy.unit.Knight;
import strategy.unit.Unit;

public class BlueTeamKnight extends Unit {

	public BlueTeamKnight() {
//		// TODO Auto-generated constructor stub
		super("Knight");
		setting(new Knight());
	}
	
	public String toString(){
		this.setType("BlueTeam "+this.getType());
		return super.toString();
	}
}
