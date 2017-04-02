package factory.af.unit;

import factory.af.TeamInfo;
import factory.af.TeamMessage;
import factory.af.TeamName;
import observer.Subject;
import strategy.behavior.attack.AttackBehavior;
import strategy.behavior.movement.MovementBehavior;
import strategy.behavior.weapon.WeaponBehavior;
import strategy.function.GenerateRandomPosition;
import strategy.unit.Unit;

public abstract class TeamUnit extends Unit{
	public String teamMessage;
	public String teamName;
	TeamInfo teamInfo;
	
	
	public abstract void prepareTeamInfo();
	

	public TeamUnit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamUnit(Unit u){
		
	}


	public TeamUnit(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}


	public TeamUnit(Subject weatherData) {
		super(weatherData);
		// TODO Auto-generated constructor stub
	}


	public void createTeamInfo() {
		// TODO Auto-generated method stub
		
	}

}
