package factory.fm;

import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Citizen;
import strategy.unit.Unit;

public class RedTeamCitizen extends Unit {

	public RedTeamCitizen() {
//		// TODO Auto-generated constructor stub
		super("Citizen");
		setting(new Citizen());
	}
	
	public String toString(){
		this.setType("RedTeam "+this.getType());
		return super.toString();
	}
}
