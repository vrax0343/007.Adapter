package factory.fm;

import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Knight;
import strategy.unit.Mage;
import strategy.unit.Unit;

public class RedTeamMage extends Unit {

	public RedTeamMage() {
		// TODO Auto-generated constructor stub
		super("Mage");
		setting(new Mage());
	}
	
	public String toString(){
		this.setType("RedTeam "+this.getType());
		return super.toString();
	}
}
