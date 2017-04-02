package factory.fm;

import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Citizen;
import strategy.unit.Knight;
import strategy.unit.Unit;

public class BlueTeamCitizen extends Unit {

	public BlueTeamCitizen() {
		// TODO Auto-generated constructor stub
		super("Citizen");
		setting(new Citizen());
	}
	
	public String toString(){
		this.setType("BlueTeam "+this.getType());
		return super.toString();
	}
	

}
