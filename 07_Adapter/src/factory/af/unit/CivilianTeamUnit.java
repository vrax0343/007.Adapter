package factory.af.unit;

import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Citizen;
import strategy.unit.Mage;
import strategy.unit.Unit;
import factory.af.AbstractTeamInfoFactory;
import factory.af.TeamMessage;
import factory.af.TeamName;

public class CivilianTeamUnit extends TeamUnit {
	AbstractTeamInfoFactory atf;
	public TeamMessage teamMessage;
	public TeamName teamName;
	
	public CivilianTeamUnit(AbstractTeamInfoFactory atf) {
		super();
		this.atf = atf;
		this.setting(new Citizen());
	}

	@Override
	public void prepareTeamInfo() {
		// TODO Auto-generated method stub
		teamMessage = atf.createTeamMessage();
		teamName	= atf.createTeamName();
	}
	
	public String toString(){
		return "teamMessage: " + this.teamMessage + "\t teamName: " + this.teamName + "\n" + super.toString();  
	}

	
	
}